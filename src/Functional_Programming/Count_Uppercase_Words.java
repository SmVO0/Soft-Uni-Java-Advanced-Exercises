package Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Count_Uppercase_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Predicate<String> checkUpperCaseStartingWord = word -> Character.isUpperCase(word.charAt(0));
        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        words = words.stream().filter(checkUpperCaseStartingWord).collect(Collectors.toList());

        System.out.println(words.size());
        words.forEach(System.out::println);
    }
}
