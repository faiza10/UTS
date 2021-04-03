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
public class MainTransaksi {
    public static void main(String[] args) {
        int pilih;
        Scanner input = new Scanner(System.in);
        RekeningTransaksiService rts = new RekeningTransaksiService();
        rts.rek[0] = new Rekening("161006170573,”bin Abdul Salam”,”Ariffin”,13578430547,”nec@lectusjusto.org” ");
        rts.rek[1] = new Rekening("162404012243,”bin Mail”,”Ismail”,5717062,”convallis@Vestibulumanteipsum.org”");
        rts.rek[2] = new Rekening("162705250112,”Singh”,”Jarjit”,6230234,”porttitor.tellus.non@Curabitur.ca”");
        rts.rek[3] = new Rekening("164603294259,”bin Khamis”,”Isnin”,8977608,”pede.Suspendisse.dui@a.ca");
        rts.rek[4] = new Rekening("163204213437,”Xiao”,”Mei Mei”,7924447,”non@mus.com”, 989609,333823,802752");
        rts.rek[5] = new Rekening("163204213437,”Xiao”,”Mei Mei”,7924447,”non@mus.com”");
        rts.rek[6] = new Rekening("161807297229,”Fadhullah”,”Jeanne Roselia”,8638209,”Pellentesque.ut.ipsum@neque.ca”);
        rts.rek[7] = new Rekening("169503136823,”Nohara”,”Shinnosuke”,5926919,”tellus.justo.sit@commodoauctor.net”");
        rts.rek[8] = new Rekening("168507083528,”Nohara”,”Hiroshi”,11153397678,”dictum@nec.edu”");
        rts.rek[9] = new Rekening("160802059329,”Nohara”,”Misae”,18917032664,”vel@ullamcorpermagna.co.uk”");
        rts.rek[10] = new Rekening("160806282695,”Nohara”,”Himawari”,19786325110,”Aliquam.gravida@vestibulumMauris.net”");
        rts.rek[11] = new Rekening("161309092979,”Nobi”,”Nobita”,8171766,”interdum.Curabitur.dictum@rutrumurna.edu");
        rts.rek[12] = new Rekening("168902128688,”Takeshi”,”Goda”,16754004501,”et.ultrices@a.co.uk”");
        rts.rek[13] = new Rekening("161410089963,”Kudo”,”Shinichi”,5279085,”ut@aultriciesadipiscing.ca”");
        rts.rek[14] = new Rekening("167711267372,”Mouri”,”Kogoro”,3535137,”cubilia.Curae.Phasellus@Duis.com”");
        
        rts.tr[0] = new Transaksi(205420,200162,775880,"2021-06-25 10:23:00"," ");
        rts.tr[1] = new Transaksi(2838632,350929,328316,"2021-09-18 23:00:04"," ");
        rts.tr[2] = new Transaksi(230659,204434,690503,"2022-02-02 19:10:34", " ");
        rts.tr[3] = new Transaksi(816129,851403,597842,"2021-07-18 19:41:20", " ");
        rts.tr[4] = new Transaksi(989609,333823,802752,"2022-02-01 01:13:11", " ");
        rts.tr[5] = new Transaksi(297103,396116,779589,"2021-07-03 01:09:49", " ");
        rts.tr[6] = new Transaksi(66190,259150,619774,"2021-09-09 03:57:30", " ");
        rts.tr[7] = new Transaksi( 234301,278309,547922,"2021-08-24 13:18:39", " ");
        rts.tr[8] = new Transaksi(243306,869468,50283,"2021-03-12 03:40:16", " ");
        rts.tr[9] = new Transaksi(371045,991242,602034,"2021-08-06 11:48:59", " ");
        rts.tr[10] = new Transaksi(234301, 278309, 547922, "2021-08-24 13:18:39", " ");
        rts.tr[11] = new Transaksi(395170,97058,472273,"2021-05-02 10:53:31", " ");
        rts.tr[12] = new Transaksi(371045, 991242, 602034, "2021-08-06 11:48:59", " ");
        rts.tr[13] = new Transaksi(862731,561908,109431,"2021-07-31 08:11:00", " ");
        rts.tr[14] = new Transaksi(862731, 561908, 109431, "2021-07-31 08:11:00", " ");
        rts.tr[15] = new Transaksi(556798,31387,725426,"2021-03-27 06:18:20", " ");
        rts.tr[16] = new Transaksi(66987,823014,868772,"2020-12-21 05:57:59", " ");

        do {
            do {
                rts.menu();
                pilih = input.nextInt();
                if (pilih < 1 || pilih > 5) {
                    System.out.print("Masukkan Menu Yang Ingin Dipilih : ");
                }  
            } while (pilih < 1 || pilih > 5);
                rts.milih(pilih);
        }while (pilih > 0 && pilih < 5);
    }
}
