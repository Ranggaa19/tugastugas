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
public class Pegawai {

    private String nama, status, Npp;
    private int jumanak, golongan, gaji, tunjangan;

    public Pegawai(String Npp, String nama) {
        this.Npp = Npp;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    public String getNpp() {
        return Npp;
    }

    public int getJumanak() {
        return jumanak;
    }

    public int getGaji() {
        return gaji;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setJumanak(int jumanak) {
        this.jumanak = jumanak;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int Golongan) {
        this.golongan = Golongan;
    }

    public int hitungGajiPokok() {
        if (golongan == 1){
            gaji = 130000;
            return gaji;
        } else if (golongan == 2){
            gaji = 175000;
            return gaji;
        } else if (golongan == 3){
            gaji = 200000;
            return gaji;
        } else{
            gaji = 0;
            return gaji;
        }
    }

    public int hitungTunjanganKeluarga() {
        if (status.equals("menikah"))
        {
            tunjangan = 30000 + (jumanak * 10000);

        }
        return 0;
    }

    public int hitungGajiTotal() {
        return (gaji + tunjangan);
    }

}
