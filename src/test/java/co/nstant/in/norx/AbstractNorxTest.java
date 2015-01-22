package co.nstant.in.norx;

import org.junit.Test;

public abstract class AbstractNorxTest<T> {

    protected abstract T[] getTraceG(int index);

    protected abstract void testG(int index);

    @Test
    public void testG0() {
        testG(0);
    }

    @Test
    public void testG1() {
        testG(1);
    }

    @Test
    public void testG2() {
        testG(2);
    }

    @Test
    public void testG3() {
        testG(3);
    }

    @Test
    public void testG4() {
        testG(4);
    }

    @Test
    public void testG5() {
        testG(5);
    }

    @Test
    public void testG6() {
        testG(6);
    }

    @Test
    public void testG7() {
        testG(7);
    }

    @Test
    public void testG8() {
        testG(8);
    }

    @Test
    public void testG9() {
        testG(9);
    }

    @Test
    public void testG10() {
        testG(10);
    }

}
