/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1gun;
/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;

public class Posttest1gun {
    public static void main(String[] args) {
        // Membuat ArrayList untuk objek SportsEquipment
        ArrayList<alat_olahraga > Listalat_olahraga = new ArrayList<>();

        // Inisialisasi objek-objek SportsEquipment
        Listalat_olahraga.add(new alat_olahraga ("bola", "sepatu futsal",0.1));
        Listalat_olahraga.add(new alat_olahraga ("baju bola", "bola volli", 0.2));
        Listalat_olahraga.add(new alat_olahraga ("sepatu bola", "Basketball", 0.3));
        Listalat_olahraga.add(new alat_olahraga ("kaus bola", "sepatu jooging", 0.4));
        Listalat_olahraga.add(new alat_olahraga("deker sepatu", "teping", 0.5));

        // Menampilkan informasi alat olahraga dalam ArrayList
        for (alat_olahraga alat : Listalat_olahraga) {
            System.out.println("Name: " + alat.name);
            System.out.println("Sport Type: " + alat.sportType);
            System.out.println("Weight: " + alat.weight + " kg");
            System.out.println();
        }
    }
}
