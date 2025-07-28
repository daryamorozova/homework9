package task3;

//3. Задача: использование volatile
//Условие задачи: Создайте поток, который бесконечно увеличивает счетчик.
//В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.

public class VolatileKeyWord implements Runnable {

    private volatile boolean stop = false;
    int counter = 0;

    @Override
    public void run(){
        while(!stop){
            counter++;
            System.out.println("Не стоп: " + counter);
        }
    }

    public void stops(){
        this.stop = true;
    }


}
