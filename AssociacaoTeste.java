/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package associacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marie
 */
public class AssociacaoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setAno(2024);
        carro.setModelo("S10");
        carro.setPlaca("AFF-0A29");
        carro.setValor(300000);
        
        Carro carro2 = new Carro();
        carro2.setAno(2020);
        carro2.setModelo("Fuca");
        carro2.setPlaca("KHH-0011");
        carro2.setValor(35000);
        
        Carro carro3 = new Carro();
        carro3.setAno(2005);
        carro3.setModelo("UNO");
        carro3.setPlaca("AAA-0011");
        carro3.setValor(25000);
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luiz Antonio");
        pessoa.setEndereco("Catanduvas");
        pessoa.setTelefone("3232-3433");
        pessoa.setCarro(carro);
        
        List<Carro> carros = new ArrayList<Carro>();
        carros.add(carro);
        carros.add(carro2);
        carros.add(carro3);
        pessoa.setCarros(carros);
       
        System.out.println("Pessoa: " +pessoa.getNome());
        System.out.println("Carro: " +pessoa.getCarro().getModelo());
        System.out.println("Carro na Lista: " 
                + "Carro 1:" +pessoa.getCarros().get(0).getModelo()
                + "Carro 2:" +pessoa.getCarros().get(1).getModelo()
                + "Carro 3:" +pessoa.getCarros().get(2).getModelo());
        
        System.out.println("-----------------------------------------");
        System.out.println("Usando for com índice do tamanho da lista");
        for (int i = 0; i < pessoa.getCarros().size(); i++) {
            System.out.println("Item " + (i + 1) + ":"
                + pessoa.getCarros().get(i).getModelo());
        }
        
        System.out.println("-------------------------------------------");
        System.out.println("Usando for percorrendo a lista");
        int i = 1;
        for (Carro carroAux : pessoa.getCarros()) {
            System.out.println("Modelo do carro " + i + ": " + carroAux.getModelo());
            i++;    
        }

    }
                    
    
}
