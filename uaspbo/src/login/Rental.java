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
import javax.swing.JTextField;

/**
 *
 * 
 */
public class Rental extends javax.swing.JFrame {
    //Variable
    private int id_penyewa;
    private int saldo;

    /**
     * Creates new form register
     */
    public Rental() {
        initComponents();
        reformatComboBox();
        setIdPenyewa(1);
        lbl_saldo.setText("Rp. "+getSaldo(id_penyewa));
    }
    
    public Rental(int id) {
        initComponents();
        reformatComboBox();
        setIdPenyewa(id);
        lbl_saldo.setText("Rp. "+getSaldo(id_penyewa));
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
        lbl_supir = new javax.swing.JLabel();
        lbl_tanggal = new javax.swing.JLabel();
        btn_history = new javax.swing.JButton();
        btn_booking = new javax.swing.JButton();
        lbl_model_mobil = new javax.swing.JLabel();
        lbl_lamaperhari = new javax.swing.JLabel();
        cmb_model = new javax.swing.JComboBox<>();
        cmb_supir = new javax.swing.JComboBox<>();
        spn_waktu = new javax.swing.JSpinner();
        lbl_lama_sewa3 = new javax.swing.JLabel();
        jtf_tggl = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        lbl_total = new javax.swing.JLabel();
        lbl_saldo = new javax.swing.JLabel();
        lbl_saldo1 = new javax.swing.JLabel();
        lbl_total1 = new javax.swing.JLabel();

        lbl_lama_sewa2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_lama_sewa2.setForeground(new java.awt.Color(102, 102, 102));
        lbl_lama_sewa2.setText("Lama Sewa");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RentAllCars");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_judul.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_judul.setText("Rental Mobil");
        jPanel2.add(lbl_judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 300, -1));

        lbl_supir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_supir.setForeground(new java.awt.Color(102, 102, 102));
        lbl_supir.setText("Nama Supir");
        jPanel2.add(lbl_supir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 80, -1));

        lbl_tanggal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_tanggal.setForeground(new java.awt.Color(102, 102, 102));
        lbl_tanggal.setText("Tanggal Sewa");
        jPanel2.add(lbl_tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 100, -1));

        btn_history.setBackground(new java.awt.Color(102, 102, 255));
        btn_history.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_history.setForeground(new java.awt.Color(102, 102, 255));
        btn_history.setText("History");
        btn_history.setBorderPainted(false);
        btn_history.setContentAreaFilled(false);
        btn_history.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_historyActionPerformed(evt);
            }
        });
        jPanel2.add(btn_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        btn_booking.setBackground(new java.awt.Color(102, 102, 255));
        btn_booking.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_booking.setForeground(new java.awt.Color(255, 255, 255));
        btn_booking.setText("Booking");
        btn_booking.setBorderPainted(false);
        btn_booking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookingActionPerformed(evt);
            }
        });
        jPanel2.add(btn_booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));

        lbl_model_mobil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_model_mobil.setForeground(new java.awt.Color(102, 102, 102));
        lbl_model_mobil.setText("Model Mobil");
        jPanel2.add(lbl_model_mobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 100, -1));

        lbl_lamaperhari.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_lamaperhari.setForeground(new java.awt.Color(102, 102, 102));
        lbl_lamaperhari.setText("Hari");
        jPanel2.add(lbl_lamaperhari, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 70, -1));

        cmb_model.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_modelActionPerformed(evt);
            }
        });
        jPanel2.add(cmb_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        cmb_supir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_supir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_supirActionPerformed(evt);
            }
        });
        jPanel2.add(cmb_supir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        spn_waktu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn_waktuStateChanged(evt);
            }
        });
        jPanel2.add(spn_waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        lbl_lama_sewa3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_lama_sewa3.setForeground(new java.awt.Color(102, 102, 102));
        lbl_lama_sewa3.setText("Lama Sewa");
        jPanel2.add(lbl_lama_sewa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 70, -1));

        jtf_tggl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_tggl.setText("YYYY-MM-DD");
        jtf_tggl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jtf_tggl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_tgglActionPerformed(evt);
            }
        });
        jPanel2.add(jtf_tggl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 220, 30));

        btn_back.setBackground(new java.awt.Color(102, 102, 255));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_back.setForeground(new java.awt.Color(102, 102, 255));
        btn_back.setText("Back");
        btn_back.setBorderPainted(false);
        btn_back.setContentAreaFilled(false);
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel2.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        lbl_total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_total.setForeground(new java.awt.Color(102, 102, 255));
        lbl_total.setText("Rp. 0");
        jPanel2.add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 160, 30));

        lbl_saldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_saldo.setForeground(new java.awt.Color(102, 102, 255));
        lbl_saldo.setText("Rp. 0");
        jPanel2.add(lbl_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 160, 30));

        lbl_saldo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_saldo1.setForeground(new java.awt.Color(102, 102, 255));
        lbl_saldo1.setText("Saldo Anda :");
        jPanel2.add(lbl_saldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 250, 30));

        lbl_total1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_total1.setForeground(new java.awt.Color(102, 102, 255));
        lbl_total1.setText("Total :");
        jPanel2.add(lbl_total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 210, 30));

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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void btn_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historyActionPerformed
        // TODO add your handling code here:
        RentalHistory s = new RentalHistory(id_penyewa);
        s.setTitle("History Transaksi");
        s.setVisible(true);
    }//GEN-LAST:event_btn_historyActionPerformed

    private void btn_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookingActionPerformed
        // TODO add your handling code here:
        String model = (String) cmb_model.getSelectedItem();
        String supir = (String) cmb_supir.getSelectedItem();
        String tanggal_sewa = jtf_tggl.getText().toString();
        System.out.println("Tanggal Sewa ");
        int lama_sewa = (Integer) spn_waktu.getValue();
