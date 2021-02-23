import java.util.*;

class Main {
    
    public static void main(String[] args) {
        System.out.println("check if palindrome, racecar: " + isPalindrome("racecar") + ", hello: " + isPalindrome("hello"));
        System.out.println("check if triangular number, 50: " + isTriangularNumber(50) + ", 55: " + isTriangularNumber(55));
        System.out.println("check if prime, 2: " + isPrime(2) + ", 100: " + isPrime(100));
        System.out.println("check if fibonacci number, 2: " + isFibonacci(2) + ", 100: " + isFibonacci(100));
        System.out.println("sieve of eratosthenes, 97: " + sieve(97).toString());
        System.out.println("factorize, 14 → sqrt(14) < 14 / 2: " + factorizationOf(14).toString() + ", 24: " + factorizationOf(24).toString());
        System.out.println("factorial, 20: " + factorial(20));
        System.out.println("gcd, 24, 32: " + gcd(24, 32));
        System.out.println("gcd for array, {24, 42, 56}: " + gcdArr(new int[]{24, 42, 56}));
        System.out.println("lcm, 24, 32: " + lcm(24, 32));
        System.out.println("reverse string, Hello, World!: " + reverseStr("Hello, World!"));
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTriangularNumber(int number) {
        double val = (Math.sqrt(8 * number + 1) - 1) / 2;
        return val % 1 == 0;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isFibonacci(long n) { 
        long m = 5L * n * n;
        long m1 = (long) Math.pow((long) Math.sqrt(m + 4), 2);
        long m2 = (long) Math.pow((long) Math.sqrt(m - 4), 2);
        return m1 == m + 4 || m2 == m - 4;
    }
     
    public static ArrayList<Integer> sieve(int n) { // eratosthenes
        boolean[] isprime = new boolean[n + 1];
        Arrays.fill(isprime, true);
        isprime[0] = false;
        isprime[1] = false;
        ArrayList<Integer> values = new ArrayList();
        for (int i = 2; i <= n; i++) {
            if (isprime[i]) {
                values.add(i);
                for (long j = 1L * i * i; j <= n; j += i) {
                    isprime[(int) j] = false;
                }
            }
        }
        return values;
    }

    public static ArrayList<Integer> factorizationOf(int n) {
        ArrayList<Integer> values = new ArrayList();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                n /= i;
                values.add(i);
            }
        }
        if (n != 1) {
            values.add(n);
        }
        return values;
    }

    public static long factorial(int n) {
        long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static int gcdArr(int[] arr) {
        int result = 0;
        for (int element: arr){
            result = gcd(result, element);
            if(result == 1) {
               return 1;
            }
        }
        return result;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static String reverseStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
