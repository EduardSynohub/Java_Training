package eduard.javaBasics.externaljar;

import org.apache.commons.lang3.StringUtils;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(toggleChar("Swap"));
    }

    public static String toggleChar(String str) {
        return StringUtils.swapCase(str);
    }
}
