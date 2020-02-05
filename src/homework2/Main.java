package homework2;

public class Main {
    private final static int SIZE = 4;

    public static void main(String[] args) {

        String[][] myArr = {{"1", "2", "asd", "1"}, {"1", "1", "saa", "3"}, {"1", "1", "1","5"}, {"1", "1", "1", "7"}};
        String[][] myArr1 = {{"1", "2", "asd", "1"}, {"1", "1", "saa", "3"}, {"1", "1", "1"}, {"1", "1", "1"}};


        try {
            sumArr(myArr);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }finally {
            System.out.println(" - по массиву 1");
        }

        try {
            sumArr(myArr1);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }finally {
            System.out.println(" - по массиву 2");
        }
    }


    public static void sumArr(String[][] array) throws MyArrayDataException {
        int sum = 0;
        if (array.length != SIZE) throw new MyArraySizeException(array.length);
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != SIZE) throw new MyArraySizeException(array[i].length);
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += convert(array[i][j], i, j);
                } catch (MyArrayDataException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.print("Сумма: " + sum);
    }

    public static int convert(String s, int i, int j) throws MyArrayDataException {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(i, j);

        }
    }
}