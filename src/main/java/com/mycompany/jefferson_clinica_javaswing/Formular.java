/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jefferson_clinica_javaswing;

import javax.swing.JOptionPane;

/**
 *
 * @author Dagon
 */
public class Formular extends javax.swing.JFrame {

    private Klinik klinik;

    public Formular() {
        initComponents();
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        geral = new javax.swing.JPanel();
        geral2 = new javax.swing.JPanel();
        daten = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        cpff = new javax.swing.JLabel();
        altura = new javax.swing.JLabel();
        peso = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        cpf = new javax.swing.JFormattedTextField();
        hohe = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        gewicht = new javax.swing.JTextField();
        title = new javax.swing.JPanel();
        cadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("formular");

        geral2.setBackground(new java.awt.Color(0, 102, 102));

        daten.setBackground(new java.awt.Color(0, 102, 102));

        nome.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        nome.setText("Nome:");

        cpff.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        cpff.setText("CPF:");

        altura.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        altura.setText("Altura (m):");

        peso.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        peso.setText("Peso (Kg):");

        name.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });

        try {
            hohe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        hohe.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        hohe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoheActionPerformed(evt);
            }
        });

        jButton1.setBackground(java.awt.SystemColor.activeCaption);
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gewicht.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        gewicht.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gewichtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout datenLayout = new javax.swing.GroupLayout(daten);
        daten.setLayout(datenLayout);
        datenLayout.setHorizontalGroup(
            datenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datenLayout.createSequentialGroup()
                .addComponent(altura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hohe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(peso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gewicht, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(datenLayout.createSequentialGroup()
                .addGroup(datenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome)
                    .addComponent(cpff))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name)
                    .addGroup(datenLayout.createSequentialGroup()
                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(datenLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jButton1)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        datenLayout.setVerticalGroup(
            datenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(datenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpff)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(datenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altura)
                    .addComponent(hohe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peso)
                    .addComponent(gewicht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        title.setBackground(new java.awt.Color(0, 102, 102));
        title.setLayout(new java.awt.BorderLayout());

        cadastro.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        cadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cadastro.setText("Cadastro de Pacientes");

        javax.swing.GroupLayout geral2Layout = new javax.swing.GroupLayout(geral2);
        geral2.setLayout(geral2Layout);
        geral2Layout.setHorizontalGroup(
            geral2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(geral2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(geral2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(daten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        geral2Layout.setVerticalGroup(
            geral2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geral2Layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(daten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout geralLayout = new javax.swing.GroupLayout(geral);
        geral.setLayout(geralLayout);
        geralLayout.setHorizontalGroup(
            geralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(geral2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        geralLayout.setVerticalGroup(
            geralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geralLayout.createSequentialGroup()
                .addComponent(geral2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(geral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(geral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
    }//GEN-LAST:event_cpfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String peso = this.gewicht.getText().trim();
        if (this.klinik.eintragenPatient(new Patient(this.name.getText(), this.cpf.getText(), Float.parseFloat(this.hohe.getText().trim()), Float.parseFloat(peso)), null))
        {
            this.name.setText("");
            this.cpf.setText("");
            this.hohe.setText("");
            this.gewicht.setText("");
            JOptionPane.showMessageDialog(null, "Cadastrado realizado com Sucesso!");

            this.setVisible(false);
        } else
        {/*, */
            JOptionPane.showMessageDialog(null, "Falha ao tentar cadastrar!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void hoheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoheActionPerformed
    }//GEN-LAST:event_hoheActionPerformed

    private void gewichtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gewichtKeyTyped

        String satan = "0123456789.";
        if (!satan.contains(evt.getKeyChar() + "") || gewicht.getText().length() >= 5)
        {
            evt.consume();
        }
    }//GEN-LAST:event_gewichtKeyTyped

    public static void main(String args[]) {

        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Formular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Formular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Formular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Formular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel altura;
    private javax.swing.JLabel cadastro;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JLabel cpff;
    private javax.swing.JPanel daten;
    private javax.swing.JPanel geral;
    private javax.swing.JPanel geral2;
    private javax.swing.JTextField gewicht;
    private javax.swing.JFormattedTextField hohe;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel peso;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
