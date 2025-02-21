package org.acme;


import org.junit.Test;

public class FailingTest {

    @Test
    public void thisAlwaysFails() {
        assert false;
    }
}