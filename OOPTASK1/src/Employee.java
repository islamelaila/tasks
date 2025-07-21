public class Employee extends Person{

  private   double salary ;
   private String role ;



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }




    Employee(String name, int age, double salary, String role) {
        super(age, name);
        this.salary = salary;
        this.role = role;
    }



    void work(){
        super.introduce();
        System.out.println(getName() + " works as a " + role + " in the restaurant.");
    }

}
