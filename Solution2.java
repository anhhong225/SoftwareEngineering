public class Solution2 {
    public static void main(String[] args) {

        int Num1 = 0;
        int Num2 = 1;
        int sum = 0;

        do
        {
            sum = Num1 + Num2;
            Num1 = Num2;
            Num2 = sum;

            if (Num2 % 2 == 0)
                sum = sum + Num2;
        }
        while (Num2 < 4000000);

        System.out.println(sum);
    }
}
