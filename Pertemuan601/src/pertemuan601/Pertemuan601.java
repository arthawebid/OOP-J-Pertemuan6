package pertemuan601;

import java.util.Scanner;

/**
 *
 * @author Made Artha
 * TGL: 15 April 2025
 */
public class Pertemuan601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VolumeBalok vb = new VolumeBalok();
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Hitung Volume Balok");
        System.out.print("Nilai Panjang: ");
        vb.setPanjang(inp.nextInt());
        System.out.print("Nilai Lebar: ");
        vb.setLebar(inp.nextInt());
        System.out.print("Nilai Tinggi: ");
        vb.setTinggi(inp.nextInt());
        System.out.println("Nilai Volumenya: ");
        System.out.println("V = P * L * T");
        System.out.printf("  = %d * %d * %d\n",vb.getPanjang(),vb.getLebar(),vb.getTinggi() );
        System.out.printf("  = %d",vb.Volume());
    }
    
}
