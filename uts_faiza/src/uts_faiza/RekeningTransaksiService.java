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
import java.util.Scanner;
public class RekeningTransaksiService {
    Scanner input = new Scanner(System.in);
    Rekening[] rek = new Rekening[19];
    Transaksi[] tr = new Transaksi[19];

    void menu() {
        System.out.println("--MENU UTS--");
        System.out.println("1. Tampil Data Rekening");
        System.out.println("2. Tampil Data Transaksi");
        System.out.println("3. Mencari Saldo > 500000");
        System.out.println("4. Sorting By Name");
        System.out.println("5. Keluar");
        System.out.print("Pilih(1-5) : ");
    }
    
    void milih(int pilih) {
        if (pilih == 1) {
            pilih1();
        } else if (pilih == 2) {
            pilih2();
        } else if (pilih == 3) {
            pilih3();
        } else if (pilih == 4) {
            pilih4();
        } else {
            pilih5();
        }
    }

    void pilih1() {
        System.out.println("No rekening\t Nama\t Nama Ibu\t Phone\t Email ");
        for (int i = 0; i < rek.length; i++) {
            System.out.println(rek[i].noRekening + " " + rek[i].nama + "\t " + rek[i].namaIbu + "\t" + rek[i].phone + "\t" + rek[i].email);
        }
    }

    void pilih2() {
        System.out.println("Saldo\t Saldo Awal\t Saldo Akhir\t Tanggal Transaksi\t Type ");
        for (int i = 0; i < tr.length; i++) {
            System.out.println(tr[i].saldo + "  \t" + tr[i].saldoAwal + "\t\t" + tr[i].saldoAkhir + " \t" + tr[i].tanggalTransaksi + "\t" + tr[i].type);
        }
    }

    void pilih3() {
        for (int i = 0; i < tr.length; i++) {
            if (tr[i].saldo > 500000) {
                System.out.println(rek[i].noRekening + "\t" + tr[i].saldo + "\t" + tr[i].saldoAwal + "\t" + tr[i].saldoAkhir + "\t" + tr[i].tanggalTransaksi);
            }
        }
    }

    void pilih4() {
        for (int i = 0; i < tr.length - 1; i++) {
            for (int j = 1; j < tr.length - i; j++) {
                if (rek[j].nama.compareToIgnoreCase(rek[j - 1].nama) < 0) {
                    String tmp = rek[j].nama;
                    rek[j].nama = rek[j - 1].nama;
                    rek[j - 1].nama = tmp;
                }
            }
        }
        System.out.println("Sorting by Name");
        for (int i = 0; i < rek.length; i++) {
            System.out.println(rek[i].noRekening + "\t\t" + rek[i].nama + "\t\t" + rek[i].namaIbu + "\t\t" + rek[i].phone + "\t\t" + rek[i].email);
        }
    }

    void pilih5() {
        System.exit(0);
    }
}
