/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Empresa;
import Interfaces.Empresa1;
import Interfaces.Empresa2;
import Interfaces.Empresa3;
import Interfaces.Gestion_Gerente;
import Interfaces.Gestion_Gerente2;
import Interfaces.Gestion_Gerente3;
import Interfaces.Gestion_Jefe;
import Interfaces.Gestion_Jefe2;
import Interfaces.Gestion_Jefe3;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Nicolás Briceño
 */
public class Gerente extends Empresa{
    
    private int reducedSalary;
    private boolean stop;

    public Gerente(int daysToDeliver, int dayDuration, int numBusiness) {
        super(daysToDeliver, dayDuration, numBusiness);
        this.reducedSalary = 0;
        this.stop = false;
    }
    
    @Override
    public void run(){
        int dayDuration = getDayDuration();
        int numBusiness = getNumBusiness();
        Semaphore mutex = getMutexCounter();
        while(!this.stop){
            double checkPlay = (dayDuration*((long) Math.floor(Math.random()*(90-30+1)+30))*1000)/1440;
            double vigilantTime = (dayDuration*(Math.floor(Math.random()*(18-12+1)+18))*1000)/24;
            float money = getBossMoney();
            int daysToDeliver = getDaysToDeliver();
            try{
                switch (numBusiness) {
                    case 1:
                        mutex.acquire();
                        if (Integer.parseInt(Empresa1.Dia_entrega.getText()) == 0){
                            Gestion_Gerente.Estado.setText("Trabajando");
                            Empresa1.Dia_entrega.setText(Integer.toString(daysToDeliver));
                        }else{
                            Gestion_Gerente.Estado.setText("Vigilando");
                            while (vigilantTime >= 0) {
                                Thread.sleep((long) checkPlay);
                                if (Gestion_Jefe.Estado.getText().equals("Jugando Clash Royale")) {
                                    money -= 2;
                                    setBossMoney(money);
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
                            while (vigilantTime >= 0) {
                                Thread.sleep((long) checkPlay);
                                if (Gestion_Jefe2.Estado.getText().equals("Jugando Clash Royale")) {
                                    money -= 2;
                                    setBossMoney(money);
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
                            while (vigilantTime >= 0) {
                                Thread.sleep((long) checkPlay);
                                if (Gestion_Jefe3.Estado.getText().equals("Jugando Clash Royale")) {
                                    money -= 2;
                                    setBossMoney(money);
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
