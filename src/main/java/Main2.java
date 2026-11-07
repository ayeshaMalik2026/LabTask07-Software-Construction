import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        
        // --- LAB TASK 1: BLACK-BOX REUSE ---
        System.out.println("=== LAB TASK 1: BLACK-BOX REUSE ===");
        PaymentMethod creditCard = new CreditCardPayment();
        EcommerceCart cart1 = new EcommerceCart(creditCard);
        cart1.checkout(250.00);

        PaymentMethod jazzCash = new JazzCashPayment();
        EcommerceCart cart2 = new EcommerceCart(jazzCash);
        cart2.checkout(120.50);


        // --- LAB TASK 2: GENERICS & TYPE SAFETY ---
        System.out.println("=== LAB TASK 2: GENERICS & TYPE SAFETY ===");
        DataBox<String> studentNameBox = new DataBox<>("Ali Khan");
        System.out.println("Student Name: " + studentNameBox.getData());

        DataBox<Integer> studentIdBox = new DataBox<>(1042);
        System.out.println("Student ID: " + studentIdBox.getData());
        System.out.println();


        // --- LAB TASK 3: LSP & CONTRACT INTEGRITY ---
        System.out.println("=== LAB TASK 3: LSP & CONTRACT INTEGRITY ===");
        Shape rect = new FixedRectangle(5, 10);
        Shape square = new FixedSquare(5);
        System.out.println("Fixed Rectangle Area (w=5, h=10): " + rect.getArea());
        System.out.println("Fixed Square Area (side=5): " + square.getArea());
        
    }
}
