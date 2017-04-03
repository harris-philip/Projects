/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomenclature;

import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author phili
 */
public class DeleteWindow extends javax.swing.JFrame {

    URL iconImage = this.getClass().getClassLoader().getResource("NomenclaturePics/TaskbarIcon.png");
    /**
     * Creates new form DeleteWindow
     */
    public DeleteWindow() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(iconImage));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noteLabel = new javax.swing.JLabel();
        chemFormText = new javax.swing.JTextField();
        chemFormLabel = new javax.swing.JLabel();
        chemNameText = new javax.swing.JTextField();
        chemNameLabel = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete");
        setPreferredSize(new java.awt.Dimension(484, 300));
        setResizable(false);

        noteLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        noteLabel.setText("<html>Note: To delete compounds with different chemical names,<br> but are the same compound-- you must delete each one <br> separately and one at a time.</html>");

        chemFormText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        chemFormText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chemFormTextActionPerformed(evt);
            }
        });

        chemFormLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        chemFormLabel.setText("Chemical Formula:");

        chemNameText.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        chemNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chemNameTextActionPerformed(evt);
            }
        });

        chemNameLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        chemNameLabel.setText("Chemical Name:");

        submitBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ionic", "Covalent", "Acids", "Anions", "Cations" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addComponent(chemNameText)
                    .addComponent(chemFormText)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chemNameLabel)
                            .addComponent(chemFormLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chemNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chemNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chemFormLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chemFormText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String chemName = chemNameText.getText();
        String chemForm = chemFormText.getText();
        
        if (chemName.trim().isEmpty() || chemForm.trim().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Please fill each field.", "Error", JOptionPane.ERROR_MESSAGE);
        else
        {
            
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        new AdvisorWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void chemNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chemNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chemNameTextActionPerformed

    private void chemFormTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chemFormTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chemFormTextActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel chemFormLabel;
    private javax.swing.JTextField chemFormText;
    private javax.swing.JLabel chemNameLabel;
    private javax.swing.JTextField chemNameText;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
