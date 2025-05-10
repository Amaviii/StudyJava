package presa_8;

abstract class Payment {
    int amount;
    String currency;

    Payment(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    void processPayment() {
        System.out.printf("Вы заплатили: %d %s", amount, currency);
    }


}


class CreditCardPayment extends Payment {
    CreditCardPayment(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    void processPayment() {
        System.out.printf("Вы оплатили кредитной картой: %d %s\n", amount, currency);
    }
}

class PayPalPayment extends Payment {
    PayPalPayment(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    void processPayment() {
        System.out.printf("Вы оплатили через Paypal: %d %s\n", amount, currency);

    }
}

class ResultPayment {
    public static void main(String[] args) {
        CreditCardPayment ccp = new CreditCardPayment(35000, "Долларов");
        ccp.processPayment();
        PayPalPayment ppp = new PayPalPayment(2000, "Долларов");
        ppp.processPayment();

    }
}