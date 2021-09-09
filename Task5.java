package GroupProjects.Project3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int firstSpace = input.indexOf(' ', 0);
        int secondSpace = input.indexOf(' ', firstSpace+1);
        //
        int lastLetterOfFirstWordIndex = firstSpace-1;
        int lastLetterOfSecondWordIndex = secondSpace-1;
        int lastLetterOfLastWordIndex = input.length()-1;

        System.out.println(lastLetterOfFirstWordIndex + " - index number of " + input.charAt(lastLetterOfFirstWordIndex));
        System.out.println(lastLetterOfSecondWordIndex + " - index of " + input.charAt(lastLetterOfSecondWordIndex));
        System.out.println(lastLetterOfLastWordIndex + " - index of " + input.charAt(lastLetterOfLastWordIndex));

        System.out.println(lastLetterOfFirstWordIndex+lastLetterOfSecondWordIndex+lastLetterOfLastWordIndex);
    }

}
