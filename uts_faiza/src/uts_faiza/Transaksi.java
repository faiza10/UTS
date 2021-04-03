/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_faiza;

/**
 *
 * @author entercomp
 */
public class Transaksi {
    public double saldo,saldoAwal,saldoAkhir;
    public String tanggalTransaksi,type;
    
    Transaksi(double a,double b,double c,String d,String e){
        saldo=a;
        saldoAwal=b;
        saldoAkhir=c;
        tanggalTransaksi=d;
        type=e;
    }
    
    void tampilData(){
        System.out.println("Saldo : " + saldo );
        System.out.println("Saldo Awal        : " + saldoAwal );
        System.out.println("saldoAkhir        : " + saldoAkhir );
        System.out.println("Tanggal Transaksi : " + tanggalTransaksi );
        System.out.println("Type              : " + type );
    }
}
