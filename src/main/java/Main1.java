public class Main1 {
    public static void main(String[] args) {
        System.out.println("=== LAB TASK 2: GENERICS & TYPE SAFETY ===\n");

        // 1. Create a DataBox that holds a String (Student Name)
        DataBox<String> studentNameBox = new DataBox<>("Ali Khan");
        System.out.println("Student Name: " + studentNameBox.getData());

        // 2. Create a DataBox that holds an Integer (Student ID)
        DataBox<Integer> studentIdBox = new DataBox<>(1042);
        System.out.println("Student ID: " + studentIdBox.getData());
    }
}
