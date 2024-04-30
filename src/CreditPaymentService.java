public class CreditPaymentService {
    public int calculate(int loanAmount, double percent, int termInMonths){
        int monthlyPayment;
        monthlyPayment = (int) (loanAmount * ((percent / 100 / 12)  * Math.pow(1 + (percent / 100 / 12), termInMonths) / (Math.pow(1 + (percent / 100/12), termInMonths) - 1)));
        return monthlyPayment;


    }
}
