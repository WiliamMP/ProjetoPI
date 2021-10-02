/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetotransheta;

import javax.swing.*;

/**
 *
 * @author Wiliam
 */
public class Calc extends javax.swing.JFrame {

    
    public int tipo = 0;
    public float ans = 0;
    public float ans1 = 0;
    public float ans2 = 0;
    public float ans3 = 0;
    public float ans4 = 0;
    public float ans5 = 0;
    public float ans6 = 0;
    public float ans7 = 0;
    
    
    
    public void calcular(){
        switch(tipo){
            case 1 -> {
                Float a = Float.parseFloat(jTextField1.getText());
                String result = Float.toString(ans + ans1 + ans2 + ans3 + ans4 + ans5 + ans6 + ans7 + a);
                if(jLabel1.getText().contains("=") == false){
                    jLabel1.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel2.getText().contains("=") == false){
                    jLabel2.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel3.getText().contains("=") == false){
                    jLabel3.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel5.getText().contains("=") == false){
                    jLabel5.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel6.getText().contains("=") == false){
                    jLabel6.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel7.getText().contains("=") == false){
                    jLabel7.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel8.getText().contains("=") == false){
                    jLabel8.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel9.getText().contains("=") == false){
                    jLabel9.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel10.getText().contains("=") == false){
                    jLabel10.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel11.getText().contains("=") == false){
                    jLabel11.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel12.getText().contains("=") == false){
                    jLabel12.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel13.getText().contains("=") == false){
                    jLabel13.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel14.getText().contains("=") == false){
                    jLabel14.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel15.getText().contains("=") == false){
                    jLabel15.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel16.getText().contains("=") == false){
                    jLabel16.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel17.getText().contains("=") == false){
                    jLabel17.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel18.getText().contains("=") == false){
                    jLabel18.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }else if(jLabel19.getText().contains("=") == false){
                    jLabel19.setText(ans + " + " + jTextField1.getText() + " = " + result);
                }               
                jTextField1.setText("R$" + result);
                ans1 = 0;
                ans2 = 0;
                ans3 = 0;
                ans4 = 0;
                ans5 = 0;
                ans6 = 0;
                ans7 = 0;
                ans = 0;
            }
            case 2 -> {
                Float b = Float.parseFloat(jTextField1.getText());
                String result1 = Float.toString(ans - b);
                jTextField1.setText("R$" + result1);
                ans1 = 0;
                ans2 = 0;
                ans3 = 0;
                ans4 = 0;
                ans5 = 0;
                ans6 = 0;
                ans7 = 0;
                ans = 0;
            }
            case 3 -> {
                Float c = Float.parseFloat(jTextField1.getText());
                String result2 = Float.toString(ans * c);
                jTextField1.setText("R$" + result2);
                ans1 = 0;
                ans2 = 0;
                ans3 = 0;
                ans4 = 0;
                ans5 = 0;
                ans6 = 0;
                ans7 = 0;
                ans = 0;
            }
            case 4 -> {
                Float d = Float.parseFloat(jTextField1.getText());
                String result3 = Float.toString(ans / d);
                jTextField1.setText("R$" + result3);
                ans1 = 0;
                ans2 = 0;
                ans3 = 0;
                ans4 = 0;
                ans5 = 0;
                ans6 = 0;
                ans7 = 0;
                ans = 0;
            }
        }
    }
    
