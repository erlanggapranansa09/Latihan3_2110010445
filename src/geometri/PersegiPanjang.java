package geometri;


public class PersegiPanjang {
    double bil1, bil2;

    public PersegiPanjang(double  bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    public double setLuasPersegiPanjang(){
        return bil1 * bil2;
    }

     public double setKelilingPersegiPanjang(){
        return 2 * (bil1 * bil2);
    }
    
    
    
}
