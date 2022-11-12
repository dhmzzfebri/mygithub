
package programlatiaif;


public class ProgramLatianIf
{
    public static void main(String[]args)
  {
        int pensil    =15000;
        int buku      =45000;
        int pulpen    =20000;
        int penghapus =30000;
        int harga=pensil*1+buku*2+pulpen*3+penghapus*1;
            System.out.println(harga);
        if(harga>100000);
        { 
                int diskon=harga*10/100;
                int total=harga-diskon;
                System.out.print(total);
        }
        else
        {
                int diskon=harga*5/100;
                int total=harga-diskon;
                System.out.print(total);
        }
  }
}