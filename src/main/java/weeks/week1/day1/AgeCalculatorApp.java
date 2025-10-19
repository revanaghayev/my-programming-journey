package weeks.week1.day1;

import java.util.Scanner;

public class AgeCalculatorApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name, age, height and weight by following queue: ");

        String myName = sc.nextLine();

        int myAge = sc.nextInt();
        double myHeight = sc.nextDouble();
        double myWeight = sc.nextDouble();
        double bmi = myWeight / (myHeight * myHeight);
        int roundedBmi1 = (int) bmi * 100;
        String weight;

//        System.out.println(roundedBmi1);
        double roundedBmi2 = roundedBmi1 / 100.0;
//        System.out.println(roundedBmi2);
        double roundedBmi = ((int) (bmi * 100)) / 100.0;

        if (bmi < 18.5) {
            weight = "Underweight";
        } else if (bmi >= 18 && bmi < 25) {
            weight = "Normal";
        } else {
            weight = "Overweight";
        }

        System.out.print("Your age is: " + myAge + '\n' + "Your name is: " + myName + '\n' + "Your BMI is: " +
                roundedBmi + '\n' + "Your weight type is: " + weight);
    }
}
