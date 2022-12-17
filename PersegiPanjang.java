public class PersegiPanjang extends Shape implements ShapeMethod{
    public int panjang;
    public int lebar;

    // Konstruktor default

    public PersegiPanjang() {
        this.nama = "Persegi Panjang";
        this.panjang = 0;
        this.lebar = 0;
    }

    // Konstruktor dengan parameter
    public PersegiPanjang(int panjang, int lebar) {
        this.nama = "Persegi Panjang";
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Setter
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    public void setLebar(int lebar){
        this.lebar = lebar;
    }

    // Getter
    public int getPanjang(){
        return this.panjang;
    }
    public int getLebar(){
        return this.lebar;
    }

    @Override
    public int luas(){
        // System.out.println("Menghitung Luas Persegi");
        return panjang*lebar;
    }
    @Override
    public int keliling(){
        // System.out.println("Menghitung Keliling Persegi");
        return 2*(panjang+lebar);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Bangun: " + this.nama + " \nLuas: " + luas() + " \nKeliling: " + keliling() + "\n";
    }
}
