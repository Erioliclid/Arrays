package HW2;

// http://javazadachi.blogspot.com/p/blog-page_5.html

import java.util.Random;
import java.util.Scanner;

public class HW2_3_Array_1 {

    /*

    Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
    отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
    Перед созданием массива подумайте, какого он будет размера.

    */
    public static void main(String args[]) {

        int[] array = new int[20];

        for (int i = 0; i < array.length; i = i + 2) {
            array[i] = i + 2;
            System.out.print(array[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < array.length; i = i + 2) {
            array[i] = i + 2;
            System.out.println(array[i]);
        }
    }
}

class HW2_3_Array_2 {

/*

Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
а затем этот же массив выведите на экран тоже в строку, но в обратном порядке.

 */

    public static void main(String args[]) {
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i = i + 2) {
            array2[i] = i + 1;
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 99; i >= 0; i = i - 2) {
            array2[i] = i;
            System.out.print(array2[i] + " ");
        }
    }
}

class HW2_3_Array_3 {

    /*

    Создайте массив из 15 случайных целых чисел из отрезка [0;9].
    Выведите массив на экран.
    Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.

    */
    public static void main(String args[]) {
        int[] array3 = new int[15];
        Random random = new Random();
        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(10);
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        int b = 0; // Счётчик чётных цифр
        for (int i = 0; i < array3.length; i++)

            if (array3[i] % 2 == 0 && array3[i] > 0) {
                int num = array3[i];
                b++;
                System.out.print(num + " ");
            }
        System.out.println();
        System.out.println("Всего чётных цифр: " + b);
    }
}

class HW2_3_Array_4 {
    /*

    Создайте массив из 8 случайных целых чисел из отрезка [1;10].
    Выведите массив на экран в строку.
    Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.

    */
    public static void main(String args[]) {
        int[] array4 = new int[8];
        Random random = new Random();
        for (int i = 0; i < array4.length; i++) {
            array4[i] = random.nextInt(10) + 1;
            System.out.print(array4[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array4.length; i++) {
            if (array4[i] % 2 != 0) {
                array4[i] = 0;
                System.out.print(array4[i] + " ");
            } else System.out.print(array4[i] + " ");
        }
    }
}

class HW2_3_Array_5 {

/*

Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
выведите массивы на экран в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и сообщите,
для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

*/

    public static void main(String args[]) {
        int[] array5_1 = new int[5];
        int[] array5_2 = new int[5];
        Random random = new Random();

        // Рисуем два массива

        for (int i = 0; i < array5_1.length; i++) {
            array5_1[i] = random.nextInt(6);
            System.out.print(array5_1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array5_2.length; i++) {
            array5_2[i] = random.nextInt(6);
            System.out.print(array5_2[i] + " ");
        }
        System.out.println();

        //Находим среднее арифметическое
        int i = 0;
        int sum = 0;
        while (i < array5_1.length) {
            sum = sum + array5_1[i];
            i++;
        }
        int middle1 = sum / i;
        System.out.println("Среднее арифметическое первого массива = " + middle1);

        int j = 0;
        int sum2 = 0;
        while (j < array5_2.length) {
            sum2 = sum2 + array5_2[j];
            j++;
        }
        int middle2 = sum2 / j;
        System.out.println("Среднее арифметическое второго массива = " + middle2);
        System.out.println();

        // Ищем большее значение
        if (middle1 > middle2) {
            System.out.println("Array 1 bigger array 2.");
        } else if (middle1 < middle2) {
            System.out.println("Array 1 smaller array 2.");
        } else System.out.println("Array 1 equals array 2.");
    }
}

class HW2_3_Array_6 {

/*

Создайте массив из 4 случайных целых чисел из отрезка [10;99],
выведите его на экран в строку.
Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.

*/

    public static void main(String args[]) {

        //Рисуем массив
        int[] array6 = new int[4];
        Random random = new Random();
        for (int i = 0; i < array6.length; i++) {
            array6[i] = random.nextInt(90) + 10;
            System.out.print(array6[i] + " ");
        }

        //Проверяем последовательность
        int i = 0;
        int b = 1;
        while (i < array6.length - 1) {
            if (array6[i] < array6[i + 1] || array6[i] == array6[i + 1]) {
                b++;
                i++;
            } else i++;
        }
        System.out.println();

        if (b == array6.length) {
            System.out.println("Массив растёт");
        } else System.out.println("Массив не растёт");
    }
}

class HW2_3_Array_7 {

/*

Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.

*/

    public static void main(String args[]) {
        int[] array7 = new int[20];
        array7[0] = 1;
        array7[1] = 1;
        System.out.print(array7[0] + " " + array7[1] + " ");

        for (int i = 2; i < array7.length; i++) {
            array7[i] = array7[i - 1] + array7[i - 2];
            System.out.print(array7[i] + " ");
        }
    }
}

class HW2_3_Array_8 {

/*

Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

*/

    public static void main(String args[]) {
        //Рисуем массив
        int[] array8 = new int[12];
        int index = 0;
        Random random = new Random();
        for (int i = 0; i < array8.length; i++) {
            array8[i] = random.nextInt(31) - 15;
            System.out.print(array8[i] + " ");
        }
        System.out.println();
        //Ищем наибольшее значение
        int max = -15;
        for (int i = 0; i < array8.length; i++) {
            if (max < array8[i]) {
                max = array8[i];
                index = i + 1;
            }
        }
        System.out.println("Maximum is: " + max);
        System.out.println("Max index: " + index);

    }
}

class HW2_3_Array_9 {

/*
Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом.
Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.
*/

    public static void main(String args[]) {
        double[] array9_1 = new double[10];
        double[] array9_2 = new double[10];
        Random random = new Random();
        //Рисуем два массива

        for (int i = 0; i < array9_1.length; i++) {
            array9_1[i] = random.nextInt(9) + 1;
            String result = String.format("%.0f", array9_1[i]);
            System.out.print(result + "      ");
        }
        System.out.println();
        for (int i = 0; i < array9_2.length; i++) {
            array9_2[i] = random.nextInt(9) + 1;
            String result = String.format("%.0f", array9_2[i]);
            System.out.print(result + "      ");
        }
        System.out.println();

        //Создаём третий массив
        double[] array9_3 = new double[10];
        for (int i = 0; i < array9_3.length; i++) {
            array9_3[i] = array9_1[i] / array9_2[i];
            String result = String.format("%.1f", array9_3[i]);
            System.out.printf(result + "    ");
        }
        System.out.println();

        //Ищем количество целых значений в третьем массиве
        int num = 0;
        for (int i = 0; i < array9_3.length; i++) {
            if (array9_3[i] % 1 == 0) {
                num++;
            }
        }
        System.out.println("Целых чисел в третьем массиве: " + num);
    }
}

class HW2_3_Array_10 {

/*

Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.

*/

    public static void main(String args[]) {

        //Рисуем массив
        int[] array10 = new int[11];
        Random random = new Random();
        for (int i = 0; i < array10.length; i++) {
            array10[i] = random.nextInt(3) - 1;
            System.out.print(array10[i] + " ");
        }
        System.out.println();
        //Смотрим частоту значений
        int a = -1;
        int b = 0;
        int c = 1;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        for (int i = 0; i < array10.length; i++) {
            if (array10[i] == -1) {
                num1++;
            } else if (array10[i] == 0) {
                num2++;
            } else if (array10[i] == 1) {
                num3++;
            }
        }
        if (num1 > num2 && num1 > num3) {
            System.out.println("Чаще всего встречается " + a);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Чаще всего встречается " + b);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Чаще всего встречается " + c);
        }
    }
}

class HW2_3_Array_11 {

/*

Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив
указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку.
После этого программа должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше:
левой или правой, либо сообщить, что эти суммы модулей равны.
Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор,
пока не будет указано корректное значение.

*/

    public static void main(String args[]) {
        //Указываем число
        Scanner scanner = new Scanner(System.in);
        int b = -1;
        while (b < 0 || b % 2 != 0) {
            System.out.print("Введите чётное положительное число: ");
            b = scanner.nextInt();
            if (b < 0 || b % 2 != 0) {
                System.out.println("Wrong number. Repeat");
            }
        }
        //Строим массив
        Random random = new Random();
        int[] array11 = new int[b];
        for (int i : array11) {
            array11[i] = random.nextInt(11) - 5;
            System.out.print(array11[i] + " ");

        }
        System.out.println();
        //Складываем модули половин
        // Первая половина
        int sum1 = 0;
        for (int i = 0; i < array11.length / 2; i++) {

            if (array11[i] < 0) {                  //Если значение массива меньше нуля
                sum1 = sum1 - array11[i];          //Тогда вычитаем из общей суммы значение
            } else if (array11[i] >= 0) {          //Если больше или равно
                sum1 = sum1 + array11[i];          //То прибавляем
            }
        }
        System.out.println("Сумма первой половины массива равна: " + sum1);

        //Вторая половина
        int sum2 = 0;
        for (int i = array11.length / 2; i < array11.length; i++) {
            if (array11[i] < 0) {
                sum2 = sum2 - array11[i];
            } else {
                sum2 = sum2 + array11[i];
            }
        }
        System.out.println("Сумма второй половины массива равна: " + sum2);

        if (sum1 > sum2) {
            System.out.println("Сумма первой половины массива больше суммы второй половины");
        } else if (sum1 < sum2) {
            System.out.println("Сумма первой половины массива меньше суммы второй половины");
        } else if (sum1 == sum2) {
            System.out.println("Суммы половин равны");
        }

    }
}

class HW2_3_Array_12 {

/*

Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,
чтобы отрицательных и положительных элементов там было поровну и не было нулей.
При этом порядок следования элементов должен быть случаен
(т. е. не подходит вариант, когда в массиве постоянно выпадает сначала 6 положительных, а потом 6 отрицательных чисел
или же когда элементы постоянно чередуются через один и пр.).
Вывести полученный массив на экран.

*/

    public static void main(String args[]) {
        Random random = new Random();
        int[] array12 = new int[12];
        int negative = 0;
        int pozitive = 0;

        for (int i = 0; i < array12.length; i++) {

            array12[i] = random.nextInt(21) - 10;

            if (array12[i] < 0) {
                if (negative < 6) {
                    negative++;
                } else {
                    array12[i] = random.nextInt(10) + 1;
                    pozitive++;
                }


            } else if (array12[i] > 0) {
                if (pozitive < 6) {
                    pozitive++;
                } else {
                    array12[i] = random.nextInt(9) - 10;
                    negative++;
                    ;
                }

            } else if (array12[i] == 0 && negative < 6) {
                array12[i] = random.nextInt(9) - 10;
                negative++;

            } else if (array12[i] == 0 && pozitive < 6) {
                array12[i] = random.nextInt(10) + 1;
                pozitive++;
            }
            System.out.println(array12[i]);
        }
        System.out.println();
        System.out.println(pozitive);
        System.out.println(negative);
    }

}


class HW2_3_Array_13 {

    /*

    Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
    Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
    Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
    Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

    */
    //Вводим число
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = 0;
        while (n <= 3) {
            System.out.print("Enter number bigger than 3: ");
            n = scanner.nextInt();
            if (n <= 3) {
                System.out.println("Wrong number! Repeat");
            }
        }
        //создаём два массива
        int[] arrayFull = new int[n];

        for (int i = 0; i < arrayFull.length; i++) {
            arrayFull[i] = random.nextInt(n);
            System.out.print(arrayFull[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arrayFull.length; i++) {
            if (arrayFull[i] % 2 == 0 && arrayFull[i] != 0) {
                System.out.print(arrayFull[i] + " ");
            }
        }

    }
}

class HW2_3_Array_14 {

/*

Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
Вывести массив на экран.

*/

    public static void main(String args[]) {
        Random random = new Random();
        int[][] array14 = new int[8][5];
        for (int i = 0; i < array14.length; i++) {
            for (int j = 0; j < array14[i].length; j++) {
                array14[i][j] = random.nextInt(89) + 10;
                System.out.print(array14[i][j] + " ");
            }
            System.out.println();

        }
    }
}

class HW2_3_Array_15 {

/*

Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
Вывести массив на экран.
После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения).

*/

    public static void main(String args[]) {
        Random random = new Random();
        //Рисуем матрицу
        int[][] array15 = new int[5][8];
        for (int i = 0; i < array15.length; i++) {
            for (int j = 0; j < array15[i].length; j++) {
                array15[i][j] = random.nextInt(198) - 99;
                System.out.print(array15[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        //Ищем наибольшее значение
        int max = 0;
        for (int i = 0; i < array15.length; i++) {
            for (int j = 0; j < array15[i].length; j++) {
                if (array15[i][j] >= 0 && array15[i][j] > max) {
                    max = array15[i][j];
                } else if (array15[i][j] < 0 && array15[i][j] < -max) {
                    max = array15[i][j] * -1;
                }
            }
        }
        System.out.println(max);
    }
}

class HW2_3_Array_16 {

    /*

    Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
    Вывести массив на экран.
    Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
    Если таких строк несколько, то вывести индекс первой встретившейся из них.

    */
    public static void main(String args[]) {
        Random random = new Random();
        //Рисуем матрицу
        int[][] array16 = new int[7][4];

        for (int i = 0; i < array16.length; i++) {
            for (int j = 0; j < array16[i].length; j++) {
                array16[i][j] = random.nextInt(10) - 5;
                System.out.print(array16[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //_____________________________________
        //Строим массив максимальных значений столбца
        int[] max = new int[array16.length];

        //Строим массив максимальных значений столбца.Придаём значение единицы дефолтному значению массива
        for (int i = 0; i < max.length; i++) {
            max[i] = 1;
        }
        //Строим массив максимальных значений столбца.Присваиваем максимумы.
        System.out.print("Max[i] = ");
        for (int i = 0; i < array16.length; i++) {
            for (int j = 0; j < array16[i].length; j++) {
                max[i] = max[i] * array16[i][j];
            }
            System.out.print(max[i] + " ");
        }
        System.out.println();
        System.out.println();


        //Строим массив максимальных значений столбца.Избавляемся от минусов
        System.out.print("Max[i] pozitive = ");
        for (int i = 0; i < max.length; i++) {
            if (max[i] < 0) {
                max[i] = max[i] * -1;
            }
            System.out.print(max[i] + " ");
        }
        System.out.println();
        System.out.println();

        //Вычленяем индекс максимального значения массива
        int index = 0;
        int b = 0;
        for (int i = 0; i < max.length; i++) {
            if (max[i] >= b) {
                b = max[i];
                index = i + 1;
            }
        }
        System.out.println("Наибольший индекс: " + index);
    }
}

class HW2_3_Array_17 {

/*

Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
Вывести массив на экран.
Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент.
При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки.
Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку,
а можно отсортировать по убыванию каждую строку).
Вывести преобразованный массив на экран.

*/

    public static void main(String args[]) {
        Random random = new Random();
        //Рисуем матрицу
        int[][] array17 = new int[6][7];
        for (int i = 0; i < array17.length; i++) {
            for (int j = 0; j < array17[i].length; j++) {
                array17[i][j] = random.nextInt(10);
                System.out.print(array17[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        //Ищем индекс максимального элемента

        int index = 0;
        int swap;

        for (int i = 0; i < array17.length; i++) {
            int b = 0;
            for (int j = 0; j < array17[i].length; j++) {
                if (array17[i][j] >= b) {
                    b = array17[i][j];
                    index = j;
                }
            }
            swap = array17[i][index];
            array17[i][index] = array17[i][0];
            array17[i][0] = swap;
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < array17.length; i++) {
            for (int j = 0; j < array17[i].length; j++) {
                System.out.print(array17[i][j] + " ");
            }
            System.out.println();
        }
    }
}


class HW2_3_Array_18 {

    /*

    Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать каждый урок с того,
    чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек, а примеры среди них не должны повторяться.
    В помощь учителю напишите программу, которая будет выводить на экран 15 случайных примеров из таблицы умножения
    (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты).
    При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).

    */
    public static void main(String args[]) {
        Random random = new Random();
        int[] students = new int[15];
        int[][] example = new int[8][8];

        //Создаём множества учеников и множителей
        for (int i = 0; i < students.length; i++) {
            students[i] = i + 1;
            System.out.print(students[i] + " ");
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < example.length; i++) {
            System.out.print((i + 2) + "    ");
            for (int j = 0; j < example[i].length; j++) {
                example[i][j] = j + 2;
                System.out.print(example[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        //Создаём примеры ученикам
        int a = 0;
        int b = 0;
        FIRST:
        for (int i = 0; i < students.length; i++) {
            System.out.print("Ученик №" + students[i] + " решает: ");

            for (int j = 0; j < example.length; j++) {
                for (int q = 0; q < example[j].length; q++) {
                    a = random.nextInt(example.length - 1) + 2;
                    b = random.nextInt(example[j].length - 1) + 2;
                    if (b >= a) {
                        System.out.println(a + "*" + b);
                        continue FIRST;
                    }
                }
            }
            System.out.println();
        }
    }
}