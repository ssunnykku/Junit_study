package study.testCode.exercise;

public class PasswordMeter {
    public PasswordStrength meter(String pw) {
        passwordEmptyException(pw);
        int metCount = calculateMetCount(pw);

        if(metCount == 1 || metCount == 0) {
            return PasswordStrength.WEAK;
        }
        if(metCount == 2) {
            return PasswordStrength.NORMAL;
        }
        return PasswordStrength.STRONG;
    }

    private int calculateMetCount(String pw) {
        int metCount = 0;
        if(isLengthEight(pw)) metCount++;
        if(containsUppercase(pw)) metCount++;
        if(containsDigit(pw)) metCount++;
        return metCount;
    }

    private static void passwordEmptyException(String pw) {
        if (pw == null || pw.isEmpty())
            throw new IllegalArgumentException();
    }

    private static boolean isLengthEight(String pw) {
        return pw.length() >= 8;
    }


    private static boolean containsUppercase(String pw) {
        for (char ch : pw.toCharArray()) {
            if(ch >= 65 && ch <= 90) {
                return true;
            }
        }
        return false;
    }

    private boolean containsDigit(String pw) {
        for (char ch : pw.toCharArray()) {
            if(ch >= '0' && ch <= '9') {
                return true;
            }
        }
        return false;
    }
}
