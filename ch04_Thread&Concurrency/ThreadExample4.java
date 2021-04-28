public class ThreadExample4 {
    public static void main(String args[]) {
        Runnable task = () -> {
            try {
                int i = 0;
                while (i < 5) {
                    System.out.println("Hello, Thread!");
                    Thread.sleep(500);
                    i++;
                }
            }
            catch (InterruptedException ie) {
                System.out.println("I'm interrupted!");
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println("Hello, My Joined Child!");
  }
}