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
public class Empresa {
        
    private Semaphore mutexCounter;
    private Gerente g1;
    private Gerente g2;
    private Gerente g3;
    
    public Empresa(int daysToDeliver, int dayDuration) {
        this.g1 = new Gerente(dayDuration, mutexCounter, daysToDeliver, 1);
        this.g2 = new Gerente(dayDuration, mutexCounter, daysToDeliver, 2);
        this.g3 = new Gerente(dayDuration, mutexCounter, daysToDeliver, 3);

    }
}
