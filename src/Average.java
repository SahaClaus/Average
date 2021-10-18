public class Average {
    public static void main(String[] args) {
        int i = 2;
        int k = 7;
        int sum = 0;
        int count = 0;

        while (i <= k) {
            sum += i;
            i++;
            count += 1;
        }

        double average = (double)sum / count;
        System.out.printf("Среднее арифметическое чисел равно:%5.2f%n", average);
    }
}
