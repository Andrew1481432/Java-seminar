package practice1;

public class Ball {

    private Dog dog;

    Ball(Dog dog) {
        this.dog = dog;
    }

    public void play() {
        System.out.println("Собака "+dog.getName()+" поиграла в мяч");
    }

}
