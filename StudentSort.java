




import java.util.Scanner;

class Student {
    private String name;
    private double grade;

    
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    
    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    
    @Override
    public String toString() {
        return "Name: " + name + ", Grade: " + grade;
    }
}

public class StudentSort {
    
    public static void bubbleSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getGrade() > students[j + 1].getGrade()) {
                    
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); 

        Student[] students = new Student[numberOfStudents];

    
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter grade of student " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); 
            students[i] = new Student(name, grade);
        }

        
        bubbleSort(students);

        
        System.out.println("\nSorted list of students by grade:");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}