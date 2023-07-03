package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    int commaSemi(String str) {
        // 리팩토링 예정 깊이 1 else 사용 x
        String[] strArr = str.trim().split(",|:");

        int result = 0;

        if (strArr[0] == null || strArr[0].equals("")) {
            return result;
        }

        for (int i = 0; i < strArr.length; i++) {

            result += Integer.parseInt(strArr[i]);

        }

        if (result < 0) {
            throw new RuntimeException();
        }

        return result;
    }

    int customPattern(String str) {
        // 리팩토링 예정 깊이 1 else 사용 x
        Pattern pattern = Pattern.compile("//(.)\\n(.*)");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {

            String[] strArr = matcher.group(2).split(matcher.group(1));

            int result = 0;

            if (strArr[0] == null || strArr[0].equals("")) {
                return result;
            }

            for (int i = 0; i < strArr.length; i++) {
                result += Integer.parseInt(strArr[i]);

            }

            if (result < 0) {
                throw new RuntimeException();
            }

            return result;
        }else {
            throw new RuntimeException();
        }

    }
}
