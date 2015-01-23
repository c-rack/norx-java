package co.nstant.in.norx;

public class Norx32 {

    private final static int W = 32;
    private final static int R0 = 8;
    private final static int R1 = 11;
    private final static int R2 = 16;
    private final static int R3 = 31;

    public static void f(int[] state) {
        g(state, 0, 4, 8, 12);
        g(state, 1, 5, 9, 13);
        g(state, 2, 6, 10, 14);
        g(state, 3, 7, 11, 15);
        g(state, 0, 5, 10, 15);
        g(state, 1, 6, 11, 12);
        g(state, 2, 7, 8, 13);
        g(state, 3, 4, 9, 14);
    }

    private static void g(int[] s, int a, int b, int c, int d) {
        int[] array = new int[] { s[a], s[b], s[c], s[d] };
        g(array);
        s[a] = array[0];
        s[b] = array[1];
        s[c] = array[2];
        s[d] = array[3];
    }

    public static void g(int[] array) {
        g1(array, R0);
        g2(array, R1);
        g1(array, R2);
        g2(array, R3);
    }

    private static void g1(int[] v, int r) {
        v[0] = (v[0] ^ v[1]) ^ ((v[0] & v[1]) << 1);
        v[3] ^= v[0];
        v[3] = (v[3] >>> r) | (v[3] << (W - r));
    }

    private static void g2(int[] v, int r) {
        v[2] = (v[2] ^ v[3]) ^ ((v[2] & v[3]) << 1);
        v[1] ^= v[2];
        v[1] = (v[1] >>> r) | (v[1] << (W - r));
    }

}
