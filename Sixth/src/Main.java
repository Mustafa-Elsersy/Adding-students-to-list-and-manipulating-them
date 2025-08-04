import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            students.add(name);
        }

        Collections.sort(students);

        System.out.println("Sorted names: " + students);*/



        Scanner sc = new Scanner(System.in);
        ArrayList<String> signIns = new ArrayList<>();
        ArrayList<String> uniqueStudents = new ArrayList<>();

        System.out.println("Enter student names (type \"done\" to finish):");

        while (true) {
            String name = sc.nextLine();
            if (name.equals("done")) {
                break;
            }
            signIns.add(name);

            if (!uniqueStudents.contains(name)) {
                uniqueStudents.add(name);
            }
        }

        Collections.sort(uniqueStudents);

        System.out.println("Total sign-ins: " + signIns.size());
        System.out.println("Unique students: " + uniqueStudents.size());
        System.out.println("Attendance list: " + uniqueStudents);









    }
}
