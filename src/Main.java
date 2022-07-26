public class Main {
    public static void main(String[] args) {

        int[] randomArray = generateRandomArray();

        //Задание 1

        int payment_amount = 0;

        for (int j : randomArray) {
            payment_amount = payment_amount + j;
        }

        System.out.println("Сумма трат за месяц составила" + payment_amount + "рублей");

        //Задание 2

        int min = randomArray[0];
        int max = randomArray[0];

        for (int k : randomArray) {
            if (min > k) {
                min = k;
            }
            if (max < k) {
                max = k;
            }
        }

        System.out.println("Минимальная сумма трат за день составила" + min + "рублей. Максимальная сумма трат за день составила" + max + "рублей");

        //Задание 3

        double average = 0;

        for (int j : randomArray) {
            average = average + j;
        }

        average = average/30;

        System.out.println("Средняя сумма трат за месяц составила" + average + "рубле");

        //Задание 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int length = reverseFullName.length; length > 0; length--) {
            System.out.print(reverseFullName[length-1]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}