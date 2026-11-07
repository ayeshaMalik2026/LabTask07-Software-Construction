public class JazzCashPayment implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid $" + amount + " successfully using JazzCash.");
        return true;
    }
}
