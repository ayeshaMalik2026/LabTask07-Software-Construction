public class CreditCardPayment implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid $" + amount + " successfully using Credit Card.");
        return true;
    }
}