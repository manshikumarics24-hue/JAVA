import java.util.Scanner;
public class greatestofthree {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("enter first number:");
        int a=input.nextInt();
        System.out.println("enter second number:");
        int b=input.nextInt();
        System.out.println("enter thirs]d number:");
        int c=input.nextInt();
        if(a>b && a>c){
             System.out.println("the greatest number is:"+a);

        }
        else if(b>a && b>c){
             System.out.println("the greatest number is:"+b);

        }
        else{
            System.out.println("the greatest number is:"+c);

        }


    }
    
}
