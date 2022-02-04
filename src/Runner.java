import java.util.ArrayList;
import java.util.Arrays;

public class Runner
{
    public static int passedTests = 0;
    public static int failedTests = 0;

    public static void main(String[] args)
    {
        Digits dig = new Digits(15704);
        System.out.println(dig.isStrictlyIncreasing());
    }
}