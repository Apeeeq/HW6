import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();


// Тернальные операторы
        double greatest = (first > second && first > third ? first : first < second && third < second ? second : third);
        double average = (first < second && first > third ? first : second < first && second > third ? second : third);
        double smallest = (first < second && first < third ? first : second < first && second < third ? second : third);

//        if (first > second && first > third) {
//            greatest = first;
//        } else if (first < second && first < third) {
//            smallest = first;
//        } else {
//            average = first;
//        }
//
//        if (second > first && second > third) {
//            greatest = second;
//        } else if (second < first && second < third) {
//            smallest = second;
//        } else {
//            average = second;
//        }
//
//        if (third > second && third > first) {
//            greatest = third;
//        } else if (third < second && third < first) {
//            smallest = third;
//        } else {
//            average = third;
//
//        }


        System.out.println(greatest);
        System.out.println(average);
        System.out.println(smallest);


    }
}










