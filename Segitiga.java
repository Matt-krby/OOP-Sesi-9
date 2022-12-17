public class Segitiga extends Shape implements ShapeMethod{
    public int alas;
    public int tinggi;

    // Konstruktor default
    public Segitiga() {
        this.nama = "Segitiga";
        this.alas = 0;
        this.tinggi = 0;
    }

    // Konstruktor dengan parameter
    public Segitiga(int alas, int tinggi) {
        this.nama = "Segitiga";
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    // Setter
    public void setAlas(int alas){
        this.alas = alas;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }

    // Getter
    public int getAlas(){
        return this.alas;
    }
    public int getTinggi(){
        return this.tinggi;
    }

    @Override
    public int luas(){
        return alas*tinggi/2;
    }
    @Override
    public int keliling(){
        return alas*3;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Bangun: " + this.nama + " \nLuas: " + luas() + " \nKeliling: " + keliling() + "\n";
    }
}
