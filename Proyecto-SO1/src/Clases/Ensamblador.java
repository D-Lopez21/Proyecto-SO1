/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.Ensambladores;
import Interfaces.Ensambladores2;
import Interfaces.Ensambladores3;
import java.util.concurrent.Semaphore;
/**
 *
 * @author andre
 */
public class Ensamblador extends Productores{
    
    private int dayDuration;
    private boolean stop;
    private Semaphore mutexEnsamblador;
    private int camaras;
    private int pantalla;
    private int botones;
    private int pin = 1;

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

    public Ensamblador(Semaphore mutexEnsamblador, int[] maxStorages, int[] dailyProds, int daysToDeliver, int dayDuration, int numBusiness) {
        super(maxStorages, dailyProds, daysToDeliver, dayDuration, numBusiness);
        this.stop = true;
        this.mutexEnsamblador = new Semaphore(1);
    }

    public void run(){
        
        mutexBotones = getMutexBotones();
        semBotones = getSemBotones();
        semEnsBotones = getSemEnsBotones();
        mutexCamaras = getMutexCamaras();
        semCamaras = getSemCamaras();
        semEnsCamaras = getSemEnsCamaras();
        mutexPantallas = getMutexPantallas();
        semPantallas = getSemPantallas();
        semEnsPantallas = getSemEnsPantallas();
        mutexPinCarga = getMutexPinCarga();
        semPinCarga = getSemPinCarga();
        semEnsPinCarga = getSemEnsPinCarga();
        
        dayDuration = getDayDuration();
        int numBusiness = getNumBusiness();
        switch (numBusiness) {
            case 1:
                camaras = 4;
                pantalla = 1;
                botones = 3;
                break;
            case 2:
                camaras = 3;
                pantalla = 1;
                botones = 4;
                break;
            case 3:
                camaras = 4;
                pantalla = 2;
                botones = 3;
                break;
        }
        
        while(true){
            if (!this.stop) {
                try{
                    //hacemos acquire a los semáforos de productor
                    semEnsPantallas.acquire(pantalla);
                    semEnsBotones.acquire(botones);
                    semEnsCamaras.acquire(camaras);
                    semEnsPinCarga.acquire(pin);

                    Thread.sleep(dayDuration*1000*2);
                    
                    mutexPantallas.acquire(pantalla);
                    //Saco la cantidad de pantallas que necesito
                    Productores.pantallasDisp -= pantalla;
                    switch (numBusiness) {
                    case 1:
                        Ensambladores.Valor_pantallas.setText(Integer.toString(Productores.pantallasDisp));
                        break;
                    case 2:
                        Ensambladores2.Valor_pantallas.setText(Integer.toString(Productores.pantallasDisp));
                        break;
                    case 3:
                        Ensambladores3.Valor_pantallas.setText(Integer.toString(Productores.pantallasDisp));
                        break;
                    }
                    mutexPantallas.release();
                    
                    semPantallas.release(pantalla); //liberamos semáforo de productor

                    mutexBotones.acquire();
                    //Saco la cantidad de botones que necesito
                    Productores.botonesDisp -= botones;
                    switch (numBusiness) {
                    case 1:
                        Ensambladores.Valor_botones.setText(Integer.toString(Productores.botonesDisp));
                        break;
                    case 2:
                        Ensambladores2.Valor_botones.setText(Integer.toString(Productores.botonesDisp));
                        break;
                    case 3:
                        Ensambladores3.Valor_botones.setText(Integer.toString(Productores.botonesDisp));
                        break;
                    }
                    mutexBotones.release();
                    
                    semBotones.release(botones); //liberamos semáforo de productor

                    mutexCamaras.acquire();
                    //Saco la cantidad de camaras que necesito
                    Productores.camarasDisp -= camaras;
                    switch (numBusiness) {
                    case 1:
                        Ensambladores.Valor_camara.setText(Integer.toString(Productores.camarasDisp));
                        break;
                    case 2:
                        Ensambladores2.Valor_camara.setText(Integer.toString(Productores.camarasDisp));
                        break;
                    case 3:
                        Ensambladores3.Valor_camara.setText(Integer.toString(Productores.camarasDisp));
                        break;
                    }
                    mutexCamaras.release();
                    
                    semCamaras.release(camaras); //liberamos semáforo de productor

                    mutexPinCarga.acquire();
                    //Saco la cantidad de pins de carga que necesito
                    Productores.pinCargaDisp -= pin;
                    switch (numBusiness) {
                    case 1:
                        Ensambladores.Valor_pin.setText(Integer.toString(Productores.pinCargaDisp));
                        break;
                    case 2:
                        Ensambladores2.Valor_pin.setText(Integer.toString(Productores.pinCargaDisp));
                        break;
                    case 3:
                        Ensambladores3.Valor_pin.setText(Integer.toString(Productores.pinCargaDisp));
                        break;
                    }
                    mutexPinCarga.release();
                    
                    semPinCarga.release(pin); //liberamos semáforo de productor

                    mutexEnsamblador.acquire();

                    Productores.phonesDisp++;
                    switch (numBusiness) {
                    case 1:
                        Ensambladores.assemblyPhones.setText(Integer.toString(Productores.phonesDisp));
                        break;
                    case 2:
                        Ensambladores2.assemblyPhones.setText(Integer.toString(Productores.phonesDisp));
                        break;
                    case 3:
                        Ensambladores3.assemblyPhones.setText(Integer.toString(Productores.phonesDisp));
                        break;
                    }

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