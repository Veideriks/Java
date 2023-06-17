import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class Main {
    public static int i = randomNumbers();
    public static int n = bit();
    public static void main (String args[]){
        System.out.println(randomNumbers());
        System.out.println(bit());
        System.out.println(shortMax());
        System.out.println();
        System.out.println(shortMin());
        System.out.println();
        System.out.println(Arrays.toString(maxArray));
        System.out.println();
        System.out.println(Arrays.toString(minArray));
    }
    public static int randomNumbers(){
        int minRandom = 0;
        int maxRandom = 2000;
        int randNum = ThreadLocalRandom.current().nextInt(minRandom, maxRandom + 1);
        return randNum;
    }
    public static int bit(){
        int n = Integer.highestOneBit(i);
        return n;
    }
    static int [] maxArray = new int[Short.MAX_VALUE - i];
    static int [] minArray = new int[i - Short.MIN_VALUE];
    public static Void shortMax(){
        int j = 0;
        for (int x = i; x<=Short.MAX_VALUE; x++){
            if (x%n==0) {
                maxArray[j] = x;
//                System.out.print(x + ";");
                j++;
            }
        }
        return null;
    }
    public static Void shortMin(){
        int j = 0;
        for (int x = Short.MIN_VALUE; x<i; x++){
            if (x%n!=0){
                minArray[j] = x;
//                System.out.print(x + ";");
                j++;
            }
        }
        return null;
    }
}
