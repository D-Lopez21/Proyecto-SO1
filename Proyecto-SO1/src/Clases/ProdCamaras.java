/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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

    public ProdCamaras(boolean stop, int[] maxStorages, int[] dailyProds, int daysToDeliver, int dayDuration, int numBusiness) {
        super(maxStorages, dailyProds, daysToDeliver, dayDuration, numBusiness);
        this.stop = false;
        this.dailyProduce = dailyProds[3];

    }

    @Override
    public void run() {
        this.mutex = getMutexBotones();
        this.semCamaras = getSemCamaras();
        this.semEnsamblador = getSemEnsCamaras();
        this.dayDuration = getDayDuration();
        this.numBusiness = getNumBusiness();
        while (!stop) {
            try {
                semCamaras.acquire();

                Thread.sleep(Math.round(dayDuration * 1000 * dailyProduce));
                mutex.acquire();

                Productores.camarasDisp++;
                switch (numBusiness) {
                    case 1:
                        Productor_Camara.camDisp.setText(Integer.toString(Productores.camarasDisp));
                        break;
                    case 2:
                        Productor_Camara2.camDisp.setText(Integer.toString(Productores.camarasDisp));
                        break;
                    case 3:
                        Productor_Camara3.camDisp.setText(Integer.toString(Productores.camarasDisp));
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
