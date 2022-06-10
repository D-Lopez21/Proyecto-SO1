/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JOptionPane;
/**
 *
 * @author Andres y Nicolas
 */
public class Lectura {
    
    private int dayDuration;
    private int daysToDeliver;
    private int[] maxStorages;
    private int[] dailyProds;
    private int[] dailyProds2;
    
    public void readJson() {
        
        JsonParser parser = new JsonParser();
        Gson gson = new Gson();

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Clases/data.json"));
            Object json = gson.fromJson(br, Object.class).toString();
            String strJson = json.toString();
            JsonObject jsonObj = parser.parse(strJson).getAsJsonObject();
            
            JsonElement empresa = jsonObj.get("empresa").getAsJsonArray().get(0);
            JsonObject empresaObj = parser.parse(empresa.toString()).getAsJsonObject();
            
            this.setDayDuration(empresaObj.get("dayDuration").getAsInt());
            this.setDaysToDeliver(empresaObj.get("daysToDeliver").getAsInt());
            
            int[] storages = {0,0,0,0};
            storages[0] = empresaObj.get("almacenMaxPa").getAsInt();
            storages[1] = empresaObj.get("almacenMaxBo").getAsInt();
            storages[2] = empresaObj.get("almacenMaxPin").getAsInt();
            storages[3] = empresaObj.get("almacenMaxCa").getAsInt();
            this.setMaxStorages(storages);
            
            int[] dayProds = {0,0,0,0};
            dayProds[0] = empresaObj.get("paDiarios").getAsInt();
            dayProds[1] = empresaObj.get("boDiarios").getAsInt();
            dayProds[2] = empresaObj.get("pinDiarios").getAsInt();
            dayProds[3] = empresaObj.get("caDiarios").getAsInt();
            this.setDailyProds(dayProds);
            
            int[] dayProds2 = {0,0,0,0};
            dayProds2[0] = dayProds[0] + 1;
            dayProds2[1] = dayProds[1] - 2;
            dayProds2[2] = dayProds[2] + 1;
            dayProds2[3] = dayProds[3];
            this.setDailyProds2(dayProds2);

            
        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "No se encontró el archivo de texto (json)","ALERTA", JOptionPane.WARNING_MESSAGE);
        }
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getDaysToDeliver() {
        return daysToDeliver;
    }

    public void setDaysToDeliver(int daysToDeliver) {
        this.daysToDeliver = daysToDeliver;
    }

    public int[] getMaxStorages() {
        return maxStorages;
    }

    public void setMaxStorages(int[] maxStorages) {
        this.maxStorages = maxStorages;
    }

    public int[] getDailyProds() {
        return dailyProds;
    }

    public void setDailyProds(int[] dailyProds) {
        this.dailyProds = dailyProds;
    }

    public int[] getDailyProds2() {
        return dailyProds2;
    }

    public void setDailyProds2(int[] dailyProds2) {
        this.dailyProds2 = dailyProds2;
    }
    
}