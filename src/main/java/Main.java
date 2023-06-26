import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String [] args) {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
        list.add(new Random().nextInt(20));
        }
        list.sort(Comparator.naturalOrder());
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
            System.out.print(" ");
        }
        int min = list.get(0);
        int max = list.get(list.size()-1);
        System.out.println();
        System.out.println("Минимум равен: " + min);
        System.out.println("Максимум равен: " + max);
        int sredneeAr = 0;
        for (int i = 0; i < list.size(); i++){
            sredneeAr = sredneeAr+list.get(i);
        }
        System.out.println("Среднее арифметическое значение: " + sredneeAr/ list.size());
        System.out.println("Значение в середине: " + list.get(list.size()/2));
        list.removeIf(n -> (n%2==0));
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
            System.out.print(" ");
        }
    }
}