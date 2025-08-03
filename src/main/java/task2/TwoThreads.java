package task2;

//2. Задача: создание двух потоков
//Условие задачи: Создайте два потока. Один поток должен печатать "A",
//второй — "B", каждый по 5 раз с небольшой задержкой.

public class TwoThreads {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new PrintTask("A"));
        Thread t2 = new Thread(new PrintTask("B"));

        t1.start();
        t2.start();

    }


}
