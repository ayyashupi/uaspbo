/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

/**
 *
 * @author User
 */
public class transaksi {
    private int id_transaksi;
    private int id_penyewa;
    private int kd_mobil;
    private int id_supir;
    private String tgl_pinjam;
    private String tgl_kembali;
    private int diskon;
    private int total;

    /**
     * @return the id_transaksi
     */
    public int getId_transaksi() {
        return id_transaksi;
    }

    /**
     * @param id_transaksi the id_transaksi to set
     */
    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    /**
     * @return the id_penyewa
     */
    public int getId_penyewa() {
        return id_penyewa;
    }

    /**
     * @param id_penyewa the id_penyewa to set
     */
    public void setId_penyewa(int id_penyewa) {
        this.id_penyewa = id_penyewa;
    }

    /**
     * @return the kd_mobil
     */
    public int getKd_mobil() {
        return kd_mobil;
    }

    /**
     * @param kd_mobil the kd_mobil to set
     */
    public void setKd_mobil(int kd_mobil) {
        this.kd_mobil = kd_mobil;
    }

    /**
     * @return the id_supir
     */
    public int getId_supir() {
        return id_supir;
    }

    /**
     * @param id_supir the id_supir to set
     */
    public void setId_supir(int id_supir) {
        this.id_supir = id_supir;
    }

    /**
     * @return the tgl_pinjam
     */
    public String getTgl_pinjam() {
        return tgl_pinjam;
    }

    /**
     * @param tgl_pinjam the tgl_pinjam to set
     */
    public void setTgl_pinjam(String tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    /**
     * @return the tgl_kembali
     */
    public String getTgl_kembali() {
        return tgl_kembali;
    }

    /**
     * @param tgl_kembali the tgl_kembali to set
     */
    public void setTgl_kembali(String tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }

    /**
     * @return the diskon
     */
    public int getDiskon() {
        return diskon;
    }

    /**
     * @param diskon the diskon to set
     */
    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
    
}
