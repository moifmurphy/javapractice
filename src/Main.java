import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //get salaries
        int salary1 = scanner.nextInt();
        int salary2 = scanner.nextInt();
        //code here
        int sum = salary1 + salary2;
        System.out.println();
        System.out.println("Sum: "+sum);
    }
}
