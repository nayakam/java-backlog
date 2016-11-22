/**
 * Created by tsaba on 22/09/2016.
 */
public class SwitchTest {
    public static void main(String[] args) {
        String day = "SAT";
        switch (day) {

            case "MON":
                System.out.println("Monday");
                break;
            case "TUE":
                System.out.println("Tuesday");
                break;
            case "WED":
                System.out.println("Wednesday");
                break;
            case "THU":
                System.out.println("Thursday");
                break;
            case "FRI":
                System.out.println("Friday");
                break;
            case "SAT":
                System.out.println("Saturday");
                break;
            case "SUN":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
