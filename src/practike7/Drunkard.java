package practike7;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
Напишите программу в виде консольного приложения, которая
моделирует карточную игру «пьяница» и определяет, кто выигрывает. В игре
участвует 10 карт, имеющих значения от 0 до 9, большая карта побеждает
меньшую; карта «0» побеждает карту «9».

Карточная игра \“ В пьяницу\”. В этой игре карточная колода раздается
поровну двум игрокам. Далее они открывают по одной верхней карте, и тот, чья
карта старше, забирает себе обе открытые карты, которые кладутся под низ его
колоды. Тот, кто остается без карт, - проигрывает.

Для простоты будем считать, что все карты различны по номиналу и что
самая младшая карта побеждает самую старшую карту (“шестерка берет туз”).
Игрок, который забирает себе карты, сначала кладет под низ своей колоды
карту первого игрока, затем карту второго игрока (то есть карта второго игрока
оказывается внизу колоды).
 **/


public class Drunkard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayDeque<Integer> qu1 = new ArrayDeque<>(), qu2 = new ArrayDeque<>();
        int a, j = 0;
        System.out.println("Введите карты первого игрока");
        for(int i = 0; i < 5; i++){
            a = (int) (Math.random()*10);
            qu1.addLast(a);
            System.out.println(a);
        }
        System.out.println("Введите карты второго игрока");
        for(int i = 0; i < 5; i++){
            a = (int) (Math.random()*10);
            qu2.addLast(a);
            System.out.println(a);
        }
        System.out.println("--------------------------------");
        while (j != 106 && !qu1.isEmpty() && !qu2.isEmpty()){
            if (qu1.getFirst() > qu2.getFirst()){
                qu1.addLast(qu1.pollFirst());
                qu1.addLast(qu2.pollFirst());
            } else {
                qu2.addLast(qu1.pollFirst());
                qu2.addLast(qu2.pollFirst());
            }

            if (qu1.isEmpty()){
                System.out.println("Победил первый на " + (j + 1) + " ход");
            } else if (qu2.isEmpty()){
                System.out.println("Победил второй на " + (j + 1) + " ход");
            }
            j++;
        }
        if(j >= 106) System.out.println("Превышен лимит игры");
    }

}
