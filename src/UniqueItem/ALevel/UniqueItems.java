package UniqueItem.ALevel;

public class UniqueItems {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 1, 9, 4, 3, 8, 7};
        for (int i = 1; i < array.length; i++) {
            int ChisloSprava = array[i];
            for (int j = i - 1; j >= 0; j--) {
                int ChisloSleva = array[j];

                if (ChisloSleva > ChisloSprava) {
                    array[j + 1] = ChisloSleva;
                    array[j] = ChisloSprava;
                }
            }
        }

        int UniqueItem = array.length;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                UniqueItem = UniqueItem - 1;
            }
        }
        System.out.print("Количество уникальных чисел в массиве = " + UniqueItem);
    }
}
