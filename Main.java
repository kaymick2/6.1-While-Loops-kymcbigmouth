import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);

    System.out.println("Please input the amount of money you want to calculate interest on (Principal)");
    double initAmt = userInput.nextDouble();
    System.out.println("Now input the interest rate as a percentage. ex. enter \"5\" if the interest rate is 5%");
    double intRate = userInput.nextDouble();
    System.out.println("How many times per year will it be compounded?");
    double cuantoComb = userInput.nextDouble();
    System.out.println("For how many years?");
    double time = userInput.nextDouble();
    // actual calculation methods below
    double balance = Math.pow(initAmt * (1 + (intRate * 100) / cuantoComb), cuantoComb * time);
    double interest = Math.pow(initAmt * (1 + (intRate * 100) / cuantoComb), cuantoComb * time) - initAmt;
    balance = balance / 100;
    interest = interest / 100;
    // actual calculation methods above
    while (time <= 10) {

      System.out.println("After " + (11 - time) + " years, you will have accumulated $");
      interest = Math.round(interest * 100);

      System.out.println(interest/ 100);
      System.out.println(" in interest, making your balance $");
      balance = Math.round(balance * 100);

      System.out.println(balance / 100);
      time++;
      System.out.println("Press enter to see next year's account stats");
      try {
        System.in.read();
      } catch (Exception e) {
      }
    }
  }
}