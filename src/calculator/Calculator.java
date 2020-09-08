package calculator;

public class Calculator {

    double add (double a, double b) {
        return a + b;
    }
    double sub (double a, double b) {
        return a - b;
    }
    double mul (double a, double b) {
        return a * b;
    }
    double div (double a, double b) {
      try {
          return a / b;
                }
      catch (ArithmeticException c) {
          System.out.println(c.getClass());
          System.out.println(c.getMessage());
          return 0;
      }
    }

}
