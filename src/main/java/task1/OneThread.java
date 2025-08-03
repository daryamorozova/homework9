package task1;

//1. Задача: создание одного потока
//Условие задачи: Напишите программу, в которой создается отдельный поток,
//выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.

public class OneThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Привет из потока!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new OneThread());
            t1.start();
        }

    }

