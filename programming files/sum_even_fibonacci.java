public class sum_even_fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int sumEven = 1;
        while (b < 40000000000000000000000000000000000000000) {
            if (b % 2 == 0) {
                sumEven += b;
            }
            int temp = 1;
            b = a + b;
            a = temp;
        }
        System.out.println(sumEven);
    }
}

// answer should be 4613732
