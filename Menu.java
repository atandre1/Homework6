import java.util.Scanner;

public class Menu {
    public Menu() {
        int[] array = new int[10];
        int i = 0;
        int result = 0;
    }

    public void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1 для работы с математическими операциями и 0 для выхода");
        if (scan.hasNextInt()) {
            int j = scan.nextInt();
            while (j == 1) {
                System.out.println("Введите первое число");
                if (scan.hasNextInt()) {
                    int a = scan.nextInt();
                    System.out.println("Введите второе число");
                    if (scan.hasNextInt()) {
                        int b = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Введите операцию (+, -, *, /)");
                        if (scan.hasNext("[*/+-]")) {
                            String input = scan.nextLine();

                            switch (input) {
                                case "+":
                                    Sum sum = new Sum();
                                    sum.Action(a, b);
                                    break;
                                case "-":
                                    Minus minus = new Minus();
                                    minus.Action(a, b);
                                    break;
                                case "*":
                                    Umn umn = new Umn();
                                    umn.Action(a, b);
                                    break;
                                case "/":
                                    Delen delen = new Delen();
                                    delen.Action(a, b);
                                    break;
                            }
                        } else {
                            System.out.println("Вы ввели не операцию");
                            break;
                        }
                    } else {
                        System.out.println("Вы ввели не число");
                        break;
                    }
                } else {
                    System.out.println("Вы ввели не число");
                    break;
                }
                System.out.println("Введите 1 для работы с математическими операциями и 0 для выхода");
                j = scan.nextInt();
            }
            if (j != 1 && j != 0) System.out.println("Вы ввели неверное число");
            System.out.println("Выполнение программы завершено.");
        } else System.out.println("Вы ввели не число. Выполнение программы завершено.");
    }
}
