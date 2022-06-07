/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.concurrent.Semaphore;

/**
 *
 * @author andre
 */
public class ProdPinCarga {

    private int dayDuration;
    private double dailyProduce=30;
    private Semaphore mutex;
    private Semaphore semPiece;
    private Semaphore semEnsamblador;
    private boolean stop;

    public ProdPinCarga( int dayDuration, Semaphore mutex, Semaphore semPiece, Semaphore semEnsamblador) {


        this.dayDuration=dayDuration;
        this.mutex = mutex;
        this.semPiece = semPiece;
        this.semEnsamblador = semEnsamblador;

    }

    public void run() {
        while (!stop) {
            try {
                semPiece.acquire();

                Thread.sleep(Math.round((dayDuration * 1000) / dailyProduce));
                mutex.acquire();

                Interfaz.pinDisp++;

                Interfaz.avPins.setText(Integer.toString(Interfaz.pinDisp));

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