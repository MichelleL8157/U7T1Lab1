import java.util.ArrayList;
import java.util.Arrays;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num) {
        String list = num + "";
        for (int i = 0; i != list.length(); i++) {
            String value = list.substring(i, i + 1);
            int number = Integer.parseInt(value);
            digitList.add(number);
        }
    }

    public boolean isStrictlyIncreasing() {
        boolean isIncreasing = true;
        for (int i = 0; i != digitList.size() - 1; i++) {
            int num1 = digitList.get(i);
            int num2 = digitList.get(i + 1);
            if (num2 < num1) {
                isIncreasing = false;
            }
        }
        return isIncreasing;
    }


}
