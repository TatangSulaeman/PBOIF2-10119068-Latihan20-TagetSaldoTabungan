/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119068.latihan20.tagetsaldotabungan;


import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan Target Saldo di dalam tabungan
 */
public class PBOIF210119068Latihan20TagetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        DecimalFormat mataUangIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols nRp = new DecimalFormatSymbols();
        
        nRp.setCurrencySymbol("Rp. ");
        nRp.setMonetaryDecimalSeparator(',');
        nRp.setGroupingSeparator('.');
        
        mataUangIndonesia.setDecimalFormatSymbols(nRp);
        int i = 1;
        float bungaPerBulan;
        double saldoAwal,saldoPenargetan,saldo;
        
        System.out.print("Saldo Awal : Rp. ");
        saldoAwal = keyboard.nextDouble();
        
        System.out.print("Bunga perBulan : ");
        bungaPerBulan = keyboard.nextFloat();
        
        System.out.print("Saldo Target : Rp. ");
        saldoPenargetan = keyboard.nextDouble();
        
        bungaPerBulan = (float) (bungaPerBulan/100);
        
        while (i< saldoPenargetan){
            saldo = (saldoAwal * 0.08) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " %s %n", mataUangIndonesia.format(saldo));
            saldoAwal = saldo ;
            if (saldoAwal >= saldoPenargetan){
                break;
            }i++;
        }
        System.out.println("DIBUAT OLEH TATANG SULAEMAN");
    }
    
}
