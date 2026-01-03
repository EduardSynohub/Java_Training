package eduard.javaBasics.externaljar;

import org.apache.commons.lang3.StringUtils;

public class Task3 {
    public static void main(String[] args) {
        String[] strings = {"Some", "text", "for", "task", "3"};
        System.out.println(stringFromArray(strings));
    }

    public static String stringFromArray(String[] str) {
        return StringUtils.join(str, " ");
    }
}
