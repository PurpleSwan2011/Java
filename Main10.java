import java.util.Scanner;
public class Main10
{
    public static void main()
    {
        boolean infiniteLoop=true;
        double[] accountBalance=new double[1000];
        String[] accountName=new String[1000];
        int option, size=100;
        while (infiniteLoop)
        {
            System.out.println("Welcome To Saima's Banking Services");
            System.out.println("Banking Menu:");
            System.out.println("select any one option from below.");
            System.out.println("1-> Add Customer");
            System.out.println("2-> Change Customer Name");
            System.out.println("3-> Check Account Balance");
            System.out.println("4-> Update Account Balance");
            System.out.println("5-> Summary of All Accounts");
            System.out.println("6-> Quit");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter ur option to proceed ahead:");
            option=sc.nextInt();
            if (option==1)
            {
                System.out.println("\nAdd Customer \nMenu->");
                sc.nextLine();
                System.out.print("\nEnter Customer Name:");
                String name=sc.nextLine();
                accountName[size]=name;
                System.out.println("Enter Opening Balance Acount:");
                double amt=sc.nextDouble();
                accountBalance[size]=amt;
                System.out.println("Account Created Successfully. \n");
                System.out.println("Account Details: \n");
                System.out.println("Account Number:"+(size));
                System.out.println("Account Name:"+accountName[size]);
                System.out.println("Account Balance:"+accountBalance[size]+"Rs \n");
                System.out.println("================");
                size=size+1;
            }
            else if (option==2)
            {
                System.out.println("\nChange Customer Name Menu");
                System.out.println("\nEnter ur Account Number:");
                int accountIndex;
                String temp;
                accountIndex=sc.nextInt();
                sc.nextLine();
                if (accountIndex>size)
                {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating.....");
                }
                else
                {
                    temp=accountName[accountIndex];
                    System.out.println("Enter the new name:");
                    String name=sc.nextLine();
                    accountName[accountIndex]=name;
                    System.out.println("Name is successfully updated from"+temp+"to"+name+".\n");
                }
                else if (option==3)
            {
                System.out.println("\nCheck Account Balance");
                System.out.println("\nEnter ur Account Number:");
                int accountIndex;
                
                accountIndex=sc.nextInt();
                
                if (accountIndex>size)
                {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating.....");
                }
                 else
                {
                    
                }
            }
        }
    }
}