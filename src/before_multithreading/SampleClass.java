package before_multithreading;

public class SampleClass {
    public static void main(String[] args) {

        System.out.println("Part-1 : printing the numbers in ascending order from 1 - 10");
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("i is : " + i);
        }

        System.out.println("Part-2 : printing the numbers in descending order from 10 - 1");
        for(int j = 10; j >= 1; j--)
        {
            System.out.println("j is : " + j);
        }
    }
}
