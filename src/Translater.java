class Translater {


    static void translateToRome() {
        if (Calculator.result < 1){
            System.out.println("В системе римских цифр отсутсвует значения меньше единицы");
        }

        String[] romeArabian = new String[]{" ", "I", "II", "III", "IV", "V",
                "VI", "VII", "VIII", "IX"};

        String tensRome = new String();
        int tens = Calculator.result / 10;
        int units = Calculator.result % 10;
        if (tens == 1) {
            tensRome = "X";
        } else if (tens == 2) {
            tensRome = "XX";
        } else if (tens == 3) {
            tensRome = "XXX";
        } else if (tens == 4) {
            tensRome = "XL";
        } else if (tens == 5) {
            tensRome = "L";
        } else if (tens == 6) {
            tensRome = "LX";
        } else if (tens == 7) {
            tensRome = "LXX";
        } else if (tens == 8) {
            tensRome = "LXXX";
        } else if (tens == 9) {
            tensRome = "XC";
        } else if (tens == 10) {
            tensRome = "C";
        }
        System.out.println(tensRome + romeArabian[units]);
    }
}
