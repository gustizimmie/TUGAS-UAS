public class main {
    public static void main(String[] args) {
        String variabelString;
        pengguna pengguna = new pengguna();
        // latihan 4 Buat object Buku pada class Main, sebagaimana object Pengguna
        buku buku = new buku(); 
        // latihan 7 
        mobil mobil = new mobil();

        // display
       pengguna.lupaPassword();
       buku.daftar();
       mobil.naikkanHarga(0);

    }
}
