package HW2;

import java.util.Random;

public class HW2_4_SeaBattle {
    static int[][] field = new int[12][12];


    public static void main(String[] args) {
        sides(numberOfShips(battleShips(field)));
    }

    public static int[][] battleShips(int[][] field) {
        //Ставим корабль
        Random random = new Random();
        int[][] field_2 = field;
        int[][] ship = {{0,0 ,0 },
                        {0, 55, 0},
                        {0, 0, 0}};
        int i = random.nextInt(10);
        int j = random.nextInt(10);

        field_2[i][j] = ship[0][0];
        field_2[i][j + 1] = ship[0][1];
        field_2[i][j + 2] = ship[0][2];
        field_2[i + 1][j] = ship[1][0];
        field_2[i + 1][j + 1] = ship[1][1];
        field_2[i + 1][j + 2] = ship[1][2];
        field_2[i + 2][j] = ship[2][0];
        field_2[i + 2][j + 1] = ship[2][1];
        return field_2;
    }

    public static int[][] numberOfShips(int[][] field_2) {
        int one = 0; //Количество кораблей
        while (one < 10) {
            one = 0;
            battleShips(field);
            for (int i = 0; i < field_2.length; i++) {
                for (int j = 0; j < field_2[i].length; j++) {
                    if (field_2[i][j] == 55) {
                        one++;
                    }
                }
            }

        }
        return field_2;
    }

    //      Делаем рамку
    public static int[][] sides(int[][] field_2) {
        int[][] field_3 = field_2;


        for (int i = 0; i < field_3.length; i++) {
            for (int j = 0; j < field_3[i].length; j++) {
                if (i == 0 && j >= 0 || i == 11 && j >= 0 || i >= 0 && j == 0 || i >= 0 && j == 11) {
                    field_3[i][j] = 7;
                }
                System.out.print(field_3[i][j] + "  ");
            }
            System.out.println();
        }
        return field_3;
    }
}