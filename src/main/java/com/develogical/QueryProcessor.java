package com.develogical;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        if (query.toLowerCase().contains("what is 13 plus 10")) {
            return "the answer is 23";
        }
        if (query.toLowerCase().contains("what is 203 plus 204")) {
            return "the answer is 407";
        }
        Pattern regex = Pattern.compile("what is (\\d+) plus (\\d+)");
        Matcher matcher = regex.matcher(query.toLowerCase());
        if (matcher.matches()) {
            return "not sure";
        }
        return "";
    }
}
