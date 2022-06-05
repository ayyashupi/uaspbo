/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import login.KoneksiDB;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author ayyash
 */
public class form_laporan extends javax.swing.JFrame {
    
    /**
     * Creates new form register
     */
    private String tipe;
    public form_laporan() {
        this("Tabel Ranking (Penyewa)");
//        initComponents();
//        tampil_laporan();
//        tampilRankingPenyewa();
//        this.tipe = "Tabel Ranking (Supir)";
        
    }
    
    public form_laporan(String tipe) {
        initComponents();
        lbl_judul.setText(tipe);
        this.tipe = tipe;
        if (tipe.equals("Tabel Laporan")) {
            tampil_laporan();
        }else if (tipe.equals("Tabel Ranking (Supir)")) {
            filter.setSelectedIndex(0);
            filter.setEnabled(false);
            tampilRankingSupir();
        }else if (tipe.equals("Tabel Ranking (Penyewa)")) {
            filter.setSelectedIndex(0);
            filter.setEnabled(false);
            tampilRankingPenyewa();
        }
        
    }
    
    private void tampilRankingSupir(){
        DefaultTableModel tb = new DefaultTableModel ();
        tb.addColumn("No");
        tb.addColumn("ID Supir");
        tb.addColumn("Nama Supir");
        tb.addColumn("No Telp");
        tb.addColumn("Biaya");
        tb.addColumn("Jumlah Customer");
        tb.addColumn("Peringkat");
       
        String cari = txtcari.getText().toString();
//        String com = (String) filter.getSelectedItem();
        try{
            int no = 1;
            // query data  + BISA SEARCH 
//            System.out.println("The Text : " +txtcari.getText().toString());
            String query = "select id_supir, nama, no_telp, biaya, jml_cus, "
                            + "dense_rank() over(order by jml_cus desc) AS \"Peringkat\" from supir where nama LIKE '%"+cari+"%' order by jml_cus desc";
                    
        //FILTER BELUM BISA    
//                 "select penyewa.id_penyewa as \"ID Penyewa\", penyewa.nama,count(penyewa.id_penyewa) as \"Jumlah Transaksi\", \n" +
//                            "supir.id_supir as \"ID Supir\", supir.nama as \"Nama Supir\", transaksi.tgl_pinjam as \"Peminjaman\", transaksi.tgl_kembali as \"Pengembalian\", sum(transaksi.total) as \"Total Transaksi\",\n" +
//                            "dense_rank() over(Order by transaksi.total desc) as \"Peringkat Penyewa\"\n" +
//                            "from transaksi inner join penyewa on penyewa.id_penyewa = transaksi.id_penyewa inner join supir on transaksi.id_supir = supir.id_supir \n" +
//                            "MonthName(tgl_pinjam) LIKE'%\"+filter+\"%' group by penyewa.id_penyewa order by transaksi.total desc";
            
            // fungsi koneksi
            Connection vconn = (Connection)KoneksiDB.configDB();
            // kirim parameter fungsi java ke sql
            Statement s = vconn.createStatement();
            // eksekusi query
            ResultSet r = s.executeQuery(query);
            // menampilkan data (Looping)
            while(r.next()){
                tb.addRow(new Object[]{
                  no++, r.getString(1),r.getString(2),r.getString(3), 
                        r.getString(4),r.getString(5),r.getString(6),
                });
            }
            s.close();
            r.close();
            tbl_laporan.setModel(tb);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    private void tampilRankingPenyewa(){
         DefaultTableModel tb = new DefaultTableModel ();
        tb.addColumn("No");
        tb.addColumn("ID Penyewa");
        tb.addColumn("Nama Penyewa");
        tb.addColumn("No Telp");
        tb.addColumn("No KTP");
        tb.addColumn("Saldo");
        tb.addColumn("Peringkat");
       
        String cari = txtcari.getText();
//        String com = (String) filter.getSelectedItem();
        try{
            int no = 1;
            // query data  + BISA SEARCH 
            String query = "SELECT id_penyewa, nama, no_telp, no_ktp, saldo, "
                              + "dense_rank() over(order by saldo desc) AS \"Peringkat\" from penyewa where nama LIKE '%"+cari+"%'order by saldo desc";
                    
        //FILTER BELUM BISA    
//                 "select penyewa.id_penyewa as \"ID Penyewa\", penyewa.nama,count(penyewa.id_penyewa) as \"Jumlah Transaksi\", \n" +
//                            "supir.id_supir as \"ID Supir\", supir.nama as \"Nama Supir\", transaksi.tgl_pinjam as \"Peminjaman\", transaksi.tgl_kembali as \"Pengembalian\", sum(transaksi.total) as \"Total Transaksi\",\n" +
//                            "dense_rank() over(Order by transaksi.total desc) as \"Peringkat Penyewa\"\n" +
//                            "from transaksi inner join penyewa on penyewa.id_penyewa = transaksi.id_penyewa inner join supir on transaksi.id_supir = supir.id_supir \n" +
//                            "MonthName(tgl_pinjam) LIKE'%\"+filter+\"%' group by penyewa.id_penyewa order by transaksi.total desc";
            
            // fungsi koneksi
            java.sql.Connection vconn = (Connection)KoneksiDB.configDB();
            // kirim parameter fungsi java ke sql
            java.sql.Statement s = vconn.createStatement();
            // eksekusi query
            java.sql.ResultSet r = s.executeQuery(query);
            // menampilkan data (Looping)
            while(r.next()){
                tb.addRow(new Object[]{
                  no++, r.getString(1),r.getString(2),r.getString(3), 
                        r.getString(4),r.getString(5),r.getString(6),
                });
            }
            s.close();
            r.close();
            tbl_laporan.setModel(tb);
        }catch(Exception e){
       
        }
    }
    
    private void tampil_laporan(){
       DefaultTableModel tb = new DefaultTableModel ();
        tb.addColumn("No");
        tb.addColumn("ID Penyewa");
        tb.addColumn("Nama Penyewa");
        tb.addColumn("Jumlah Transaksi");
        tb.addColumn("ID Supir");
        tb.addColumn("Nama Supir");
        tb.addColumn("Peminjaman");
        tb.addColumn("Pengembalian");
        tb.addColumn("Total Transaksi");
        tb.addColumn("Peringkat Penyewa");
       
        String cari = txtcari.getText();
        String com = (String) filter.getSelectedItem();
        try{
            int no = 1;
            // query data  + BISA SEARCH 
            
            String query = "Test";
            if (filter.getSelectedIndex() != 0) {
                query = "select penyewa.id_penyewa as \"ID Penyewa\", penyewa.nama,count(penyewa.id_penyewa) as \"Jumlah Transaksi\", \n" +
                            "supir.id_supir as \"ID Supir\", supir.nama as \"Nama Supir\", transaksi.tgl_pinjam as \"Peminjaman\", transaksi.tgl_kembali as \"Pengembalian\", sum(transaksi.total) as \"Total Transaksi\",\n" +
                            "dense_rank() over(Order by transaksi.total desc) as \"Peringkat Penyewa\"\n" +
                            "from transaksi inner join penyewa on penyewa.id_penyewa = transaksi.id_penyewa inner join supir on transaksi.id_supir = supir.id_supir \n" +
                            "where MonthName(tgl_pinjam) LIKE'%"+com+"%' group by penyewa.id_penyewa order by transaksi.total desc";
            }else{
                query = "select penyewa.id_penyewa as \"ID Penyewa\", penyewa.nama,count(penyewa.id_penyewa) as \"Jumlah Transaksi\", \n" +
                            "supir.id_supir as \"ID Supir\", supir.nama as \"Nama Supir\", transaksi.tgl_pinjam as \"Peminjaman\", transaksi.tgl_kembali as \"Pengembalian\", sum(transaksi.total) as \"Total Transaksi\",\n" +
                            "dense_rank() over(Order by transaksi.total desc) as \"Peringkat Penyewa\"\n" +
                            "from transaksi inner join penyewa on penyewa.id_penyewa = transaksi.id_penyewa inner join supir on transaksi.id_supir = supir.id_supir \n" +
                            "where penyewa.nama LIKE'%"+cari+"%' group by penyewa.id_penyewa order by transaksi.total desc";
            }
            
                    
        //FILTER BELUM BISA    
//                 "select penyewa.id_penyewa as \"ID Penyewa\", penyewa.nama,count(penyewa.id_penyewa) as \"Jumlah Transaksi\", \n" +
//                            "supir.id_supir as \"ID Supir\", supir.nama as \"Nama Supir\", transaksi.tgl_pinjam as \"Peminjaman\", transaksi.tgl_kembali as \"Pengembalian\", sum(transaksi.total) as \"Total Transaksi\",\n" +
//                            "dense_rank() over(Order by transaksi.total desc) as \"Peringkat Penyewa\"\n" +
//                            "from transaksi inner join penyewa on penyewa.id_penyewa = transaksi.id_penyewa inner join supir on transaksi.id_supir = supir.id_supir \n" +
//                            "MonthName(tgl_pinjam) LIKE'%\"+filter+\"%' group by penyewa.id_penyewa order by transaksi.total desc";
//            
            // fungsi koneksi
            java.sql.Connection vconn = (Connection)KoneksiDB.configDB();
            // kirim parameter fungsi java ke sql
            java.sql.Statement s = vconn.createStatement();
            // eksekusi query
            java.sql.ResultSet r = s.executeQuery(query);
            // menampilkan data (Looping)
            while(r.next()){
                tb.addRow(new Object[]{
                  no++, "SW00" + r.getString(1),r.getString(2),r.getString(3), 
                        "SPR00" + r.getString(4),r.getString(5),r.getString(6),
                        r.getString(7),r.getString(8),r.getString(9)
                });
            }
            s.close();
            r.close();
            
            tbl_laporan.setModel(tb);
            tbl_laporan.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbl_laporan.getColumnModel().getColumn(1).setPreferredWidth(30);
            tbl_laporan.getColumnModel().getColumn(4).setPreferredWidth(30);
                    
        }catch(Exception e){
       
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
        lbl_judul = new javax.swing.JLabel();
        bersih = new javax.swing.JButton();
        btn_submit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        filter = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_laporan = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_judul.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_judul.setText("FORM LAPORAN");
        jPanel2.add(lbl_judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 300, -1));

        bersih.setBackground(new java.awt.Color(102, 102, 255));
        bersih.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bersih.setForeground(new java.awt.Color(102, 102, 255));
        bersih.setText("REFRESH");
        bersih.setBorderPainted(false);
        bersih.setContentAreaFilled(false);
        bersih.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihActionPerformed(evt);
            }
        });
        jPanel2.add(bersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        btn_submit.setBackground(new java.awt.Color(102, 102, 255));
        btn_submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_submit.setForeground(new java.awt.Color(255, 255, 255));
        btn_submit.setText("SUBMIT");
        btn_submit.setBorderPainted(false);
        btn_submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        jPanel2.add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Cari Berdasarkan Peminjaman");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        filter.setEditable(true);
        filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Bulan", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);
            }
        });
        jPanel2.add(filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 30));

        tbl_laporan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Penyewa", "Nama Penyewa", "Jumlah Transaksi", "ID Supir", "Nama Supir", "Peminjaman", "Pengembalian", "Total Transaksi", "Peringkat Penyewa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_laporan);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 920, 340));

        txtcari.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcari.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcariKeyReleased(evt);
            }
        });
        jPanel2.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 220, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Filter");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihActionPerformed
        // TODO add your handling code here:
        if (tipe.equals("Tabel Laporan")) {
            DefaultTableModel model = (DefaultTableModel)tbl_laporan.getModel();
            model.setRowCount(0);
            tampil_laporan();
        }else if (tipe.equals("Tabel Ranking (Supir)")) {
//            DefaultTableModel model = (DefaultTableModel)tbl_laporan.getModel();
//            model.setRowCount(0);
            tampilRankingSupir();
        }else if (tipe.equals("Tabel Ranking (Penyewa)")) {
            DefaultTableModel model = (DefaultTableModel)tbl_laporan.getModel();
            model.setRowCount(0);
            tampilRankingPenyewa();
        }
        
    }//GEN-LAST:event_bersihActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        if (tipe.equals("Tabel Laporan")) {
