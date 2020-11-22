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

    // actual calculation methods above

    while (time <= years) {
      double balance = initAmt * Math.pow((1 + (intRate / 100) / cuantoComb), cuantoComb * time);

      double interest = initAmt * Math.pow((1 + (intRate / 100) / cuantoComb), cuantoComb * time) - initAmt;

      System.out.print("After " + time + " years, you will have accumulated \n $");

      System.out.printf("%.2f",interest);

      System.out.print(" in interest, making your balance \n");

      System.out.printf("%.2f",balance);

      time++;

      System.out.println("\n Press enter to see next year's account stats");

      try {
        System.in.read();
      } catch (Exception e) {
      }
    }
  }
}