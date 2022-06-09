/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.Productor_Pin;
import Interfaces.Productor_Pin2;
import Interfaces.Productor_Pin3;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Andres y Nicolas
 */
public class ProdPinCarga extends Productores{

    private boolean stop;
    private Semaphore mutex;
    private Semaphore semCamaras;
    private Semaphore semEnsamblador;
    private int dailyProduce;
    private int dayDuration;
    private int numBusiness;

    public ProdPinCarga(boolean stop, int[] maxStorages, int[] dailyProds, int daysToDeliver, int dayDuration, int numBusiness) {
        super(maxStorages, dailyProds, daysToDeliver, dayDuration, numBusiness);
        this.stop = false;
        this.dailyProduce = dailyProds[2];

    }

    @Override
    public void run() {
        this.mutex = getMutexBotones();
        this.semCamaras = getSemPinCarga();
        this.semEnsamblador = getSemEnsPinCarga();
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
                        Productor_Pin.pinDisp.setText(Integer.toString(Productores.pantallasDisp));
                        break;
                    case 2:
                        Productor_Pin2.pinDisp.setText(Integer.toString(Productores.pantallasDisp));
                        break;
                    case 3:
                        Productor_Pin3.pinDisp.setText(Integer.toString(Productores.pantallasDisp));
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