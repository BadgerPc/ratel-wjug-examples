package some.cool.service;

import com.payu.ratel.Discover;
import org.springframework.stereotype.Component;
import some.cool.stuff.CalculatorService;

import java.util.Scanner;

@Component
public class SumGame {

    private final CalculatorService calc;

    public SumGame(@Discover final CalculatorService calc) {
        this.calc = calc;
    }

    public void playConsoleGame() {
        boolean running = true;
        final Scanner scanner = new Scanner(System.in);
        int a, b, sum;
        String quotient;

        while (running) {
            System.out.println("Please enter two numbers separated by whitespace");
            a = scanner.nextInt();
            b = scanner.nextInt();

            sum = simpleSum(a, b);

            System.out.printf("Sum of your numbers is %d\n\n", sum);

            System.out.println("Try again (y/n)?");
            running = scanner.next("[yY]|[nN]").equalsIgnoreCase("y");
        }

    }

    public int simpleSum(final int a, final int b) {
        return calc.add(a, b);
    }

}
