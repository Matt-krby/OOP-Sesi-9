/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Class berikut merupakan sebuah abstract class Shape yang akan digunakan sebagai
 * parent class dari class-class yang akan dibuat.
 * Abstract class Shape memiliki 3 atribut yaitu nama, luas, dan keliling.
 */

public abstract class Shape {
    public String nama;  // atribut nama untuk menyimpan nama dari shape
    public int luas;     // atribut luas untuk menyimpan luas dari shape
    public int keliling; // atribut keliling untuk menyimpan keliling dari shape
    
    //setter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setLuas(int luas){
        this.luas = luas;
    }
    public void setKeliling(int keliling){
        this.keliling = keliling;
    }
}
