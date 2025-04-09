package main.java;

public class CorpoHumano {
    private float massa;
    private float volume;
    private float densidade; //não tem set pois vai ser utilizada apenas pra recuperar o valor da operação
    //ou private float massa, volume, densidade;
    private double altura;
    private int peso;
    private double imc;

    //construtor
    public CorpoHumano(float m, float v) {
        this.massa = m;
        this.volume = v;
        calcularDensidade(); //chamada do método que contém o cálculo
        //a densidade será alterada assim que tiver os valores de m (massa) e v (volume)
    }

    //método para calcular a densidade
    private void calcularDensidade(){
        if (massa > 0 && volume > 0){
            this.densidade = this.massa/this.volume;
        }
    }

    //construtor para calcular o IMC
    public void CalcularImc(double a, int p){
        this.altura = a;
        this.peso = p;
        this.imc = p/(a*a);
    }

    //utilizando set para alterar valor do atributo massa
    //void: quando utilizado não é necessário return
    // public void setMassa(){
    // }

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
