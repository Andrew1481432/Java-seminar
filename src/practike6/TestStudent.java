package practike6;

import java.util.Arrays;
import java.util.Scanner;

public class TestStudent {

    public static <T> T[] concat(T[] first, T[] second) {
        T[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    private static void insertionSort(Student[] arr) {
        for(int i = 0; i < arr.length; i++) {
            Student currElem = arr[i];
            int prevKey = i - 1;
            while(prevKey>=0 && arr[prevKey].getIdNumber() > currElem.getIdNumber()) {
                arr[prevKey+1] = arr[prevKey];
                prevKey--;
            }
            arr[prevKey+1] = currElem;
        }
    }


    private static void ex1() {
        //Написать тестовый класс, который создает массив класса Student и
        //сортирует массив iDNumber и сортирует его вставками

        Student[] students = {
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),

                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),

                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300)),
        };

        for (Student student : students) {
            System.out.print(student.getIdNumber()+" ");
        }
        System.out.println("");
        insertionSort(students);
        for (Student student : students) {
            System.out.print(student.getIdNumber()+" ");
        }
        System.out.println("");
    }

    private static void ex2() {
        /*
        Напишите класс SortingStudentsByGPA который реализует интерфейс
        Comparator таким образом, чтобы сортировать список студентов по их итоговым
        баллам в порядке убывания с использованием алгоритма быстрой сортировки.
         */

        Student[] students = {
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),

                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),

                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
        };

        for (Student student : students) {
            System.out.print(student.getTotalPoints()+" ");
        }
        System.out.println("");
        SortingStudentsByGPA comp = new SortingStudentsByGPA();
        Arrays.sort(students, comp); //с использованием алгоритма быстрой сортировки?
        for (Student student : students) {
            System.out.print(student.getTotalPoints()+" ");
        }
        System.out.println("");
    }

    private static void ex3() {
        //Напишите программу, которая объединяет два списка данных о студентах
        //в один отсортированный списках с использованием алгоритма сортировки слиянием.
        Student[] students1 = {
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),

                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),

                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
        };

        Student[] students2 = {
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),

                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),

                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
                new Student((int) (Math.random() * 300), (int) (Math.random() * 300)),
        };

        Student[] results = concat(students1, students2);

        for (Student student : results) {
            System.out.print(student.getIdNumber()+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите упражнение: ");
        int inputMode = scanner.nextInt();
        switch (inputMode) {
            case 1:
                ex1();
                break;

            case 2:
                ex2();
                break;

            case 3:
                ex3();
                break;

            default:
                System.out.println("Упражнение не найдено!");
        }
    }

}
