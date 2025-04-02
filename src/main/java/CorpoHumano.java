package main.java;

public class CorpoHumano {
    private float massa;
    private float volume;
    private float densidade; //não tem set pois vai ser utilizada apenas pra recuperar o valor da operação

    public CorpoHumano(float m, float v){
        this.massa = m;
        this.volume = v;
        densidade = m / v;
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
}
