package encasulation;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {
    public static void main(String[] args) {
       SimpleInterestCalculator Calculator = new SimpleInterestCalculator("4500.00", "7.5");
        BigDecimal totalValue = Calculator.calculateTotalValue(5);
        System.out.println(totalValue);
    }
}
