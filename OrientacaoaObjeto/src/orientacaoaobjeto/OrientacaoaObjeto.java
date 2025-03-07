/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orientacaoaobjeto;

/**
 *
 * @author marie
 */
public class OrientacaoaObjeto {

        public static void main(String[] args) {
              
              Empresa empresa1 = new Empresa();
              empresa1.setNome("Loja 1");
              empresa1.setCnpj("12343232");
              empresa1.setEndereco("Rua abc, 100");
              empresa1.setNumeroFuncionarios(50);
              
              String dataFundacaoStr = "23/02/2024";
              empresa1.setDataFundacao(dataFundacaoStr);
              
  	      empresa1.imprimir();
              
              /*Empresa empresa2 = new Empresa();
              empresa2.setNome("Loja 2");
              empresa2.setCnpj("12354432");
              empresa2.setEndereco("Rua abc, 200");
              empresa2.setNumeroFuncionarios(5);
              empresa2.imprimir();
   
              Empresa empresa3 = new Empresa();
              empresa3.setNome("Posto de Gasolina");
              empresa3.setCnpj("12345434");
              empresa3.setEndereco("Rua afd, 500");
              empresa3.setNumeroFuncionarios(800);
              empresa3.imprimir();
              
              Aluno aluno1 = new Aluno();
              aluno1.setNomeAluno("Maria");
              aluno1.setCgm(555555);
              aluno1.setCpf(9999999);
              aluno1.setCurso("Japonês");
              aluno1.setEmailAluno("maria@hotmail.com");
              aluno1.imprimir();*/
              
              
              

        }
}
