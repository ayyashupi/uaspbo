/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;
import java.sql.*;
import javax.swing.JOptionPane;
//import 

/**
 *
 * @author ayyash
 */
import admin.*;

public class Login extends javax.swing.JFrame {
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        try{
            con=(Connection)KoneksiDB.configDB();
        }catch(SQLException ex){
            System.out.println(ex);
        }
//        con=KoneksiDB.mysqlconfig;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fPassword = new javax.swing.JPasswordField();
        btnSignUp = new javax.swing.JButton();
        btnLogIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RentAllCars");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 350));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Password");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 70, -1));

        fUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel2.add(fUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 190, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign In");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 350, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Username");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 70, -1));

        fPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel2.add(fPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 190, 30));

        btnSignUp.setBackground(new java.awt.Color(102, 102, 255));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(102, 102, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.setBorderPainted(false);
        btnSignUp.setContentAreaFilled(false);
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        btnLogIn.setBackground(new java.awt.Color(102, 102, 255));
        btnLogIn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("Log In");
        btnLogIn.setBorderPainted(false);
        btnLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
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

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Register().setVisible(true);
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        // TODO add your handling code here:
        String username=fUsername.getText();
        String password=fPassword.getText();
        
        try {
        if(username.equalsIgnoreCase("Admin")&&password.equalsIgnoreCase("AdminBear")){
                MainMenuAdmin form_admin = new MainMenuAdmin();
                form_admin.setVisible(true);
                this.dispose();
            }else{
                
            
            if(username.equals("")||password.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Lengkapi info login.",
                        "Pesan", JOptionPane.ERROR_MESSAGE);
                fUsername.requestFocus();
            }else{
            String sql="select*from penyewa where username=? and password=?";
//            ps=con.prepareCall(sql);
            ps=con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            
            rs=ps.executeQuery();
            
            if (rs.next()) {
                this.dispose();
//                System.out.println("ID : "+rs.getInt("id_penyewa")+"");
                new MenuUtama(rs.getInt("id_penyewa")+"").setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Info login salah.",
                        "Pesan",JOptionPane.ERROR_MESSAGE);
            }
                  }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnLogInActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPasswordField fPassword;
    private javax.swing.JTextField fUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
