package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
class FailingTest {

    @Test
    void thisAlwaysFails() {
        assert false;
    }
}