package GroupProjects.Project3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the string");
        String input = sc.nextLine();
        System.out.println("Please provide starting num");
        int firstValue = sc.nextInt() - 1;
        System.out.println("Please provide ending num");
        int secondValue = sc.nextInt();

        System.out.print(input.substring(firstValue,secondValue));

    }
}
