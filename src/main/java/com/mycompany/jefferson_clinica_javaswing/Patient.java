package com.mycompany.jefferson_clinica_javaswing;

import java.util.Scanner;

public class Patient {

    private String name;
    private String cpf;
    private float hohe;
    private float gewicht;
    private double imc;
    private Scanner dagon = new Scanner(System.in);
    private String formatt;

    public Patient() {
        super();
    }

    public Patient(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public Patient(String name, String cpf, float hohe, float gewicht) {
        super();
        this.name = name;
        this.cpf = cpf;
        this.setHohe(hohe);
        this.gewicht = gewicht;
    }

    public Patient(boolean k) {

        System.out.println("Nome:");
        this.name = this.dagon.nextLine();

        System.out.println("CPF:");
        this.cpf = this.dagon.next();

        System.out.println("Altura (m):");
        this.setHohe(this.dagon.nextFloat());

        System.out.println("Peso (Kg):");
        this.gewicht = this.dagon.nextFloat();

        dagon.nextLine();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getHohe() {

        return hohe;
    }

    public void setHohe(float hohe) {
//		if (hohe > 99) {
//			hohe /= 100;
//		}
        this.hohe = hohe;
    }

    public float getGewicht() {
        return gewicht;
    }

    public void setGewicht(float gewicht) {
        this.gewicht = gewicht;
    }

    public double getImc() {

        return this.imc = this.gewicht / (Math.pow(this.hohe, 2));

    }

    @Override
    public String toString() {
        return "Nome: " + name + "\nCPF: " + cpf + "\nAltura: " + hohe + "\nPeso: " + gewicht + "\nIMC: "
                + formatt.format("%.2f", this.getImc()) + "\n\n";
    }

}
