package com.example.lab9.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Masina {

    @Id
    private String numarInmatriculare;
    private String marca;
    private int anFabricatie;
    private String culoare;
    private int kilometri;

    public Masina(String numarInmatriculare, String marca, int anFabricatie, String culoare, int kilometri) {
        this.numarInmatriculare = numarInmatriculare;
        this.marca = marca;
        this.anFabricatie = anFabricatie;
        this.culoare = culoare;
        this.kilometri = kilometri;
    }

    public Masina() {
    }

    public String getNumarInmatriculare() {
        return numarInmatriculare;
    }

    public void setNumarInmatriculare(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getKilometri() {
        return kilometri;
    }

    public void setKilometri(int kilometri) {
        this.kilometri = kilometri;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "numarInmatriculare='" + numarInmatriculare + '\'' +
                ", marca='" + marca + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", culoare='" + culoare + '\'' +
                ", kilometri=" + kilometri +
                '}';
    }
}
