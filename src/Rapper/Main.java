package Rapper;

public class Main {
    public static void main(String[] args) {
        Age student = new Age();
        student.insertAge(25);
        student.name = "Travis Scott";
        student.showHobbie = "Music";
        student.typeofRap = "Mumble";
        System.out.println(student);

        student.pack();
        student.flow();

    }
}

