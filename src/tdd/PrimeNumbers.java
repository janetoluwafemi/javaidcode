package tdd;

public class PrimeNumbers {
    public boolean isPrime(int number) {
            if (number % 1 == 0 && number % number == 0 && number % 2 != 0 && number % 3 != 0) {
                return true;
            }
        return false;
    }
}
