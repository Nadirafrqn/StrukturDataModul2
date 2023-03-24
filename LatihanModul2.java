/* 
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template 
*/
package Tugasmodul2;

import java.util.ArrayList;
/**
 *
 * @author Nadira Furqani
 */

public class LatihanModul2 {
    public static void main(String[] args) {
        // Buat objek Hewan
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println("Hewan : ");
        System.out.println(hewan);
        
        // Buat objek DeleteHewan
        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");
        
        // Buat objek untuk menampung data yang dihapus
        ArrayList<String> deletedData = new ArrayList<>();
        
        // Hapus data yang sama dengan data warna pada DeleteHewan
        for (String warna : deleteHewan) {
            hewan.removeIf(h -> h.equals(warna));
            deletedData.add(warna); // Tambahkan data yang dihapus ke dalam deleteData
        }
        
        // Tampilkan hasil penghapusan
        System.out.println("Hewan yang dihapus:");
        System.out.println(deletedData);
        
        // Tampilkan hasil setelah menghapus data
        System.out.println("Output Hewan:");
        System.out.println(hewan);
    }
}
