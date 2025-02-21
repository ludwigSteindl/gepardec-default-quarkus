package org.acme;

import org.junit.jupiter.api.Test;

class FailingTest {

    @Test
    void thisAlwaysFails() {
        assert false;
    }
}