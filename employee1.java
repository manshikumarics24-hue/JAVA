
class employee{
    String name;
    double salary;
    public employee(String name,double salary){
        this.name=name;
        this.salary=salary;

    }
   employee comparesalary(employee e){
    if(this.salary>e.salary){
        return this;
    }
    else{
        return e;
    }
}
    void display(){
        System.out.println("employee name:"+name);
        System.out.println("employee salary:"+salary);
    }
  
}
public class employee1 {
    public static void main(String[] args) {
        employee e1=new employee("manshi",30000);
        employee e2=new employee("neha",40000);
        employee e=e1.comparesalary(e2);
        e.display();
    }
    
}
