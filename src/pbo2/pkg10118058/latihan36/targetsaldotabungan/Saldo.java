/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan36.targetsaldotabungan;

/**
 *
 * @author user
 */
class Saldo {
    
    private static int saldoAwal,bunga,i;

    public static int getSaldoAwal() {
        return saldoAwal;
    }

    public static void setSaldoAwal(int aSaldoAwal) {
        saldoAwal = aSaldoAwal;
    }
    
    public int uangAwal(){
        saldoAwal=2500000;
        return saldoAwal;
}
    
    public int hitungBunga(){
        bunga = (int)(saldoAwal*0.15);
        return bunga;
    }
    
    public int seluruhSaldo(){
        i=1;
        do {
            
            System.out.println("Saldo di bulan ke- "+i+" Rp. "+saldoAwal);
            i++;
             bunga = (int)(saldoAwal*0.15);
             saldoAwal+=bunga;
        }while(i<=6);
        return i;
    }
}
