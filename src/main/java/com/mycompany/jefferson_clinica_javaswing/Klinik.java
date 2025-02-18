package com.mycompany.jefferson_clinica_javaswing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Klinik {

    private int mengePat = 0;
    private int maxMengePat = 6;
    private Patient patient[];
    private Formular formular;
    private Zeigenpat zeigenpat;
    private Suchen suchen;
    private ZeigSuchenCpf zeigSuchenCpf;
    private SuchenImc suchenImc;

    //============Constructor===================//
    public Klinik() {
        super();

        this.patient = new Patient[this.maxMengePat];

    }
    //========================================//

    public SuchenImc getSuchenImc() {
        return suchenImc;
    }

    public void setSuchenImc(SuchenImc suchenImc) {
        this.suchenImc = suchenImc;
    }

    public void setZeigSuchenCpf(ZeigSuchenCpf zeigSuchenCpf) {
        this.zeigSuchenCpf = zeigSuchenCpf;
    }

    public ZeigSuchenCpf getZeigSuchenCpf() {
        return zeigSuchenCpf;
    }

    public Suchen getSuchen() {
        return suchen;
    }

    public int getMengePat() {
        return mengePat;
    }

    public void setSuchen(Suchen suchen) {
        this.suchen = suchen;
    }

    public void setZeigenpat(Zeigenpat zeigenpat) {
        this.zeigenpat = zeigenpat;
    }

    public void setFormular(Formular formular) {
        this.formular = formular;
    }

    public void starten(int auswahl) {

        switch (auswahl)
        {
            case 1:

                formular.setVisible(true);

                break;

            case 2:
                this.zeigenPatient();

                break;
            case 3:

                this.suchen.setVisible(true);

                break;

            case 4:

                this.suchenImc.setVisible(true);

                break;

            case 0:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
                break;
        }

    }

    public boolean eintragenPatient(Patient patient, Patient neupatient) {

        for (int x = 0; x < this.patient.length; x++)
        {

            if (neupatient != null && this.patient[x].equals(patient))
            {

                this.patient[x] = neupatient;

                return true;

            } else if (this.patient[x] == null)
            {
                this.patient[x] = patient;

                this.mengePat++;

                return true;
            }
        }
        return false;
    }

    public void zeigenPatient() {

        this.zeigenpat.getPatienten().setText("");
        for (Patient patient : this.patient)
        {
            if (patient != null)
            {
                this.zeigenpat.getPatienten().append(patient.toString());
            }

        }

        this.zeigenpat.setTitle(this.mengePat + " Pacientes Cadastrados!");
        this.zeigenpat.setVisible(true);

    }

    public Patient andernPatient(String cpf) {

        for (int z = 0; z < this.patient.length; z++)
        {

            if (patient[z] != null && patient[z].getCpf().equals(cpf))
            {

                this.zeigSuchenCpf.getPatientSuch().setText(patient[z].toString());

                return patient[z];
            }
        }

        return null;

    }

    public boolean suchenImc(float first, float last) {

        int count = 0;
        this.zeigenpat.getPatienten().setText("");

        for (Patient patient : this.patient)
        {

            if (patient != null && patient.getImc() >= first && patient.getImc() <= last)
            {
                this.zeigenpat.getPatienten().append(patient.toString());
                count++;
            }

        }

        if (count != 0)
        {

            this.zeigenpat.setTitle(count + " Pacientes Encontrados!");
            this.zeigenpat.setVisible(true);
            return true;
        }

        return false;

    }

}
