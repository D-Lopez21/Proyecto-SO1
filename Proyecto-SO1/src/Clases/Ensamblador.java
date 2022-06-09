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
public class Ensamblador extends Thread{

    private int dayDuration;
    private double dailyProduce=0.5;
    private int camaras=1;
    private int botones=4;
    private int pantallas=40;
    private int pins=40;
    private boolean stop;
    private Semaphore mutexEnsamblador;

    private Semaphore mutexPantallas; //Mutex
    private Semaphore semPantallas; //Productor
    private Semaphore semEnsPantallas; //Consumidor

    private Semaphore mutexBotones; //Mutez
    private Semaphore semBotones; //Productor
    private Semaphore semEnsBotones; //Consumidor

    private Semaphore mutexCamaras; //Mutex
    private Semaphore semCamaras; //Productor
    private Semaphore semEnsCamaras; //Consumidor

    private Semaphore mutexPinCarga; //Mutex
    private Semaphore semPinCarga; //Productor
    private Semaphore semEnsPinCarga; //Consumidor

    public Ensamblador(int dayDuration, Semaphore mutexEnsamblador, Semaphore mutexPantallas, Semaphore semPantallas, Semaphore semEnsPantallas, Semaphore mutexBotones, Semaphore semBotones, Semaphore semEnsBotones, Semaphore mutexCamaras, Semaphore semCamaras, Semaphore semEnsCamaras,Semaphore mutexPinCarga, Semaphore semPinCarga, Semaphore semEnsPinCarga) {
        this.dayDuration = dayDuration;
        this.mutexEnsamblador = mutexEnsamblador;
        this.mutexPantallas = mutexPantallas;
        this.semPantallas = semPantallas;
        this.semEnsPantallas = semEnsPantallas;
        this.mutexBotones = mutexBotones;
        this.semBotones = semBotones;
        this.semEnsBotones = semEnsBotones;
        this.mutexCamaras = mutexCamaras;
        this.semCamaras = semCamaras;
        this.semEnsCamaras = semEnsCamaras;
        this.mutexPinCarga = mutexPinCarga;
        this.semPinCarga = semPinCarga;
        this.semEnsPinCarga = semEnsPinCarga;
    }

    public void run(){

        while(true){
            if (!this.stop) {
                try{
                    //hacemos acquire a los semáforos de productor
                    semEnsPantallas.acquire(pantallas);
                    semEnsBotones.acquire(botones);
                    semEnsCamaras.acquire(camaras);
                    semEnsPinCarga.acquire(pins);


                    mutexPantallas.acquire(pantallas);
                    Thread.sleep(dayDuration*1000*2);
                    //Saco la cantidad de pantallas que necesito

                    Interfaz.pantallaDisp-= pantallas;
                    Interfaz.avPantallas.setText(Integer.toString(Interfaz.pantallaDisp));

                    mutexPantallas.release();
                    semPantallas.release(pantallas); //liberamos semáforo de productor

                    mutexBotones.acquire();
                    //Saco la cantidad de botones que necesito
                    Interfaz.botonDisp-= botones;
                    Interfaz.avBoton.setText(Integer.toString(Interfaz.botonDisp));

                    mutexBotones.release();
                    semBotones.release(botones); //liberamos semáforo de productor

                    mutexCamaras.acquire();
                    //Saco la cantidad de camaras que necesito
                    Interfaz.camarasDisp-= camaras;
                    Interfaz.avCamaras.setText(Integer.toString(Interfaz.camarasDisp));

                    mutexCamaras.release();
                    semCamaras.release(camaras); //liberamos semáforo de productor

                    mutexPinCarga.acquire();
                    //Saco la cantidad de pins de carga que necesito
                    Interfaz.pinsDisp-= pins;
                    Interfaz.avPinss.setText(Integer.toString(Interfaz.pinDisp));

                    mutexPinCarga.release();
                    semPinCarga.release(pin); //liberamos semáforo de productor

                    mutexEnsamblador.acquire();

                    Interfaz.pahlsDisp +=1;
                    Interfaz.avPahls.setText(Integer.toString(Interfaz.pahlsDisp));

                    mutexEnsamblador.release();

                }catch(Exception e){

                }
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