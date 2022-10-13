package practike8_11;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Task5 {

    /**
     * Сравнить время выполнения кода в реализации кода в виде различных
     * структур данных из предыдущих заданий (
     * сравнить ArrayList и LinkedList по
     * производительности – операции вставки
     * )
     */
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int value = 123456;
        System.out.println("---Add elements ( 6kk )");
        Date startAddLinkedTime = new Date();
        for(int i = 0; i < 6000000; i++) {
            linkedList.add(value);
        }
        Date finishAddLinkedTime = new Date();
        long addLinkedTime = finishAddLinkedTime.getTime() - startAddLinkedTime.getTime();
        Date startAddArrayTime = new Date();
        for(int i = 0; i < 6000000; i++) {
            arrayList.add(value);
        }
        Date finishAddArrayTime = new Date();
        long addArrayTime = finishAddArrayTime.getTime() - startAddArrayTime.getTime();
        System.out.println("LinkedList: "+addLinkedTime +" ms");
        System.out.println("ArrayList: "+addArrayTime +" ms");

        if(addArrayTime>addLinkedTime) {
            System.out.print("LinkedList is faster");
        } else {
            System.out.print("ArrayList is faster");
        }
    }

}
