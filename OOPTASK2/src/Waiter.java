public class Waiter extends  Employee implements Eatable {


    public Waiter( String name,int age, double salary, String role) {
        super( name,age, salary, role);
    }

     @Override
    void work(){
         System.out.println( getRole() +" "+ getName() + " is serving customers");
     }

    @Override
    public void eat() {
        System.out.println( getRole() +" "+ getName() + " is having a quick meal break");
    }

    @Override
    public void getYouMenu() {
        Eatable.super.getYouMenu();
    }
}

