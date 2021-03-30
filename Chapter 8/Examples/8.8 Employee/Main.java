package JuyangBai.Java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.printf("Employee before instantiation: %d%n", Employee.getCount());

        Employee e1 = new Employee("Susan", "Baker");
        Employee e2 = new Employee("Bob", "Baker");

        System.out.printf("%nEmployee after instantiation:%n");
        System.out.printf("via e1.getCount(): %d%n", e1.getCount());
        System.out.printf("via e2.getCount(): %d%n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d%n", Employee.getCount());

        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n", e1.getFirstName(), e1.getLastName(), e2.getFirstName(), e2.getLastName());
    }
}
