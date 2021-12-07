package Rapper;

public class Student {
    public String name;
    public int countAge;

    public String showHobbie;

    public String typeofRap;

    public void pack() {
        System.out.println("Запакованный рэп!");
    }

    public void flow() {
        System.out.println("She thought it was the ocean, it's just the pool !");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", countAge=" + countAge +
                ", showHobbie='" + showHobbie + '\'' +
                ", typeofRap='" + typeofRap + '\'' +
                '}';
    }


    public Student(String name, int countAge, String showHobbie, String typeofRap) {
        this.name = name;
        this.countAge = countAge;
        this.showHobbie = showHobbie;
        this.typeofRap = typeofRap;
    }

    public Student() {

    }

    public void insertAge(int count) {
        countAge = count + countAge;
    }

}

