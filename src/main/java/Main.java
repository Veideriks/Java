import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        new Main().Vvod();
        new Main().Vvod();
        pokazMatrix();
    }

    static ArrayList<String[]> outerArr = new ArrayList<String[]>();
    public static void pokazMatrix() {
        outerArr.sort(new Comparator<String[]>() {
            public int compare(String[] o1, String[] o2) {
                int r = Integer.parseInt(o1[5]) - Integer.parseInt(o2[5]);
                return r;
            }
        });
        for (int i = 0; i < outerArr.size(); i++) {
            String[] myString = new String[6];
            myString = outerArr.get(i);
            for (int j = 0; j < myString.length; j++) {
                System.out.print(myString[j]);
            }
            System.out.print("\n");
        }
    }
    public ArrayList<String[]> Dobavlenie() {
        outerArr.add(myString1);
        return outerArr;
    }

    String[] myString1 = new String[6];
    static int c = 1;
    public String[] Vvod () {
            Scanner in = new Scanner(System.in);
            for (int i = 0; i < myString1.length; i++) {
                switch (i) {
                    case 0:
                        myString1[i] = c++ + " ";
                        break;
                    case 1:
                        System.out.println("Введите вашу Фамилию");
                        myString1[i] = in.nextLine() + " ";
                        break;
                    case 2:
                        System.out.println("Введите ваше Имя");
                        myString1[i] = in.nextLine() + " ";
                        break;
                    case 3:
                        System.out.println("Введите ваше Отчество");
                        myString1[i] = in.nextLine() + " ";
                        break;
                    case 4:
                        System.out.println("Введите ваш Пол");
                        myString1[i] = in.nextLine() + " ";
                        break;
                    case 5:
                        System.out.println("Введите ваш Возраст");
                        myString1[i] = in.nextLine();
                        Dobavlenie();
                        break;
                }
            }
            return myString1;
        }
}
