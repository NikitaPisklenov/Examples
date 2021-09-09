package GroupProjects.Project3;

import java.util.Scanner;

public class Task7 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        int indexOfSpace = input.indexOf(' ');

        String firstWord = input.substring(0,indexOfSpace);
        String firstLetterOfSecondWord = input.substring(indexOfSpace+1,indexOfSpace+2);
        String ramainderOfSecondWord = input.substring(indexOfSpace+2);

        System.out.println(firstWord+" "+firstLetterOfSecondWord.toUpperCase()+""+ramainderOfSecondWord);



    }


}
