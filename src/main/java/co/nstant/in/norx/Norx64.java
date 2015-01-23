package co.nstant.in.norx;

public class Norx64 {

    private final static int W = 64;
    private final static int R0 = 8;
    private final static int R1 = 19;
    private final static int R2 = 40;
    private final static int R3 = 63;

    public static void f(long[] state) {
        g(state, 0, 4, 8, 12);
        g(state, 1, 5, 9, 13);
        g(state, 2, 6, 10, 14);
        g(state, 3, 7, 11, 15);
        g(state, 0, 5, 10, 15);
        g(state, 1, 6, 11, 12);
        g(state, 2, 7, 8, 13);
        g(state, 3, 4, 9, 14);
    }

    private static void g(long[] s, int a, int b, int c, int d) {
        long[] array = new long[] { s[a], s[b], s[c], s[d] };
        g(array);
        s[a] = array[0];
        s[b] = array[1];
        s[c] = array[2];
        s[d] = array[3];
    }

    public static void g(long[] array) {
        gx(array, R0, 0, 1, 3);
        gx(array, R1, 2, 3, 1);
        gx(array, R2, 0, 1, 3);
        gx(array, R3, 2, 3, 1);
    }

    private static void gx(long[] v, int r, int x, int y, int z) {
        v[x] = (v[x] ^ v[y]) ^ ((v[x] & v[y]) << 1);
        v[z] ^= v[x];
        v[z] = (v[z] >>> r) | (v[z] << (W - r));
    }

}
