package practike13;


import practike13.task3.Address;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(Address.createUseSplit("Страна, Регион, Город, Улица, Дом, Корпус, Квартира"));
        System.out.println(Address.createUseToken("Страна, Регион, Город, Улица, Дом, Корпус, Квартира"));
    }

}
