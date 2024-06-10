public class Assignment {
    public int average(int[] numbers) {
        int average_numbers = 0;
        int sum = 0;
        for (int counter = 0; counter < numbers.length; ) {
            sum = sum + numbers[counter];
            average_numbers = sum / counter;

        }
        return average_numbers;
    }

    public int oddNumbers(int[] numbers) {
        int sum = 0;
        int[] odd_numbers = new int[numbers.length / 2];
        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] % 2 == 1) {
                odd_numbers[count] = numbers[count];
                sum += odd_numbers[count];
            }

        }
        return sum;
    }

    public int evenNumbers(int[] numbers) {
        int sum = 0;
        int[] even_numbers = new int[numbers.length / 2];
        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] % 2 == 1) {
                even_numbers[count] = numbers[count];
                sum += even_numbers[count];
            }

        }
        return sum;
    }

    public class CountingStrings {
        public int lengthOfAnumber(int[] value){
            int length = 0;
            for(int count = 0; count < value.length; count++){
                length = count+1;
            }
            return length;
        }
    }

    public int largestNumber(int[] numbers) {
        int largest_number = 0;
        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] > largest_number) {
                largest_number = numbers[count];
            }
        }
        return largest_number;
    }
    public int smallestNumber(int[] numbers) {
        int smallest_number = 0;
        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] > smallest_number) {
                smallest_number = numbers[count];
            }
        }
        return smallest_number;
    }

}
