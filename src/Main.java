import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        int Number = (int) (Math.random() * 101);
//        System.out.println("Guess a magic number between 0 and 100");
//        int random = -1;
//
//        while(random != Number){
//            System.out.println("\nEnter your guess:");
//            random = sc.nextInt();
//
//            if(random == Number)
//                System.out.println("Yes, the number is " + Number);
//            else if (random > Number) {
//                System.out.println("Your guess is too High");
//            }
//            else {
//                System.out.println("Your guess is too Low");
//            }
//        }


        // Example 2


        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        Scanner inp = new Scanner(System.in);

        while(count < NUMBER_OF_QUESTIONS){
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);

            if (num1 < num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println(
                    "What is " + num1 + " - " + num2 + "? "
            );
            int answer = inp.nextInt();
            if (num1 - num2 == answer){
                System.out.println("You are correct! ");
                correctCount++;
            } else {
                System.out.println("You answer is wrong.\n" + num1 + " - " + num2 + " should be " + (num1 - num2));
                count++;
                output += "\n" + num1 + "-" + num2 + "=" + answer +
                        ((num1 - num2 == answer) ? " Correct" : " Wrong");
            }
        }




        // Example 3

        Scanner inp2 = new Scanner(System.in);

        System.out.println("Enter an int value (the program exits if the input is 0): ");
        int data = inp2.nextInt();

        int sum = 0;
        while (data != 0){
            sum += data;

            System.out.println("Enter an int value (the program exits if the input is 0): ");
            data = inp2.nextInt();
        }

        System.out.println("The sum is " + sum);




    }

//    public class SubtractionQuizLoop{
//        public static void main(String[] args){
//
//
//        }
    }
