package task2;

//2. Задача: создание двух потоков
//Условие задачи: Создайте два потока. Один поток должен печатать "A",
//второй — "B", каждый по 5 раз с небольшой задержкой.

public class TwoThreads {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        for (int i = 0; i < 5; i++) {
            t1.run();
            System.out.println("A");
            t1.sleep(500);
            t2.run();
            System.out.println("B");
            t2.sleep(500);

        }

    }


}
