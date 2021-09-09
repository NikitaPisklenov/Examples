package GroupProjects.Project3;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();

        boolean lengthCheck = first.length() == second.length() && first.length() == third.length();

        boolean javaCheck = first.toLowerCase().contains("java")
                && second.toLowerCase().contains("java")
                && third.toLowerCase().contains("java");

        boolean upperCaseCheck =  first.charAt(0)>=65 && first.charAt(0)<=90
                && second.charAt(0)>=65 && second.charAt(0)<=90
                && third.charAt(0)>=65 && third.charAt(0)<=90;
        boolean allConditionsAreMet = lengthCheck == javaCheck && javaCheck == upperCaseCheck;


        System.out.println(allConditionsAreMet);






    }

}
