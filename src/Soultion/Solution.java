package Soultion;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public int mostWordsFound(String[] sentences) {
        int result = 0;
        String regx = "[`~!@#$%^&*()+=|{}':;,]";
        Pattern compile = Pattern.compile(regx);

        List<String[]> collect = Arrays.stream(sentences).map(it ->
                compile.matcher(it).replaceAll("").split("\\s+")
        ).collect(Collectors.toList());

        for (String sentence : sentences) {

            List<String[]> collect1 = Arrays.stream(new String[]{sentence}).map(it ->
                    compile.matcher(it).replaceAll("").split("\\s+")
            ).collect(Collectors.toList());

            Matcher matcher = compile.matcher(sentence);
            String[] split = matcher.replaceAll("").split("\\s+");


            if (split.length > result) {
                result = split.length;
            }
        }
        return result;
    }

    /**
     * String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great , thanks very much"};
     */
}
