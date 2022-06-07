/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Nicolás Briceño
 */
public class Jefe extends Empresa{
    
    private String state;
    private boolean stop;

    public Jefe(boolean stop, int daysToDeliver, int dayDuration, int numBusiness) {
        super(daysToDeliver, dayDuration, numBusiness);
        this.stop = false;
    }
    
     public void run(){
        int dayDuration = getDayDuration();
        int numBusiness = getNumBusiness();
        Semaphore mutex = getMutexCounter();
        double chillTime = (dayDuration*1000) - (dayDuration*1000)/24;
        int salaryTime = 0;
        while(!this.stop){
            float money = getBossMoney();
            int daysToDeliver = getDaysToDeliver();
            try{
                switch (numBusiness) {
                    case 1:
                        while (chillTime > 0) {
                            state = "Jugando Clash Royale";
                            Gestion_Jefe.Estado.setText(state);
                            Thread.sleep((dayDuration*15000)/1440);
                            state = "Revisando papeles";
                            Gestion_Jefe.Estado.setText(state);
                            Thread.sleep((dayDuration*15000)/1440);
                            chillTime -= (dayDuration*30000)/1440;
                            salaryTime++;
                            if ((salaryTime % 2) == 0) {
                                money += 7;
                                setBossMoney(money);
                                Gestion_Jefe.wonSalary.setText(Float.toString(money));
                            }
                        }
                        mutex.acquire();
                        state = "Trabajando";
                        Gestion_Jefe.Estado.setText(state);
                        Thread.sleep((dayDuration*1000)/24);
                        daysToDeliver--;
                        setDaysToDeliver(daysToDeliver);
                        payManager();
                        Empresa1.Dia_entrega.setText(Integer.toString(daysToDeliver));
                        mutex.release();
                        break;
                    case 2:
                        while (chillTime > 0) {
                            state = "Jugando Clash Royale";
                            Gestion_Jefe2.Estado.setText(state);
                            Thread.sleep((dayDuration*15000)/1440);
                            state = "Revisando papeles";
                            Gestion_Jefe2.Estado.setText(state);
                            Thread.sleep((dayDuration*15000)/1440);
                            chillTime -= (dayDuration*30000)/1440;
                            salaryTime++;
                            if ((salaryTime % 2) == 0) {
                                money += 7;
                                setBossMoney(money);
                                Gestion_Jefe2.wonSalary.setText(Float.toString(money));
                            }
                        }
                        mutex.acquire();
                        state = "Trabajando";
                        Gestion_Jefe2.Estado.setText(state);
                        Thread.sleep((dayDuration*1000)/24);
                        daysToDeliver--;
                        setDaysToDeliver(daysToDeliver);
                        payManager();
                        Empresa2.Dia_entrega.setText(Integer.toString(daysToDeliver));
                        mutex.release();
                        break;
                    case 3:
                        while (chillTime > 0) {
                            state = "Jugando Clash Royale";
                            Gestion_Jefe3.Estado.setText(state);
                            Thread.sleep((dayDuration*15000)/1440);
                            state = "Revisando papeles";
                            Gestion_Jefe3.Estado.setText(state);
                            Thread.sleep((dayDuration*15000)/1440);
                            chillTime -= (dayDuration*30000)/1440;
                            salaryTime++;
                            if ((salaryTime % 2) == 0) {
                                money += 7;
                                setBossMoney(money);
                                Gestion_Jefe3.wonSalary.setText(Float.toString(money));
                            }
                        }
                        mutex.acquire();
                        state = "Trabajando";
                        Gestion_Jefe3.Estado.setText(state);
                        Thread.sleep((dayDuration*1000)/24);
                        daysToDeliver--;
                        setDaysToDeliver(daysToDeliver);
                        payManager();
                        Empresa3.Dia_entrega.setText(Integer.toString(daysToDeliver));
                        mutex.release();
                        break;
                }
                
            }catch(Exception e){
                
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
