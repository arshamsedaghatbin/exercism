import java.util.stream.IntStream;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        String s = stringToVerify.replaceAll("-", "");
        return s.length() == 10 && IntStream.range(0, 9).allMatch((i) -> Character.isDigit(s.charAt(i)))
                && (s.charAt(10) == 'X' || Character.isDigit(s.charAt(10)))
                && IntStream.range(0, 10).map(i -> digitValue(s.charAt(i)) * (10 - i)).sum() % 11 == 0;


    }

    private int digitValue(char charAt) {
        return (charAt == 'X') ? 10 : (charAt - '0');
    }

}
