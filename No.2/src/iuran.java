/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS PC
 */
public class iuran extends pendataan {
    int iuran,totPembayaran,sampah, keamanan,sumbangan;
    

    public iuran(String nama, String nik, String alamat, String job, int noTlp, int jml_ank) {
        super(nama, nik, alamat, job, noTlp, jml_ank);
        this.iuran = iuran;
        this.totPembayaran = totPembayaran;
    }

    @Override
    public Integer getJml_ank() {
        return super.getJml_ank(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Integer getNoTlp() {
        return super.getNoTlp(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getJob() {
        return super.getJob(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getAlamat() {
        return super.getAlamat(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNik() {
        return super.getNik(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNama() {
        return super.getNama(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setJml_ank(Integer jml_ank) {
        super.setJml_ank(jml_ank); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNoTlp(Integer noTlp) {
        super.setNoTlp(noTlp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setJob(String job) {
        super.setJob(job); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setAlamat(String alamat) {
        super.setAlamat(alamat); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNik(String nik) {
        super.setNik(nik); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public int bayarIuran(){
        
        totPembayaran = iuran + sampah + keamanan + sumbangan;
        
        return totPembayaran;
        
        
        
    }
}