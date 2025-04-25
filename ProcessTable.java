public class ProcessTable {

    public ProcessTable() {
    }

    public void someReordering(int P[]) {
        int s = P.length;

        for (int i = 1; i < s; i++) {
            int index = P[i];
            int j = i - 1;

            while (j >= 0 && P[j] > index) {
                P[j + 1] = P[j];
                j--;
            }
            P[j + 1] = index;
        }
    }

    public int[] add(int[] d, int v[]) {
        int[] result = new int[d.length + v.length];
        System.arraycopy(d, 0, result, 0, d.length);

        for (int i = 0; i < v.length; i++) {
            result[d.length + i] = v[i];
        }
        return result;
    }

    public void watch(int[] T) {
        for (int i = 0; i < T.length; i++) {
            System.out.print(T[i] + " ");
        }
        System.out.println();
    }

}