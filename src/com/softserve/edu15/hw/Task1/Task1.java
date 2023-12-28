public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread : 1 \n is running");
            }
        });
        var t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread : 2 \n is running");
            }
        });
        var t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread : 3 \n is running");
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
    }
}