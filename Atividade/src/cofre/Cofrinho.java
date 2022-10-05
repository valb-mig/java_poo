package cofre;

import java.util.ArrayList;

public class Cofrinho {

    // Lista de Moedas / Array das moedas inseridas //

    private ArrayList<Double> listaMoedas =  new ArrayList<Double>();


    // ------- Metodos ------- //


    // - Adicionar 

    public void adicionarMoeda(double valor) {
        listaMoedas.add(valor);
    }

    // - Remover 

    public void removerMoeda(double valor) {
        listaMoedas.remove(valor);
    }

    // - Listar 

    public void listarMoedas(){

        System.out.print("\n");
        System.out.print(listaMoedas);
        System.out.print("\n");
    
    }
    
    // -  Total convertido para Real

    public double totalConvertido(){

        double total = listaMoedas.stream().mapToDouble(Double::doubleValue).sum();
        
        return total;

    }
}
