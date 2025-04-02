package main.java;

public class CorpoHumano {
    private float massa;
    private float volume;
    private float densidade; //não tem set pois vai ser utilizada apenas pra recuperar o valor da operação
    private double altura;
    private int peso;
    private double imc;

    public CorpoHumano(float m, float v) {
        this.massa = m;
        this.volume = v;
        densidade = m/v;
    }

    public void CalcularImc(double a, int p){
        this.altura = a;
        this.peso = p;
        imc = (a*a)/p;
    }

    public float getMassa() {
        return this.massa;
    }

    public float getVolume() {
        return this.volume;
    }

    public float getDensidade() {
        return this.densidade;
    }

    public double getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public double getImc() {
        return imc;
    }

}
