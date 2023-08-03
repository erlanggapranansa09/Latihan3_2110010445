
package geometri;


public class main {
   
     public static void main(String[] args) {
  
    PersegiPanjang erlangga = new PersegiPanjang(3,4);

        System.out.println("Hasil Luas Persegi Panjang :"+erlangga.setLuasPersegiPanjang());

        System.out.println("Hasil Keliling Persegi Panjang :"+erlangga.setKelilingPersegiPanjang());

        Lingkaran erlanggaL = new Lingkaran(3);
        System.out.println("Hasil Luas Persegi Panjang :"+erlanggaL.setLuasLingkaran());
        System.out.println("Hasil Keliling Persegi Panjang :"+erlanggaL.setKelilingLingkaran());


    }
}


