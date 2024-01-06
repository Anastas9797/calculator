class Calculator {

    static int result;

    static void calculate(){
        if (Transformer.arithmeticSign.equals("+")) {
            result = Transformer.numberOne + Transformer.numberTwo;
        } else if (Transformer.arithmeticSign.equals("-")) {
            result = Transformer.numberOne - Transformer.numberTwo;
        } else if (Transformer.arithmeticSign.equals("/")) {
            result = Transformer.numberOne / Transformer.numberTwo;
        } else if (Transformer.arithmeticSign.equals("*")) {
            result = Transformer.numberOne * Transformer.numberTwo;
        }
        if (Validator.isArabian) {
            System.out.println(Calculator.result);
        } else {
            Translater.translateToRome();
        }
    }
}
