/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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

    public ProdBotones(boolean stop, int[] maxStorages, int[] dailyProds, int daysToDeliver, int dayDuration, int numBusiness) {
        super(maxStorages, dailyProds, daysToDeliver, dayDuration, numBusiness);
        this.stop = false;
        this.dailyProduce = dailyProds[0];

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

                Productores.botonesDisp++;
                switch (numBusiness) {
                    case 1:
                        Productor_Botones.botonDisp.setText(Integer.toString(Productores.botonesDisp));
                        break;
                    case 2:
                        Productor_Botones2.botonDisp.setText(Integer.toString(Productores.botonesDisp));
                        break;
                    case 3:
                        Productor_Botones3.botonDisp.setText(Integer.toString(Productores.botonesDisp));
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
