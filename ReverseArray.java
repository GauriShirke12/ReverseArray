public class ReverseArray {

    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            int temp;
            // swap
            temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;

        }

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        reverse(numbers);

        // print
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println();
    }

}
