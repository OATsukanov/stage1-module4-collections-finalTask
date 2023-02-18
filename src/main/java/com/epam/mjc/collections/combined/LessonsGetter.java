package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {

        Set<String> setOfLessons = new HashSet<>();

        for (var entry: timetable.entrySet()) {

            for (String element : entry.getValue()) {

                if (!setOfLessons.contains(element)) {

                    setOfLessons.add(element);
                }
            }
        }

        return setOfLessons;
    }
}
