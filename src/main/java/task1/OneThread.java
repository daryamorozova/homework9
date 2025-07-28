package task1;

//1. Задача: создание одного потока
//Условие задачи: Напишите программу, в которой создается отдельный поток,
//выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.

public class OneThread implements Runnable {

    public void run(){
        System.out.println("Привет из потока!");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new OneThread());

        for (int i = 0; i < 5; i++) {
            t1.run();
            t1.sleep(1000);

        }

    }



}
