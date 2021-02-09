package com.company;
import java.util.ArrayList;
import java.util.Map;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Square> squares = new ArrayList<Square>();

        for(int idx = 0; idx < 20; idx++) {
            squares.add(new Square(Math.random()*100));
        }

        // a
        System.out.println("Zadanie a)");
        squares.stream()
                .filter(f -> f.getCircumFerence() > f.getArea())
                .forEach(System.out::println);

        System.out.println("\nZadanie b)");
        // b
        squares.stream()
                .sorted(Comparator.comparingDouble(Square::getArea))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\nZadanie c)");
        // c
        squares.stream()
                .sorted(Comparator.comparingDouble(Square::getCircumFerence).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\nZadanie d)");
        // d
        squares.stream()
                .mapToDouble(Square::getCircumFerence)
                .average()
                .ifPresent(System.out::println);

        System.out.println("\nZadanie e)");
        // e
        double sum = squares.stream()
                .mapToDouble(Square::getArea)
                .sum();
        System.out.println(sum);

        System.out.println("\nWstaw listę wszystkich figur do mapy, gdzie kluczem będzie pole figury, a wartością cały obiekt figury.");
        Map<Double, Square> squaresMap = squares.stream()
                .collect(Collectors.toMap(
                        s -> s.getArea(),
                        s -> s
                ));

        System.out.println(squaresMap);
    }
}