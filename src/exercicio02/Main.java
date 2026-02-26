package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente paciente = new Paciente();
        double[] alvo = paciente.frequenciaAlvo();

        System.out.println("Sistema de Monitoramento - Clínica Esportiva");

        System.out.println("Digite o nome do paciente --> ");
        paciente.nome = sc.nextLine();
        System.out.println("Digite a idade do paciente --> ");
        paciente.idade = sc.nextInt();

        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Frequência máxima: " + paciente.calcularFrequenciaMaxima());
        System.out.println("Frequência alvo [ " + alvo[0] + ", " + alvo[1] + "]");



    }
}
