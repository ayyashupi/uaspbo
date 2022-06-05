/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import login.*;
import object.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Virtual S4
 */
public class MainMenuAdmin extends javax.swing.JFrame {
    
    Connection conn;
    /**
     * Creates new form MainMenuAdmin
     */
    public MainMenuAdmin() {
        initComponents();
        lbl_nama.setText("Welcome, Admin");
        try{
            conn = KoneksiDB.configDB();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        this.setLocationRelativeTo(null);
        
        initComboBox();
        
        this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            Login form_login = new Login();
            form_login.setVisible(true);
            
        }
        });
        
        
    }
    
    private ArrayList<String> getAllPenyewa(){
        ArrayList<String> data_penyewa = new ArrayList();
        try{
            Statement state = conn.createStatement();
            String query = "Select nama from penyewa";
            ResultSet rs = state.executeQuery(query);
            
        
            while(rs.next()){
            data_penyewa.add(rs.getString("nama"));
            }
            rs.close();
            state.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return data_penyewa;
    }
    
    private void initComboBox(){
        ArrayList<String> list_penyewa = getAllPenyewa();
        
        for(int i = 0;i<list_penyewa.size();i++){
            cmb_nama_user.addItem(list_penyewa.get(i));
        }
        
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
        lbl_nama = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        btn_crud_mobil = new javax.swing.JButton();
        btn_crud_penyewa = new javax.swing.JButton();
        btn_crud_supir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_crud_transaksi = new javax.swing.JButton();
        btn_rental = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmb_nama_user = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btn_rank_penyewa = new javax.swing.JButton();
        btn_pendapatan = new javax.swing.JButton();
        btn_rank_supir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RentAllCars");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 350));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nama.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_nama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nama.setText("<nama>.");
        jPanel2.add(lbl_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 350, -1));

        btnLogOut.setBackground(new java.awt.Color(102, 102, 255));
        btnLogOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(102, 102, 255));
        btnLogOut.setText("Log Out");
        btnLogOut.setBorderPainted(false);
        btnLogOut.setContentAreaFilled(false);
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 440, 30));

        btn_crud_mobil.setBackground(new java.awt.Color(102, 102, 255));
        btn_crud_mobil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_crud_mobil.setForeground(new java.awt.Color(255, 255, 255));
        btn_crud_mobil.setText("Mobil");
        btn_crud_mobil.setBorderPainted(false);
        btn_crud_mobil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_crud_mobil.setPreferredSize(new java.awt.Dimension(100, 50));
        btn_crud_mobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crud_mobilActionPerformed(evt);
            }
        });
        jPanel2.add(btn_crud_mobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 130, 40));

        btn_crud_penyewa.setBackground(new java.awt.Color(102, 102, 255));
        btn_crud_penyewa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_crud_penyewa.setForeground(new java.awt.Color(255, 255, 255));
        btn_crud_penyewa.setText("Penyewa");
        btn_crud_penyewa.setBorderPainted(false);
        btn_crud_penyewa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_crud_penyewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crud_penyewaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_crud_penyewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 130, 40));

        btn_crud_supir.setBackground(new java.awt.Color(102, 102, 255));
        btn_crud_supir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_crud_supir.setForeground(new java.awt.Color(255, 255, 255));
        btn_crud_supir.setText("Supir");
        btn_crud_supir.setBorderPainted(false);
        btn_crud_supir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_crud_supir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crud_supirActionPerformed(evt);
            }
        });
        jPanel2.add(btn_crud_supir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 130, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Laporan");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 130, -1));

        btn_crud_transaksi.setBackground(new java.awt.Color(102, 102, 255));
        btn_crud_transaksi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_crud_transaksi.setForeground(new java.awt.Color(255, 255, 255));
        btn_crud_transaksi.setText("Delete Transaksi");
        btn_crud_transaksi.setBorderPainted(false);
        btn_crud_transaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_crud_transaksi.setPreferredSize(new java.awt.Dimension(100, 50));
        btn_crud_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crud_transaksiActionPerformed(evt);
            }
        });
        jPanel2.add(btn_crud_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 130, 40));

        btn_rental.setBackground(new java.awt.Color(102, 102, 255));
        btn_rental.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_rental.setForeground(new java.awt.Color(255, 255, 255));
        btn_rental.setText("Rental Mobil");
        btn_rental.setBorderPainted(false);
        btn_rental.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_rental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rentalActionPerformed(evt);
            }
        });
        jPanel2.add(btn_rental, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 110, 40));

        jLabel1.setText("Nama User");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        cmb_nama_user.setEditable(true);
        cmb_nama_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--" }));
        jPanel2.add(cmb_nama_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 160, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Manage Data");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 280, -1));

        btn_rank_penyewa.setBackground(new java.awt.Color(102, 102, 255));
        btn_rank_penyewa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_rank_penyewa.setForeground(new java.awt.Color(255, 255, 255));
        btn_rank_penyewa.setText("Ranking Penyewa");
        btn_rank_penyewa.setBorderPainted(false);
        btn_rank_penyewa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_rank_penyewa.setPreferredSize(new java.awt.Dimension(100, 50));
        btn_rank_penyewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rank_penyewaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_rank_penyewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 130, 40));

        btn_pendapatan.setBackground(new java.awt.Color(102, 102, 255));
        btn_pendapatan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_pendapatan.setForeground(new java.awt.Color(255, 255, 255));
        btn_pendapatan.setText("Pendapatan");
        btn_pendapatan.setBorderPainted(false);
        btn_pendapatan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pendapatan.setPreferredSize(new java.awt.Dimension(100, 50));
        btn_pendapatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pendapatanActionPerformed(evt);
            }
        });
        jPanel2.add(btn_pendapatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 130, 40));

        btn_rank_supir.setBackground(new java.awt.Color(102, 102, 255));
        btn_rank_supir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_rank_supir.setForeground(new java.awt.Color(255, 255, 255));
        btn_rank_supir.setText("Ranking Supir");
        btn_rank_supir.setBorderPainted(false);
        btn_rank_supir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_rank_supir.setPreferredSize(new java.awt.Dimension(100, 50));
        btn_rank_supir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rank_supirActionPerformed(evt);
            }
        });
        jPanel2.add(btn_rank_supir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 130, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 520, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btn_crud_penyewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crud_penyewaActionPerformed
        // TODO add your handling code here:
        CRUD_Table form_baru = new CRUD_Table("Penyewa");
        form_baru.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_crud_penyewaActionPerformed

    private void btn_crud_supirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crud_supirActionPerformed
        CRUD_Table form_baru = new CRUD_Table("Supir");
        form_baru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_crud_supirActionPerformed

    private void btn_rentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rentalActionPerformed
        Validator v = new Validator();
        
        if(!v.isEmpty(cmb_nama_user)){
//            System.out.println("Masuk ke If");
            Rental rent = new Rental();
//            int id = rent.getIdSupir(cmb_nama_user.getSelectedItem().toString());
            int id = getIdPenyewa(cmb_nama_user.getSelectedItem().toString());
            System.out.println("ID User : "+id);
            Rental form_rental = new Rental(id);
            form_rental.setVisible(true);
        }
    }//GEN-LAST:event_btn_rentalActionPerformed

    private void btn_crud_mobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crud_mobilActionPerformed
        
        CRUD_Table form_baru = new CRUD_Table("Mobil");
        form_baru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_crud_mobilActionPerformed

    private void btn_crud_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crud_transaksiActionPerformed
        RentalDeleteHistory form_baru = new RentalDeleteHistory();
        this.dispose();
        form_baru.setVisible(true);
    }//GEN-LAST:event_btn_crud_transaksiActionPerformed

    private void btn_rank_penyewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rank_penyewaActionPerformed
        FormLaporan form_baru = new FormLaporan("Tabel Ranking (Penyewa)");
        form_baru.setVisible(true);
    }//GEN-LAST:event_btn_rank_penyewaActionPerformed

    private void btn_pendapatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pendapatanActionPerformed
        FormLaporan form_baru = new FormLaporan("Tabel Laporan");
        form_baru.setVisible(true);
    }//GEN-LAST:event_btn_pendapatanActionPerformed

    private void btn_rank_supirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rank_supirActionPerformed
        FormLaporan form_baru = new FormLaporan("Tabel Ranking (Supir)");
        form_baru.setVisible(true);
    }//GEN-LAST:event_btn_rank_supirActionPerformed
    
    private int getIdPenyewa(String nama){
        int id_penyewa = 0;
        try{
            Statement state = conn.createStatement();
            String query = "Select id_penyewa from penyewa where nama = '"+nama+"'";
            ResultSet rs = state.executeQuery(query);
            
            while (rs.next()){
                id_penyewa = rs.getInt("id_penyewa");
            }
            rs.close();
            state.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return id_penyewa;
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btn_crud_mobil;
    private javax.swing.JButton btn_crud_penyewa;
    private javax.swing.JButton btn_crud_supir;
    private javax.swing.JButton btn_crud_transaksi;
    private javax.swing.JButton btn_pendapatan;
    private javax.swing.JButton btn_rank_penyewa;
    private javax.swing.JButton btn_rank_supir;
    private javax.swing.JButton btn_rental;
    private javax.swing.JComboBox<String> cmb_nama_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_nama;
    // End of variables declaration//GEN-END:variables
}
