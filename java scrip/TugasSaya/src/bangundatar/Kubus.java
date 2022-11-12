package bangundatar;
public class Kubus extends BangunRuang{
    private double s;
        public Kubus()
        {
            super();
            System.out.println
                ("mencetak anak: balok \n");
            s=5;
            nama="ini kubus";
        }
        public double Volume()
        {
            return s*s*s;
        }   
        public void infoKubus()
        {System.out.println("nama:"+nama);
        System.out.println("nilai:"+ this.s);
        System.out.println("Luas balok:"+Volume());
        }
       }

    

