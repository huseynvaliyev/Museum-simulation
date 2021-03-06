/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muze;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Huseyn
 */
public class GuiBiletAl extends javax.swing.JFrame {
    private Integer kucuk,buyuk;
    /**
     * Creates new form BiletAl
     */
    public GuiBiletAl() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kucukSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        buyukSpinner = new javax.swing.JSpinner();
        biletAl = new java.awt.Button();
        anamenu = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kucuk_fiyat_Label = new javax.swing.JLabel();
        buyuk_fiyat_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logomini.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 130, 100));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Küçük (7-11 yaş)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        kucukSpinner.setToolTipText("");
        kucukSpinner.setAutoscrolls(true);
        kucukSpinner.setName(""); // NOI18N
        jPanel1.add(kucukSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 40, 30));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Büyük (12 yaş üstü)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));
        jPanel1.add(buyukSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 40, 30));

        biletAl.setActionCommand("al");
        biletAl.setBackground(new java.awt.Color(0, 0, 0));
        biletAl.setForeground(new java.awt.Color(240, 240, 240));
        biletAl.setLabel("BILET AL");
        biletAl.setName("BİLET AL"); // NOI18N
        biletAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biletAlActionPerformed(evt);
            }
        });
        jPanel1.add(biletAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 170, 40));

        anamenu.setActionCommand("anamenu");
        anamenu.setBackground(new java.awt.Color(0, 0, 0));
        anamenu.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        anamenu.setForeground(new java.awt.Color(255, 51, 51));
        anamenu.setLabel("Ana Menüye dön");
        anamenu.setName("anamenu"); // NOI18N
        anamenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anamenuActionPerformed(evt);
            }
        });
        jPanel1.add(anamenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 110, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bilet fiyatları");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, 20));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("7-11 yaş:");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("12 yaş üstü:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 30));

        kucuk_fiyat_Label.setBackground(new java.awt.Color(0, 0, 0));
        kucuk_fiyat_Label.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        kucuk_fiyat_Label.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(kucuk_fiyat_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 70, 30));

        buyuk_fiyat_Label.setBackground(new java.awt.Color(0, 0, 0));
        buyuk_fiyat_Label.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        buyuk_fiyat_Label.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(buyuk_fiyat_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anamenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anamenuActionPerformed
        GuiMusteri mus=new GuiMusteri();
        this.setVisible(false);
        mus.setVisible(true);
    }//GEN-LAST:event_anamenuActionPerformed

    public void setBuyuk_fiyat_Label(String fiyat) {
        buyuk_fiyat_Label.setText(fiyat+"TL");
    }

    public void setKucuk_fiyat_Label(String fiyat) {
        kucuk_fiyat_Label.setText(fiyat+"TL");
    }

    private void biletAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biletAlActionPerformed
        
        kucuk=(Integer)kucukSpinner.getValue();
        buyuk=(Integer)buyukSpinner.getValue();
        if((kucuk>0 && buyuk>=0) || (kucuk>=0 && buyuk>0) || (kucuk>0 && buyuk>0))
        {
            try {
                ConnectionDB.biletAl();
                int tutar=kucuk*Bilet.getKucuk_bilet()+buyuk*Bilet.getBuyuk_bilet();
                ConnectionDB.kasaBilgi(kucuk,buyuk,tutar);
                KrediKarti kk=new KrediKarti();
                kk.getTutar_kelime_Label().setVisible(true);
                kk.setTutarLabel(String.valueOf(tutar)+"TL");
                this.setVisible(false);
                kk.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(GuiBiletAl.class.getName()).log(Level.SEVERE, null, ex);
            }
            /*
            TC insan classindan alinacaq.Database-e TC ve kucuk ve buyuk biletlerinin sayi ve  
        */
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Bilet sayısı sıfırdan küçük ve ikisi de aynı zamanda sıfıra eşit olamaz."); 
        }
    }//GEN-LAST:event_biletAlActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiBiletAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiBiletAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiBiletAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiBiletAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiBiletAl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button anamenu;
    private java.awt.Button biletAl;
    private javax.swing.JSpinner buyukSpinner;
    private javax.swing.JLabel buyuk_fiyat_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner kucukSpinner;
    private javax.swing.JLabel kucuk_fiyat_Label;
    // End of variables declaration//GEN-END:variables
}
