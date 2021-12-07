package Rapper;

public class Rap extends Student {
    public Rap() {
        super();
    }

    public Rap(String name, int countAge, String showHobbie, String typeofRap) {
        super(name, countAge, showHobbie, typeofRap);
    }

    public void flow() {
        System.out.println("She thought it was the ocean, it's just the pool !");
    }

    @Override
    public void pack() {
        System.out.println("Запакованный рэп!");
    }
}

