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
public class ProdBotones extends Productores{

    private boolean stop;
    private Semaphore mutex;
    private Semaphore semBotones;
    private Semaphore semEnsamblador;
    private int dailyProduce;
    private int dayDuration;

    public ProdBotones(boolean stop, int[] maxStorages, int[] dailyProds, int daysToDeliver, int dayDuration, int numBusiness) {
        super(maxStorages, dailyProds, daysToDeliver, dayDuration, numBusiness);
        this.stop = false;
        this.mutex = getMutexBotones();
        this.semBotones = getSemBotones();
        this.semEnsamblador = getSemEnsBotones();
        this.dailyProduce = dailyProds[0];
        this.dayDuration = getDayDuration();
    }

    @Override
    public void run() {
        while (!stop) {
            try {
                semBotones.acquire();

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
