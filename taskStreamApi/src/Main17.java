import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main17 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);

        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);


        List<Student> students = Arrays.asList(
                new Student("Ali", "IT", 85),
                new Student("Mona", "CS", 92),
                new Student("Ahmed", "IT", 60),
                new Student("Sara", "CS", 70),
                new Student("Omar", "IS", 45),
                new Student("Laila", "IS", 78));

        List<Employee> employees = Arrays.asList(
                new Employee("Ali", 30, "HR", 5000),
                new Employee("Mona", 25, "IT", 7000),
                new Employee("Ahmed", 30, "HR", 5500),
                new Employee("Sara", 27, "IT", 7200),
                new Employee("Omar", 40, "Finance", 8000),
                new Employee("Laila", 35, "Finance", 8200)
        );


//                                 17 - Partition a list of numbers into even and odd using partitioningBy.
              numbers.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0)).forEach((isEven, nums) -> {
                      System.out.println(isEven ? "Even numbers: " : "Odd numbers: ");
                            nums.forEach(num -> System.out.println(num));
                            });



    }
}