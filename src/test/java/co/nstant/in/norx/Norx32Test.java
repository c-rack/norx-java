package co.nstant.in.norx;

import static org.junit.Assert.assertArrayEquals;

public class Norx32Test extends AbstractNorxTest<Integer> {

    private Integer[][] vectors = {
        {
            0x00000000, 0x00000000, 0x00000000, 0x00000000,
            0x00000000, 0x00000000, 0x00000000, 0x00000000 },
        {
            0x00000001, 0x00000000, 0x00000000, 0x00000000,
            0x00002001, 0x42024200, 0x21010100, 0x20010100 },
        {
            0x00000000, 0x00000001, 0x00000000, 0x00000000,
            0x00202001, 0x42424240, 0x21010120, 0x20010120 },
        {
            0x00000000, 0x00000000, 0x00000001, 0x00000000,
            0x00200000, 0x00400042, 0x00000021, 0x00000020 },
        {
            0x00000000, 0x00000000, 0x00000000, 0x00000001,
            0x00002000, 0x42004200, 0x21000100, 0x20000100 },
        {
            0x80000000, 0x00000000, 0x00000000, 0x00000000,
            0x80001000, 0x21012100, 0x10808080, 0x10008080 },
        {
            0x00000000, 0x80000000, 0x00000000, 0x00000000,
            0x80101000, 0x21212120, 0x10808090, 0x10008090 },
        {
            0x00000000, 0x00000000, 0x80000000, 0x00000000,
            0x00100000, 0x00200021, 0x80000010, 0x00000010 },
        {
            0x00000000, 0x00000000, 0x00000000, 0x80000000,
            0x00001000, 0x21002100, 0x10800080, 0x10000080 },
        {
            0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF,
            0xFFFF5FFE, 0x35F939FC, 0x1AFCFCFE, 0x5FFEFEFF },
        {
            0x01234567, 0x89ABCDEF, 0xFEDCBA98, 0x7654321F,
            0xB7BF8099, 0x65A6E720, 0x1E22F5CB, 0x1AA9E143 },
    };

    @Override
    protected Integer[] getTraceG(int index) {
        return vectors[index];
    }

    public void testG(int index) {
        System.out.println("G32 Trace " + index);
        Integer[] trace = getTraceG(index);
        int a = trace[0];
        int b = trace[1];
        int c = trace[2];
        int d = trace[3];
        int ga = trace[4];
        int gb = trace[5];
        int gc = trace[6];
        int gd = trace[7];

        int[] input = { a, b, c, d };
        int[] expected = { ga, gb, gc, gd };

        Norx32.g(input);

        System.out.println(String.format("%08X %08X %08X %08X", a, b, c, d));
        System.out.println(String.format("%08X %08X %08X %08X", ga, gb, gc, gd));
        System.out.println(String.format("%08X %08X %08X %08X", input[0], input[1], input[2], input[3]));
        assertArrayEquals(expected, input);
        System.out.println("--> OK");
    }

}
