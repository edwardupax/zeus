package com.upax.zeus.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HashtagExtractor {

    public static List<String> extractHashtags(String text) {
        List<String> hashtags = new ArrayList<>();
        Pattern hashtagPattern = Pattern.compile("#(\\w+)");
        Matcher matcher = hashtagPattern.matcher(text);

        while (matcher.find()) {
            hashtags.add(matcher.group());
        }
        return hashtags;
    }


}
