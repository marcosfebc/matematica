import java.util.Scanner;

public class EquacaoReduzidaDaReta{
    public static void main(String[] args) {

        // y - y0 = m (x-x0)

        Scanner recebendo_xa = new Scanner(System.in);
        System.out.print("Informe o valor de xa:");
        double xa = recebendo_xa.nextDouble();

        Scanner recebendo_ya = new Scanner(System.in);
        System.out.print("Informe o valor de ya:");
        double ya = recebendo_ya.nextDouble();

        Scanner recebendo_xb = new Scanner(System.in);
        System.out.print("Informe o valor de xb:");
        double xb = recebendo_xb.nextDouble();
        
        Scanner recebendo_yb = new Scanner(System.in);
        System.out.print("Informe o valor de yb:");
        double yb = recebendo_yb.nextDouble();

        double valores_reduzida[] = {xa, ya, xb, yb};
        
        double y0_iniciando = valores_reduzida[1] * -1;
        double coeficente_angular = (valores_reduzida[3] + valores_reduzida[1]) / (valores_reduzida[2] + valores_reduzida[0]);
        double multiplicando_coeficiente_angular_com_xa = coeficente_angular * valores_reduzida[0];
        double coeficente_linear = multiplicando_coeficiente_angular_com_xa + (y0_iniciando * -1);

        if(coeficente_linear == 0){
            System.out.println("y = " + coeficente_angular);
        }else if(coeficente_linear < 0){
            System.out.println("y = " + coeficente_angular + "x" + " - " + coeficente_linear * -1);
        }else if(coeficente_angular == 0){
            System.out.println("O coeficiente angular não pode ser zero.");
        }else{
            System.out.println("y = " + coeficente_angular + "x" + " + " + coeficente_linear);
        }
    }
}
