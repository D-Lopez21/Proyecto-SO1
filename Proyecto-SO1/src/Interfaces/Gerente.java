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
public class Gerente extends Thread{
    
    private int dayDuration;
    private int daysToDeliver;
    private int reducedSalary;
    public static int money;
    private boolean stop;
    private Semaphore mutex;
    private int numBusiness;
    
    public Gerente(int dayDuration, Semaphore mutex, int daysToDeliver, int numBusiness){
        this.daysToDeliver = daysToDeliver;
        this.dayDuration = dayDuration;
        this.reducedSalary = 0;
        Gerente.money = 0;
        this.stop = false;
        this.mutex = mutex;
        this.numBusiness = numBusiness;
    }
    
    @Override
    public void run(){
        while(!this.stop){
            
            try{
                switch (this.numBusiness) {
                    case 1:
                        mutex.acquire();
                        if (Integer.parseInt(Empresa1.Dia_entrega.getText()) == 0){
                            Gestion_Gerente.Estado.setText("Trabajando");
                            Empresa1.Dia_entrega.setText(Integer.toString(daysToDeliver));
                        }else{
                            Gestion_Gerente.Estado.setText("Vigilando");
                            double checkPlay;
                            double vigilantTime = (dayDuration*(Math.floor(Math.random()*(18-12+1)+18))*1000)/24;
                            while (vigilantTime >= 0) {
                                checkPlay = (dayDuration*((long) Math.floor(Math.random()*(90-30+1)+30))*1000)/1440;
                                Thread.sleep((long) checkPlay);
                                if (Gestion_Jefe.state.equals("Jugando Clash Royale")) {
                                    Gestion_Jefe.money -= 2;
                                    this.reducedSalary += 2;
                                    Gestion_Jefe.lostMoney.setText(Integer.toString(this.reducedSalary));
                                }
                                vigilantTime -= checkPlay;
                            }
                        }   mutex.release();
                        break;
                    case 2:
                        mutex.acquire();
                        if (Integer.parseInt(Empresa2.Dia_entrega.getText()) == 0){
                            Gestion_Gerente2.Estado.setText("Trabajando");
                            Empresa2.Dia_entrega.setText(Integer.toString(daysToDeliver));
                        }else{
                            Gestion_Gerente2.Estado.setText("Vigilando");
                            double checkPlay;
                            double vigilantTime = (dayDuration*(Math.floor(Math.random()*(18-12+1)+18))*1000)/24;
                            while (vigilantTime >= 0) {
                                checkPlay = (dayDuration*((long) Math.floor(Math.random()*(90-30+1)+30))*1000)/1440;
                                Thread.sleep((long) checkPlay);
                                if (Gestion_Jefe2.state.equals("Jugando Clash Royale")) {
                                    Gestion_Jefe2.money -= 2;
                                    this.reducedSalary += 2;
                                    Gestion_Jefe2.lostMoney.setText(Integer.toString(this.reducedSalary));
                                }
                                vigilantTime -= checkPlay;
                            }
                        }   mutex.release();
                        break;
                    case 3:
                        mutex.acquire();
                        if (Integer.parseInt(Empresa3.Dia_entrega.getText()) == 0){
                            Gestion_Gerente3.Estado.setText("Trabajando");
                            Empresa3.Dia_entrega.setText(Integer.toString(daysToDeliver));
                        }else{
                            Gestion_Gerente3.Estado.setText("Vigilando");
                            double checkPlay;
                            double vigilantTime = (dayDuration*(Math.floor(Math.random()*(18-12+1)+18))*1000)/24;
                            while (vigilantTime >= 0) {
                                checkPlay = (dayDuration*((long) Math.floor(Math.random()*(90-30+1)+30))*1000)/1440;
                                Thread.sleep((long) checkPlay);
                                if (Gestion_Jefe3.state.equals("Jugando Clash Royale")) {
                                    Gestion_Jefe3.money -= 2;
                                    this.reducedSalary += 2;
                                    Gestion_Jefe3.lostMoney.setText(Integer.toString(this.reducedSalary));
                                }
                                vigilantTime -= checkPlay;
                            }
                        }   mutex.release();
                        break;
                    default:
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
