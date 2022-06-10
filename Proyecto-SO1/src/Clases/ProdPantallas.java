/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.Empresa1;
import Interfaces.Empresa2;
import Interfaces.Empresa3;
import Interfaces.Productor_Pantallas;
import Interfaces.Productor_Pantallas2;
import Interfaces.Productor_Pantallas3;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Andres y Nicolas
 */
public class ProdPantallas extends Productores{

    private boolean stop;
    private Semaphore mutex;
    private Semaphore semPantallas;
    private Semaphore semEnsamblador;
    private int dailyProduce;
    private int dayDuration;
    private int numBusiness;
    private int maxPantallas;

    public ProdPantallas(int[] maxStorages, int[] dailyProds, int daysToDeliver, int dayDuration, int numBusiness) {
        super(maxStorages, dailyProds, daysToDeliver, dayDuration, numBusiness);
        this.stop = false;
        this.dailyProduce = dailyProds[0];
        this.maxPantallas = maxStorages[2];

    }

    @Override
    public void run() {
        this.mutex = getMutexPantallas();
        this.semPantallas = getSemPantallas();
        this.semEnsamblador = getSemEnsPantallas();
        this.dayDuration = getDayDuration();
        this.numBusiness = getNumBusiness();
        while (!stop) {
            try {
                semPantallas.acquire();

                Thread.sleep(Math.round((dayDuration * 1000) / dailyProduce));
                mutex.acquire();
                switch (numBusiness) {
                    case 1:
                        if (Productores.pantallasDisp1 >= this.maxPantallas) {
                            this.setStop(true);
                        } else {
                            Productores.pantallasDisp1++;
                        }
                        Productor_Pantallas.panDisp.setText(Integer.toString(Productores.pantallasDisp1));
                        Empresa1.Valor_pantallas.setText(Integer.toString(Productores.pantallasDisp1));
                        break;
                    case 2:
                        if (Productores.pantallasDisp2 >= this.maxPantallas) {
                            this.setStop(true);
                        } else {
                            Productores.pantallasDisp2++;
                        }
                        Productor_Pantallas2.panDisp.setText(Integer.toString(Productores.pantallasDisp2));
                        Empresa2.Valor_pantallas.setText(Integer.toString(Productores.pantallasDisp2));
                        break;
                    case 3:
                        if (Productores.pantallasDisp3 >= this.maxPantallas) {
                            this.setStop(true);
                        } else {
                            Productores.pantallasDisp3++;
                        }
                        Productor_Pantallas3.panDisp.setText(Integer.toString(Productores.pantallasDisp3));
                        Empresa3.Valor_pantallas.setText(Integer.toString(Productores.pantallasDisp3));
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
