/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.Empresa1;
import Interfaces.Empresa2;
import Interfaces.Empresa3;
import Interfaces.Productor_Botones;
import Interfaces.Productor_Botones2;
import Interfaces.Productor_Botones3;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Andres y Nicolas
 */
public class ProdBotones extends Productores{

    private boolean stop;
    private Semaphore mutex;
    private Semaphore semBotones;
    private Semaphore semEnsamblador;
    private int dailyProduce;
    private int dayDuration;
    private int numBusiness;
    private int maxBotones;

    public ProdBotones(int[] maxStorages, int[] dailyProds, int daysToDeliver, int dayDuration, int numBusiness) {
        super(maxStorages, dailyProds, daysToDeliver, dayDuration, numBusiness);
        this.stop = false;
        this.dailyProduce = dailyProds[1];
        this.maxBotones = maxStorages[0];
    }

    @Override
    public void run() {
        this.mutex = getMutexBotones();
        this.semBotones = getSemBotones();
        this.semEnsamblador = getSemEnsBotones();
        this.dayDuration = getDayDuration();
        this.numBusiness = getNumBusiness();
        while (!stop) {
            try {
                semBotones.acquire();

                Thread.sleep(Math.round((dayDuration * 1000) / dailyProduce));
                mutex.acquire();
                
                switch (numBusiness) {
                    case 1:
                        if (Productores.botonesDisp1 > this.maxBotones) {
                            this.setStop(true);
                        } else {
                            Productores.botonesDisp1++;
                         }
                            Productor_Botones.botonDisp.setText(String.valueOf(Productores.botonesDisp1));
                            Empresa1.Valor_botones.setText(String.valueOf(Productores.botonesDisp1));
                        break;
                    case 2:
                        if (Productores.botonesDisp2 > this.maxBotones) {
                            this.setStop(true);
                        } else {
                            Productores.botonesDisp2++;
                        }
                        Productor_Botones2.botonDisp.setText(Integer.toString(Productores.botonesDisp2));
                        Empresa2.Valor_botones.setText(Integer.toString(Productores.botonesDisp2));
                        break;
                    case 3:
                        if (Productores.botonesDisp3 > this.maxBotones) {
                            this.setStop(true);
                        } else {
                            Productores.botonesDisp3++;
                        }
                        Productor_Botones3.botonDisp.setText(Integer.toString(Productores.botonesDisp3));
                        Empresa3.Valor_botones.setText(Integer.toString(Productores.botonesDisp3));
                        break;
                }

                mutex.release();
                semEnsamblador.release();

            } catch (Exception e) {

            }
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
