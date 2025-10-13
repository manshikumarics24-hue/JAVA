
class calgrade{


    int marks;
    int percentage;
    void calgrade(int marks){
        if(marks>=90){
            System.out.println("grade is A");
        }
        else if(marks>=80) {
            System.out.println("grade is B");
            
        }else if(marks>=70){
            System.out.println("grade is c");
        }else if(marks>=60){
            System.out.println("grade is D");
        }else{
            System.out.println("grade is F");
        }
    }
    void calgrade(int marks1,int marks2,int marks3){
        int avg=(marks1+marks2+marks3)/3;
        System.out.println("average:"+avg);
        if(avg>=90){
            System.out.println("garade is A");
        }
        else if(avg>=80){

             System.out.println("garade is B");
        }else if(avg>=70){
             System.out.println("garade is C");
        }else if(avg>=60){
             System.out.println("garade is D");
        }else{
             System.out.println("garade is F");
        }
    }
         void calgrade(double per){
            if(per>=90){
                 System.out.println("garade is A");
            }
                 else if(per>=80){

             System.out.println("garade is B");
        }else if(per>=70){
             System.out.println("garade is C");
        }else if(per>=60){
             System.out.println("garade is D");
        }else{
             System.out.println("garade is F");
        }
            }
        }


public class grade{
    public static void main (String[] args){
        calgrade c=new calgrade();
        c.calgrade(95);
        c.calgrade(96,99,98);
        c.calgrade(77);
        

    }
}
