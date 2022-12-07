import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEnumTest {

  @Test
  void apply() {
    String apply = TestEnum.ABC.apply("테스트!");

    assertEquals("abc테스트!", apply);
  }
}