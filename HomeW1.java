//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)

import java.util.Scanner;

public class HomeW1 {
    
    static int getTriangNumber(int n) {

        int sum = 0;
        for (int index = 0;index < n; index++) {
        sum += index + 1;
    }
    return sum;
}
    static int getFactorial(int n) {

        int result = 1;
        for (int index = 0; index < n; index++) {
            result *= index + 1;
    }
    return result;
}
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = 0;
    System.out.printf("введите натуральное число: ");
    if (!scn.hasNextInt()) {
        System.out.println("неверное число");
    } else {
        n = scn.nextInt();
        if (n < 1)
        System.out.println("введите положительное число");
        else {
            System.out.printf(" треугольное число от %d равно: %s! ", n, getTriangNumber(n));
            System.out.println();
            System.out.printf("Факториал от %d равен: %s! ", n, getFactorial(n));
        }
    }
    scn.close();
}
}
  //Вывести все простые числа от 1 до 1000

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите положительное число");
        int input = scanner.nextInt();
        scanner.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
        if (isPrimeNumber) {
            primes.add(i);
        }
        }
        System.out.println("простые числа: " + primes);
    }
    
}


//Реализовать простой калькулятор

import java.util.Scanner;

public class HomeW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите первое число");
        int numb_a = sc.nextInt();
        System.out.println("введите второе число");
        int numb_b = sc.nextInt();
        System.out.println("введите операцию + - * / ");
        char operation;
      
        operation = sc.next().charAt(0);
        int res;
        switch (operation) {
            case '+':
                res = numb_a + numb_b;
                System.out.println(res);
                break;
            case '-':
                res = numb_a - numb_b;
                System.out.println(res);
                break;
            case '/':
                res = numb_a / numb_b;
                System.out.println(res);
                break;
            case '*':
                res = numb_a * numb_b;
                System.out.println(res);
                break;
        }
        sc.close();
    }
    
}