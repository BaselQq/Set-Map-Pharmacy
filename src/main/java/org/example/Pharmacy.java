package org.example;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class Pharmacy {

    private Map<String, Medication> medication;

    public Map<String, Medication> getMedication() {
        return medication;
    }

    public void setMedication(Map<String, Medication> medication) {
        this.medication = medication;
    }

    public long getCount() {
        return this.medication.size();
    }

    public void save(Medication medication) {
        this.medication.put(medication.getName(), medication);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "medication=" + medication +
                '}';
    }
}
