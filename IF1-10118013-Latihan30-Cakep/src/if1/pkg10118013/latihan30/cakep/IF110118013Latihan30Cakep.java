/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan30.cakep;
import java.util.Scanner;
/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-1
 * NIM : 10118013
 * Deskripsi Program : Cakep
 */
public class IF110118013Latihan30Cakep {
    public static final String reset = "\u001B[0m";
    public static final String merah = "\u001B[31m";
    public static final String hijau = "\u001B[32m";
    public static final String kuning = "\u001B[33m";
    public static final String biru = "\u001B[34m";
    public static final String ungu = "\u001B[35m";
    public static final String biruMuda = "\u001B[36m";
    public static final String putih = "\u001B[37m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(merah + "Kamu " + hijau + "ngerjain sendiri " + kuning + "latihan 17 sampe " + 
                biru + "latihan 30 ini ?\n" );
        System.out.print("Jawab " + merah + "(Yoi/Enggak) :  " + reset);
        Scanner scanner = new Scanner(System.in);
        String jawab = scanner.nextLine();
        jawab = jawab.toUpperCase();
        if (jawab.equals("YOI"))
            System.out.println(merah + "Capek Bener." + ungu + " Good Job");
        
        else {
            System.out.println(merah + "Tetep cakep sih.");
            System.out.println(biruMuda + "Sing penting paham konsep nya yee.");
            System.out.println(reset + "Keep the source code works dude");
        }
        System.out.println("(Developed by : Rifian Joe Premilenio)");
    }
    
}
