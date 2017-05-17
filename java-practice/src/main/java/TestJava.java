import com.google.common.base.Strings;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by tsaba on 26/10/2015.
 */
public class TestJava {

    public static void main(String[] args) {
        File testFile = new File("/moved-example-data");
        System.out.println(testFile.isDirectory());
        System.out.println(testFile.isFile());

        testFile = new File("/example-data/textfile.txt");
        System.out.println(testFile.isDirectory());
        System.out.println(testFile.isFile());


        System.out.println("args = [" + args + "]");
        System.out.println("Strings.isNullOrEmpty() = [" + Strings.isNullOrEmpty(null) + "]");
        System.out.println("Strings.isNullOrEmpty(\"\") = [" + Strings.isNullOrEmpty("") + "]");
        System.out.println("Strings.isNullOrEmpty(\" \") = [" + Strings.isNullOrEmpty(" ") + "]");
        System.out.println("Strings.isNullOrEmpty( t ) = [" + Strings.isNullOrEmpty(" t ") + "]");

        System.out.println("Strings.isNullOrEmpty( t ) = [" + " ".isEmpty() + "]");
        System.out.println("Strings.isNullOrEmpty( t ) = [" + "".isEmpty() + "]");

        String string1 = "";
        String string2 = "\t\r\n";
        String string3 = " ";
        String string4 = null;
        String string5 = "Hi";
        System.out.println("\nString one is empty? " + StringUtils.isBlank(string1));
        System.out.println("String one is not empty? " + StringUtils.isNotBlank(string1));
        System.out.println("\nString two is empty? " + StringUtils.isBlank(string2));
        System.out.println("String two is not empty?" + StringUtils.isNotBlank(string2));
        System.out.println("\nString three is empty?" + StringUtils.isBlank(string3));
        System.out.println("String three is not empty?" + StringUtils.isNotBlank(string3));
        System.out.println("\nString four is empty?" + StringUtils.isBlank(string4));
        System.out.println("String four is not empty?" + StringUtils.isNotBlank(string4));
        System.out.println("\nString five is empty?" + StringUtils.isBlank(string5));
        System.out.println("String five is not empty?" + StringUtils.isNotBlank(string5));
    }

    private List<Integer> testStreamMap(Map<Integer, Long> mapGroup) {
        List<Integer> listMax = new ArrayList<Integer>();
        Long frequencey = 0L;
        for (Integer key : mapGroup.keySet()) {
            Long occurance = mapGroup.get(key);
            if (occurance > frequencey) {
                listMax.clear();

                listMax.add(key);
                frequencey = occurance;
            } else if (occurance == frequencey) {
                listMax.add(key);
            }
        }
        return listMax;
    }

//    private List<Integer> testStreamMapStream(Map<Integer, Long> mapGroup) {
//        List<Integer> listMax = new ArrayList<Integer>();
//        Long frequencey = 0L;
//        for (Integer key : mapGroup.keySet()) {
//            Long occurance = mapGroup.get(key);
//            if (occurance > frequencey) {
//                listMax.clear();
//                listMax.add(key);
//                frequencey = occurance;
//            } else if (occurance == frequencey) {
//                listMax.add(key);
//            }
//        }
//        final Long occurance = 0l;
//        List<Integer> intList = mapGroup.entrySet().stream().filter(map -> {
//            Long tempValue = map.getValue();
//            if (occurance > tempValue) {
//                listMax.clear();
//                listMax.add(map.getKey());
//                tempValue = occurance;
//            } else if (occurance == tempValue) {
//                listMax.add(map.getKey());
//            }
//        }).collect(Collectors.<Integer>toList());
//        return listMax;
//    }
}
