package pewarisan;
public class Lingkaran extends BagunDatar{
    private double r;
            public Lingkaran(){
            super();
            System.out.println("Mencetak anak : Lingkaran \n");
            r=10;
            nama = "Ini lingkaran";
        }
        public double Luas(){
            return 3.14 * r * r;
        }
        public void infoLingkaran(){
            System.out.println("Nama :" + nama);
            System.out.println("Nialai r : " + this.r);
            System.out.println("Luas Lingkaran : " + Luas());
        }
}
