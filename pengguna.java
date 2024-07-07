public class pengguna{
    private int id;
    private String username;
    private String password;


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
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    // latihan 1 Buat method getter untuk atribut password
    public String getPassword(){
        return password;
    }
    // latihan 2 Buat method setter untuk atribut password
    public void setPassword(String password){
        this.password=password;
    }
    public pengguna(){
        System.out.println("Object telah diciptakan, constuctor berjalan");
    }

    public void hapus(){
        System.out.println("DELETE FROM pengguna");
    }
    public void hapus(int id){
        System.out.println("DELETE FROM pengguna WHERE id = " + id);
    }
    public void hapus(String username){
        System.out.println("DELETE FROM pengguna WHERE username = " + username);
    }
    public void login(){
        System.out.println("ini method untuk login");
    }
    public void login(String tokenGoogle){
        System.out.println("ini login menggunakan google");
    }
}