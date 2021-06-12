package ex26;

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double i, double b, double p){
        return (-(1/30) * Math.log(1 + b/p * Math.pow(1 - (1 + i),30)) /Math.log(1 + i));
    }
}
