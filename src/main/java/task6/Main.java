package task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    private static Integer[] numbers = {3, 6, 9, 15, 16, 1, 2, 5, 8, 63};
    static List<Integer> list = Arrays.asList(numbers);

    public static void main(String[] args) throws InterruptedException {
        int sum = parallelSum(list);
        System.out.println("Сумма: " + sum);

    }

    public static int parallelSum(List<Integer> list) throws InterruptedException {

        ListOfElements listOfElements1 = new ListOfElements(list, 0, 2);
        ListOfElements listOfElements2 = new ListOfElements(list, 3, 5);
        ListOfElements listOfElements3 = new ListOfElements(list, 6, 8);

        Thread t1 = new Thread(listOfElements1);
        Thread t2 = new Thread(listOfElements2);
        Thread t3 = new Thread(listOfElements3);

        t1.start();
        t2.start();
        t3.start();

        for (int i = 0; i <= 2; i++) {

        }

        t1.join();
        t2.join();
        t3.join();

        return listOfElements1.getSum() + listOfElements1.getSum() + listOfElements3.getSum();

    }

}
