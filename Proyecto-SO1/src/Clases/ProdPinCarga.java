/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.Empresa1;
import Interfaces.Empresa2;
import Interfaces.Empresa3;
import Interfaces.Productor_Camara;
import Interfaces.Productor_Camara2;
import Interfaces.Productor_Camara3;
import Interfaces.Productor_Pantallas;
import Interfaces.Productor_Pantallas2;
import Interfaces.Productor_Pantallas3;
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
    private Semaphore semPinCarga;
    private Semaphore semEnsamblador;
    private int dailyProduce;
    private int dayDuration;
    private int numBusiness;
    private int maxPinCarga;

    public ProdPinCarga(int[] maxStorages, int[] dailyProds, int daysToDeliver, int dayDuration, int numBusiness) {
        super(maxStorages, dailyProds, daysToDeliver, dayDuration, numBusiness);
        this.stop = false;
        this.dailyProduce = dailyProds[2];
        this.maxPinCarga = maxStorages[3];
    }

    @Override
    public void run() {
        this.mutex = getMutexPinCarga();
        this.semPinCarga = getSemPinCarga();
        this.semEnsamblador = getSemEnsPinCarga();
        this.dayDuration = getDayDuration();
        this.numBusiness = getNumBusiness();
        while (!stop) {
            try {
                semPinCarga.acquire();

                Thread.sleep(Math.round(dayDuration * 1000 * dailyProduce));
                mutex.acquire();

                switch (numBusiness) {
                    case 1:
                        if (Productores.pinCargaDisp1 >= this.maxPinCarga) {
                            this.setStop(true);
                        } else {
                            Productores.pinCargaDisp1++;
                        }
                        Productor_Pin.pinDisp.setText(Integer.toString(Productores.pinCargaDisp1));
                        Empresa1.Valor_pin.setText(Integer.toString(Productores.pinCargaDisp1));
                        break;
                    case 2:
                        if (Productores.pinCargaDisp2 >= this.maxPinCarga) {
                            this.setStop(true);
                        } else {
                            Productores.pinCargaDisp2++;
                        }
                        Productor_Pin.pinDisp.setText(Integer.toString(Productores.pinCargaDisp2));
                        Empresa2.Valor_pin.setText(Integer.toString(Productores.pinCargaDisp2));
                        break;
                    case 3:
                        if (Productores.camarasDisp3 >= this.maxPinCarga) {
                            this.setStop(true);
                        } else {
                            Productores.camarasDisp3++;
                        }
                        Productor_Pin.pinDisp.setText(Integer.toString(Productores.camarasDisp3));
                        Empresa3.Valor_pin.setText(Integer.toString(Productores.camarasDisp3));
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