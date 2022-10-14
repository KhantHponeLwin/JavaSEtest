public class Q13 {
    public static void main(String[] args) {
        int numbers[] = {11,12,13,14,15,13,14,17,18,19,19};
        for (int  i= 0;  i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]==numbers[j]){
                    System.out.println(numbers[j]);
                }

            }

        }

    }
}
