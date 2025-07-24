public class Chef extends Employee implements Eatable {




    public Chef(String name, int age, double salary, String role) {
        super( name,age, salary, role);
    }



    @Override
    void work(){
        System.out.println( getRole() + " " + getName() + " is preparing dishes");
    }


    @Override
    public void eat() {
        System.out.println( getRole() + " " + getName() + " is tasting the food");
    }
}
