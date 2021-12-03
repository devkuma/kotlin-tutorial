import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class Foo {
    // Java이다.
    @NotNull
    Optional<String> getName() {
        return null;
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.getName().toString();
    }
}

