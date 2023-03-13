public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(2, 2));
        System.out.println(calc.mult(10, 0));
        System.out.println(calc.pow(2, 10));
        System.out.println(calc.sub(2, 10));
        System.out.println(calc.div(10, 2));

        Calculator calc2 = new Calculator();
        System.out.println(
                calc2.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        Ints calc3 = new IntsCalculator();
        System.out.println(calc3.sum(2, 5));
        System.out.println(calc3.mult(10, 33));
        System.out.println(calc3.pow(2, 15));
        System.out.println(calc3.sub(2, 10));
        System.out.println(calc3.div(10, 2));
    }
}
