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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prontuario prontuario1 = new Prontuario("Ana", "12/04/1987", 45, 1.70);
        Prontuario prontuario2 = new Prontuario("Joana", "05/10/2007", 76, 1.50);
        Prontuario prontuario3 = new Prontuario("Marcelo", "01/02/2000", 34, 1.20);
        Prontuario prontuario4 = new Prontuario("Luis", "15/10/1989", 45, 1.47);
        System.out.println("Informaçoes sobre o paciente: \n" + prontuario1.imprimeProntuario() + "\n" + prontuario1.preDiagnosticar() + "\n");
        System.out.println("Informaçoes sobre o paciente: \n" + prontuario2.imprimeProntuario() + "\n" + prontuario2.preDiagnosticar() + "\n");
        System.out.println("Informaçoes sobre o paciente: \n" + prontuario3.imprimeProntuario() + "\n" + prontuario3.preDiagnosticar() + "\n");
        System.out.println("Informaçoes sobre o paciente: \n" + prontuario4.imprimeProntuario() + "\n" + prontuario4.preDiagnosticar() + "\n");
    }
    
}
