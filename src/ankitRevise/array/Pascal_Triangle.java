package ankitRevise.array;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        result.add(new ArrayList<Integer>());
        result.get(0).add(1);

        for(int row = 1; row < numRows; row++){
            List<Integer> newRows = new ArrayList<>();

            newRows.add(1);
            List<Integer> prevRow = result.get(row-1);
            for(int i=1; i<row; i++){
                newRows.add(prevRow.get(i) + prevRow.get(i-1));
            }
            newRows.add(1);
            result.add(newRows);
        }
        return result;
    }
}
