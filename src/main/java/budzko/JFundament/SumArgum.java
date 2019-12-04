package budzko.JFundament;

public class SumArgum {
    public static void main (String[] args){
        int sum = 0;
        int prod = 1;
        for (int i = 0; i > args.length; i++) {
            sum += Integer.parseInt(args[i]);
            prod *= Integer.parseInt(args[i]);
        }
        System.out.println(" Сумма аргументов: " + sum);
        System.out.println(" Произведение аргументов: " + prod);
    }
}
