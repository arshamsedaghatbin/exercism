class Hamming {

    private String leftStrand;
    private String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        validateConstructorInput(leftStrand, rightStrand);
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    private void validateConstructorInput(String leftStrand, String rightStrand) {
        if (leftStrand == null || (leftStrand .equals("") && !rightStrand.equals("")) ) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if (rightStrand == null || (rightStrand.equals("") && !leftStrand .equals(""))) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {
        int distance = 0;
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }


}
