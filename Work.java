package javaadvanced._3;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


    /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new list of unique items
     *
     *   You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));
        Set<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);


        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     */
    private static void exercise2() {
        private static Set<String> toSet(Collection<String> collection) {
            return new HashSet<>(collection);
        }

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        // toSet(list); <-- uncomment
        // toSet(set); <-- uncomment
    }

    List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
    Set<String> set1 = toSet(list);
System.out.println(set1); // Output: [orange, banana, apple, kiwi]

    Set<String> set2 = Set.of("apple", "banana");
    Set<String> set3 = toSet(set2);
System.out.println(set3); // Output: [banana, apple]



    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        private static void exercise3() {
            String str = "the fox and the lazy dog saw another fox with another not lazy dog";
            List<String> words = Arrays.asList(str.split(" "));
            Map<String, Integer> wordCount = new HashMap<>();

            for (String word : words) {
                int count = wordCount.getOrDefault(word, 0);
                wordCount.put(word, count + 1);
            }

            // Print the word counts
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer: To store students in order of their arrival you have to write a List that maintains the insertion order of elements
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: to store students in a class and their grades you have to use a Map.
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: List
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer: Map
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer:List
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer:Map
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer:Map
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer:Map
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer:Map
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer:List
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer:Map
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer:Map
     */

}
