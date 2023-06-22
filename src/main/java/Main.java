public class Main {
    public static void main(String [] args) {
        System.out.println();
        System.out.println("select * from students where " + domashka1());
        System.out.println();
        System.out.println(domashka2());
    }
    static StringBuilder dz = new StringBuilder("Name:Ivanov, Country:Russia, City:Moscow, Age:Null");
    static String result = "0";
    public static String domashka1() {
        int res = dz.indexOf("Age:Null");
        for (int i = 0; i < dz.length(); i++) {
            if (i < res-2) {
                if (dz.charAt(i) == ':'){
                    dz.setCharAt(i,'=');
                }
            }
            else {
                dz.delete(i,dz.length());
            }
        }
        result = dz.toString();
        return result;
    }

    static String[] fam = {"Иванов", "Петрова", "Краснов"};
    static String[] ocenka = {"5", "4", "5"};
    static String[] predmet = {"Математика", "Информатика", "Физика"};
    static StringBuilder dz2 = new StringBuilder ("Студент x получил y по предмету z");

    public static Void domashka2() {
        result = dz2.toString();
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < dz2.length(); i++) {
                if (dz2.charAt(i) == 'x') {
                    dz2.delete(i, i+1);
                    dz2.insert(i, fam[j]);
                } else if (dz2.charAt(i) == 'y') {
                    dz2.delete(i, i+1);
                    dz2.insert(i, ocenka[j]);
                } else if (dz2.charAt(i) == 'z') {
                    dz2.delete(i, i+1);
                    dz2.insert(i, predmet[j]);
                    System.out.println(dz2);
                    dz2 = new StringBuilder(result);
                }
            }
        }
        return null;
    }
}