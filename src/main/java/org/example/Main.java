package org.example;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Medication medication1 = new Medication("med1", 15, true);
        Medication medication2 = new Medication("med2", 10, true);

        Pharmacy pharmacy = new Pharmacy();

        Map<String, Medication> medications = new HashMap<>();
        medications.put("med1", medication1);
        medications.put("med2", medication2);

        pharmacy.setMedication(medications);

        System.out.println(pharmacy.getMedication());
        System.out.println(pharmacy.getCount());
    }
}