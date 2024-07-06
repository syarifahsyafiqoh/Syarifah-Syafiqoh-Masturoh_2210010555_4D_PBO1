package proyekakhir;

public class Handphone {
    //atribut dan encapsulation
    protected String merk;
    protected String seri;
    protected int harga;

    //constructor
    public Handphone(String merk, String seri, int harga) {
        this.merk = merk;
        this.seri = seri;
        this.harga = harga;
    }

    //method mutator (setter)
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    //method accessor (getter)
    public String getMerk() {
        return merk;
    }

    public String getSeri() {
        return seri;
    }

    public int getHarga() {
        return harga;
    }
    
    public String tampil(){
        return "\nMerk: "+getMerk()+
               "\nSeri: "+getSeri()+
               "\nHarga: "+getHarga();
    }
    
    //polymorphism (overloading)
    public String tampil(String Perusahaan){
        return tampil() + "\nPerusahaan: "+Perusahaan;
    } 
}
