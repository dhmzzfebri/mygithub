package operator;
import java.util.Scanner;
public class OperatorTugas {

   public static void main(String[]args){
   int nilai1,nilai2,nilai3;
    
        Scanner key = new Scanner(System.in);
        System.out.println("Masukan nilai 1 : ");
        nilai1 =key.nextInt(); 
        System.out.println("Masukan nilai 2: ");
        nilai2 =key.nextInt();
        System.out.println("Masukan nilai 3 : ");
        nilai3 = key.nextInt();
        
        System.out.println("nilai 1 = " +nilai1);
        System.out.println("nilai 2 = "+nilai2);
        System.out.println("nilai 3 = " +nilai3);
    int hasil1=nilai1 + nilai3;
            System.out.println("nilai1 + nilai3 = "+hasil1);
    int hasil2=nilai2 * nilai3;
            System.out.println("nilai2 * nilai3 = "+hasil2);
    if(nilai1 > nilai2)
             {  System.out.println("Nilai 1 lebih besar dari nilai 2");}
         else if(nilai1 > nilai3)
             {  System.out.println("Nilai 1 lebih besar dari nilai 3");}
         else if(nilai2 > nilai3)
             {  System.out.println("Nilai 2 lebih besar dari nilai 3");}
             {  System.out.println("Nilai 1 lebih kecil dari nilai 2 dan 3");} 
    }
}
