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
            
            int dayDuration = empresaObj.get("dayDuration").getAsInt();
            int daysToDeliver = empresaObj.get("daysToDeliver").getAsInt();
            int almacenMaxPa = empresaObj.get("almacenMaxPa").getAsInt();
            int almacenMaxBo = empresaObj.get("almacenMaxBo").getAsInt();
            int almacenMaxPin = empresaObj.get("almacenMaxPin").getAsInt();
            int almacenMaxCa = empresaObj.get("almacenMaxCa").getAsInt();
            int paDiarios = empresaObj.get("paDiarios").getAsInt();
            int boDiarios = empresaObj.get("boDiarios").getAsInt();
            int pinDiarios = empresaObj.get("pinDiarios").getAsInt();
            int caDiarios = empresaObj.get("caDiarios").getAsInt();
            int[] maxStorages = {almacenMaxPa, almacenMaxBo, almacenMaxPin, almacenMaxCa};
            int[] dailyProds = {paDiarios, boDiarios, pinDiarios, caDiarios};
            
            Empresa iNico = new Empresa(daysToDeliver, dayDuration, 1);
            iNico.createProds(maxStorages, dailyProds);
            Empresa UniPhone = new Empresa(daysToDeliver, dayDuration, 3);
            UniPhone.createProds(maxStorages, dailyProds);
            dailyProds[0] = paDiarios + 1;
            dailyProds[1] = boDiarios - 2;
            dailyProds[2] = pinDiarios + 1;
            Empresa Butterland = new Empresa(daysToDeliver, dayDuration, 2);
            Butterland.createProds(maxStorages, dailyProds);
            
        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "No se encontró el archivo de texto (json)","ALERTA", JOptionPane.WARNING_MESSAGE);
        }
    }
}