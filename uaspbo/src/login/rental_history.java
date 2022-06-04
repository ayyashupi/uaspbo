/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class rental_history extends javax.swing.JFrame {
    //variable
    private int id_penyewa;
    
    /**
     * Creates new form register
     */
    public rental_history(int id_penyewa) {
        initComponents();
        reformatComboBox();
        setIdPenyewa(id_penyewa);
        show_table();
    }

    //set id penyewa
    public void setIdPenyewa(int id_penyewa){
        this.id_penyewa = id_penyewa;
    }
    
    //get id penyewa
    public int getIdPenyewa(){
        return this.id_penyewa;
    }
    

    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_lama_sewa2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_judul = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_model_mobil = new javax.swing.JLabel();
        lbl_model_mobil1 = new javax.swing.JLabel();
        lbl_model_mobil2 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        cmb_model = new javax.swing.JComboBox<>();
        cmb_supir = new javax.swing.JComboBox<>();
        jtf_tggl = new javax.swing.JTextField();
        spn_tgl_k = new javax.swing.JSpinner();
        lbl_model_mobil4 = new javax.swing.JLabel();
        lbl_tid = new javax.swing.JLabel();

        lbl_lama_sewa2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_lama_sewa2.setForeground(new java.awt.Color(102, 102, 102));
        lbl_lama_sewa2.setText("Lama Sewa");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 922, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_judul.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_judul.setText("Rental History");
        jPanel2.add(lbl_judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 300, -1));

        btn_edit.setBackground(new java.awt.Color(102, 102, 255));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("Edit");
        btn_edit.setBorderPainted(false);
        btn_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel2.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 255));
        jButton3.setText("Back");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Id_transaksi", "Id_penyewa", "Id_mobil", "Id_supir", "Tanggal Peminjaman", "Tanggal Kembali", "Diskon", "Total"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 900, 100));

        lbl_model_mobil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_model_mobil.setForeground(new java.awt.Color(102, 102, 102));
        lbl_model_mobil.setText("Supir");
        jPanel2.add(lbl_model_mobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, -1));

        lbl_model_mobil1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_model_mobil1.setForeground(new java.awt.Color(102, 102, 102));
        lbl_model_mobil1.setText("Tanggal Kembali");
        jPanel2.add(lbl_model_mobil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 130, -1));

        lbl_model_mobil2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_model_mobil2.setForeground(new java.awt.Color(102, 102, 102));
        lbl_model_mobil2.setText("Model Mobil");
        jPanel2.add(lbl_model_mobil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, -1));

        lbl_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(102, 102, 102));
        lbl_id.setText("0");
        jPanel2.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 20, -1));

        cmb_model.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cmb_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        cmb_supir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cmb_supir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jtf_tggl.setText("YYYY-MM-DD");
        jtf_tggl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_tgglActionPerformed(evt);
            }
        });
        jPanel2.add(jtf_tggl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 130, -1));
        jPanel2.add(spn_tgl_k, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 60, -1));

        lbl_model_mobil4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_model_mobil4.setForeground(new java.awt.Color(102, 102, 102));
        lbl_model_mobil4.setText("Tanggal Peminjaman");
        jPanel2.add(lbl_model_mobil4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 130, -1));

        lbl_tid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_tid.setForeground(new java.awt.Color(102, 102, 102));
        lbl_tid.setText("Id :");
        jPanel2.add(lbl_tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 20, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        String id = lbl_id.getText();
        String model = (String) cmb_model.getSelectedItem();
        String supir = (String) cmb_supir.getSelectedItem();
        String tanggal_p = jtf_tggl.getText();
        int lama_sewa = (Integer) spn_tgl_k.getValue();
        
        if(model == "Pilih Mobil" || supir == "Pilih Supir" || tanggal_p == "" || tanggal_p == "YY-MM-DD" || lama_sewa == 0){
            JOptionPane.showMessageDialog(null, "Data wajib terisi");
        } else {
            try{
                //id 
                int id_mobil = getIdMobil(model);
                int id_supir = getIdSupir(supir);
                
                //get tanggal akhir
                String tanggal_akhir = getDateAdd(tanggal_p, lama_sewa);
                
                String query = "UPDATE transaksi SET kd_mobil = '"+ id_mobil +"', id_supir = '"+ id_supir +"', tgl_pinjam = '"+ tanggal_p +"', tgl_kembali = '"+ tanggal_akhir +"' WHERE id_transaksi = '"+ id +"'";

                //2. koneksi
                java.sql.Connection c = (Connection)KoneksiDB.configDB();
                java.sql.PreparedStatement s = c.prepareStatement(query);
                s.execute();
                JOptionPane.showMessageDialog(null, "Data Terupdate");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Data tidak terupdate");
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        show_table();
        
        lbl_id.setText("0");
        cmb_model.setSelectedItem(0);
        cmb_supir.setSelectedItem(0);
        jtf_tggl.setText("YY-MM-DD");
        spn_tgl_k.setValue(0);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.rowAtPoint(evt.getPoint());
        //int kolom = jTable1.columnAtPoint(evt.getPoint());
        
        String gid = jTable1.getValueAt(baris, 1).toString();
        lbl_id.setText(gid);
        
        String model = jTable1.getValueAt(baris, 3).toString();
        int id_mobil = Integer.parseInt(model);
        String getmodel = getMobil(id_mobil);
        cmb_model.setSelectedItem(getmodel);

        String supir = jTable1.getValueAt(baris, 4).toString();
        int id_supir = Integer.parseInt(supir);
        String getids = getSupir(id_supir);
        cmb_supir.setSelectedItem(getids);
        
        String tanggal_peminjaman = jTable1.getValueAt(baris, 5).toString();
        jtf_tggl.setText(tanggal_peminjaman);
        
        String tanggal_kembali = jTable1.getValueAt(baris, 6).toString();
        int kembali = getDateDiff(tanggal_kembali, tanggal_peminjaman);
        spn_tgl_k.setValue(kembali);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jtf_tgglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_tgglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_tgglActionPerformed

    private void show_table(){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("No.");
        table.addColumn("Id_transaksi");
        table.addColumn("id_penyewa");
        table.addColumn("Id_mobil");
        table.addColumn("Id_supir");
        table.addColumn("Tanggal Peminjaman");
        table.addColumn("Tanggal Kembali");
        table.addColumn("Diskon");
        table.addColumn("Total");
        
        try{
            //get id penyewa
            int id_p = getIdPenyewa();
            
            //1. query
            String query = "SELECT * FROM transaksi WHERE id_penyewa = '"+ id_p +"'";
            
            //2. koneksi
            java.sql.Connection c = (Connection)KoneksiDB.configDB();
            
            //3. kirim parameter
            java.sql.Statement s = c.createStatement();
            
            //4. ekseskusi query
            java.sql.ResultSet r = s.executeQuery(query);
            
            //5. looping
            int i = 1;
            while(r.next()){
                table.addRow(new Object[] {
                    i,
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6),
                    r.getString(7),
                    r.getString(8),                    
                });
                jTable1.setModel(table);
                i++;
                
            }
        
        } catch (Exception e){
            
            
        }
    }

    public String getDateAdd(String tanggal_sewa, int lama_sewa){
        String tanggal = null;
        try{
            //1. Query get id_mobil dan supir
            String query = "SELECT DATE_ADD('"+ tanggal_sewa + "', INTERVAL '"+ lama_sewa +"' DAY) as hari";
            
            //2. koneksi
            java.sql.Connection c = (Connection)KoneksiDB.configDB();

            
            //3. kirim parameter
            java.sql.Statement s = c.createStatement();

            
            //4. ekseskusi query
            java.sql.ResultSet r = s.executeQuery(query);
            
            //5. looping model
            int i = 1;
            while(r.next()){
                
                 tanggal = r.getString("hari");
                 i++;

            }             
        } catch (Exception e){
            
        }
        return tanggal;
        
    }
    
    public int getDateDiff(String tanggal_sewa, String tanggal_akhir){
        int tanggal = 0;
        try{
            //1. Query get id_mobil dan supir
            String query = "SELECT DATEDIFF('"+ tanggal_sewa + "', '"+ tanggal_akhir +"') as hari";
            
            //2. koneksi
            java.sql.Connection c = (Connection)KoneksiDB.configDB();

            
            //3. kirim parameter
            java.sql.Statement s = c.createStatement();

            
            //4. ekseskusi query
            java.sql.ResultSet r = s.executeQuery(query);
            
            //5. looping model
            int i = 1;
            while(r.next()){
                
                 tanggal = r.getInt("hari");
                 i++;

            }             
        } catch (Exception e){
            
        }
        return tanggal;
        
    }
    

    public String getSupir(int id){
        String supir = null;
        try{
            //1. Query get id_mobil dan supir
            String query = "SELECT nama FROM supir WHERE id_supir = '" + id + "'";
            
            //2. koneksi
            java.sql.Connection c = (Connection)KoneksiDB.configDB();

            
            //3. kirim parameter
            java.sql.Statement s = c.createStatement();

            
            //4. ekseskusi query
            java.sql.ResultSet r = s.executeQuery(query);
            
            //5. looping model
            int i = 1;
            while(r.next()){
                
                 supir = r.getString("nama");
                 i++;

            }  
        } catch (Exception e){
            
        }
        return supir;        
    }
    
    public String getMobil(int id){
        String mobil = null;
        try{
            //1. Query get id_mobil dan supir
            String query = "SELECT model FROM mobil WHERE id_mobil = '" + id + "'";
            
            //2. koneksi
            java.sql.Connection c = (Connection)KoneksiDB.configDB();

            
            //3. kirim parameter
            java.sql.Statement s = c.createStatement();

            
            //4. ekseskusi query
            java.sql.ResultSet r = s.executeQuery(query);
            
            //5. looping model
            int i = 1;
            while(r.next()){
                
                 mobil = r.getString("model");
                 i++;

            }  
        } catch (Exception e){
            
        }
        return mobil;
    }

    public int getIdSupir(String supir){
        int id_supir = 0;
        try{
            //1. Query get id_mobil dan supir
            String query = "SELECT id_supir FROM supir WHERE nama = '" + supir + "'";
            
            //2. koneksi
            java.sql.Connection c = (Connection)KoneksiDB.configDB();

            
            //3. kirim parameter
            java.sql.Statement s = c.createStatement();

            
            //4. ekseskusi query
            java.sql.ResultSet r = s.executeQuery(query);
            
            //5. looping model
            int i = 1;
            while(r.next()){
                
                 id_supir = r.getInt("id_supir");
                 i++;

            }  
        } catch (Exception e){
            
        }
        return id_supir;        
    }
    
    public int getIdMobil(String model){
        int id_mobil = 0;
        try{
            //1. Query get id_mobil dan supir
            String query = "SELECT id_mobil FROM mobil WHERE model = '" + model + "'";
            
            //2. koneksi
            java.sql.Connection c = (Connection)KoneksiDB.configDB();

            
            //3. kirim parameter
            java.sql.Statement s = c.createStatement();

            
            //4. ekseskusi query
            java.sql.ResultSet r = s.executeQuery(query);
            
            //5. looping model
            int i = 1;
            while(r.next()){
                
                 id_mobil = r.getInt("id_mobil");
                 i++;

            }  
        } catch (Exception e){
            
        }
        return id_mobil;
    }
        
    private void reformatComboBox() {
        try{
            cmb_model.removeAllItems();
            cmb_model.addItem("Pilih Mobil");
            
            cmb_supir.removeAllItems();
            cmb_supir.addItem("Pilih Supir");
            
            //1. Query
            String query = "SELECT model FROM mobil";
            String query2 = "SELECT nama FROM supir";
            
            //2. koneksi
            java.sql.Connection c = (Connection)KoneksiDB.configDB();
            java.sql.Connection c2 = (Connection)KoneksiDB.configDB();
            
            //3. kirim parameter
            java.sql.Statement s = c.createStatement();
            java.sql.Statement s2 = c2.createStatement();
            
            //4. ekseskusi query
            java.sql.ResultSet r = s.executeQuery(query);
            java.sql.ResultSet r2 = s2.executeQuery(query2);
            
            //5. looping model
            int i = 1;
            while(r.next()){
                
                cmb_model.addItem(r.getString(i));

           
            }
            
            //6. looping supir
            while(r2.next()){
                
                cmb_supir.addItem(r2.getString(i));
           
            }
    
        }catch(Exception e){
            
        }

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
            java.util.logging.Logger.getLogger(rental_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rental_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rental_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rental_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new rental_history().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JComboBox<String> cmb_model;
    private javax.swing.JComboBox<String> cmb_supir;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtf_tggl;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_judul;
    private javax.swing.JLabel lbl_lama_sewa2;
    private javax.swing.JLabel lbl_model_mobil;
    private javax.swing.JLabel lbl_model_mobil1;
    private javax.swing.JLabel lbl_model_mobil2;
    private javax.swing.JLabel lbl_model_mobil4;
    private javax.swing.JLabel lbl_tid;
    private javax.swing.JSpinner spn_tgl_k;
    // End of variables declaration//GEN-END:variables

}
