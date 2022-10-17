    import java.util.Scanner;

    public class Praktikum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите год:");
            int year = scanner.nextInt();

            if (isLeapYear(year)) {
                // здесь нужно вывести результат
                System.out.println("День программиста - 12.09." + year);
            }
            else {
                System.out.println("День программиста - 13.09." + year);
            }
        }

        public static boolean isLeapYear(int year) {
            if (year % 400 == 0) {   // если год деление которого нацело делится на 400 то високосный
                return true;
            } else if (year % 4 == 0) { // иначе если год нацело делится на 4
                if (year % 100 != 0) { // то если он нацело еще и не делится на 100 то он високосный
                    return true;
                } else return false;   // иначе високосный
            } else return false;
        }
    }
