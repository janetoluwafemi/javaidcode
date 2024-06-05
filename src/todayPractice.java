public class todayPractice {
        public static void main(String[] args) {
            int[] firstNumbers = new int[]{2, 4, 3};
            int[] numbers = new int[firstNumbers.length];

            for(int count = firstNumbers.length-1; count >= 0; count--) {
                numbers[count] = firstNumbers[count];
                System.out.println(numbers[count]);
            }
            int[] values = new int[]{5, 6, 4};
            int[] numbers2 = new int[values.length];

            for(int count = values.length-1; count >= 0; count--){
                numbers2[count] = values[count];
                System.out.println(numbers2[count]);
            }
            int sum1 = 0;
            int sum2 = 0;
            int sum3 = 0;

                sum1 = numbers[0] + numbers2[0];
                sum2 = numbers[1] + numbers2[1];
                sum3 = numbers[2] + numbers2[2];

            System.out.println(sum1);
            System.out.println(sum2);
            System.out.println(sum3);

        }


    }