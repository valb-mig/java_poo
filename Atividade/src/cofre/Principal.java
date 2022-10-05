package cofre;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        Cofrinho cofre = new Cofrinho();

        double valor;

        String loop = "on"; 
        String loopMoeda = "on";

        int opcMoeda;

        Real  real  = new Real();
        Euro  euro  = new Euro();
        Dolar dolar = new Dolar();

        while(loop == "on"){

            // ----- Menu ----- //

            System.out.print("\n--------------\n   Cofrinho\n--------------\n\n");

            System.out.print("1 - Adicionar Moedas\n");
            System.out.print("2 - Remover Moedas\n");
            System.out.print("3 - Listar Moedas\n");
            System.out.print("4 - Calcular Total Convertido\n");
            System.out.print("0 - Encerrar\n");
            
            System.out.print("\n|\n-------> ");
            int opc = scan.nextInt();


            // ----- Opções ----- //

            if (opc > 4) { // Opção não existente

                System.out.print("\n! ------- Opção - inválida ------- !\n");

            }

            // 1 - Adicionar Moedas

            if (opc == 1){ 

                while(loopMoeda == "on"){

                    System.out.print("\n\n---------------------\n   Escolha a moeda\n---------------------\n\n");

                    System.out.print("1 - Real\n");
                    System.out.print("2 - Dolar\n");
                    System.out.print("3 - Euro\n");
                    System.out.print("0 - Voltar\n");

                    System.out.print("\n|\n-------> ");
                    opcMoeda = scan.nextInt();

                    // ----- Opções Moeda ----- //

                    
                    // 1 -Real

                    if (opcMoeda == 1){

                        System.out.print("\nDigitar Valor: ");
                        System.out.print("\n|\n-------> ");

                        real.valor = scan.nextDouble();
                        cofre.adicionarMoeda(real.valor);

                        double totalReal = real.converter();

                        break;

                    }

                    
                    // 2 - Dolar

                    if (opcMoeda == 2){

                        System.out.print("\nDigitar Valor: ");
                        System.out.print("\n|\n-------> ");

                        dolar.valor = scan.nextDouble();
                        cofre.adicionarMoeda(dolar.valor);

                        double totalDolar = dolar.converter();

                        break;

                    }

                    
                    // 3 - Euro

                    if (opcMoeda == 3){

                        System.out.print("\nDigitar Valor: ");
                        System.out.print("\n|\n-------> ");

                        euro.valor = scan.nextDouble();
                        cofre.adicionarMoeda(euro.valor);

                        double totalEuro = euro.converter();

                        break;

                    }

                    
                    // 0 - Voltar

                    if(opcMoeda == 0){

                        System.out.print("\n! ------- Voltando ------- !\n");
                        break;

                    }
                        
                }

            }
            
            // 2 - Remover Moedas

            if (opc == 2){ 

                while(loopMoeda == "on"){

                    System.out.print("\n\n---------------------\n   Escolha a moeda\n---------------------\n\n");

                    System.out.print("1 - Real\n");
                    System.out.print("2 - Dolar\n");
                    System.out.print("3 - Euro\n");
                    System.out.print("0 - Voltar\n");

                    System.out.print("\n\n|\n-------> ");
                    opcMoeda = scan.nextInt();

                    // ----- Opções Moeda ----- //

                    
                    // 1 -Real

                    if (opcMoeda == 1){

                        System.out.print("\nDigitar Valor: ");
                        System.out.print("\n\n|\n-------> ");

                        real.valor = scan.nextDouble();
                        cofre.removerMoeda(real.valor);

                        break;

                    }

                    
                    // 2 - Dolar

                    if (opcMoeda == 2){

                        System.out.print("\nDigitar Valor: ");
                        System.out.print("\n\n|\n-------> ");

                        dolar.valor = scan.nextDouble();
                        cofre.removerMoeda(dolar.valor);

                        dolar.info();

                        break;

                    }

                    
                    // 3 - Euro

                    if (opcMoeda == 3){

                        System.out.print("\nDigitar Valor: ");
                        System.out.print("\n\n|\n-------> ");

                        euro.valor = scan.nextDouble();
                        cofre.removerMoeda(euro.valor);

                        break;

                    }

                    
                    // 0 - Voltar

                    if(opcMoeda == 0){

                        System.out.print("\n! ------- Voltando ------- !\n");
                        break;

                    }
                        
                }

            }

            // 3 - Listar Moedas

            if (opc == 3){ 

                cofre.listarMoedas();

            }

            // 4 - Calcular Total Convertido

            if (opc == 4){ 
                
                cofre.totalConvertido();

            }

            // 0 - Encerrar

            if (opc < 1){ 

                System.out.print("\n! ------- Saindo ------- !\n");
                break;

            }
            
        }
        
    }   
    
}
