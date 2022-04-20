/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Anderson
 * @since 19/06/2017 - 16:07
 * @version 1.0 Beta Logan
 */
public class Calculadora {
    private String nome;
    private double nu1;
    private double nu2;
    private String op;

    public Calculadora() {
    }

    /**
     * 
     * @param nome recebe o nome
     * @param nu1 recebe o numero
     * @param nu2 recebe o numero
     * @param op recebe oq o usuario escolheu
     */
    public Calculadora(String nome, double nu1, double nu2, String op) {
        this.nome = nome;
        this.nu1 = nu1;
        this.nu2 = nu2;
        this.op = op;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNu1() {
        return nu1;
    }

    public void setNu1(double nu1) {
        this.nu1 = nu1;
    }

    public double getNu2() {
        return nu2;
    }

    public void setNu2(double nu2) {
        this.nu2 = nu2;
    }
    
    /**
     * 
     * @return  soma dois atributos
     */
    public double somar(){
        return nu1+nu2;
    }
    
    /**
     * 
     * @return subtrai dois atributos
     */
    public double subtrair(){
        return nu1-nu2;
    }
    
    /**
     * 
     * @return multiplica dois atributos 
     */
    public double multiplicar(){
        return nu1*nu2;
    }
    
    /**
     * 
     * @return dividi dois atributos
     */
    public double dividir(){
        return nu1/nu2;
    }
    
    public String verificarOp(){
        if(op.equalsIgnoreCase("somar")){
            return String.valueOf(somar());
        }else if(op.equalsIgnoreCase("subtrair")){
            return String.valueOf(subtrair());
        }else if(op.equalsIgnoreCase("multiplicar")){
            return String.valueOf(multiplicar());
        }else if(op.equalsIgnoreCase("dividir")){
            return String.valueOf(dividir());
        }else{
            return toString();
        }
    }
    
    @Override
    public String toString() {
        return "\nNome: " + nome + "\n"
                + "Numero 1: " + nu1 + "\n"
                + "Numero 2: " + nu2 + "\n"
                + "Resultado soma: " + somar() + "\n"
                + "Resultado subtrair: "+ subtrair()+"\n"
                + "Resultado multiplicar: "+multiplicar()+"\n"
                + "Resultado dividir: "+dividir();
    }
    
    
    
}
