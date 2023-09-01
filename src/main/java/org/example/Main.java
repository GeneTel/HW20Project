package org.example;


import java.util.*;

import static org.example.Product.removeDuplicates;

public class Main  {
    public static void main(String[] args) {
        String input = "1, 2, 3, 4, 4, 5";
        String[] numbers = input.split(", ");
        Set<String> uniqueNumbers = new HashSet<>(Arrays.asList(numbers));
        String result = String.join(", ", uniqueNumbers);
        System.out.println(result);
    }

    {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        List<Integer> uniqueNumbers = new ArrayList<>(removeDuplicates(numbers));

        System.out.println(uniqueNumbers);
    }

    {
        Map<String, Product> toyMap = new HashMap<>();

        toyMap.put("Teddy Bear", new Product("Teddy Bear"));
        toyMap.put("Lego Set", new Product("Lego Set"));
        toyMap.put("Doll", new Product("Doll"));

        Product.printEntries(toyMap);
        Product.printKeys(toyMap);
        Product.printValues(toyMap);
    }

}

class Product {
    String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void printEntries(Map<String, Product> map) {
        for (Map.Entry<String, Product> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void printKeys(Map<String, Product> map) {
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }

    public static void printValues(Map<String, Product> map) {
        for (Product product : map.values()) {
            System.out.println(product);
        }
    }


        public static <T > Collection < T > removeDuplicates(Collection < T > collection) {
        return new HashSet<>(collection);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        System.out.print("Введіть кількість рядків: ");
        int count = scanner.nextInt();
        scanner.nextLine();  // Очищення буфера після вводу числа

        for (int i = 0; i < count; i++) {
            System.out.print("Введіть рядок #" + (i + 1) + ": ");
            strings.add(scanner.nextLine());
        }

        List<String> longestStrings = findLongestStrings(strings);
        for (String longestString : longestStrings) {
            System.out.println(longestString);
        }
    }

    public static List<String> findLongestStrings(List<String> strings) {
        List<String> longestStrings = new ArrayList<>();
        int maxLength = 0;

        for (String str : strings) {
            int length = str.length();
            if (length > maxLength) {
                maxLength = length;
                longestStrings.clear();
                longestStrings.add(str);
            } else if (length == maxLength) {
                longestStrings.add(str);
            }
        }

        return longestStrings;
    }
}



