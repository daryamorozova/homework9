package task3;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        VolatileKeyWord keyWord = new VolatileKeyWord();
        Thread t1 = new Thread(keyWord);
        t1.start();
        t1.sleep(2000);
        keyWord.stops();
    }
}
