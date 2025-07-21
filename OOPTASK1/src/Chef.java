public class Chef extends Employee{




    public Chef(String name, int age, double salary, String role) {
        super( name,age, salary, role);
    }



    @Override
    void work(){
        System.out.println( getRole() + " " + getName() + " is preparing dishes");
    }
}
