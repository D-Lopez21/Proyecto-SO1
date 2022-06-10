/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.Empresa1;
import Interfaces.Empresa2;
import Interfaces.Empresa3;
import Interfaces.Productor_Camara;
import Interfaces.Productor_Camara2;
import Interfaces.Productor_Camara3;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Andres y Nicolas
 */
public class ProdCamaras extends Productores{

    private boolean stop;
    private Semaphore mutex;
    private Semaphore semCamaras;
    private Semaphore semEnsamblador;
    private int dailyProduce;
    private int dayDuration;
    private int numBusiness;
    private int maxCamaras;

    public ProdCamaras(int[] maxStorages, int[] dailyProds, int daysToDeliver, int dayDuration, int numBusiness) {
        super(maxStorages, dailyProds, daysToDeliver, dayDuration, numBusiness);
        this.stop = false;
        this.dailyProduce = dailyProds[3];
        this.maxCamaras = maxStorages[1];
    }

    @Override
    public void run() {
        this.mutex = getMutexCamaras();
        this.semCamaras = getSemCamaras();
        this.semEnsamblador = getSemEnsCamaras();
        this.dayDuration = getDayDuration();
        this.numBusiness = getNumBusiness();
        while (!stop) {
            try {
                semCamaras.acquire();

                Thread.sleep(Math.round(dayDuration * 1000 * dailyProduce));
                mutex.acquire();

                switch (numBusiness) {
                    case 1:
                        if (Productores.camarasDisp1 > this.maxCamaras) {
                            this.setStop(true);
                        } else {
                            Productores.camarasDisp1++;
                        }
                        Productor_Camara.camDisp.setText(Integer.toString(Productores.camarasDisp1));
                        Empresa1.Valor_camara.setText(Integer.toString(Productores.camarasDisp1));
                        break;
                    case 2:
                        if (Productores.camarasDisp2 > this.maxCamaras) {
                            this.setStop(true);
                        } else {
                            Productores.camarasDisp2++;
                        }
                        Productor_Camara2.camDisp.setText(Integer.toString(Productores.camarasDisp2));
                        Empresa2.Valor_camara.setText(Integer.toString(Productores.camarasDisp2));
                        break;
                    case 3:
                        if (Productores.camarasDisp3 > this.maxCamaras) {
                            this.setStop(true);
                        } else {
                            Productores.camarasDisp3++;
                        }
                        Productor_Camara3.camDisp.setText(Integer.toString(Productores.camarasDisp3));
                        Empresa3.Valor_camara.setText(Integer.toString(Productores.camarasDisp3));
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