//            DefaultTableModel model = (DefaultTableModel)tbl_laporan.getModel();
//            model.setRowCount(0);
            tampil_laporan();
        }else if (tipe.equals("Tabel Ranking (Supir)")) {
//            DefaultTableModel model = (DefaultTableModel)tbl_laporan.getModel();
//            model.setRowCount(0);
            tampilRankingSupir();
        }else if (tipe.equals("Tabel Ranking (Penyewa)")) {
            DefaultTableModel model = (DefaultTableModel)tbl_laporan.getModel();
            model.setRowCount(0);
            tampilRankingPenyewa();
        }
    }//GEN-LAST:event_btn_submitActionPerformed

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterActionPerformed
        if (tipe.equals("Tabel Laporan")) {
            DefaultTableModel model = (DefaultTableModel)tbl_laporan.getModel();
            model.setRowCount(0);
            tampil_laporan();
        }else if (tipe.equals("Tabel Ranking (Supir)")) {
//            DefaultTableModel model = (DefaultTableModel)tbl_laporan.getModel();
//            model.setRowCount(0);
            tampilRankingSupir();
        }else if (tipe.equals("Tabel Ranking (Penyewa)")) {
            DefaultTableModel model = (DefaultTableModel)tbl_laporan.getModel();
            model.setRowCount(0);
            tampilRankingPenyewa();
        }
    }//GEN-LAST:event_filterActionPerformed

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        System.out.println("Released");
        if (tipe.equals("Tabel Laporan")) {
            DefaultTableModel model = (DefaultTableModel)tbl_laporan.getModel();
            model.setRowCount(0);
            tampil_laporan();
        }else if (tipe.equals("Tabel Ranking (Supir)")) {
//            DefaultTableModel model = (DefaultTableModel)tbl_laporan.getModel();
//            model.setRowCount(0);
            tampilRankingSupir();
//            System.out.println("Displayed");
        }else if (tipe.equals("Tabel Ranking (Penyewa)")) {
            DefaultTableModel model = (DefaultTableModel)tbl_laporan.getModel();
            model.setRowCount(0);
            tampilRankingPenyewa();
        }
    }//GEN-LAST:event_txtcariKeyReleased

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
            java.util.logging.Logger.getLogger(form_laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_laporan().setVisible(true);
            }
        });
    }
 private void bersih(){
        txtcari.setText("");
//        //combobox paksa untuk pilih pertama
//        mat.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bersih;
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox<String> filter;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_judul;
    private javax.swing.JTable tbl_laporan;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
