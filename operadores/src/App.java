public class App {
    public static void main(String[] args) throws Exception {
        int numero1=1;
        int numero2=2;
    System.out.println("O número 1 é igual ao número 2: "+(numero1==numero2?"Sim":"Não"));
    System.out.println( "O número 1 é diferente do número 2: "+(numero1!=numero2?"Sim":"Não"));
    System.out.println("O número 1 é menor que o número 2: "+(numero1<numero2?"Sim":"Não"));
    System.out.println("O número 1 é menor ou igual ao número 2: "+(numero1<=numero2?"Sim":"Não"));
    System.out.println("O número 1 é maior que o número 2: "+(numero1>numero2?"Sim":"Não"));
    System.out.println("O número 1 é maior ou igual ao número 2: "  +(numero1>=numero2?"Sim":"Não"));
    System.out.println(numero1++);
    System.out.println(++numero1);
    System.out.println(numero1--);
    System.out.println(--numero1);
    System.out.println(numero1+numero2);
    System.out.println(numero1-numero2);
    System.out.println(numero1*numero2);
    System.out.println(numero1/numero2);
    System.out.println(numero1%numero2);
    System.out.println((numero1==1&&numero2==2?"Sim":"Não"));
    System.out.println((numero1==1||numero2==2?"Sim":"Não"));
}
}