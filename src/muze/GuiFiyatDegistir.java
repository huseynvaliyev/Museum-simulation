/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muze;
import java.lang.Integer;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Huseyn
 */
public class GuiFiyatDegistir extends javax.swing.JFrame {

    int kucuk,buyuk;
    /**
     * Creates new form FiyatDegistir
     */
    public GuiFiyatDegistir() {
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
        degistir = new java.awt.Button();
        anamenu = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logomini.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 130, 120));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Küçük (7-11 yaş)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        kucukSpinner.setToolTipText("");
        jPanel1.add(kucukSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 40, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Büyük (12 yaş üstü)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        jPanel1.add(buyukSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 40, -1));

        degistir.setActionCommand("degistir");
        degistir.setBackground(new java.awt.Color(0, 0, 0));
        degistir.setForeground(new java.awt.Color(240, 240, 240));
        degistir.setLabel("DEGISTIR");
        degistir.setName("DEGISTIR"); // NOI18N
        degistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degistirActionPerformed(evt);
            }
        });
        jPanel1.add(degistir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 170, 40));

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

    private void degistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degistirActionPerformed
        kucuk=(int)kucukSpinner.getValue();
        buyuk=(int)buyukSpinner.getValue();    
        
        if(kucuk<=0 && buyuk<=0)
        {
            JOptionPane.showMessageDialog(null, "Bilet fiyatları sıfırdan küçük ve sıfıra eşit değerde olamaz."); 
        }
        else
        {
            try {
                ConnectionDB.fiyatDegistir(kucuk,buyuk);
                JOptionPane.showMessageDialog(null, "Bılet fiyatları güncellendi."); 
            } catch (SQLException ex) {
                Logger.getLogger(GuiFiyatDegistir.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_degistirActionPerformed

    private void anamenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anamenuActionPerformed
        GuiMuzeYoneticisi gmy=new GuiMuzeYoneticisi();
        this.setVisible(false);
        gmy.setVisible(true);
    }//GEN-LAST:event_anamenuActionPerformed

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
            java.util.logging.Logger.getLogger(GuiFiyatDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFiyatDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFiyatDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFiyatDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiFiyatDegistir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button anamenu;
    private javax.swing.JSpinner buyukSpinner;
    private java.awt.Button degistir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner kucukSpinner;
    // End of variables declaration//GEN-END:variables
}
