import java.util.Scanner;

// // Task 1 (uncomment the whole block of the code)
//public class Main {
//    public static void printDigits(int n) {
//        // Base case: если число меньше 10, выводим его (это первая цифра)
//        if (n < 10) {
//            System.out.println(n);
//            return;
//        }
//        // Recursive step: сначала уходим вглубь до первой цифры
//        printDigits(n / 10);
//        // При выходе из рекурсии печатаем последнюю цифру текущего вызова
//        System.out.println(n % 10);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); // Пример: 5481
//        printDigits(n);
//    }
//}


// //Task 2
//public class Main {
//    // Рекурсивный ввод массива (заменяет цикл for)
//    public static void readArray(Scanner sc, int[] arr, int index, int n) {
//        if (index == n) return;
//        arr[index] = sc.nextInt();
//        readArray(sc, arr, index + 1, n);
//    }
//
//    // Рекурсивная сумма
//    public static double findSum(int[] arr, int n) {
//        if (n <= 0) return 0;
//        return arr[n - 1] + findSum(arr, n - 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        readArray(sc, arr, 0, n); // Рекурсивный ввод
//
//        double sum = findSum(arr, n);
//        System.out.println(sum / n);
//    }
//}


// //Task3
//public class Main {
//    public static boolean isPrime(int n, int divisor) {
//        // Base cases
//        if (n <= 2) return (n == 2);
//        if (n % divisor == 0) return false; // Нашли делитель - не простое
//        if (divisor * divisor > n) return true; // Проверили до корня - простое
//
//        // Recursive step: проверяем следующий делитель
//        return isPrime(n, divisor + 1);
//    }
//
//    public static void main(String[] args) {
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        int n = sc.nextInt();
//        if (isPrime(n, 2)) System.out.println("Prime");
//        else System.out.println("Composite");
//    }
//}


// //Task 4
//public class Main {
//    public static long factorial(int n) {
//        // Base case: 0! и 1! равны 1
//        if (n == 0 || n == 1) return 1;
//        // Recursive step: n * (n-1)!
//        return n * factorial(n - 1);
//    }
//
//    public static void main(String[] args) {
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(factorial(n));
//    }
//}

// //Task 5
//public class Main {
//    public static int fibonacci(int n) {
//        // Base cases
//        if (n == 0) return 0;
//        if (n == 1) return 1;
//        // Recursive step: сумма двух предыдущих
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }
//
//    public static void main(String[] args) {
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(fibonacci(n));
//    }
//}


// //Task6
//public class Main {
//    public static long power(int a, int n) {
//        // Base case: любая степень 0 равна 1
//        if (n == 0) return 1;
//        // Recursive step: a * a^(n-1)
//        return a * power(a, n - 1);
//    }
//
//    public static void main(String[] args) {
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        int a = sc.nextInt();
//        int n = sc.nextInt();
//        System.out.println(power(a, n));
//    }
//}



// //Task 7
//public class Main {
//    public static void reverseOutput(Scanner sc, int n) {
//        // Base case: если чисел больше нет, выходим
//        if (n == 0) return;
//
//        int current = sc.nextInt(); // Считываем текущее число
//        // Recursive step: уходим в рекурсию для оставшихся n-1 чисел
//        reverseOutput(sc, n - 1);
//
//        // Когда рекурсия возвращается, печатаем число (LIFO)
//        System.out.print(current + " ");
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        reverseOutput(sc, n);
//    }
//}

// //Task 8
//public class Main {
//    public static String isAllDigits(String s) {
//        // Base cases
//        if (s.length() == 0) return "Yes"; // Дошли до конца — всё ок
//        if (!Character.isDigit(s.charAt(0))) return "No"; // Нашли букву — стоп
//
//        // Recursive step: проверяем строку без первого символа
//        return isAllDigits(s.substring(1));
//    }
//
//    public static void main(String[] args) {
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        String s = sc.next();
//        System.out.println(isAllDigits(s));
//    }
//}


// //TaSK 9
//public class Main {
//    public static int countChars(String s) {
//        // Base case: пустая строка имеет 0 символов
//        if (s.equals("")) return 0;
//        // Recursive step: 1 + длина остальной части
//        return 1 + countChars(s.substring(1));
//    }
//
//    public static void main(String[] args) {
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        String s = sc.next();
//        System.out.println(countChars(s));
//    }
//}


//Task 10
//public class Main {
//    public static int countChars(String s) {
//        // Base case: пустая строка имеет 0 символов
//        if (s.equals("")) return 0;
//        // Recursive step: 1 + длина остальной части
//        return 1 + countChars(s.substring(1));
//    }
//
//    public static void main(String[] args) {
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        String s = sc.next();
//        System.out.println(countChars(s));
//    }
//}