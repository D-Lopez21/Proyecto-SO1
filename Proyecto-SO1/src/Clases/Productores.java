/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Nicolás Briceño
 */
public class Productores extends Empresa{
    
    //Semaforos Botones
    private Semaphore mutexBotones;
    private Semaphore semBotones;
    private Semaphore semEnsBotones;
    //Semaforos Camaras
    private Semaphore mutexCamaras;
    private Semaphore semCamaras;
    private Semaphore semEnsCamaras;
    //Semaforos Pantallas
    private Semaphore mutexPantallas;
    private Semaphore semPantallas;
    private Semaphore semEnsPantallas;
    //Semaforos Pin Carga
    private Semaphore mutexPinCarga;
    private Semaphore semPinCarga;
    private Semaphore semEnsPinCarga;
    //Contadores de piezas en el almacen
    public static volatile int botonesDisp = 0;
    public static volatile int camarasDisp = 0;
    public static volatile int pantallasDisp = 0;
    public static volatile int pinCargaDisp = 0;
    //Contador de smartphones
    public static volatile int phonesDisp = 0;
    
    private int[] maxStorages;
    private int[] dailyProds;

    public Productores(int[] maxStorages, int[] dailyProds, int daysToDeliver, int dayDuration, int numBusiness) {
        super(daysToDeliver, dayDuration, numBusiness);
        
        //Botones
        this.mutexBotones = new Semaphore(1);
        this.semBotones = new Semaphore(maxStorages[0]);
        this.semEnsBotones = new Semaphore(0);
        //Camaras
        this.mutexCamaras = new Semaphore(1);
        this.semCamaras = new Semaphore(maxStorages[1]);
        this.semEnsCamaras = new Semaphore(0);
        //Pantallas
        this.mutexPantallas = new Semaphore(1);
        this.semPantallas = new Semaphore(maxStorages[2]);
        this.semEnsPantallas = new Semaphore(0);
        //Pin Carga
        this.mutexPinCarga = new Semaphore(1);
        this.semPinCarga = new Semaphore(maxStorages[3]);
        this.semEnsPinCarga = new Semaphore(0);
        
        this.maxStorages = maxStorages;
        this.dailyProds = dailyProds;
    }

    public Semaphore getMutexBotones() {
        return mutexBotones;
    }

    public Semaphore getSemBotones() {
        return semBotones;
    }

    public Semaphore getSemEnsBotones() {
        return semEnsBotones;
    }

    public Semaphore getMutexCamaras() {
        return mutexCamaras;
    }

    public Semaphore getSemCamaras() {
        return semCamaras;
    }

    public Semaphore getSemEnsCamaras() {
        return semEnsCamaras;
    }

    public Semaphore getMutexPantallas() {
        return mutexPantallas;
    }

    public Semaphore getSemPantallas() {
        return semPantallas;
    }

    public Semaphore getSemEnsPantallas() {
        return semEnsPantallas;
    }

    public Semaphore getMutexPinCarga() {
        return mutexPinCarga;
    }

    public Semaphore getSemPinCarga() {
        return semPinCarga;
    }

    public Semaphore getSemEnsPinCarga() {
        return semEnsPinCarga;
    }
    
    
}
