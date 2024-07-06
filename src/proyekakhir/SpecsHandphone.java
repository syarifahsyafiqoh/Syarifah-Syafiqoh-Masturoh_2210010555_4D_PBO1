package proyekakhir;

//inheritance
public class SpecsHandphone extends Handphone{
    //overriding
    public SpecsHandphone(String merk, String seri, int harga) {
        super(merk, seri, harga);
    }
    
    public String getRam(){
        String ram = getSeri().substring(0, 2);
        //seleksi switch
        switch(ram){
            case "A1":
                return "4 GB";
            case "B1":
                return "8 GB";
            case "C1":
                return "12 GB";
            default:
                return"Lainnya";
        }
    }
    
    public String getTipe(){
        String tipe = getSeri().substring(2, 7);
        //seleksi if
        if(tipe.equals("S23FE")){
           return "Seri S";
        } else {
           return "Seri Lain";
        }
    }
    
    public int getTahunBuat(){
        return Integer.parseInt(getSeri().substring(7)) + 2000;
    }
    
    //polymorphism (overriding)
    @Override
    public String tampil(){
        return super.tampil()+
                "\nRAM Handphone: "+getRam()+
                "\nTipe Handphone: "+getTipe()+
                "\nTahun Buat: "+getTahunBuat();
    }
}
