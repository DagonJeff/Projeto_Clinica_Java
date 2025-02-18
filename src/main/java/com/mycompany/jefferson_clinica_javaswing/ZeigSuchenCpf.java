package com.mycompany.jefferson_clinica_javaswing;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Dagon
 */
public class ZeigSuchenCpf extends javax.swing.JFrame {

    private Patient patient;
    private Klinik klinik;

    //=============Constructor==================//
    public ZeigSuchenCpf() {
        initComponents();
        this.patientSuch.setEditable(false);

    }
    //=========================================//

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public Patient getPatient() {
        return patient;
    }

    public JTextArea getPatientSuch() {
        return patientSuch;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SuchenDaten = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientSuch = new javax.swing.JTextArea();
        titlePat = new javax.swing.JLabel();
        neuDaten = new javax.swing.JPanel();
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
        titleNeu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        SuchenDaten.setBackground(new java.awt.Color(0, 102, 102));

        patientSuch.setBackground(new java.awt.Color(0, 145, 125));
        patientSuch.setColumns(20);
        patientSuch.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        patientSuch.setRows(5);
        jScrollPane1.setViewportView(patientSuch);

        titlePat.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        titlePat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlePat.setText("Paciente");

        javax.swing.GroupLayout SuchenDatenLayout = new javax.swing.GroupLayout(SuchenDaten);
        SuchenDaten.setLayout(SuchenDatenLayout);
        SuchenDatenLayout.setHorizontalGroup(
            SuchenDatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuchenDatenLayout.createSequentialGroup()
                .addComponent(titlePat, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(SuchenDatenLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SuchenDatenLayout.setVerticalGroup(
            SuchenDatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SuchenDatenLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(titlePat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        neuDaten.setBackground(new java.awt.Color(0, 102, 102));

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
        jButton1.setText("Atualizar");
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

        titleNeu.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        titleNeu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleNeu.setText("Insira os novos dados:");

        javax.swing.GroupLayout neuDatenLayout = new javax.swing.GroupLayout(neuDaten);
        neuDaten.setLayout(neuDatenLayout);
        neuDatenLayout.setHorizontalGroup(
            neuDatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(neuDatenLayout.createSequentialGroup()
                .addComponent(titleNeu, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, neuDatenLayout.createSequentialGroup()
                .addComponent(daten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        neuDatenLayout.setVerticalGroup(
            neuDatenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, neuDatenLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleNeu)
                .addGap(31, 31, 31)
                .addComponent(daten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(SuchenDaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(neuDaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(neuDaten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SuchenDaten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
    }//GEN-LAST:event_cpfActionPerformed

    private void hoheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoheActionPerformed
    }//GEN-LAST:event_hoheActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String peso = this.gewicht.getText().trim();
        this.patient = new Patient(this.name.getText(), this.cpf.getText(), Float.parseFloat(this.hohe.getText()), Float.parseFloat(peso));

        if (this.klinik.eintragenPatient(this.klinik.getSuchen().getPatientZuchen(), this.patient))
        {

            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");

            this.name.setText("");
            this.cpf.setText("");
            this.hohe.setText("");
            this.gewicht.setText("");

            this.setVisible(false);
        } else
        {
            JOptionPane.showMessageDialog(null, "Falha ao tentar atualizar!");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ZeigSuchenCpf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ZeigSuchenCpf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ZeigSuchenCpf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ZeigSuchenCpf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new ZeigSuchenCpf().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SuchenDaten;
    private javax.swing.JLabel altura;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JLabel cpff;
    private javax.swing.JPanel daten;
    private javax.swing.JTextField gewicht;
    private javax.swing.JFormattedTextField hohe;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JPanel neuDaten;
    private javax.swing.JLabel nome;
    private javax.swing.JTextArea patientSuch;
    private javax.swing.JLabel peso;
    private javax.swing.JLabel titleNeu;
    private javax.swing.JLabel titlePat;
    // End of variables declaration//GEN-END:variables
}
