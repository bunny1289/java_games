import java.util.ArrayList;

public class Randomguess {
    public int[] number() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        while (list.size() > 4) {
            int x = (int) (Math.random() * 10);
            if (x < list.size()) {
                list.remove(x);
            }
        }

        int x = list.get(0);
        for (int i = 1; i < 4; i++) {
            x = x * 10 + list.get(i);
        }
        int res[] = new int[4];
        for (int i = 0; i < 4; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}