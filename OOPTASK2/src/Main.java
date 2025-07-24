import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        Chef chef = new Chef("marc" , 25, 25000,"chef");

        Waiter waiter =new Waiter("konate",22,20000,"waiter");


        chef.work();
        System.out.println();
        chef.eat();
        System.out.println();
        waiter.eat();
        System.out.println();
        waiter.getYouMenu();
    }
}
