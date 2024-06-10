
public class Task {
    public static void main(String[] args) {
        int[] numbers = {3,3,5,3,3,2,5};

        for(int count = numbers.length; count > 0; count--){
            for(int counter = numbers.length; counter > 0; count--){
                if(numbers[count] == numbers[counter]) {
                    System.out.print(counter++);
                }
                if(numbers[counter] > numbers[count]) {
                    System.out.print(count++);
                }
            }
        }
    }
}
