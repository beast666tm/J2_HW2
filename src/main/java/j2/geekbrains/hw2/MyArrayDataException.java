package j2.geekbrains.hw2;

public class MyArrayDataException extends Exception {
    public String i;
    public String j;

    public MyArrayDataException(int i, int j) {
        super("Ошибка в ячейке: " + i + "x" + j);

    }

}
