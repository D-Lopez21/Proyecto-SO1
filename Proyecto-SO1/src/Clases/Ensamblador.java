/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.Empresa1;
import Interfaces.Empresa2;
import Interfaces.Empresa3;
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
        this.stop = false;
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
                    switch (numBusiness) {
                    case 1:
                        Productores.pantallasDisp1 -= pantalla;
                        Ensambladores.Valor_pantallas.setText(Integer.toString(Productores.pantallasDisp1));
                        break;
                    case 2:
                        Productores.pantallasDisp2 -= pantalla;
                        Ensambladores2.Valor_pantallas.setText(Integer.toString(Productores.pantallasDisp2));
                        break;
                    case 3:
                        Productores.pantallasDisp3 -= pantalla;
                        Ensambladores3.Valor_pantallas.setText(Integer.toString(Productores.pantallasDisp3));
                        break;
                    }
                    mutexPantallas.release();
                    
                    semPantallas.release(pantalla); //liberamos semáforo de productor

                    mutexBotones.acquire();
                    //Saco la cantidad de botones que necesito
                    switch (numBusiness) {
                    case 1:
                        Productores.botonesDisp1 -= botones;
                        Ensambladores.Valor_botones.setText(Integer.toString(Productores.botonesDisp1));
                        break;
                    case 2:
                        Productores.botonesDisp2 -= botones;
                        Ensambladores2.Valor_botones.setText(Integer.toString(Productores.botonesDisp2));
                        break;
                    case 3:
                        Productores.botonesDisp3 -= botones;
                        Ensambladores3.Valor_botones.setText(Integer.toString(Productores.botonesDisp3));
                        break;
                    }
                    mutexBotones.release();
                    
                    semBotones.release(botones); //liberamos semáforo de productor

                    mutexCamaras.acquire();
                    //Saco la cantidad de camaras que necesito
                    switch (numBusiness) {
                    case 1:
                        Productores.camarasDisp1 -= camaras;
                        Ensambladores.Valor_camara.setText(Integer.toString(Productores.camarasDisp1));
                        break;
                    case 2:
                        Productores.camarasDisp2 -= camaras;
                        Ensambladores2.Valor_camara.setText(Integer.toString(Productores.camarasDisp2));
                        break;
                    case 3:
                        Productores.camarasDisp3 -= camaras;
                        Ensambladores3.Valor_camara.setText(Integer.toString(Productores.camarasDisp3));
                        break;
                    }
                    mutexCamaras.release();
                    
                    semCamaras.release(camaras); //liberamos semáforo de productor

                    mutexPinCarga.acquire();
                    //Saco la cantidad de pins de carga que necesito
                    switch (numBusiness) {
                    case 1:
                        Productores.pinCargaDisp1 -= pin;
                        Ensambladores.Valor_pin.setText(Integer.toString(Productores.pinCargaDisp1));
                        break;
                    case 2:
                        Productores.pinCargaDisp2 -= pin;
                        Ensambladores2.Valor_pin.setText(Integer.toString(Productores.pinCargaDisp2));
                        break;
                    case 3:
                        Productores.pinCargaDisp3 -= pin;
                        Ensambladores3.Valor_pin.setText(Integer.toString(Productores.pinCargaDisp3));
                        break;
                    }
                    mutexPinCarga.release();
                    
                    semPinCarga.release(pin); //liberamos semáforo de productor

                    mutexEnsamblador.acquire();

                    switch (numBusiness) {
                    case 1:
                        Productores.phonesDisp1++;
                        Ensambladores.assemblyPhones.setText(Integer.toString(Productores.phonesDisp1));
                        Empresa1.TlfVendidos.setText(Integer.toString(Productores.phonesDisp1));
                        break;
                    case 2:
                        Productores.phonesDisp2++;
                        Ensambladores2.assemblyPhones.setText(Integer.toString(Productores.phonesDisp2));
                        Empresa2.TlfVendidos.setText(Integer.toString(Productores.phonesDisp2));
                        break;
                    case 3:
                        Productores.phonesDisp3++;
                        Ensambladores3.assemblyPhones.setText(Integer.toString(Productores.phonesDisp3));
                        Empresa3.TlfVendidos.setText(Integer.toString(Productores.phonesDisp2));
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