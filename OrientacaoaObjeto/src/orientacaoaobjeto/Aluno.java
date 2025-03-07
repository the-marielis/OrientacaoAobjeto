/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoaobjeto;

/**
 *
 * @author marie
 */
public class Aluno {
    private String nomeAluno;
    private String emailAluno;
    private int cgm;
    private int cpf;
    private String curso;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public int getCgm() {
        return cgm;
    }

    public void setCgm(int cgm) {
        this.cgm = cgm;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void imprimir(){
        System.out.println("Nome do Aluno: " + nomeAluno);
        System.out.println("E-mail: " + emailAluno);
        System.out.println("CGM: " + cgm);
        System.out.println("CPF: " + cpf);
        System.out.println("Nome do Curso: " + curso);
        System.out.println("");
    }
}
