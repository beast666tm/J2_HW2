package j2.geekbrains.hw2;

import java.io.OutputStream;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"1", "2", "3", "4"}, {"1", "7", "2", "2"}, {"8", "o", "2", "2"}, {"1", "7", "2", "2"}};
        try {
            try {
                int result = exArray(array);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива Не верен!");
                e.printStackTrace();
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            e.printStackTrace();
        }

    }


    public static int exArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }

        return sum;
    }

}
