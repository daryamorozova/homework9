package task6;

//6. Параллельная обработка данных с использованием потоков
//Условие задачи: Напишите программу, которая создает 3 потока для обработки элементов в списке.
//Каждый поток должен обработать 3 элемента из списка и вывести их индекс и значение.
//После завершения всех потоков, программа должна вывести общий результат: сколько элементов было обработано и их суммы.

import java.util.ArrayList;
import java.util.List;

public class ListOfElements implements Runnable {
    private List<Integer> list = new ArrayList<>();
    private final int start;
    private final int end;

    private int sum = 0;

     public ListOfElements(List<Integer> list, int start, int end) {
        this.list = list;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += list.get(i);
        }
    }

    public int getSum() {
        return sum;
    }
}
