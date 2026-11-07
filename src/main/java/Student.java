public class Student implements Comparable<Student> {
    private int rollNo;
    private double cgpa;

    public Student(int rollNo, double cgpa) {
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo); // Natural sorting by rollNo (Ascending)
    }

    @Override
    public String toString() {
        return "Student {rollNo=" + rollNo + ", cgpa=" + cgpa + "}";
    }
}