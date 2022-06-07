/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.Gestion_Gerente;
import Interfaces.Gestion_Gerente2;
import Interfaces.Gestion_Gerente3;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Nicolás Briceño
 */
public class Empresa extends Thread{
    
    private int daysToDeliver;
    private int dayDuration;
    private int numBusiness;
    private int[] maxStorages;
    private int[] dailyProds;
    private float managerMoney;
    private float bossMoney;
    private Semaphore mutexCounter;
    
    public Empresa(int daysToDeliver, int dayDuration, int numBusiness) {
        this.daysToDeliver = daysToDeliver;
        this.dayDuration = dayDuration;
        this.numBusiness = numBusiness;
        this.maxStorages = maxStorages;
        this.dailyProds = dailyProds;
        this.managerMoney = 0;
        this.bossMoney = 0;
        this.mutexCounter= new Semaphore(1); 
    }

    protected int getDaysToDeliver() {
        return daysToDeliver;
    }

    protected void setDaysToDeliver(int daysToDeliver) {
        this.daysToDeliver = daysToDeliver;
    }

    protected int getDayDuration() {
        return dayDuration;
    }

    protected int getNumBusiness() {
        return numBusiness;
    }

    protected float getManagerMoney() {
        return managerMoney;
    }

    protected void setManagerMoney(float managerMoney) {
        this.managerMoney = managerMoney;
    }

    protected float getBossMoney() {
        return bossMoney;
    }

    protected void setBossMoney(float bossMoney) {
        this.bossMoney = bossMoney;
    }

    protected Semaphore getMutexCounter() {
        return mutexCounter;
    }
    
    protected void payManager() {
        setManagerMoney(this.managerMoney + 180);
        switch (this.numBusiness) {
            case 1:
                Gestion_Gerente.wonSalary.setText(Integer.toString((int) this.managerMoney));
                break;
            case 2:
                Gestion_Gerente2.wonSalary.setText(Integer.toString((int) this.managerMoney));
                break;
            case 3:
                Gestion_Gerente3.wonSalary.setText(Integer.toString((int) this.managerMoney));
                break;
        }
    }
    
    
}
