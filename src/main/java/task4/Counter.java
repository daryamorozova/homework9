package task4;

//4. Задача: использование synchronized
//Условие задачи: Напишите класс Counter с методом increment, увеличивающим значение счётчика.
//Создайте два потока, каждый из которых вызывает increment() 1000 раз.
//Обеспечьте правильную работу с помощью synchronized.

public class Counter {

    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public synchronized int getCounter() {
        return counter;
    }


}
