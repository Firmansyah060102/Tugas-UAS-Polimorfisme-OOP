/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_praktek;

/**
 *
 * @author firman
 */
public class JenisNasiPadang extends PenjualanNasiPadang{
    public void jualNasiPadang(String jenis, String rasa, int jumlah, int harga) {
        System.out.println("Penjualan nasi padang jenis " + jenis + " rasa " + rasa + " sebanyak " + jumlah + " porsi");
        System.out.println("harga 1 porsi = "+"Rp "+harga);
        System.out.println("total harga   = "+"Rp "+jumlah*harga);
        System.out.println("-------------------------------------------");
    }
}
