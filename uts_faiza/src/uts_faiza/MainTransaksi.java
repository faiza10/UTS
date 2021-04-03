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
        rts.rek[0] = new Rekening("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligua.null@tacitisociosqu.edu");
        rts.rek[1] = new Rekening("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org");
        rts.rek[2] = new Rekening("16240401 2243", "Fuller", "Finn Dunlap", "571-7062", "convalli@Vestibulumanteispum.org");
        rts.rek[3] = new Rekening("16270525 0112", "Malcolm", "Keane Floyd", "623-0234", "porttitor.tellus.non@Curabitur.ca");
        rts.rek[4] = new Rekening("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentenesque@luctusutpellentesque.com");
        rts.rek[5] = new Rekening("16100727 8862", "Rudyard", "Charles Morales", "650-5379", "Proin.eget@velitegestaslacinia.ca");
        rts.rek[6] = new Rekening("16460329 4259", "Troy", "Damon Guerra", "897-7608", "pede.Suspendisse.dui@a.ca");
        rts.rek[7] = new Rekening("16320421 3437", "Alec", "Cooper Lee", "792-4447", "non@mus.com");
        rts.rek[8] = new Rekening("16180729 7229", "Walter", "Seth Drake", "863-8209", "Pellentesque.ut.ipsum@neque.ca");
        rts.rek[9] = new Rekening("16950313 6823", "Simon", "Burton Gates", "592-6919", "tellus.justo.sit@commodoauctor.net");
        rts.rek[10] = new Rekening("16850708 3528", "Kamal", "Odysseus Salas", "1-115-339-7678", "dictum@nec.edu");
        rts.rek[11] = new Rekening("16080205 9329", "Xenos", "Colin Curry", "1-891-703-2664", "vel@ullamcorpermagna.co.uk");
        rts.rek[12] = new Rekening("16080628 2695", "Merritt", "Clarke Roman", "1-978-632-5110", "Aliquam.gravida@vestibulumMauris.net");
        rts.rek[13] = new Rekening("16130909 2979", "Ryder", "Joel Cunningham", "817-1766", "interdum.Curabitur.dictum@rutrumurna.edu");
        rts.rek[14] = new Rekening("16890212 8688", "Preston", "Brock Schroeder", "1-675-400-4501", "et.ultrices@a.co.uk");
        rts.rek[15] = new Rekening("16141008 9963", "Alec", "Baker Barton", "527-9085", "ut@aultriciesadipiscing.ca");
        rts.rek[16] = new Rekening("16511222 7763", "Price", "Ashton Burke", "1-564-419-4285", "Proin.velit@Duisac.net");
        rts.rek[17] = new Rekening("16720623 0943", "Devin", "Slade Flores", "977-6690", "ac@nibhAliquamornare.com");
        rts.rek[18] = new Rekening("16771126 7372", "Ignatius", "Lionel Kane", "353-5137", "cubilia.Curae.Phasellus@Duis.com");

        rts.tr[0] = new Transaksi(898214, 494048, 3587, "2021-03-09 07:54:42", " ");
        rts.tr[1] = new Transaksi(205420, 200162, 775880, "2021-06-25 10:23:00", " ");
        rts.tr[2] = new Transaksi(838632, 350929, 328316, "2021-09-18 23:00:04", " ");
        rts.tr[3] = new Transaksi(230659, 204434, 690503, "2022-02-02 19:10:34", " ");
        rts.tr[4] = new Transaksi(770592, 334245, 444267, "2020-08-11 13:36:56", " ");
        rts.tr[5] = new Transaksi(685302, 451002, 376442, "2020-05-23 07:34:53", " ");
        rts.tr[6] = new Transaksi(816129, 851403, 597842, "2021-07-18 19:41:20", " ");
        rts.tr[7] = new Transaksi(989609, 333823, 802752, "2022-02-01 01:13:11", " ");
        rts.tr[8] = new Transaksi(297103, 396116, 779589, "2021-07-03 01:09:49", " ");
        rts.tr[9] = new Transaksi(66190, 259150, 619774, "2021-09-09 03:57:30", " ");
        rts.tr[10] = new Transaksi(234301, 278309, 547922, "2021-08-24 13:18:39", " ");
        rts.tr[11] = new Transaksi(243306, 869468, 50283, "2021-03-12 03:40:16", " ");
        rts.tr[12] = new Transaksi(371045, 991242, 602034, "2021-08-06 11:48:59", " ");
        rts.tr[13] = new Transaksi(395170, 97058, 472273, "2021-05-02 10:53:31", " ");
        rts.tr[14] = new Transaksi(862731, 561908, 109431, "2021-07-31 08:11:00", " ");
        rts.tr[15] = new Transaksi(556798, 31387, 725426, "2021-03-27 06:18:20", " ");
        rts.tr[16] = new Transaksi(873982, 896213, 846142, "2021-07-18 04:06:30", " ");
        rts.tr[17] = new Transaksi(774247, 739406, 775848, "2020-10-24 01:39:00", " ");
        rts.tr[18] = new Transaksi(66987, 823014, 868772, "2020-12-21 05:57:59", " ");

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
