public abstract class Employee extends Person{

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



   abstract void work();


}
