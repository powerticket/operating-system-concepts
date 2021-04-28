public class ThreadExample5 {
    public static void main(String args[]) {
        Runnable task = () -> {
            try {
                while (true) {
                    System.out.println("Hello, Thread!");
                    Thread.sleep(100);
                }
            }
            catch (InterruptedException ie) {
                System.out.println("I'm interrupted!");
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        try {
            Thread.sleep(500);            
        } catch (Exception e) {
            //TODO: handle exception
        }
        thread.interrupt();
        System.out.println("Hello, My Interrupted Child!");
  }
}