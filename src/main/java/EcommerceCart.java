public class EcommerceCart {
    private PaymentMethod paymentMethod; // Composition via interface

    // Constructor injection
    public EcommerceCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {
        boolean success = paymentMethod.pay(amount);
        if (success) {
            System.out.println("Checkout completed.\n");
        } else {
            System.out.println("Checkout failed.\n");
        }
    }
}
