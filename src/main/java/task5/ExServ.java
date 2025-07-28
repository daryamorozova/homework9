package task5;

//5. Реализация пула потоков для обработки задач
//Условие задачи: Напишите программу, которая использует ExecutorService для создания пула потоков,
//в котором несколько потоков обрабатывают задачи. Каждая задача — это выполнение простого теста с задержкой.
//Программа должна создать пул из 4 потоков, каждая задача должна быть выполнена с задержкой в 2 секунды.
//После выполнения всех задач, результат должен быть выведен в главном потоке.


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExServ {

public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(4);

    for (int i = 0; i < 10; i++) {
        final int taskNumber = i;
        executorService.execute(() -> {
            System.out.println("Задача " + taskNumber + " выполнена");
        });
    }
    System.out.println("Все задачи выполнены.");
    executorService.shutdown();
    }
}



