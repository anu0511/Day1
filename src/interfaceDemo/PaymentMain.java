package interfaceDemo;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment=new UpiPayment();
        payment.pay(500);

         payment=new CreditCardPayment();
        payment.pay(900);

        payment=new InternetBanking();
        payment.pay(100);


    }
}
