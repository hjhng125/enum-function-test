import java.util.function.Function;

public enum TestEnum {

  ABC((value) -> "abc" + value),
  DEF((value) -> "def" + value),
  ;

  private final Function<String, String> desc;

  TestEnum(Function<String, String> desc) {
    this.desc = desc;
  }

  public Function<String, String> getDesc() {
    return desc;
  }

  public String apply(String value) {
    return this.desc.apply(value);
  }
}
