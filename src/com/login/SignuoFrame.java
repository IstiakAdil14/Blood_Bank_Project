
package com.login;

//import java.awt.Toolkit;
import java.util.regex.*;
import com.databaseCon.DB;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;

public class SignuoFrame extends javax.swing.JFrame {

    
    private static final String regex1 = "^[\\\\w!#$%&'*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$";
    public SignuoFrame() {
        initComponents();
        this.setResizable(false);
          alt.setVisible(false);
          war.setVisible(false);
          ok.setVisible(false);
          
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("OIP(1).jpeg")));
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2Email = new javax.swing.JTextField();
        jPasswordField1Password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        alt = new javax.swing.JLabel();
        war = new javax.swing.JLabel();
        ok = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        alt1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Hide = new javax.swing.JLabel();
        See = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 30, 448, 19));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 448, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 55, 448, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 448, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 470, 130));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-sign-up-64.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("WellCome Here");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 210, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 130));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "SignUp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 24), new java.awt.Color(0, 153, 153)))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Email");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 65, -1));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Password");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, -1));

        jTextField2Email.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jTextField2Email.setForeground(new java.awt.Color(0, 153, 153));
        jTextField2Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2EmailKeyReleased(evt);
            }
        });
        jPanel4.add(jTextField2Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 190, -1));

        jPasswordField1Password.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jPasswordField1Password.setForeground(new java.awt.Color(0, 153, 153));
        jPasswordField1Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1PasswordActionPerformed(evt);
            }
        });
        jPasswordField1Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1PasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1PasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1PasswordKeyTyped(evt);
            }
        });
        jPanel4.add(jPasswordField1Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 190, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 90, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 100, -1));

        alt.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        alt.setForeground(new java.awt.Color(255, 0, 0));
        alt.setText("Sorry,this email is already taken");
        alt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                altKeyTyped(evt);
            }
        });
        jPanel4.add(alt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 190, 20));

        war.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-alert-48.png"))); // NOI18N
        jPanel4.add(war, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 50, 40));

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-ok-48.png"))); // NOI18N
        jPanel4.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 40, 30));

        alt1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        alt1.setForeground(new java.awt.Color(255, 0, 0));
        alt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                alt1KeyTyped(evt);
            }
        });
        jPanel5.add(alt1);

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 166, 240, 30));

        jLabel6.setText("jLabel6");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        Hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eye-24.png"))); // NOI18N
        Hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HideMouseReleased(evt);
            }
        });
        jPanel4.add(Hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        See.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eye-50.png"))); // NOI18N
        jPanel4.add(See, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, 50));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 34, 428, 255));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 450, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            String email= jTextField2Email.getText();
            String pass= jPasswordField1Password.getText();
            
            
        
         
            
            boolean status =Validation.email_validation(email);
            boolean status_pass =Validation.pass_validation(pass);
        if( status && status_pass ){
            
            if(! alt.isVisible()){
             Bean obj = new Bean(email,pass);
            Bal Obj = new Bal();
            Obj.insertDataSignup(obj);
            this.hide();
            }
           
        }else{
            JOptionPane.showMessageDialog(null, "invalid email or password.....");
        }
             
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        LoginFrame obj = new LoginFrame();
        obj.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2EmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2EmailKeyReleased
        // TODO add your handling code here:
        
        String uname=jTextField2Email.getText();
        try{
           Statement s= DB.con.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM signup_table WHERE Email = '" +uname+ "' ");
            if(rs.next()){
                String yes = rs.getString("Email");
                System.out.println(yes);
                alt.setText("invalid email...");
                jTextField2Email.setForeground(Color.red);
                alt.setVisible(true);
                war.setVisible(true);
                ok.setVisible(false);
            }
            else{
                System.out.println("This email is valid...");
                jTextField2Email.setForeground(new Color(0,102,51));
                 alt.setVisible(false);
               war.setVisible(false);
               ok.setVisible(true);
                
                
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jTextField2EmailKeyReleased

    private void altKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_altKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_altKeyTyped

    private void alt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alt1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_alt1KeyTyped

    private void jPasswordField1PasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1PasswordKeyReleased
       
        
        String upass=jPasswordField1Password.getText();
        
        boolean status_pass =Validation.pass_validation(upass);
        //String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,8}$";
        
        //^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$
        
        if(status_pass){
            alt1.setVisible(true);
            alt1.setText("Its an strong pass..");
            alt1.setForeground(new Color(0,102,51));
        }
        else{
             alt1.setVisible(true);
            alt1.setText("Use mix characters.Ex:Ab@cd56$1");
        }
       
    }//GEN-LAST:event_jPasswordField1PasswordKeyReleased

    private void jPasswordField1PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1PasswordKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasswordField1PasswordKeyTyped
   
    private void jPasswordField1PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1PasswordActionPerformed
        // TODO add your handling code here:
        
       
        
    }//GEN-LAST:event_jPasswordField1PasswordActionPerformed

    private void HideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HideMousePressed
        // TODO add your handling code here:
        
        See.setVisible(true);
        Hide.setVisible(false);
        jPasswordField1Password.setEchoChar((char)0);
    }//GEN-LAST:event_HideMousePressed

    private void HideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HideMouseReleased
        // TODO add your handling code here:
        See.setVisible(false);
        Hide.setVisible(true);
        jPasswordField1Password.setEchoChar('*');
    }//GEN-LAST:event_HideMouseReleased

    private void jPasswordField1PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1PasswordKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasswordField1PasswordKeyPressed

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
            java.util.logging.Logger.getLogger(SignuoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignuoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignuoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignuoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignuoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hide;
    private javax.swing.JLabel See;
    private javax.swing.JLabel alt;
    private javax.swing.JLabel alt1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1Password;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField2Email;
    private javax.swing.JLabel ok;
    private javax.swing.JLabel war;
    // End of variables declaration//GEN-END:variables
}
