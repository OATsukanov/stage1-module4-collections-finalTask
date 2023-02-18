package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        Map<Integer, Set<String>> keysSortedByLength = new HashMap<>();

        for (var entry: sourceMap.entrySet()) {

            int keyLength = entry.getKey().length();

            if (keysSortedByLength.containsKey(keyLength)) {

                keysSortedByLength.get(keyLength).add(entry.getKey());

            } else {

                keysSortedByLength.put(keyLength, new HashSet<>());

                keysSortedByLength.get(keyLength).add(entry.getKey());
            }
        }

        return keysSortedByLength;
    }
}
