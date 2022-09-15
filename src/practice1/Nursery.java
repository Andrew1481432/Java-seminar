package practice1;

public class Nursery {

    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        new Ball(d2).play();
        new Ball(d3).play();

        new Book("Евгений Онегин", d1).read();
    }

}
