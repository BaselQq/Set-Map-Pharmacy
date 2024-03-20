package org.example;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Medication medication1 = new Medication("med1", 15, true);
        Medication medication2 = new Medication("med2", 10, true);
        Medication medication3 = new Medication("med3", 10, true);
        Medication medication4 = new Medication("med4", 11, true);

        Pharmacy pharmacy = new Pharmacy();

        Map<String, Medication> medications = new HashMap<>();
        medications.put("med1", medication1);
        medications.put("med2", medication2);
        medications.put("med3", medication3);

        pharmacy.setMedication(medications);

        // save new medication if medication is new one
        pharmacy.save(medication4);

        System.out.println(pharmacy.getMedication());
        System.out.println(pharmacy.getCount());

        System.out.println(pharmacy.find("med1"));

        // remove one medication
        pharmacy.delete("med1");
        System.out.println(medications);
    }
}