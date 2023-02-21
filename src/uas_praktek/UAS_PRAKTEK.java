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
public class UAS_PRAKTEK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      PenjualanNasiPadang pnp = new PenjualanNasiPadang();
      BanyakNasiPadang bnp = new BanyakNasiPadang();
      JenisNasiPadang jnp = new JenisNasiPadang();
        pnp.jualNasiPadang(10,10000);
        bnp.jualNasiPadang("Ayam",20,12000);
        jnp.jualNasiPadang("Ayam", "Pedas", 30,15000);
        // TODO code application logic here
    }
    
}
