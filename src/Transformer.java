class Transformer {

    static int numberOne;
    static int numberTwo;
    static String arithmeticSign;
    static String[] romeArabian = new String[]{"I", "II", "III", "IV", "V",
        "VI", "VII", "VIII", "IX", "X"};

    static void transformStringToArabianArithmetic() {
        String[] ppt2 = Validator.str.split(" ");
        numberOne = Integer.parseInt(ppt2[0]);
        numberTwo = Integer.parseInt(ppt2[2]);
        arithmeticSign = ppt2[1];
        Calculator.calculate();
    }

    static void transformStringToRome() {
        String[] ppt2 = Validator.str.split(" ");
        arithmeticSign = ppt2[1];
        for (int i = 0; i < romeArabian.length; i++) {
           if (romeArabian[i].equals(ppt2[0])) {
                numberOne = i + 1;
           }
           if (romeArabian[i].equals(ppt2[2])) {
               numberTwo = i + 1;
           }
        }
        Calculator.calculate();
    }
}