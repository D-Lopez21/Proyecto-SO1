/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Andres y Nicolas
 */
public class ProdPinCarga extends Productores{

    private boolean stop;
    private Semaphore mutex;
    private Semaphore semPinCarga;
    private Semaphore semEnsamblador;
    private int dailyProduce;
    private int dayDuration;

    public ProdPinCarga(boolean stop, int[] maxStorages, int[] dailyProds, int daysToDeliver, int dayDuration, int numBusiness) {
        super(maxStorages, dailyProds, daysToDeliver, dayDuration, numBusiness);
        this.stop = false;
        this.mutex = getMutexBotones();
        this.semPinCarga = getSemBotones();
        this.semEnsamblador = getSemEnsBotones();
        this.dailyProduce = dailyProds[0];
        this.dayDuration = getDayDuration();
    }

    public void run() {
        while (!stop) {
            try {
                semPinCarga.acquire();

                Thread.sleep(Math.round((dayDuration * 1000) / dailyProduce));
                mutex.acquire();

                Interfaz.botonDisp++;
                Interfaz.avBoton.setText(Integer.toString(Interfaz.botonDisp));

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