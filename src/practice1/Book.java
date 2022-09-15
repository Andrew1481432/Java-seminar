package practice1;

public class Book {

    private Dog dog;

    private String name;

    Book(String name, Dog dog) {
        this.dog = dog;
        this.name = name;
    }

    public void read() {
        System.out.println("Собака "+dog.getName()+" прочла книгу "+name);
    }

}
