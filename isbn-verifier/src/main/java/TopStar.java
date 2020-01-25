public class TopStar {
        public boolean isValid(String stringToVerify) {
            char[] chars = stringToVerify.replaceAll("[^0-9X]", "").toCharArray();
            if (chars.length != 10) { return false; }
            int sum = 0;
            int total = 0;

            for (int i = 0; i < chars.length; i++) {
                total += (i == 9 && chars[i] == 'X') ? 10 : Character.getNumericValue(chars[i]);
                sum += total;
            }

            return sum % 11 == 0;
        }
    }
