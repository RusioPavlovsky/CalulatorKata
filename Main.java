import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolens boolens = new Boolens();
        Calculation calculation = new Calculation();
        Converter converter = new Converter();

        Scanner scanner = new Scanner(System.in);
        String exp = scanner.nextLine();
        if(boolens.isThereAnyActions(exp)) throw new NumberFormatException("Выражение не содержит знаков операций");
        String[] operands = exp.split("\\+|-|\\*|/");
        if(boolens.howManyElementsOfArray(operands))throw new NumberFormatException("Неправильный формат выражения");
        if(boolens.isRoman(exp)== boolens.isArabian(exp))throw new NumberFormatException("Числа в разных системах счисления");

        int a,b,result;

        if(boolens.isRoman(operands[0])){
            char[] x = operands[0].toCharArray();
            char[] y = operands[1].toCharArray();
            a = converter.romanToArabian(operands[0]);
            b = converter.romanToArabian(operands[1]);
        } else {

            a = Integer.parseInt(operands[0]);
            b = Integer.parseInt(operands[1]);
        }

        if (boolens.numbersFromZeroToTen(a,b)) throw new NumberFormatException("Введите числа от 0 до 10");

        result = calculation.calculation(exp,a,b);
        if (boolens.isRoman(exp) && result<=0){
            throw new NumberFormatException("Результат для римских чисел не может быть меньше или равен 0");}
        if (boolens.isRoman(exp)){
            System.out.println(converter.arabianToRoman(result));}
        else System.out.println(result);
    }
}