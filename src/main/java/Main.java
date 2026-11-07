public class Main {
    public static void main(String[] args) {
        System.out.println("=== LAB TASK 1: BLACK-BOX REUSE ===");
        
        // Using Credit Card payment
        PaymentMethod creditCard = new CreditCardPayment();
        EcommerceCart cart1 = new EcommerceCart(creditCard);
        cart1.checkout(250.00);

        // Using JazzCash payment dynamically
        PaymentMethod jazzCash = new JazzCashPayment();
        EcommerceCart cart2 = new EcommerceCart(jazzCash);
        cart2.checkout(120.50);
    }
}