    public Calc() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
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
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CHAMAR");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTextField1.setBackground(new java.awt.Color(255, 204, 0));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                .addGap(221, 221, 221))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showConfirmDialog(null, "Gerente chamado com sucesso!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        System.out.println(evt.getKeyCode());
        if(evt.getKeyCode() == 107 || evt.getKeyCode() == 109 || evt.getKeyCode() == 106 || evt.getKeyCode() == 111){
        int a = jTextField1.getText().trim().length();
        
        a--;
        String myStr = jTextField1.getText().trim().substring(a);
        String r = jTextField1.getText().trim().substring(0, jTextField1.getText().trim().lastIndexOf(myStr));
        jTextField1.setText(r);
        } 
        switch (evt.getKeyCode()) {
            
            case 107 -> {
                if (jTextField1.getText().contains("R$")) {
                    String r = jTextField1.getText().trim().replace("R$", "");
                    jTextField1.setText(r);
                }
                if(jLabel1.getText().isEmpty()){
                        String a = jTextField1.getText().trim();
                        jLabel1.setText(a);
                    }
                tipo = 1;
                if (ans == 0) {
                    ans = Float.parseFloat(jTextField1.getText());
                } else if (ans1 == 0) {
                    ans1 = Float.parseFloat(jTextField1.getText());
                } else if (ans2 == 0) {
                    ans2 = Float.parseFloat(jTextField1.getText());
                } else if (ans3 == 0) {
                    ans3 = Float.parseFloat(jTextField1.getText());
                } else if (ans4 == 0) {
                    ans4 = Float.parseFloat(jTextField1.getText());
                } else if (ans5 == 0) {
                    ans5 = Float.parseFloat(jTextField1.getText());
                } else if (ans6 == 0) {
                    ans6 = Float.parseFloat(jTextField1.getText());
                } else if (ans7 == 0) {
                    ans7 = Float.parseFloat(jTextField1.getText());
                }
                jTextField1.setText("");
            }
            
            case 109 -> {
                if (jTextField1.getText().contains("R$")) {
                    String r = jTextField1.getText().trim().replace("R$", "");
                    jTextField1.setText(r);
                }
                tipo = 2;
                if (ans == 0) {
                    ans = Float.parseFloat(jTextField1.getText());
                } else if (ans1 == 0) {
                    ans1 = Float.parseFloat(jTextField1.getText());
                } else if (ans2 == 0) {
                    ans2 = Float.parseFloat(jTextField1.getText());
                } else if (ans3 == 0) {
                    ans3 = Float.parseFloat(jTextField1.getText());
                } else if (ans4 == 0) {
                    ans4 = Float.parseFloat(jTextField1.getText());
                } else if (ans5 == 0) {
                    ans5 = Float.parseFloat(jTextField1.getText());
                } else if (ans6 == 0) {
                    ans6 = Float.parseFloat(jTextField1.getText());
                } else if (ans7 == 0) {
                    ans7 = Float.parseFloat(jTextField1.getText());
                }
                jTextField1.setText("");
            }
            case 106 -> {
                if (jTextField1.getText().contains("R$")) {
                    String r = jTextField1.getText().trim().replace("R$", "");
                    jTextField1.setText(r);
                }
                tipo = 3;
                if (ans == 0) {
                    ans = Float.parseFloat(jTextField1.getText());
                } else if (ans1 == 0) {
                    ans1 = Float.parseFloat(jTextField1.getText());
                } else if (ans2 == 0) {
                    ans2 = Float.parseFloat(jTextField1.getText());
                } else if (ans3 == 0) {
                    ans3 = Float.parseFloat(jTextField1.getText());
                } else if (ans4 == 0) {
                    ans4 = Float.parseFloat(jTextField1.getText());
                } else if (ans5 == 0) {
                    ans5 = Float.parseFloat(jTextField1.getText());
                } else if (ans6 == 0) {
                    ans6 = Float.parseFloat(jTextField1.getText());
                } else if (ans7 == 0) {
                    ans7 = Float.parseFloat(jTextField1.getText());
                }
                jTextField1.setText("");
            }
            case 111 -> {
                if (jTextField1.getText().contains("R$")) {
                    String r = jTextField1.getText().trim().replace("R$", "");
                    jTextField1.setText(r);
                }
                tipo = 4;
                if (ans == 0) {
                    ans = Float.parseFloat(jTextField1.getText());
                } else if (ans1 == 0) {
                    ans1 = Float.parseFloat(jTextField1.getText());
                } else if (ans2 == 0) {
                    ans2 = Float.parseFloat(jTextField1.getText());
                } else if (ans3 == 0) {
                    ans3 = Float.parseFloat(jTextField1.getText());
                } else if (ans4 == 0) {
                    ans4 = Float.parseFloat(jTextField1.getText());
                } else if (ans5 == 0) {
                    ans5 = Float.parseFloat(jTextField1.getText());
                } else if (ans6 == 0) {
                    ans6 = Float.parseFloat(jTextField1.getText());
                } else if (ans7 == 0) {
                    ans7 = Float.parseFloat(jTextField1.getText());
                }
                jTextField1.setText("");
            }

        }
        if(evt.getKeyCode() == 10){
            if(jTextField1.getText().contains("R$")){
        String r = jTextField1.getText().trim().replace("R$", "");
        jTextField1.setText(r);
            }
            calcular();
        }
        
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.isControlDown() == true){
            if(evt.getKeyCode() == 82){
                jLabel1.setText("");
                jLabel2.setText("");
                jLabel3.setText("");
                jLabel4.setText("");
                jLabel5.setText("");
                jLabel6.setText("");
                jLabel7.setText("");
                jLabel8.setText("");
                jLabel9.setText("");
                jLabel10.setText("");
                jLabel11.setText("");
                jLabel12.setText("");
                jLabel13.setText("");
                jLabel14.setText("");
                jLabel15.setText("");
                jLabel16.setText("");
                jLabel17.setText("");
                jLabel18.setText("");
                jLabel19.setText("");
                jTextField1.setText("");
                ans = 0;
                ans1 = 0;
                ans2 = 0;
                ans3 = 0;
                ans4 = 0;
                ans5 = 0;
                ans6 = 0;
                ans7 = 0;
                tipo = 0;
                
            }
        }
    }//GEN-LAST:event_jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
