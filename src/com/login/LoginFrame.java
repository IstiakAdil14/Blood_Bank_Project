
package com.login;

//import com.home.adminHome;
import com.home.donorhome;
//import com.home.purchaseForm;

import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
        this.setResizable(false);
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("OIP(1).jpeg")));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Email = new javax.swing.JTextField();
        jPasswordField1Password = new javax.swing.JPasswordField();
        jButton1Login = new javax.swing.JButton();
        jButton2Signup = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        hide = new javax.swing.JLabel();
        see = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 90, 40));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 100, 30));

        jTextField1Email.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jTextField1Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1EmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 190, -1));

        jPasswordField1Password.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jPasswordField1Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 190, -1));

        jButton1Login.setBackground(new java.awt.Color(0, 204, 204));
        jButton1Login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1Login.setForeground(new java.awt.Color(0, 153, 153));
        jButton1Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        jButton1Login.setText("Log In");
        jButton1Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1LoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, -1, -1));

        jButton2Signup.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton2Signup.setForeground(new java.awt.Color(0, 153, 153));
        jButton2Signup.setText("Don't have any account? Sign up.");
        jButton2Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2SignupActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit application.png"))); // NOI18N
        jButton3.setText("Exit App");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, -1, -1));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eye-24.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hideMouseReleased(evt);
            }
        });
        getContentPane().add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 390, 40, 30));

        see.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eye-50.png"))); // NOI18N
        getContentPane().add(see, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 390, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login background final.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1EmailActionPerformed

    private void jPasswordField1PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1PasswordActionPerformed

    private void jButton1LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1LoginActionPerformed
        // TODO add your handling code here:
        
        String email = jTextField1Email.getText();
        String pass =jPasswordField1Password.getText();
        
        Bal obj = new Bal();
        boolean b = obj.checkLogin(email, pass);
        
        if(b){
          /*HomeFrame a = new HomeFrame();
            a.show();
            this.hide();*/
            if (email.equals("admin@gmail.com") && pass.equals("admin")) {
            adminhome firstFrame = new adminhome();
            firstFrame.setVisible(true);
            this.dispose();
            } else if (email.equals(email) && pass.equals(pass)) {
            donorhome secondFrame = new donorhome(email);
            secondFrame.setVisible(true);
            this.dispose();
            } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials!");
        }
        }
    }//GEN-LAST:event_jButton1LoginActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to close this application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2SignupActionPerformed
        // TODO add your handling code here:
        this.hide();
        SignuoFrame obj = new SignuoFrame();
        obj.show();
    }//GEN-LAST:event_jButton2SignupActionPerformed

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        // TODO add your handling code here:
        
        see.setVisible(true);
        hide.setVisible(false);
        jPasswordField1Password.setEchoChar((char)0);
    }//GEN-LAST:event_hideMousePressed

    private void hideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseReleased
        // TODO add your handling code here:
        see.setVisible(false);
        hide.setVisible(true);
        jPasswordField1Password.setEchoChar('*');
    }//GEN-LAST:event_hideMouseReleased

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hide;
    private javax.swing.JButton jButton1Login;
    private javax.swing.JButton jButton2Signup;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1Password;
    private javax.swing.JTextField jTextField1Email;
    private javax.swing.JLabel see;
    // End of variables declaration//GEN-END:variables
}
