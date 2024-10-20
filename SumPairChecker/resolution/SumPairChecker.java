import java.util.*;

public class SumPairChecker {
    public boolean findPair(int[] arr, int k){
                
        HashSet<Integer> valoresCalculados = new HashSet<>();

        for (int num : arr) {
            int diferenca = k - num;

            if (valoresCalculados.contains(diferenca)) {
                return true;
            }

            valoresCalculados.add(num);
        }

        return false;
    }
}