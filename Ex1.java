import java.util.Scanner;
class Ex1{
    public static void main(String[] args){

        int totalMarks = 500;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your maths marks: ");
        int maths = sc.nextInt();
        System.out.println("Enter your science marks: ");
        int science = sc.nextInt();
        System.out.println("Enter your social marks: ");
        int social = sc.nextInt();
        System.out.println("Enter your english marks: ");
        int english = sc.nextInt();
        System.out.println("Enter your computer marks: ");
        int computer = sc.nextInt();


        int total = maths + science + social + english + computer;
        double percentage = (total / (double) totalMarks) * 100;

        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage);

    }
}