import java.util.Scanner;
class Input{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your height: ");
        float height = sc.nextFloat();
        System.out.println("Enter your weight: ");
        int weight = sc.nextInt();
        System.out.println("Are You a Student");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your height is: " + height);
        System.out.println("Your weight is: " + weight);
        System.out.println("Are you a student: " + isStudent);
        // System.out.println("Your BMI is: " + (weight / (height * height)));
    }
}