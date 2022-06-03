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
 * @author andre
 */
public class LecturaArchivos {
    public void readJson() {
        
        JsonParser parser = new JsonParser();
        Gson gson = new Gson();

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/projectFiles/data.json"));
            Object json = gson.fromJson(br, Object.class).toString();
            String strJson = json.toString();
            JsonObject jsonObj = parser.parse(strJson).getAsJsonObject();
            
            //Variables del Json - dias
            JsonElement days = jsonObj.get("days").getAsJsonArray().get(0);
            JsonObject daysObj = parser.parse(days.toString()).getAsJsonObject();
            double numRound1 = Double.parseDouble(daysObj.get("timeSeg").toString());
            dayDuration = (int)numRound1; //luego de la conversión, el 1 estaba como 1.0, se convierte a 1
            double numRound2 = Double.parseDouble(daysObj.get("counter").toString());
            daysToDeliver = (int)numRound2;

            //Variables del Json - productores
            for (int j = 0; j < 0; j++){
                JsonElement companies = jsonObj.get("companies").getAsJsonArray().get(j);
                JsonObject companiesObj = parser.parse(companies.toString()).getAsJsonObject();
                for (int i = 0; i < 4; i++) {
                    JsonElement producers = jsonObj.get("producers").getAsJsonArray().get(i);
                    JsonObject producersObj = parser.parse(producers.toString()).getAsJsonObject();
                    switch (i) {
                        case 0:
                            double a = Double.parseDouble(producersObj.get("maxStorage").toString());
                            maxStorageCamaras = (int)a;
                            double b = Double.parseDouble(producersObj.get("numProducers").toString());
                            numProdCamaras = (int)b;
                            double c = Double.parseDouble(producersObj.get("maxProducers").toString());
                            maxProdCamaras = (int)c;
                            break;
                        case 1:
                            double d = Double.parseDouble(producersObj.get("maxStorage").toString());
                            maxStorageBotones = (int)d;
                            double e = Double.parseDouble(producersObj.get("numProducers").toString());
                            numProdBotones = (int)e;
                            double f = Double.parseDouble(producersObj.get("maxProducers").toString());
                            maxProdBotones = (int)f;
                            break;
                        case 2:
                            double g = Double.parseDouble(producersObj.get("maxStorage").toString());
                            maxStoragePantallas = (int)g;
                            double h = Double.parseDouble(producersObj.get("numProducers").toString());
                            numProdPantallas = (int)h;
                            double n = Double.parseDouble(producersObj.get("maxProducers").toString());
                            maxProdPantallas = (int)n;
                            break;
                        case 3:
                            double l = Double.parseDouble(producersObj.get("maxStorage").toString());
                            maxStoragePins = (int)l;
                            double m = Double.parseDouble(producersObj.get("numProducers").toString());
                            numProdPins = (int)m;
                            double k = Double.parseDouble(producersObj.get("maxProducers").toString());
                            maxProdPins = (int)k;
                            break;
                    }
            }
            }
          
            //Variables del Json - ensambladores
            JsonElement assemblers = jsonObj.get("assemblers").getAsJsonArray().get(0);
            JsonObject assemObj = parser.parse(assemblers.toString()).getAsJsonObject();
            double numRound3 = Double.parseDouble(assemObj.get("numAssemblers").toString());
            numAssemblers = (int)numRound3; //continúa el problema de que los números del json se formatean como doubles (ejem 1.0 en vez de 1)
            double numRound4 = Double.parseDouble(assemObj.get("maxAssemblers").toString());
            maxAssemblers = (int)numRound4;
            
        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(this, "No se encontró el archivo de texto (json)","ALERTA", JOptionPane.WARNING_MESSAGE);
        }
}
