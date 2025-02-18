package com.mycompany.jefferson_clinica_javaswing;

import java.awt.event.KeyEvent;

/**
 *
 * @author Dagon
 */
public class Hauptmenu extends javax.swing.JFrame {

    private Klinik klinik;
    private Formular formular;
    private Zeigenpat zeigenpat;
    private Suchen suchen;
    private ZeigSuchenCpf zeigSuchenCpf;
    private SuchenImc suchenImc;

    public Hauptmenu() {

        initComponents();
        this.klinik = new Klinik();
        this.formular = new Formular();
        this.zeigenpat = new Zeigenpat();
        this.suchen = new Suchen();
        this.zeigSuchenCpf = new ZeigSuchenCpf();
        this.suchenImc = new SuchenImc();

        formular.setKlinik(this.klinik);
        klinik.setFormular(formular);
        klinik.setZeigenpat(this.zeigenpat);
        suchen.setKlinik(this.klinik);
        klinik.setSuchen(suchen);
        zeigSuchenCpf.setKlinik(this.klinik);
        klinik.setZeigSuchenCpf(zeigSuchenCpf);
        klinik.setSuchenImc(suchenImc);
        suchenImc.setKlinik(klinik);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        wahlen = new javax.swing.JPanel();
        wahl1 = new javax.swing.JLabel();
        wahl2 = new javax.swing.JLabel();
        wahl3 = new javax.swing.JLabel();
        wahl4 = new javax.swing.JLabel();
        wahl0 = new javax.swing.JLabel();
        wahl5 = new javax.swing.JLabel();
        wahl = new javax.swing.JTextField();
        fertig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        title.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        title.setText("Clínica");

        wahlen.setBackground(new java.awt.Color(0, 102, 102));

        wahl1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        wahl1.setText("1 - Cadastrar Paciente");

        wahl2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        wahl2.setText("2 - Listar Pacientes");

        wahl3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        wahl3.setText("3 - Alterar Paciente");

        wahl4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        wahl4.setText("4 - Buscar Pacientes por IMC");

        wahl0.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        wahl0.setText("0 - Sair");

        wahl5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        wahl5.setText("Escolha uma opção:");

        javax.swing.GroupLayout wahlenLayout = new javax.swing.GroupLayout(wahlen);
        wahlen.setLayout(wahlenLayout);
        wahlenLayout.setHorizontalGroup(
            wahlenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wahlenLayout.createSequentialGroup()
                .addGroup(wahlenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wahl1)
                    .addComponent(wahl0)
                    .addComponent(wahl4)
                    .addComponent(wahl3)
                    .addComponent(wahl2))
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(wahlenLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(wahl5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        wahlenLayout.setVerticalGroup(
            wahlenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wahlenLayout.createSequentialGroup()
                .addComponent(wahl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wahl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wahl3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wahl4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wahl0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(wahl5))
        );

        wahl.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        wahl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        wahl.setToolTipText("");
        wahl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wahlActionPerformed(evt);
            }
        });
        wahl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wahlKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wahlKeyTyped(evt);
            }
        });

        fertig.setBackground(java.awt.SystemColor.activeCaption);
        fertig.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        fertig.setForeground(new java.awt.Color(51, 51, 51));
        fertig.setText("Confirmar");
        fertig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fertigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(wahlen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(wahl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fertig)
                        .addGap(164, 164, 164))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title)
                .addGap(57, 57, 57)
                .addComponent(wahlen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wahl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fertig)
                .addContainerGap(41, Short.MAX_VALUE))
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

    private void fertigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fertigActionPerformed

        if ((!this.wahl.getText().equalsIgnoreCase("0")))
        {
            klinik.starten(Integer.parseInt(this.wahl.getText()));
            this.wahl.setText("");
        } else
        {
            this.setVisible(false);
        }


    }//GEN-LAST:event_fertigActionPerformed

    private void wahlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wahlKeyTyped

        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || wahl.getText().length() >= 1)
        {
            evt.consume();
        }

    }//GEN-LAST:event_wahlKeyTyped

    private void wahlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wahlActionPerformed

        if (evt.getActionCommand().equals("\n"))
        {
            this.fertig.doClick();
        }
    }//GEN-LAST:event_wahlActionPerformed

    private void wahlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wahlKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            this.fertig.doClick();
        }
    }//GEN-LAST:event_wahlKeyPressed

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
            java.util.logging.Logger.getLogger(Hauptmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Hauptmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Hauptmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Hauptmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hauptmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fertig;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title;
    private javax.swing.JTextField wahl;
    private javax.swing.JLabel wahl0;
    private javax.swing.JLabel wahl1;
    private javax.swing.JLabel wahl2;
    private javax.swing.JLabel wahl3;
    private javax.swing.JLabel wahl4;
    private javax.swing.JLabel wahl5;
    private javax.swing.JPanel wahlen;
    // End of variables declaration//GEN-END:variables
}
