import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
    double initAmt = 0;
    double intRate = 0;
    double cuantoComb = 0;
    double years = 0;

    System.out.println("Please input the amount of money you want to calculate interest on (Principal)");

    initAmt = userInput.nextDouble();
    System.out.println("Now input the interest rate as a percentage. ex. enter \"5\" if the interest rate is 5%");

    intRate = userInput.nextDouble();

    System.out.println("How many times per year will it be compounded?");

    cuantoComb = userInput.nextDouble();

    System.out.println("For how many years?");

    years = userInput.nextDouble();

    // actual calculation methods below
    int time = 0;
    double balance = Math.pow(initAmt * (1 + (intRate / 100) / cuantoComb), cuantoComb * years);

    double interest = Math.pow(initAmt * (1 + (intRate / 100) / cuantoComb), cuantoComb * years) - initAmt;

    // actual calculation methods above
    
    while (time <= years) {

      System.out.println("After " + time + " years, you will have accumulated $");

      System.out.printf("%.2f", interest);

      System.out.println(" in interest, making your balance $");

      System.out.printf("%.2f", balance);

      time++;

      System.out.println("Press enter to see next year's account stats");

      try {
        System.in.read();
      } catch (Exception e) {
      }
    }
  }
}