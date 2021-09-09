package GroupProjects.Project3;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String textInput = sc.nextLine();

        // no similar words
        // replaces same characters


        String numberinput = sc.nextLine();




        char intNumber = numberinput.charAt(0);

       // int asciiNumberOfInteger = intNumber;
        int asciiNumberOfInteger2 = intNumber +1;
        char intNumber2 = (char) asciiNumberOfInteger2;
        int asciiNumberOfInteger3 = intNumber +2;
        char intNumber3 = (char) asciiNumberOfInteger3;




        /*
        char intNumber = '1';
        int asciiNumberOfInteger = intNumber;
        int asciiNumberOfInteger2 = intNumber +1;
        char intNumber2 = (char) asciiNumberOfInteger2;
        int asciiNumberOfInteger3 = intNumber +2;
        char intNumber3 = (char) asciiNumberOfInteger3;
         */



        int firstWordFirstLetterIndex = 0;
        int secondWordFirstLetterIndex = textInput.indexOf(' ') + 1;
        int thirdWordFirstLetterIndex = textInput.indexOf(' ',secondWordFirstLetterIndex+1) +1;

        char firstChar = textInput.charAt(firstWordFirstLetterIndex);
        char secondChar = textInput.charAt(secondWordFirstLetterIndex);
        char thirdChar = textInput.charAt(thirdWordFirstLetterIndex);

        System.out.println(textInput.replace(firstChar, intNumber).replace(secondChar, intNumber2).replace(thirdChar, intNumber3)) ;







        //System.out.println(textInput.charAt(firstWordFirstLetterIndex));
       // System.out.println(textInput.charAt(secondWordFirstLetterIndex));
       // System.out.println(textInput.charAt(thirdWordFirstLetterIndex));






    }

}
