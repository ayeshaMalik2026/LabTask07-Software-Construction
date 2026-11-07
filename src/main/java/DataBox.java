public class DataBox<T> {
    // 'T' stands for Type. It acts as a placeholder for whatever data type 
    // the developer decides to pass when creating the DataBox.
    private T data;

    // Constructor to initialize the DataBox with data
    public DataBox(T data) {
        this.data = data;
    }

    // Getter method returns the exact type T (no casting needed!)
    public T getData() {
        return data;
    }

    // Setter method updates the data
    public void setData(T data) {
        this.data = data;
    }
}