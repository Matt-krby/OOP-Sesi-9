public class JajarGenjang extends Shape implements ShapeMethod {
    public int alas;
    public int tinggi;

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

    // Konstruktor default
    public JajarGenjang() {
        this.nama = "Jajar Genjang";
        this.alas = 0;
        this.tinggi = 0;
    }

    // Konstruktor dengan parameter
    public JajarGenjang(int alas, int tinggi) {
        this.nama = "Jajar Genjang";
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public int luas(){
        return alas*tinggi;
    }

    @Override
    public int keliling(){
        return 2*(alas+tinggi);
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Bangun: " + this.nama + " \nLuas: " + luas() + " \nKeliling: " + keliling() + "\n";
    }
    
}
