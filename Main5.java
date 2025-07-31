import java.util.Scanner;
public class Main5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        try{
              System.out.println("enter:");
              int x=sc.nextInt();
              int y=sc.nextInt();
              int z=x/y;
              System.out.println(x+"/"+y+"="+z);
              
        }
        catch (ArithmeticException ex){
               System.out.println("----catch block-----");
               System.out.println(ex.toString());
        }
        finally{
            System.out.println("----finally block--");
            System.out.println("app developed by");
            System.out.println("Saima");
            sc.close();
        }
        System.out.println("done");
    }
}