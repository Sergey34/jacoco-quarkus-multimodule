package twer;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@QuarkusTest
class TTTTTest {
    @Inject
    TTTT tttt;

    @Test
    public void test() {
        tttt.ttt();
    }

}