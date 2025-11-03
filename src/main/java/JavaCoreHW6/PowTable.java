package JavaCoreHW6;

import java.util.Arrays;

class PowTable {
    public static final int[] POWERS_2;
    static {
        POWERS_2 = new int[10];
        for (int i = 0; i < POWERS_2.length; i++) {
            int n = i + 1;
            POWERS_2[i] = n * n;
        }
    }
}

class PowTableTest {
    public static void main(String[] args) {
        //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}
