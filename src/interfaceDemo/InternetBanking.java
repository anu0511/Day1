package interfaceDemo;

public class InternetBanking  implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paid" +amount+"using Internet Banking");
    }
}

