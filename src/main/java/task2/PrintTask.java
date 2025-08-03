package task2;

public class PrintTask implements Runnable {
    private final String message;

    public PrintTask(String message) {
        this.message = message;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
