
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSortClassic {

    void sort(float[] arr) {
        if (arr.length == 0) return;

        // 1) Create max empty buckets
        List<List<Float>> buckets = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            buckets.add(new ArrayList<>());
        }

        // 2) Put elements in different buckets
        for (float item : arr) {
            int index = (int) item * arr.length;
            buckets.get(index).add(item);
        }

        // 3) Sort individual buckets
        for (List<Float> bucket : buckets) {
            Collections.sort(bucket);
        }

        // 4) Concatenate all buckets back into arr[]
        int index = 0;
        for (List<Float> bucket : buckets) {
            for (Float item : bucket) {
                arr[index++] = item;
            }
        }
    }

}