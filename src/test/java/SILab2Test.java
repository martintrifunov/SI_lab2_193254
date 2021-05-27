import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void function() {
        SILab2 multipleCondition = new SILab2();
      assertTrue(
              multipleCondition.function(List.of(-1,2,2)),
      );
    }
}