package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsTeamName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("hello"));
    }

    @Test
    public void knowsWeather() throws Exception {
        assertThat(queryProcessor.process("what is the weather today"), containsString("sunny"));
    }

    @Test
    public void knowsMoreMath() throws Exception {
        assertThat(queryProcessor.process("what is 203 plus 204"), containsString("407"));
    }

    @Test
    public void knowsAddition() throws Exception {
        assertThat(queryProcessor.process("what is 2 plus 5"), containsString("7"));
    }

    @Test
    public void knowsMultiplication() throws Exception {
        assertThat(queryProcessor.process("what is 2 multiplied by 5"), containsString("10"));
    }

    @Test
    public void knowsMax() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 2, 5"), containsString("5"));
    }
}
