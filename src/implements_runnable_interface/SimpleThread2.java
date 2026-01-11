package implements_runnable_interface;

public class SimpleThread2 implements Runnable {

    public SimpleThread2() {
        Thread thread2 = new Thread(this, "SimpleThread2");
        thread2.start();
    }

    @Override
    public void run() {
        try
        {
            System.out.println("Part-2 : printing the numbers in descending order from 10 - 1");
            for(int j = 10; j >= 1; j--)
            {
                System.out.println("j is : " + j);
                Thread.sleep(3000);
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception occurred : " + e.getMessage());
        }
    }
}
