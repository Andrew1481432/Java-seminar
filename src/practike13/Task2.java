package practike13;

import practike13.task2.Person;

public class Task2 {

    public static void main(String[] args) {
        Person person = new Person("Agafonov", "Andrew", "Evgenievich");
        System.out.println(person.getShortFIO());
        Person person1 = new Person("Agafonov");
        System.out.println(person1.getShortFIO());
    }

}
