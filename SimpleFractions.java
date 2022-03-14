import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleFractions {
    private int numerator;
    private int denominator;


    public SimpleFractions(int num, int den) {
        this.numerator = num;
        this.denominator = den;
        System.out.print(numerator + "/" + denominator + " ");
    }

    static void sum(SimpleFractions fraction1, SimpleFractions fraction2) {
        int n = fraction1.numerator * fraction2.denominator + fraction1.denominator * fraction2.numerator;
        int d = fraction1.denominator * fraction2.denominator;
        System.out.println("Сложение первым способом: " + n + "/" + d);
    }

    static void min(SimpleFractions fraction1, SimpleFractions fraction2) {
        int n = fraction1.numerator * fraction2.denominator - fraction1.denominator * fraction2.numerator;
        int d = fraction1.denominator * fraction2.denominator;
        System.out.println("Вычитание первым способом: " + n + "/" + d);
    }

    static void multiply(SimpleFractions fraction1, SimpleFractions fraction2) {
        int n = fraction1.numerator * fraction2.numerator;
        int d = fraction1.denominator * fraction2.denominator;
        System.out.println("Умножение первым способом: " + n + "/" + d);
    }

    static void divide(SimpleFractions fraction1, SimpleFractions fraction2) {
        int n = fraction1.numerator * fraction2.denominator;
        int d = fraction1.denominator * fraction2.numerator;
        System.out.println("Деление первым способом: " + n + "/" + d);
    }

    void sum(SimpleFractions fraction2) {
        int num = fraction2.numerator;
        int denum = fraction2.denominator;
        int x = 0;
        int y = 0;
        x = this.numerator * denum + this.denominator * num;
        y = this.denominator * denum;
        System.out.println("Сложение вторым способом: " + x + "/" + y);
    }

    void min(SimpleFractions fraction2) {
        int num = fraction2.numerator;
        int denum = fraction2.denominator;
        int x = 0;
        int y= 0;
        x = this.numerator * denum - this.denominator * num;
        y = this.denominator * denum;
        System.out.println("Вычитание вторым способом: " + x + "/" + y);
    }

    void multiply(SimpleFractions fraction2) {
        int num = fraction2.numerator;
        int denum = fraction2.denominator;
        int x = 0;
        int y = 0;
        x = this.numerator * num;
        y = this.denominator * denum;
        System.out.println("Умножение вторым способом: " + x + "/" + y);
    }

    void divide(SimpleFractions fraction2) {
        int num = fraction2.numerator;
        int denum = fraction2.denominator;
        int x = 0;
        int y = 0;
        x = this.numerator * denum;
        y = this.denominator * num;
        System.out.println("Деление вторым способом: " + x + "/" + y);
    }
    public static void main(String args[]) {
        int result;
        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите числитель первой дроби:");
            int num1 = console.nextInt();
            System.out.println("Введите знаменатель первой дроби:");
            int den1 = console.nextInt();
            System.out.println("Введите числитель второй дроби:");
            int num2 = console.nextInt();
            System.out.println("Введите знаменатель второй дроби:");
            int den2 = console.nextInt();
            console.close();
            result = num1 / den1;
            result = num2 / den2;
            SimpleFractions fraction1 = new SimpleFractions(num1, den1);
            SimpleFractions fraction2 = new SimpleFractions(num2, den2);
            sum(fraction1, fraction2);
            min(fraction1, fraction2);
            multiply(fraction1, fraction2);
            divide(fraction1, fraction2);
            sum(fraction2);
            min(fraction2);
            multiply(fraction2);
            divide(fraction2);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка в вводе данных.");
        } catch (ArithmeticException e) {
            System.out.println("Знаменатель дроби равен нулю, введите данные ещё раз.");
        }
    }
}
