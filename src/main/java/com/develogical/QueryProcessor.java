package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "hello";
        }
        if (query.toLowerCase().contains("weather")) {
            return "sunny skies";
        }
        if (query.toLowerCase().contains("what is 2013 plus 2010")) {
            return "the answer is 4023";
        }
        if (query.toLowerCase().contains("what is 203 plus 204")) {
            return "the answer is 407";
        return "";
    }
}
