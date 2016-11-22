/**
 * <p>Title: </p>
 *
 * <p>Description: Created by tsaba on 15/11/2016.</p>
 */
public class Test {

    int x = 5;

    static int count = 10;

    public void call() {
        int count = 5;
        System.out.println(this.count);
    }

    public static void main(String[] args) {
        byte arr[] = new byte[]{2, 3, 4, 5};
        for (final int i : getCharArray(arr)) {
            System.out.println( i + " ");
        }
    }

    static char[] getCharArray(byte[] arr) {
        char[] carr = new char[4];
        int i = 0;
        for (byte c : arr) {
            System.out.println("c" +c);
            carr[i] = (char) ++c;
            i++;
        }
        return carr;
    }

}
