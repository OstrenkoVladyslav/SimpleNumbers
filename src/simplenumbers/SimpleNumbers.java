// https://github.com/OstrenkoVladyslav/SimpleNumbers.git
package simplenumbers;

import static java.lang.Math.sqrt;

public class SimpleNumbers {

    public static void main(String[] args) {
        int simple_nums [];
        simple_nums = new int [100];
        simple_nums [0] = 1;
        simple_nums [1] = 2;
        simple_nums [2] = 3;
        int num = 3;
        boolean is_simple;
        is_simple = false;
        for (int i=5; num<simple_nums.length; i=i+2){
            is_simple = true;
            for (int j=3; j<=sqrt(i); j++){
                if (i%j==0) {
                    is_simple=false;
                    break;
                }
            }
            if (is_simple){
                simple_nums[num]=i;
                System.out.println("simple_nums["+num+"]="+simple_nums[num]);
                num++;
            }
        }
    }
}