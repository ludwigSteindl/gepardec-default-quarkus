package org.acme;

import org.junit.jupiter.api.Test;

public class FailingTest {

    @Test
    void testThisAlwaysFails() {
        assert true;
    }
}