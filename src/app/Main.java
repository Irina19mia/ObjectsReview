package app;

public class Main {

    public static void main(String[] args) {
        Person tom = new Person("Tom", 25, "Електрик");
        Person dan = new Person("Dan", 36, "Менеджер");
        Person julia = new Person("Julia", 32, "Лікар");

        System.out.println(tom);
        System.out.println(dan);
        System.out.println(julia);

        System.out.println();

        System.out.println(julia);
        julia.setProfession("Вчитель");
        System.out.println("(Після оновлення професії)");
        System.out.println(julia);
    }
}
