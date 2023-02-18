package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        List<String> developersProjects = new LinkedList<>();

        for (var entry : projects.entrySet()) {

            for (String element : entry.getValue()) {

                if (element.contains(developer)) developersProjects.add(entry.getKey());
            }
        }

        developersProjects.sort(new StringLengthComparator());

        return developersProjects;
    }


public static class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {

        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 == len2) {

            return s2.compareTo(s1);
        }
            return len2 - len1;
        }
    }
}
