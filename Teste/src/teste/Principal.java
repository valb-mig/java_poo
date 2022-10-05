package teste;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    
        double valor;

        Scanner  scan  = new Scanner(System.in);
        Cofrinho cofre = new Cofrinho();

        Real  real  = new Real();
        Euro  euro  = new Euro();
        Dolar dolar = new Dolar();

        String loop = "on";

        while(loop == "on"){

            System.out.print("\nAdicione um valor na lista\n");
            System.out.print("\nDigite 0 para sair da lista\n");

            dolar.valor = scan.nextDouble();
            
            // dolar.converter();
            cofre.adicionarMoeda(dolar.valor);

            break;
        }

        System.out.print("\n\n");
        cofre.listarMoedas();
        cofre.totalConvertido();
         
    }
    
}
