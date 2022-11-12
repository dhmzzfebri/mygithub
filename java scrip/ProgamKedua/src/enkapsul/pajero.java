package enkapsul;
public class pajero {
    private String Jenismobil;
    private String Merekmobil;
    private String Platmobil;
    private String Pemilikmobil;
    
    public String getJenismobil(){
        return Jenismobil;
    }
    public void setJenismobil(String jm){
        Jenismobil=jm;
    }
    public String getMerekmobil(){
        return Merekmobil;
    }
    public void setMerekmobil(String mm){
        Merekmobil=mm;
    }
     public String getPlatmobil(){
        return Platmobil;
    }
    public void setPlatmobil(String pm){
        Platmobil=pm;
    }
    public String getPemilikmobil(){
        return Pemilikmobil;
    }
    public void setPemilikmobil(String pm){
        Pemilikmobil=pm;
    }
    
public void infoS4(){
    System.out.println("Jenismobil="+getJenismobil());
    System.out.println("Marekmobil="+getMerekmobil());
    System.out.println("Platmobil="+getPlatmobil());
    System.out.println("Pemilikmobil="+getPemilikmobil());
  
}
}
