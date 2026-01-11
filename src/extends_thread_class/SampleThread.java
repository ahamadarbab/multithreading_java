package extends_thread_class;

public class SampleThread extends Thread {

    public SampleThread() {
        start();
    }

    @Override
    public void run() {
        try
        {
            System.out.println("Part-2 : printing the numbers in descending order from 10 - 1");
            for (int j = 10; j >= 1; j--)
            {
                System.out.println("j is : " + j);
                Thread.sleep(1);    // this will make thread to sleep for 1ms = 0.001s.
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception occurred : " + e.getMessage());
        }

    }
}
