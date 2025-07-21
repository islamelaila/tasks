import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


       Employee employee = new Employee("kounde", 24,30000,"manager") ;

        Chef chef = new Chef("marc" , 25, 25000,"chef");

        Employee employee1 =new Waiter("konate",22,20000,"waiter");


       employee.work();
        System.out.println();
        chef.work();
        System.out.println();
        employee1.work();
    }
}
