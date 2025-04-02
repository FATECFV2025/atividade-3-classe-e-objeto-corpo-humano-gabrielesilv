package main.java;

public class App {
    public static void main(String[] args) throws Exception {
        //CorpoHumano c1 = new CorpoHumano(80, 10); //construtor para atribuir valores aos atributos
        //System.out.println(c1.getDensidade());
        
        //c1.massa = "2";

        CorpoHumano c2 = new CorpoHumano(70, 10); 
        System.out.println(c2.getDensidade());


        c2.CalcularImc(1.60, 55);
        System.out.println(c2.getImc());

    }
}
