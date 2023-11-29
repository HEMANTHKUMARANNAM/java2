import java.util.Scanner;

public class check_num 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        StringBuilder sb = new StringBuilder(num);

        for(int i =0 ; i<sb.length() ; i++)
        {
            sb.charAt(i);
        }

        sc.close();
    }

}