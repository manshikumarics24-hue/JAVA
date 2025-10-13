import java.util.Scanner;
public class quadratic{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println ("enter the value of a:");
    int a=input.nextInt();
    System.out.println("enter the value of b:");
    int b=input.nextInt();
     System.out.println("enter the value of c:");
    int c=input.nextInt();

    float d=(b*b)-(4*a*c);
    double r1,r2;
    if(d>0){
      System.out.println("roots are real");
      r1=(-b+Math.sqrt(d))/(2*a);
      r2=(-b-Math.sqrt(d))/(2*a);
       System.out.println("root 1 is:"+r1);
        System.out.println("root 1 is:"+r2);
    }
    else if(d==0){

      System.out.println("roots are equal");
      r1=(-b/(2*a));
       r2=(-b/(2*a));
       System.out.println("the root is:"+r1);

    }
    else{
       System.out.println("the root is imginary");

      
    }


  }
}