//        String waktu_sewa = Integer.toString(lama_sewa);
        
        if(model.equals("Pilih Mobil") || supir.equals("Pilih Supir") || tanggal_sewa.equals("") || tanggal_sewa.endsWith("YYYY-MM-DD")  || lama_sewa == 0){
            JOptionPane.showMessageDialog(null, "Data wajib terisi");
        } else {
            try{
              //id
              int id_penyewa = getIdPenyewa();
              int id_mobil = getIdMobil(model);
              int id_supir = getIdSupir(supir);
              
              //tanggal
              String tanggal_akhir = getDateAdd(tanggal_sewa, lama_sewa);
              
              //perhitungan
              int saldo = getSaldo(id_penyewa);
              int harga_mobil = getHargaMobil(id_mobil);
              int harga_supir = getHargaSupir(id_supir);
              int count_id = countIdPenyewa(id_penyewa);
              double double_harga_mobil = harga_mobil;
              double double_harga_supir = harga_supir;
              double double_saldo = saldo;
              double lm_sewa = lama_sewa;
              double total = getTotal(double_harga_mobil, double_harga_supir, lm_sewa);
              double diskon = getDiskon(count_id, total);
              double result = total - diskon;
              
              if(saldo < result){
                JOptionPane.showMessageDialog(null, "Saldo kurang");                   
              } else {
                //1. Query
                String query = "INSERT INTO transaksi (id_penyewa, kd_mobil, id_supir, tgl_pinjam, tgl_kembali, diskon, total) VALUES ('"+ id_penyewa +"', '"+ id_mobil +"', '"+ id_supir +"', '" + tanggal_sewa + "', '"+ tanggal_akhir +"', '"+ diskon +"', '"+ result +"')";

                //2. koneksi
                java.sql.Connection c = (Connection)KoneksiDB.configDB();
                java.sql.PreparedStatement s = c.prepareStatement(query);
                s.execute();
                JOptionPane.showMessageDialog(null, "Total : " + result);
                JOptionPane.showMessageDialog(null, "Data berhasil ditambakan");
                double update_saldo = updateSaldo(double_saldo, result, id_penyewa);
              }
              
              


                // cek data setiap variable
//                JOptionPane.showMessageDialog(null, id_penyewa);
//                JOptionPane.showMessageDialog(null, id_mobil);
//                JOptionPane.showMessageDialog(null, id_supir);            
//                JOptionPane.showMessageDialog(null, tanggal_akhir);    
//                JOptionPane.showMessageDialog(null, saldo); 
//                JOptionPane.showMessageDialog(null, harga_mobil); 
//                JOptionPane.showMessageDialog(null, count_id);    
//                JOptionPane.showMessageDialog(null, total);  
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "gagal");   
                System.out.println(e);
            }
        }
        cmb_model.setSelectedItem("Pilih Mobil");
        cmb_supir.setSelectedItem("Pilih Supir");
        jtf_tggl.setText("YYYY-MM-DD");
        spn_waktu.setValue(0);
    }//GEN-LAST:event_btn_bookingActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void spn_waktuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn_waktuStateChanged
        try {
            int angka = Integer.parseInt(spn_waktu.getValue().toString());
            if (angka < 0) {
                spn_waktu.setValue(0);
            }
        } catch (NumberFormatException e) {
                spn_waktu.setValue(0);       
        }
        updateHarga();
       
    }//GEN-LAST:event_spn_waktuStateChanged

    private void jtf_tgglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_tgglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_tgglActionPerformed

    private void cmb_modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_modelActionPerformed
        updateHarga();
    }//GEN-LAST:event_cmb_modelActionPerformed

    private void cmb_supirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_supirActionPerformed
        updateHarga();
    }//GEN-LAST:event_cmb_supirActionPerformed
    
    private void updateHarga(){
        int durasi = (Integer)spn_waktu.getValue();
        if(durasi != 0){
            int harga_supir = getHargaSupir(getIdSupir(cmb_supir.getSelectedItem().toString()));
            int total = durasi *(harga_supir + getHargaMobil(getIdMobil(cmb_model.getSelectedItem().toString())));
            lbl_total.setText("Rp. "+total);
            lbl_saldo.setText("Rp. "+getSaldo(id_penyewa));
        }
        
//        int total = 0;
        
    }
    
    public double updateSaldo (double saldo, double harga_sewa, int id_penyewa){
        double total = 0;
        try{
            //perhitungan
            total = saldo - harga_sewa;
                
            String query = "UPDATE penyewa SET saldo ='"+ total +"' WHERE id_penyewa = '"+ id_penyewa + "'";

            //2. koneksi
            java.sql.Connection c = (Connection)KoneksiDB.configDB();
            java.sql.PreparedStatement s = c.prepareStatement(query);
            s.execute();
//          JOptionPane.showMessageDialog(null, "Data Terupdate");
            s.close();
//            r.close();
        }catch(Exception e){
//          JOptionPane.showMessageDialog(null, "Data tidak terupdate");
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return total;
    }
    
    public double getTotal(double harga_sewa, double harga_supir, double lama_sewa){
        double total = 0;
        total = (harga_sewa + harga_supir) * lama_sewa;

        return total;
    }
    
    public double getDiskon(double countid, double harga_sewa){
        double diskon = 0;
        if(countid >= 15){
            diskon = harga_sewa * 0.3;
        } else if (countid > 5 && countid < 15){
            diskon = harga_sewa * 0.1;
        } else {
            diskon = 0;
        }
        
        return diskon;
    }
    
    private int countIdPenyewa(int id_penyewa){
        int count = 0;
        try{
            //1. Query get id_mobil dan supir
            String query = "SELECT count(*) as count FROM transaksi WHERE id_penyewa = '" + id_penyewa + "'";
            
            //2. koneksi
            java.sql.Connection c = (Connection)KoneksiDB.configDB();

            
            //3. kirim parameter
            java.sql.Statement s = c.createStatement();

            
            //4. ekseskusi query
            java.sql.ResultSet r = s.executeQuery(query);
            
            //5. looping model
            int i = 1;
            while(r.next()){
                
                 count = r.getInt("count");
                 i++;

            }
            s.close();
            r.close();
        } catch (Exception e){
            
        }
        return count;        
    }
    
    private int getHargaSupir(int id_supir){
        int harga = 0;
        try{
            //1. Query get id_mobil dan supir
            String query = "SELECT biaya FROM supir WHERE id_supir = '" + id_supir + "'";
            
            //2. koneksi
            java.sql.Connection c = (Connection)KoneksiDB.configDB();

            
            //3. kirim parameter
            java.sql.Statement s = c.createStatement();

            
            //4. ekseskusi query
            java.sql.ResultSet r = s.executeQuery(query);
            
            //5. looping model
            int i = 1;
            while(r.next()){
                
                 harga = r.getInt("biaya");
                 i++;

            }  
            s.close();
            r.close();
        } catch (Exception e){
            
        }
        return harga;
             
    }
    
    private int getHargaMobil(int id_mobil){
        int harga = 0;
        try{
            //1. Query get id_mobil dan supir
            String query = "SELECT harga_sewa FROM mobil WHERE id_mobil = '" + id_mobil + "'";
            
            //2. koneksi
            java.sql.Connection c = (Connection)KoneksiDB.configDB();

            
            //3. kirim parameter
            java.sql.Statement s = c.createStatement();

            
            //4. ekseskusi query
            java.sql.ResultSet r = s.executeQuery(query);
            
            //5. looping model
            int i = 1;
            while(r.next()){
                
                 harga = r.getInt("harga_sewa");
                 i++;

            }
            s.close();
            r.close();
        } catch (Exception e){
            
        }
        return harga;
             
    }
    private int getSaldo(int id_penyewa){
        int saldo = 0;
        try{
            //1. Query get id_mobil dan supir
            String query = "SELECT saldo FROM penyewa WHERE id_penyewa = '" + id_penyewa + "'";
            
            //2. koneksi
            java.sql.Connection c = (Connection)KoneksiDB.configDB();

            
            //3. kirim parameter
            java.sql.Statement s = c.createStatement();

            
            //4. ekseskusi query
            java.sql.ResultSet r = s.executeQuery(query);
            
            //5. looping model
            int i = 1;
            while(r.next()){
                
                 saldo = r.getInt("saldo");
                 i++;

            }
            s.close();
            r.close();
        } catch (Exception e){
            
        }
        return saldo;
             
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
            s.close();
            r.close();
        } catch (Exception e){
            
        }
        return tanggal;
        
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
            s.close();
            r.close();
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
            s.close();
            r.close();
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
            s.close();
            r.close();
            s2.close();
            r2.close();
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_booking;
    private javax.swing.JButton btn_history;
    private javax.swing.JComboBox<String> cmb_model;
    private javax.swing.JComboBox<String> cmb_supir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jtf_tggl;
    private javax.swing.JLabel lbl_judul;
    private javax.swing.JLabel lbl_lama_sewa2;
    private javax.swing.JLabel lbl_lama_sewa3;
    private javax.swing.JLabel lbl_lamaperhari;
    private javax.swing.JLabel lbl_model_mobil;
    private javax.swing.JLabel lbl_saldo;
    private javax.swing.JLabel lbl_saldo1;
    private javax.swing.JLabel lbl_supir;
    private javax.swing.JLabel lbl_tanggal;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_total1;
    private javax.swing.JSpinner spn_waktu;
    // End of variables declaration//GEN-END:variables
}