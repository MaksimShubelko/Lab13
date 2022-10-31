import java.util.Objects;

public enum Operation {
    DIVISION("/"),
    SUMMARY("+"),
    PRODUCT("*"),
    DIFFERENCE("-");

    String operation;

    Operation(String operation) {
        this.operation = operation;
    }

    public static Operation fromString(String text) {
        for (Operation b : Operation.values()) {
            if (Objects.equals(b.operation, text)) {
                return b;
            }
        }
        return null;
    }
}
