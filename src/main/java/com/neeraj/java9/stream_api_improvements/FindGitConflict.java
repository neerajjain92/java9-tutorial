package com.neeraj.java9.stream_api_improvements;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Utility class to find out the git conflict in a file.
 * with the help of
 */
public class FindGitConflict {
    public static void main(String[] args) {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            Files.lines(Paths.get(classLoader.getResource("git-conflict.html").toURI()))
                    .dropWhile(line -> !line.contains("<<<<<<"))
                    .skip(1)
                    .takeWhile(line -> !line.contains(">>>>>>"))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
