package encasulation;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
    BigDecimal Principal;
    BigDecimal interest ;
    public SimpleInterestCalculator(String Principal, String Interest){
        this.Principal = new BigDecimal(Principal);
        this.interest = new BigDecimal(Interest).divide(new BigDecimal(100));
    }
    public BigDecimal calculateTotalValue(int noOfYears){
        BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
      BigDecimal totalValue =  Principal.add(Principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
        return totalValue;
    }
}
