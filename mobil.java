public class mobil {
    // latihan 8
    private int idMobil;
    private String noPolisi;
    private String jenisMobil;
    private double harga;

    public void login(){
        System.out.println("ini method untuk login");
    }
    public void lupaPassword(){
        System.out.println("ini method lupa password");
    }
    public void daftar(){
        System.out.println("ini method daftar user baru");
    }
    public int getIdMobil(){
        return idMobil;
    }
    public void setIdMobil(int idMobil){
        this.idMobil = idMobil;
    }
    public String getNoPolisi(){
        return noPolisi;
    }
    public void setNoPolisi(String noPolisi){
        this.noPolisi = noPolisi;
    }
    public String getJenisMobil(){
        return jenisMobil;
    }
    public void setJenisMobil(String jenisMobil){
        this.jenisMobil = jenisMobil;
    }
    public double getHarga(){
        return harga;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
    public mobil(){
        System.out.println("Object telah diciptakan, constuctor berjalan");
    }
    public void naikkanHarga(){
        System.out.println("harga sewa akan naik");
    }
    public void naikkanHarga(double kenaikan){
        System.out.println("harga sewa naik 10%");
    }
}
