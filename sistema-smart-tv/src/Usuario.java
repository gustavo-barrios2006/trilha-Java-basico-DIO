public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();
        System.out.println("A SmartTV está ligada: "+(smartTV.ligada?"Sim":"Não"));
        System.out.println("O volume da SmartTV é: "+smartTV.volume);
        System.out.println("O canal da SmartTV é: "+smartTV.canal);
        smartTV.ligar();
        System.out.println("Novo estado da SmartTV: ");
        System.out.println("A SmartTV está ligada: "+(smartTV.ligada?"Sim":"Não"));
        smartTV.desligar();
        System.out.println("Novo estado da SmartTV: ");
        System.out.println("A SmartTV está ligada: "+(smartTV.ligada?"Sim":"Não"));
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Canal atual antes da mudança: "+smartTV.canal);
        smartTV.mudarCanal(15);
        System.out.println("Canal atual após a mudança: "+smartTV.canal);
    }
}