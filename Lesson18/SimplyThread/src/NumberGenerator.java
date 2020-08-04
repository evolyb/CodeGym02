public class NumberGenerato implements Runnable {
    public void generator() throws InterruptedException {
        for (int i = 0; i <10 ; i++) {
            System.out.print(i+" ");
            Thread.sleep(500);
        }
    }

    @Override
    public void run() {

    }
}
