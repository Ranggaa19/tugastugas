/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1;

import java.util.Scanner;

/**
 *
 * @author rangga
 */
public class KelolaPerusahaan {

    public static void main(String[] args) {
        int ank = 0;
        Scanner input = new Scanner(System.in);

        Perusahaan prshn = new Perusahaan("Budi", "12345");
        prshn.setNamaPerusahaan("koperatique");
        prshn.setAlamat("jln.mangga");

        System.out.println("masukan jumlah pegawai : ");
        int jum = input.nextInt();

        for (int i = 0; i < jum; i++)
        {
            System.out.println("masukan npp anda : ");
            String Npp = input.next();
            System.out.println("masukan nama anda : ");
            String Nama = input.next();
            System.out.println("masukan golongan anda : ");
            int gol = input.nextInt();
            System.out.println("menikah/tidak : ");
            String status = input.next();
            if (status.equals("menikah"))
            {
                System.out.println("Masukan jumlah anak : ");
                ank = input.nextInt();
            } else if (status.equals("tidak"))
            {
                ank = 0;
                status = "lajang";
            }

            Pegawai pgw = new Pegawai(Npp, Nama);
            pgw.setGolongan(gol);
            pgw.setStatus(status);
            pgw.setJumanak(ank);

            prshn.addPegawai(jum, i, pgw);
            System.out.println("");
        }
        Pegawai[]tampung = prshn.getDaftarPegawai();
        System.out.println("no NPP\t nama\t Gol Status\t jumlah anak gaji pokok");
        for (int i = 0; i<tampung.length;i++){
            System.out.println(i+1) + " "+tampung[i].getNpp()+""tampung[i].getNama()+""tampung[i].getGolongan()+""tampung[i].getStatus()+""tampung[i].getJumanak()+""tampung[i].getGaji());
        
        }
    }


