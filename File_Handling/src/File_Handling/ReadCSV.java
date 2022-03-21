package File_Handling;

import java.io.*;
import java.util.*;


public class ReadCSV{
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new FileReader("C:\\Users\\shampriya\\HU_JAVA_TRACK\\File_Handling\\src\\StudentData.csv"));
            ArrayList<Student> students = new ArrayList<>();
            int i = 0;
            while (scan.hasNext()) {
                String[] str = scan.nextLine().split(",");
                if (i != 0) {
                    students.add(new Student(str[0], str[1], str[2], str[3], Integer.parseInt(str[4])));
                    // System.out.println(Arrays.toString(str));
                }
                i++;
            }
            Collections.sort(students, (a, b)-> a.getRank()-b.getRank());
            // System.out.println(students.toString());
            for (i = 0; i < Math.min(5, students.size()); i++) {
                System.out.println(students.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}

class Student<th> {
    private String name, regNo10, regNo12, BtechRegNo;
    private int Rank;

    public Student(String name, String regNo10, String regNo12, String BtechRegNo, int Rank) {
        this.name = name;
        this.regNo10 = regNo10;
        this.regNo12 = regNo12;
        this.BtechRegNo = BtechRegNo;
        this.Rank = Rank;
    }

    public String getName() {
        return name;
    }

    public String getRegNo10() {
        return regNo10;
    }

    public String getRegNo12() {
        return regNo12;
    }

    public String getBtechRegNo() {
        return BtechRegNo;
    }

    public int getRank() {
        return Rank;
    }

    @Override
    public String toString() {
        return name + " " + regNo10 + " " + getRegNo12() + " " + BtechRegNo + " " + Rank;
    }
}