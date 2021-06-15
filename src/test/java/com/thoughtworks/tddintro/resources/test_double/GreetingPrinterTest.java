package com.example.tddintro.resources.test_double;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreetingPrinterTest {

    @Test
    public void shouldPrintGreeting() {
        FakePrintStream printStream = new FakePrintStream();
        GreetingPrinter greetingPrinter = new GreetingPrinter(printStream);

        greetingPrinter.printGreeting();

        assertThat(printStream.printedString()).isEqualTo("Greetings!");
    }

}