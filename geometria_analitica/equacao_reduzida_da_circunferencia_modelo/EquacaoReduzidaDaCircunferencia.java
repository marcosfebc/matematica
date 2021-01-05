import java.util.Scanner;

public class EquacaoReduzidaDaCircunferencia{
    public static void main(String[] args) {

        // (x-a)² + (y-b)² = r² 

        Scanner recebendo_a = new Scanner(System.in);
        System.out.print("Informe o valor de a:");
        double a = recebendo_a.nextDouble();

        Scanner recebendo_b = new Scanner(System.in);
        System.out.print("Informe o valor de b:");
        double b = recebendo_b.nextDouble();

        Scanner recebendo_raio = new Scanner(System.in);
        System.out.print("Informe o valor do raio:");
        double raio = recebendo_raio.nextDouble();

        double an = a * -1;
        double bn = b * -1;

        if(raio <= 0){
            System.out.println("O raio tem que ser maior que zero!");
        }else if(a < 0){
            System.out.println("(x + " + an + ")^2" + " " + "+" + " " + "(y - " + b + ")^2" + " " + "=" + " " + Math.pow(raio, 2));
        }else if(b < 0){
            System.out.println("(x - " + a + ")^2" + " " + "+" + " " + "(y + " + bn + ")^2" + " " + "=" + " " + Math.pow(raio, 2));
        }else if(a < 0 || b < 0){
            System.out.println("(x + " + an + ")^2" + " " + "+" + " " + "(y + " + bn + ")^2" + " " + "=" + " " + Math.pow(raio, 2));
        }else{
            System.out.println("(x - " + a + ")^2" + " " + "+" + " " + "(y - " + b + ")^2" + " " + "=" + " " + Math.pow(raio, 2));
        }
    }
}    
