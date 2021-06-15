package com.example.tddintro.resources.string_joiner;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StringJoinerTests {
    private List<String> strings;
    private StringJoiner joiner;

    @Before
    public void setUp() throws Exception {
        strings = new ArrayList<String>();
        joiner = new StringJoiner("SomeDelimiter");
    }

    @Test
    public void shouldJoinIntoAnEmptyStringWhenListIsEmpty(){
        assertThat(joiner.join(strings)).isEqualTo("");
    }

    @Test
    public void shouldJoinIntoTheStringWhenListIsOneString(){
        String aString = "A String";
        strings.add(aString);
        assertThat(joiner.join(strings)).isEqualTo(aString);
    }

    @Test
    public void shouldContainBothStringsWhenListIsTwoStrings(){
        strings.add("A");
        strings.add("B");
        assertThat(joiner.join(strings))
                .contains("A")
                .contains("B");
    }

    @Test
    public void shouldPutDelimiterBetweenStrings(){
        StringJoiner joinerWithDelimiter = new StringJoiner(",");
        strings.add("A");
        strings.add("B");
        assertThat(joinerWithDelimiter.join(strings)).isEqualTo("A,B");
    }
}
