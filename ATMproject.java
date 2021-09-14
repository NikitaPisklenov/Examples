package GroupProjects;

import java.util.Scanner;

public class ATMproject {

    public static void main(String[] args) {


        //Create card number and password

        String savedcardNumber = "0";
        String savedpassword = "0";
        Scanner scan = new Scanner(System.in);
        int chances = 3;
        int choice;
        double balance = 100;
        int[] options = new int[] {5,10,20,50,100};
        String[]bills = new String[]{"gass","electricity", "internet", "water"};
        double[]cost = new double[]{33,44,55,66};


        do{

            System.out.println("please enter your card number");
            String cardNuber= scan.next();
            System.out.println("please enter your paswword");
            String pasword = scan.next();



            if (cardNuber.equals(savedcardNumber) && pasword.equals(savedpassword)) {

                System.out.println("Welcome to Bank ATM");

                do{

                    System.out.println("What would you like to do today");
                    System.out.println("1 - Withdraw \n2 - Deposit\n3 - Balance\n4 - Payment\n5- Change the password\n6 - Exit");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1 :
                            for (int i = 0; i<options.length;i++){
                                System.out.print(options[i]+"$    ");
                            }
                            System.out.println("Withdrawal amount?");
                            int money = scan.nextInt();
                            if (balance>money) {

                                balance-=money;
                                System.out.println("you succsecfully withdrew the money!!\n Your new balance is"+balance+"$");
                                break;
                            }else {
                                System.out.println("You dont have enough money");
                                break;
                            }
                        case 2 :

                            for (int i = 0; i<options.length;i++){
                                System.out.print(options[i]+"$    ");
                            }
                            System.out.println("Deposit amount?");
                            int deposit = scan.nextInt();
                            balance+= deposit;
                            System.out.println("You got this much money"+balance);



                        case 3 :
                            System.out.println("Your balance is "+balance+" $");
                        case 4 :
                            for (int i = 0; i < bills.length; i++){
                                System.out.println(bills[i]+" = "+ cost[i]);
                            }
                            System.out.println("Which bill would you like to pay");
                            String billtopay = scan.next();
                            for (int k = 0; k< bills.length; k++) {
                                if(billtopay.equalsIgnoreCase(bills[k])) {
                                    if (balance>cost[k]) {
                                        balance-=cost[k];
                                        bills[k] ="paid";
                                        cost[k] = 0;
                                        System.out.println("You sucdssfuly paid "+bills[k]+"your new balance"+balance);

                                    } else {
                                        System.out.println("You dont have enough to deposit");
                                        break;
                                    }
                                }
                            }

                        case 5 :
                        case 6 :
                            break;


                    }
                } while (true);




            }else {
                chances --;
                System.out.println("wrong info try again"+ "you have " + chances + "chances");

                if (chances ==0) {
                    System.out.println("You card is hold by ATM");
                    break;
                }
            }

        }while (true);

    }

}
