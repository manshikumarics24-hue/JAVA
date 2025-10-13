import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=input.nextInt();
        int sum=0;
        while(a>0){
            int digit=a%10;
            sum=sum+digit;
            a=a/10;

        }
        System.out.println("sum of digits are:"+sum);
    }
}