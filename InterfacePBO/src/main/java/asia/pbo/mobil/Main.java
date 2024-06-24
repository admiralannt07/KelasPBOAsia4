/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asia.pbo.mobil;

/**
 *
 * @author A-10
 */
public class Main {
    
    public static void main(String[] args) {
        MobilBaru mobilBaru = new MobilBaru("Toyota", "Mercedes", "5 tahun");
        MobilBekas mobilBekas = new MobilBekas("BMW", "M5", 2007, 50000000);
        Dealer dealer = new Dealer("Mobil Barat", mobilBaru, mobilBekas);
        dealer.info();
    }
}
