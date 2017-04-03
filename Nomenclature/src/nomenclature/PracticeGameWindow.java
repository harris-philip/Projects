/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomenclature;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Scanner;
import javax.swing.JTextField;

/**
 *
 * @author phili
 */
public class PracticeGameWindow extends javax.swing.JFrame {

    Scanner scan = new Scanner(System.in);
    URL iconImage = this.getClass().getClassLoader().getResource("NomenclaturePics/TaskbarIcon.png");
    /**
     * Creates new form PracticeGameWindow
     */
    public PracticeGameWindow() {
        initComponents();
        
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(iconImage));
        
        toSubscript(answerField);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scoreLabel = new javax.swing.JLabel();
        rightLabel = new javax.swing.JLabel();
        rightScore = new javax.swing.JLabel();
        wrongLabel = new javax.swing.JLabel();
        wrongScore = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        totalScore = new javax.swing.JLabel();
        databaseCombo = new javax.swing.JComboBox<>();
        questionLabel = new javax.swing.JLabel();
        answerField = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        comboBoxLabel = new javax.swing.JLabel();
        instructionsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practice");
        setResizable(false);

        scoreLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        scoreLabel.setText("Score:");

        rightLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        rightLabel.setForeground(new java.awt.Color(51, 102, 0));
        rightLabel.setText("Right:");

        rightScore.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        rightScore.setForeground(new java.awt.Color(51, 102, 0));
        rightScore.setText("0");

        wrongLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        wrongLabel.setForeground(new java.awt.Color(153, 0, 0));
        wrongLabel.setText("Wrong:");

        wrongScore.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        wrongScore.setForeground(new java.awt.Color(153, 0, 0));
        wrongScore.setText("0");

        totalLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        totalLabel.setText("Total:");

        totalScore.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        totalScore.setText("0");

        databaseCombo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        databaseCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anions", "Cations", "Acids", "Ionic", "Covalent" }));
        databaseCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseComboActionPerformed(evt);
            }
        });

        questionLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        questionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionLabel.setText("Question");

        answerField.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        answerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldActionPerformed(evt);
            }
        });

        submitBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        comboBoxLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        comboBoxLabel.setText("Nomenclature Tables:");

        instructionsLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        instructionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instructionsLabel.setText("<html><b>Instructions</b>: If the <b>Chemical Name</b> is displayed, type in the <b> Chemical Formula</b>. <br>\n<p style = \"margin-left: 49px\"> If the <b>Chemical Formula</b> is displayed, type in the <b>Chemical Name</b>. </html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(answerField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(databaseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(scoreLabel)
                        .addGap(18, 18, 18)
                        .addComponent(rightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rightScore, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wrongLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wrongScore, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalScore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(instructionsLabel))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(databaseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightLabel)
                    .addComponent(rightScore)
                    .addComponent(wrongLabel)
                    .addComponent(wrongScore)
                    .addComponent(totalLabel)
                    .addComponent(totalScore))
                .addGap(18, 18, 18)
                .addComponent(instructionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void databaseComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseComboActionPerformed
        String table = String.valueOf(databaseCombo.getSelectedItem()).toLowerCase();
        
        if (table.equals("anions"))
        {
            System.out.println("Table has been switched to " + table + " table.");
        }
        else if (table.equals("cations"))
        {
            System.out.println("Table has been switched to " + table + " table.");
        }
        else if (table.equals("acids"))
        {
            System.out.println("Table has been switched to " + table + " table.");
        }
        else if (table.equals("ionic"))
        {
            System.out.println("Table has been switched to " + table + " table.");
        }
        else if (table.equals("covalent"))
        {
            System.out.println("Table has been switched to " + table + " table.");
        }
    }//GEN-LAST:event_databaseComboActionPerformed

    private void answerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldActionPerformed

    }//GEN-LAST:event_answerFieldActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String text = answerField.getText();
        
    }//GEN-LAST:event_submitBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private static void toSubscript(JTextField text)
    {
        text.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String string1 = textField.getText();
                char[] charArray = string1.toCharArray();
                char a;
                String[] stringArray = new String[charArray.length];
                String string2;
                for (int i = 0; i < charArray.length; i++) {
                    a = charArray[i];
                    if (a == '0') {
                        stringArray[i] = "\u2080";
                    } else if (a == '1') {
                        stringArray[i] = "\u2081";
                    } else if (a == '2') {
                        stringArray[i] = "\u2082";
                    } else if (a == '3') {
                        stringArray[i] = "\u2083";
                    } else if (a == '4') {
                        stringArray[i] = "\u2084";
                    } else if (a == '5') {
                        stringArray[i] = "\u2085";
                    } else if (a == '6') {
                        stringArray[i] = "\u2086";
                    } else if (a == '7') {
                        stringArray[i] = "\u2087";
                    } else if (a == '8') {
                        stringArray[i] = "\u2088";
                    } else if (a == '9') {
                        stringArray[i] = "\u2089";
                    } else {
                        stringArray[i] = Character.toString(a);
                    }
                }

                string2 = String.join("", stringArray);
                textField.setText(string2);
            }
        });
    }
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
            java.util.logging.Logger.getLogger(PracticeGameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PracticeGameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PracticeGameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PracticeGameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PracticeGameWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField;
    private javax.swing.JLabel comboBoxLabel;
    private javax.swing.JComboBox<String> databaseCombo;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel instructionsLabel;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JLabel rightLabel;
    private javax.swing.JLabel rightScore;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalScore;
    private javax.swing.JLabel wrongLabel;
    private javax.swing.JLabel wrongScore;
    // End of variables declaration//GEN-END:variables
}
