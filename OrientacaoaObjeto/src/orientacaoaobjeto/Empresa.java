/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoaobjeto;

/**
 *
 * @author marie
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Empresa {

    private String nome;
    private String cnpj;
    private String endereco;
    private int numeroFuncionario;
    private double lucroBruto; //alt+insert > generator > getter and seter = serve pra incluir os métodos automaticamente
    private Date dataFundacao;

    public void setDataFundacao(String dataFundacaoStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            //convertendo string para date
            this.dataFundacao = sdf.parse(dataFundacaoStr);
        } catch (ParseException e) {
            System.out.println("Erro ao converter a data" + e.getMessage());

        }
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public double getLucroBruto() {
        return lucroBruto;
    }

    public void setLucroBruto(double lucroBruto) {
        this.lucroBruto = lucroBruto;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("Número de Funcionários: " + numeroFuncionario);
        System.out.println("Lucro Bruto: " + lucroBruto);
        System.out.println("Data da fundação: " + dataFundacao);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionarios(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

   


}
