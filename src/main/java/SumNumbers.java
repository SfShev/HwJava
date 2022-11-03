
import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
    static List<Integer> num_index;
    static char[] arrayEquation;

    public static void main(String[] args) {
        String equation = "2? + ?5 = 69".replace(" ", "");
        num_index = new ArrayList<>();
        arrayEquation = equation.toCharArray();

        for (int i = 0; i < arrayEquation.length; i++) {
            if (arrayEquation[i] == '?') {
                num_index.add(i);
            }
        }
        creatingCombination(new ArrayList<>(), 9, num_index.size());
    }

    private static void creatingCombination(List<Integer> combination, int n, int k) {
        if (combination.size() == k) {
            equationResult(combination);
            return;
        }
        for (int i = 0; i <= n; i++) {
            combination.add(i);
            creatingCombination(combination, n, k);
            combination.remove(combination.size() - 1);
        }
    }

    private static void equationResult(List<Integer> combination) {
        String result = "";
        for (int i = 0; i < combination.size(); i++) {
            char x = Integer.toString(combination.get(i)).charAt(0);
            arrayEquation[num_index.get(i)] = x;
        }
        for (int i = 0; i < arrayEquation.length; i++) {
            if (arrayEquation[i] == '+') {
                result += '=';
            } else {
                result += arrayEquation[i];
            }
        }
        String[] arr = result.split("=");
        int sum = 0;
        int res = Integer.parseInt(arr[arr.length - 1]);
        for (int i = 0; i < arr.length - 1; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        if (sum == res) {
            System.out.printf("Уравнение %s + %s = %s верно\n", arr[0], arr[1], res);
        }
    }
}