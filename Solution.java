public class Solution {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 0; i < 1000; i++) {
            if (((i % 3) == 0) || ((i % 5) == 0)
                    && !(((i % 3) == 0) && ((i % 5) == 0))) {
                s = s + i;
            }
        }
        System.out.println("The multiples of 3 or 5 below 1000: " + s);
    }
}