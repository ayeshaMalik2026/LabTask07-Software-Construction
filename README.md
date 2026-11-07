# Lab Task 07 - Construction for Reuse: Interfaces, Generics, and Contracts

## Repository & Course Information
* **University:** University of Engineering and Technology, Abbottabad Campus
* **Class:** 5th Semester Software Engineering
* **Subject:** Software Construction
* **Lab Title:** Construction for Reuse: Interfaces, Generics, and Contracts
* **GitHub Repository:** [LabTask07-Software-Construction](https://github.com/ayeshaMalik2026/LabTask07-Software-Construction)

---

## Objective
Apply enterprise software engineering principles by designing components capable of seamless black-box reuse, generic type safety, and contract integrity.

---

## Lab Task Descriptions & Implementation

* **Lab Task 1: Black-Box Reuse (Composition via Interfaces)**
  * Avoided the fragile base class problem using dependency injection.
  * Created a `PaymentMethod` interface with a `pay(double amount)` contract.
  * Implemented concrete classes `CreditCardPayment` and `JazzCashPayment`.
  * Designed an `EcommerceCart` class that accepts payment methods dynamically via constructor injection.

* **Lab Task 2: Reusable Type-Safe Data Containers (Generics)**
  * Created a generic class `DataBox<T>` featuring a private field of type `T`, a constructor, and a getter method.
  * Demonstrated compile-time safety by instantiating `DataBox<String>` for a student name and `DataBox<Integer>` for a student ID, proving that incorrect types cannot be mixed up.

* **Lab Task 3: Liskov Substitution Principle (Contract Integrity)**
  * Analyzed contract failures caused by improper subclassing (e.g., `Square` inheriting from `Rectangle` and overriding preconditions).
  * Refactored the architecture by breaking the faulty inheritance chain and introducing a common `Shape` interface with `FixedRectangle` and `FixedSquare` implementations.

* **Lab Task 4: Reusable Ordering Algorithms (Comparable & Comparator)**
  * Created a `Student` class implementing `Comparable<Student>` for natural ascending sorting by `rollNo`.
  * Implemented an external `CgpaComparator` implementing `Comparator<Student>` for descending sorting by `cgpa`.
  * Tested sorting logic using an `ArrayList` and `Collections.sort`.

---

## How to Run the Code
1. Clone or download this public repository.
2. Open the project folder in **Apache NetBeans IDE** (configured as a Maven project).
3. Ensure all Java source files (`PaymentMethod.java`, `CreditCardPayment.java`, `JazzCashPayment.java`, `EcommerceCart.java`, `DataBox.java`, `Rectangle.java`, `Square.java`, `Shape.java`, `FixedRectangle.java`, `FixedSquare.java`, `Student.java`, `CgpaComparator.java`, and `Main.java`) are present in your source packages.
4. Run **`Main.java`** to view the console output for all tasks.
```[cite: 1, 2]# Lab Task 07 - Construction for Reuse: Interfaces, Generics, and Contracts 
