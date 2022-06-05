/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;
import java.sql.*;
import object.*;
/**
 *
 * @author ayyash
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    private Penyewa pengguna;
    public Profile() {
        initComponents();
    }
    private void getUser(String id){
        try {
            Connection con=(Connection) KoneksiDB.mysqlconfig;
            ResultSet rs;
            String sql="select*from penyewa where id_penyewa=?";
            PreparedStatement ps=con.prepareCall(sql);
            
            ps.setString(1, id);
            
            rs=ps.executeQuery();
            if(rs.next()){
                pengguna.setId_penyewa(rs.getInt("id"));
                pengguna.setNama(rs.getString("name"));
                pengguna.setGender(rs.getString("sex"));
                pengguna.setNo_hp(rs.getString("no_telp"));
                pengguna.setAlamat(rs.getString("alamat"));
                pengguna.setSaldo(rs.getInt("saldo"));
            }
                    
        } catch (Exception e) {
        }
    }
    
    Profile(String id){
    this();
    getUser(id);
    pfName.setText(pengguna.getNama());
    pfSex.setText(pengguna.getGender());
    pfTelp.setText(pengguna.getNo_hp());
    pfAlamat.setText(pengguna.getAlamat());
    pfSaldo.setText("Rp. "+pengguna.getSaldo());
 
//    txtName.setText("Welcome, "+username+".");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnTopUp = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pfName = new javax.swing.JLabel();
        pfSex = new javax.swing.JLabel();
        pfTelp = new javax.swing.JLabel();
        pfAlamat = new javax.swing.JLabel();
        pfSaldo = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 350));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Profile");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 350, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Saldo:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 60, -1));

        btnTopUp.setBackground(new java.awt.Color(102, 102, 255));
        btnTopUp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTopUp.setForeground(new java.awt.Color(102, 102, 255));
        btnTopUp.setText("Top Up");
        btnTopUp.setBorderPainted(false);
        btnTopUp.setContentAreaFilled(false);
        btnTopUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTopUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopUpActionPerformed(evt);
            }
        });
        jPanel2.add(btnTopUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 70, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Sex:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 50, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("No. Telp:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 60, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Alamat:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 60, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Name:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 50, -1));

        pfName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pfName.setForeground(new java.awt.Color(102, 102, 102));
        pfName.setText("Contoh");
        jPanel2.add(pfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 190, -1));

        pfSex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pfSex.setForeground(new java.awt.Color(102, 102, 102));
        pfSex.setText("Male");
        jPanel2.add(pfSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 110, -1));

        pfTelp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pfTelp.setForeground(new java.awt.Color(102, 102, 102));
        pfTelp.setText("000000");
        jPanel2.add(pfTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 190, -1));

        pfAlamat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pfAlamat.setForeground(new java.awt.Color(102, 102, 102));
        pfAlamat.setText("Bogor");
        jPanel2.add(pfAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 190, -1));

        pfSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pfSaldo.setForeground(new java.awt.Color(102, 102, 102));
        pfSaldo.setText("Rp50000");
        jPanel2.add(pfSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 190, -1));

        btnHome.setBackground(new java.awt.Color(102, 102, 255));
        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.setBorderPainted(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 70, 30));

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

    private void btnTopUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTopUpActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MenuUtama(pengguna.getId_penyewa()+"").setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnTopUp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pfAlamat;
    private javax.swing.JLabel pfName;
    private javax.swing.JLabel pfSaldo;
    private javax.swing.JLabel pfSex;
    private javax.swing.JLabel pfTelp;
    // End of variables declaration//GEN-END:variables
}
