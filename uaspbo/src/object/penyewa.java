/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

/**
 *
 * @author User
 */
public class penyewa extends orang {
    private int id_penyewa;
    private String username;
    private String password;
    private String gender;
    private String alamat;
    private String no_ktp;
    private int saldo;

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
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the no_ktp
     */
    public String getNo_ktp() {
        return no_ktp;
    }

    /**
     * @param no_ktp the no_ktp to set
     */
    public void setNo_ktp(String no_ktp) {
        this.no_ktp = no_ktp;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
