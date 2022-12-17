public class Lingkaran extends Shape implements ShapeMethod{
    public int radius;
    public double phi = 3.14;

    // Konstruktor default
    public Lingkaran() {
        this.nama = "Lingkaran";
        this.radius = 0;
    }

    // Konstruktor dengan parameter
    public Lingkaran(int radius) {
        this.nama = "Lingkaran";
        this.radius = radius;
    }

    // Setter
    public void setRadius(int radius){
        this.radius = radius;
    }

    // Getter
    public int getRadius(){
        return this.radius;
    }

    @Override
    public int luas(){
        return (int) (phi*radius*radius);
    }

    @Override
    public int keliling(){
        return (int) (2*phi*radius);
    }

    @Override
    public String toString() {
        return "Bangun: " + this.nama + " \nLuas: " + luas() + " \nKeliling: " + keliling() + "\n";
    }
}
