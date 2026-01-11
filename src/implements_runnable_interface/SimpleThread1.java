package implements_runnable_interface;

public class SimpleThread1 implements Runnable {

    public SimpleThread1() {
        Thread thread1 = new Thread(this, "SimpleThread1");
        thread1.start();
    }

    @Override
    public void run() {
        try
        {
            System.out.println("Part-1 : printing the numbers in ascending order from 1 - 10");
            for(int i = 1; i <= 10; i++)
            {
                System.out.println("i is : " + i);
                Thread.sleep(3000);
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception occurred : " + e.getMessage());
        }
    }
}
