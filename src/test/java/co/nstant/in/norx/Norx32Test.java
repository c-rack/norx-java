package co.nstant.in.norx;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Norx32Test extends AbstractNorxTest<Integer> {

    private Integer[][] tracesG = {
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
            0x01234567, 0x89ABCDEF, 0xFEDCBA98, 0x76543210,
            0xB7BF8099, 0x65A6E720, 0x1E22F5CB, 0x1AA9E143 },
    };

    private int[][] tracesF = {
        {
            0x04004001, 0x20200400, 0x20042020, 0x4A4A8A08,
            0x01880885, 0x8A424A40, 0x4A024A02, 0xC24A0248,
            0x41212104, 0x888C4C4A, 0x41210520, 0x05212101,
            0x05012000, 0x20202004, 0x884A4A08, 0x40210500 },
        {
            0xEFDB6055, 0x4EB0C8FD, 0x4D66BAD5, 0xA5716F6F,
            0x3315BA06, 0xB5E09122, 0x44A18E71, 0x51E36297,
            0xF137B870, 0x3C7265F6, 0x00C30D5B, 0x295A09AA,
            0xB42B85E7, 0xAC007723, 0x742077A7, 0x4BADCF9B },
        {
            0xB49E8FA1, 0xB87AED22, 0x86152D27, 0xBEB398AD,
            0xBD48EB80, 0x1D4447DA, 0xB7458BA9, 0xA9E9EF9B,
            0xF7599C6A, 0x203FB309, 0x694A1283, 0xC4875743,
            0xF4E78B62, 0x50BE8206, 0x7BEF5DF7, 0xF92F6B9C },
        {
            0xD8936EA9, 0x4FDFA7F9, 0x2E23D116, 0xED7C3692,
            0x3E463C40, 0xA5AA5D55, 0xA05A6E11, 0xD22C7D58,
            0x3C0D461D, 0x5D78E74F, 0x88C9121B, 0xECA4CA13,
            0xE12928CB, 0x0167E06D, 0x90E1494E, 0x7CBBCCDA
        },
        {
            0xDC4D4AE5, 0x2EA22D30, 0x0F46317D, 0x61B76178,
            0x317CF942, 0xAA617101, 0xB1B646B0, 0x9FB8201C,
            0x31E77E87, 0x0E87682D, 0xAB27674A, 0x1C00EF33,
            0x49676DA0, 0x5E36BB3F, 0x369CB43A, 0xF6E575E8

        },
        {
            0x472112C6, 0xEBBA21DD, 0x69FAF1B0, 0x06AADA3C,
            0x958968BA, 0xFAF43AF0, 0x8A346D6C, 0x04DAD629,
            0x28C63C70, 0xF49BAA13, 0x57DE5F7C, 0x28841E18,
            0xEA3F594F, 0x8D744A62, 0x57B54FF1, 0x753A4160
        },
        {
            0x865ACF57, 0x0B1CD341, 0x44571AAD, 0x1E351C75,
            0x679AB711, 0x8D923CDC, 0x115DC180, 0xCF5E7435,
            0x94D66EB3, 0x6B643DA7, 0xC71FD3A8, 0xEACD114A,
            0xFE5A4582, 0x101A0A61, 0xDEF929CE, 0xF81307CE
        },
        {
            0xEE830EF5, 0xEFEDB52C, 0xD9B5DDE0, 0x11699703,
            0xA59F827F, 0xE7DA769E, 0x9ACF9688, 0xFE6B4EE6,
            0x2D99EFFF, 0xC1F42728, 0x1B33FCE4, 0x2484C32D,
            0x454DEF51, 0x65220E90, 0xD8B53023, 0x10265221
        }
    };

    @Override
    protected Integer[] getTraceG(int index) {
        return tracesG[index];
    }

    protected void testG(int index) {
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

    @Test
    public void testF() {
        for (int round = 1; round <= 8; round++) {
            System.out.println("Testing F" + round + " (W=32)");
            int[] state = {
                1, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0
            };
            for (int i = 0; i < round; i++) {
                Norx32.f(state);
            }
            assertArrayEquals(tracesF[round - 1], state);
        }
    }

}
