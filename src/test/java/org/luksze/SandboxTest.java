package org.luksze;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;

public class SandboxTest {
    @Test
    public void assertionsExample() {
        Assertions.assertThatThrownBy(() -> {throw new IllegalStateException("abc");})
                .isInstanceOfAny(IllegalStateException.class, IOException.class)
                .isNotInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("abc");
    }

    @Test
    public void anotherAssertionsExample() {
        Assertions.assertThatCode(() -> someHarmlessMethod()).doesNotThrowAnyException();
    }

    private static void someHarmlessMethod() {

    }
}
