import java.util.Scanner;

public class Dec2Hex
{

    public static int Arg1;

    public static void main(String args[])
    {
        if (args.length > 0) 
        {
            try ( Scanner scanner = new Scanner(args[0]) ) 
            {
                if (scanner.hasNextInt() && Integer.parseInt(args[0],10) >= 1) 
                {
                    Arg1 = Integer.parseInt(args[0]);
                    DoDecToHex(Arg1);
                }
                else
                {
                    System.out.println("Argument must be an integer.");
                	System.exit(1);
                }
            } 
            catch (NumberFormatException e) 
            {
                System.err.println("Argument " + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
        else
        {
            System.out.println("There must be an integer argument.");
        	System.exit(1);
        }
    }
    public static void DoDecToHex(int num)
    {
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
         int rem;
	    String hexadecimal=""; 
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
        
        while(num != 0)
        {
	    rem=num%16;
	    hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }
        
        System.out.println("Hexadecimal representation is : " + hexadecimal);    
    }
}
