public class buku {
    // latihan 3 Jalankan langkah 2-7 untuk tabel Buku
    private int id;
    private String judul;
    private String penulis;
    private int jumlah_halaman;
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
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getJudul(){
        return judul;
    }
    public void setJudul(String judul){
        this.judul=judul;
    }
    public String getPenulis(){
        return penulis;
    }
    public void setPenulis(String penulis){
        this.penulis=penulis;
    }
    public int getJumlahHalaman(){
        return jumlah_halaman;
    }
    public void setJumlahHalaman(int jumlah_halaman){
        this.jumlah_halaman=jumlah_halaman;
    }
    public double getHarga(){
        return harga;
    }
    public void setHarga(double harga){
        this.harga=harga;
    }
    public buku(){
        System.out.println("Object telah diciptakan, constuctor berjalan");
    }
    // latihan 6 Pada class Buku, buat method naikkanHarga() dan overloadingnya naikkanHarga(double kenaikan)
    public void naikkanHarga(){

    }
    public void naikkanHarga(double kenaikan){

    }

}
