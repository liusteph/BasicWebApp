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
    public void knowsMath() throws Exception {
        assertThat(queryProcessor.process("what is 2013 plus 2010"), containsString("4023"));
    }

    @Test
    public void knowsMath() throws Exception {
        assertThat(queryProcessor.process("what is 203 plus 204"), containsString("407"));
    }
}
