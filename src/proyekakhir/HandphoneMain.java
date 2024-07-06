package proyekakhir;

import java.util.Scanner;
public class HandphoneMain {
    public static void main(String[] args) {
        //object
        //Handphone Hp1 = new Handphone("Samsung", "AS32FE24", 10000000);
        
        //System.out.println(Hp1.tampil());
        //System.out.println(Hp1.tampil("Samsung Electronics Co., Ltd"));
        
        //error handling
        try{
            //IO sederhana
            Scanner scanner = new Scanner(System.in);

            //array
            SpecsHandphone[] Hp1 = new SpecsHandphone[2];

            //perulangan
            for(int i=0; i<Hp1.length; i++){
                System.out.print("Input Merk Handphone "+(i+1)+": ");
                String merk = scanner.nextLine();
                System.out.print("Masukkan seri Hp "+(i+1)+": ");
                String seri = scanner.nextLine();
                System.out.print("Input Harga "+(i+1)+": ");
                int harga = scanner.nextInt();
                scanner.nextLine();

                //object
                Hp1[i] = new SpecsHandphone(merk, seri, harga);
            }

            for(SpecsHandphone data: Hp1){  
                System.out.println("===============================");
                System.out.println("Rincian Spesifikasi Handphone: ");
                System.out.println(data.tampil());
            }
        } catch (NumberFormatException e){
            System.out.println("Kesalahan format nomor: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan Umum: "+e.getMessage());
        }
    }
}
