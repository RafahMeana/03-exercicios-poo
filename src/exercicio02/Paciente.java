package exercicio02;

public class Paciente {

    String nome;
    int idade;


    public int calcularFrequenciaMaxima() {
        return 220 - idade;
    }

    public double[] frequenciaAlvo() {
        double[] alvo = new double[2];
        int freqMax = calcularFrequenciaMaxima();
        alvo[0] = freqMax * 0.50;
        alvo[1] = freqMax * 0.85;
        return alvo;
    }
//
//    public double calcularAlvoMinimo() {
//        return calcularFrequenciaMaxima() * 0.50;
//    }
//
//    public double calcularAlvoMaximo() {
//        return calcularFrequenciaMaxima() * 0.85;
//    }


}