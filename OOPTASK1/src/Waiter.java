public class Waiter extends  Employee{


    public Waiter( String name,int age, double salary, String role) {
        super( name,age, salary, role);
    }

     @Override
    void work(){
         System.out.println( getRole() +" "+ getName() + " is serving customers");
     }
}

