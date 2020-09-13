package com.kwkim.programming3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {

    public int[] solution(String[] info, String[] query) {

        Map<String, Map<String, Map<String, Map<String, List<Integer>>>>> storage = new HashMap<>();
        Arrays.stream(info)
                .map(spec -> {
                    String[] specArray = spec.split(" ");

                    String language = specArray[0];
                    String position = specArray[1];
                    String career = specArray[2];
                    String soulFood = specArray[3];
                    int score = Integer.parseInt(specArray[4]);

                    storage.put(language, )
                });


        return null;
    }
}

    /*function solution(info, query) {
        var answer = [];

    const storage = {};

        console.log(
                info.map(spec => {
            const specArray = spec.split(' ');

            const language = specArray[0];
            const position = specArray[1];
            const career = specArray[2];
            const soulFood = specArray[3];
            const score = specArray[4];

        if (storage[language][position][career][soulFood] !== undefined) {
            storage[language][position][career][soulFood].push(score);
        } else {
            storage[language][position][career][soulFood] = [score];
        }
        })
    );
        return answer;
    }*/

