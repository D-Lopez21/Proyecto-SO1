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
public class ProdCamaras extends Thread{
    private int dayDuration;
    private double dailyProduce =0.33;
    private Semaphore mutex;
    private Semaphore semPiece;
    private Semaphore semEnsamblador;
    private boolean stop;

    public ProdCamaras( int dayDuration, Semaphore mutex, Semaphore semPiece, Semaphore semEnsamblador) {


        this.dayDuration = dayDuration;
        this.mutex = mutex;
        this.semPiece = semPiece;
        this.semEnsamblador = semEnsamblador;

    }

    public void run() {
        while (!stop) {
            try {
                semPiece.acquire();


                Thread.sleep(1000*dayDuration*3);
                mutex.acquire();
                Interfaz.camarasDisp++;
                Interfaz.avCamaras.setText(Integer.toString(Interfaz.CamarasDisp));

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
