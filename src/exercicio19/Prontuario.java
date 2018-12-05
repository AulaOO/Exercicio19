/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio19;

/**
 *
 * @author Luis Guilherme
 */
public class Prontuario {
    private String nome;
    private String dataDeNascimento;
    private double peso;
    private double altura;

    public Prontuario() {
    }

    public Prontuario(String nome, String dataDeNascimento, double peso, double altura) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public String imprimeProntuario(){
        String retorno = "Nome: " + nome + "\nData de nascimento: " + dataDeNascimento + "\nPeso: " + peso + "\nAltura: " + altura;
        return retorno;
    }
    
    public double calculaIMC(){
        return peso/(altura*altura);
    }
    
    public String preDiagnosticar(){
        String retorno = null;
        if(calculaIMC() < 18.5){
            retorno = "Voce está abaixo do peso ideal";
        }
        else if((calculaIMC() > 18.5) && (calculaIMC() < 24.9)){
            retorno = "Voce está no seu peso ideal";
        }
        else if((calculaIMC() > 25) && (calculaIMC() < 29.9)){
            retorno = "Você está com sobrepeso";
        }
        else if((calculaIMC() > 30) && (calculaIMC() < 34)){
            retorno = "Obesidade Grau I";
        }
        else if((calculaIMC() > 35) && (calculaIMC() < 39.9)){
            retorno = "Obesidade Grau II";
        }
        else if(calculaIMC() > 40){
            retorno = "Obesidade Mórbida";
        }
        return retorno;
    }
}
