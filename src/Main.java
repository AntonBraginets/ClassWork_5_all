import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task_5_1();
        Task_5_2();
        Task_5_3();
        Task_5_4();
        Task_5_6();
        Task_5_7();
    }

    private static void Task_5_1() {
        System.out.println("Задание 5.1");
        int n = new Random().nextInt(10) + 5;
        int m = new Random().nextInt(10) + 5;
        int array[][] = new int[n][m];
        System.out.println("Initial array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(150) - 50;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j])
                    max = array[i][j];
            }
        }
        int min = array[0][0];
        System.out.println("\nMax value is: " + max);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (min > array[i][j])
                    min = array[i][j];
            }
        }
        System.out.println("Min value is: " + min);
    }

    private static void Task_5_2() {
        System.out.println();
        System.out.println("Задание 5.2");
        int array[][] = new int[15][15];
        int sum = 0;
        System.out.println("Initial array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(100) - 50;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j == i; j++) {
                sum += array[i][j];
                //System.out.print(array[i][j] + " "); - to check if everything works properly only
            }
        }
        System.out.println("The sum is: " + sum);
    }

    private static void Task_5_3() {
        System.out.println();
        System.out.println("Задание 5.3");
        int n = new Random().nextInt(10) + 5;
        int m = new Random().nextInt(10) + 5;
        int i_max = 0;
        int j_max = 0;
        int i_min = 0;
        int j_min = 0;
        int array[][] = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(100) - 50;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    i_max = i;
                    j_max = j;
                }
            }
        }
        System.out.println("\nPosition of MAX element is: " + (i_max + 1) + " line, " + (j_max + 1) + " column");
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                    i_min = i;
                    j_min = j;
                }
            }
        }
        System.out.println("Position of MIN element is: " + (i_min + 1) + " line, " + (j_min + 1) + " column");
    }

    private static void Task_5_4() {
        System.out.println();
        System.out.println("Задание 5.4");
        int n = new Random().nextInt(5) + 2;
        int m = new Random().nextInt(5) + 2;
        int sum_column[] = new int[m];
        int sum_line[] = new int[n];
        int array[][] = new int[n][m];
        System.out.println("Initial array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(100) - 50;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("\nSum line is: ");
        int max_line = sum_line[0];
        int i_max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum_line[i] += array[i][j];
            }
            System.out.print(sum_line[i] + " ");
            if (max_line < sum_line[i]) {
                max_line = sum_line[i];
                i_max = i + 1;
            }
        }
        System.out.println("\nMax value of " + max_line + " is in line No." + i_max);
        System.out.print("\nSum column is: ");
        int max_column = sum_column[0];
        int j_max = 0;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                sum_column[j] += array[i][j];
            }
            System.out.print(sum_column[j] + " ");
            if (max_column < sum_column[j]) {
                max_column = sum_column[j];
                j_max = j + 1;
            }
        }
        System.out.println("\nMax value of " + max_column + " is in column No." + j_max);
    }

    private static void Task_5_6() {
        System.out.println();
        System.out.println("Задание 5.6");
        int n = new Random().nextInt(5) + 2;
        int m = new Random().nextInt(5) + 2;
        int sum = 0;
        int count_positive = 0;
        int count_a_b = 0;
        int array[][] = new int[n][m];
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число a для подсчета элементов, кратных этому числу: ");
        int a = scan.nextInt();
        System.out.print("Введите число b для подсчета элементов, кратных этому числу: ");
        int b = scan.nextInt();
        System.out.println("\nInitial array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(100) - 50;
                System.out.print(array[i][j] + "\t");
                if (array[i][j] % 2 != 0)
                    sum += array[i][j];
                if (array[i][j] > 0)
                    count_positive += 1;
                if (array[i][j] % a == 0 | array[i][j] % b == 0)
                    count_a_b += 1;
            }
            System.out.println();
        }
        System.out.println("\na) Сумма нечетных элементов массива равна: " + sum);
        System.out.println("b) Количество положительных элементов массива равно: " + count_positive);
        System.out.println("c) Количество числе, кратных a или b, равно: " + count_a_b);

    }

    private static void Task_5_7() {
        System.out.println();
        System.out.println("Задание 5.7");
        int line = new Random().nextInt(5) + 2;
        if (line % 2 != 0)
            line += 1;
        int column = new Random().nextInt(5) + 2;
        int array[][] = new int[line][column];
        int array_temp[] = new int[column];
        System.out.println("Imitial array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(100) - 50;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Copy of last line:");
        for (int i = line - 1; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array_temp[j] = array[i][j];
                System.out.print(array_temp[j] + "\t");
            }
        }
        System.out.println();
        System.out.println("New array:");
        for (int i = 1; i < array.length; i += 2) {
            for (int j = 0; j < column; j++) {
                array_temp[j] = array[i][j];
                array[i][j] = array[i - 1][j];
                array[i - 1][j] = array_temp[j];
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}