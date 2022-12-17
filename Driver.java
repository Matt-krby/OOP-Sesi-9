/*
 * Class berikut merupakan class untuk menguji class-class yang telah dibuat.
 */
public class Driver extends Shape {
    public static void main(String[] args) {
        Segitiga s = new Segitiga(10,5);
        PersegiPanjang p = new PersegiPanjang(5,6);
        Lingkaran l = new Lingkaran(7);
        JajarGenjang j = new JajarGenjang(5,6);
        
        
        System.out.println(s.toString()); // Bangun: Segitiga Luas: 25 Keliling: 30
        System.out.println(p.toString()); // Bangun: Persegi Panjang Luas: 0 Keliling: 0
        System.out.println(l.toString()); // Bangun: Lingkaran Luas: 0 Keliling: 0
        System.out.println(j.toString()); // Bangun: Jajar Genjang Luas: 0 Keliling: 0
    }

} 