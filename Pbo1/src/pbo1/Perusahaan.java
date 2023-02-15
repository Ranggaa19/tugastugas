/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1;

/**
 *
 * @author rangga
 */
public class Perusahaan {
    private String NamaPerusahaan,Alamat,pemilik,npwp;
    private Pegawai[] daftarPegawai;
    
    public Perusahaan(String pemilik,String npwp){
        this.pemilik = pemilik;
        this.npwp = npwp;
    }

    public String getNamaPerusahaan() {
        return NamaPerusahaan;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getPemilik() {
        return pemilik;
    }

    public String getNpwp() {
        return npwp;
    }

    public Pegawai[] getDaftarPegawai() {
        return daftarPegawai;
    }

    public void setNamaPerusahaan(String NamaPerusahaan) {
        this.NamaPerusahaan = NamaPerusahaan;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public void setDaftarPegawai(Pegawai[] daftarPegawai) {
        this.daftarPegawai = daftarPegawai;
    }
    public void addPegawai(int jumlah,int k,Pegawai pgw){
        if(k==0){
            Pegawai[] pg = new Pegawai[jumlah];
            this.daftarPegawai=pg;
        }
        this.daftarPegawai[k]=pgw;
    }
    public double hitungRata(){
        double total = 0;
        for (int i = 0; i < this.daftarPegawai.length;i++){
            total += this.daftarPegawai[i].hitungGajiPokok();
        }
        double rata = total/this.daftarPegawai.length;
        return rata;
    }
    public Pegawai CariGajiTerbesar(){
        int max = this.daftarPegawai[0].hitungGajiPokok();
        int indeks = 0;
        for(int i = 1; i<this.daftarPegawai.length;i++){
            if (this.daftarPegawai[i].hitungGajiPokok() > max){
                max = this.daftarPegawai[i].hitungGajiPokok();
                indeks = i;
                
            }
        }
        return daftarPegawai[indeks];
    
    }
    public Pegawai cariGajiTerkecil(){
int min = this.daftarPegawai[0].hitungGajiPokok();
        int indeks = 0;
        for(int i = 1; i <this.daftarPegawai.length;i++){
            if (this.daftarPegawai[i].hitungGajiPokok() < min){
                min = this.daftarPegawai[i].hitungGajiPokok();
                indeks = i;
    }
}
        return daftarPegawai[indeks];
    }
}
