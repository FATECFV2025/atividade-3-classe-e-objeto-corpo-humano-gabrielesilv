package main.java;

public class App {
    public static void main(String[] args) throws Exception {
        //CorpoHumano c1 = new CorpoHumano(80, 10); //construtor para atribuir valores aos atributos
        //System.out.println(c1.getDensidade());
        
        //c1.massa = "2"; tipo errado e acesso direto ao atributo

        CorpoHumano c2 = new CorpoHumano(70, 10); 
        System.out.println(c2.getDensidade());


        c2.CalcularImc(1.75, 82);
        System.out.println(c2.getImc());

        //objetos podem ser reatribuídos a outros objetos se tiverem os mesmos métodos
        CorpoHumano c3 = new CorpoHumano(0, 0);
        c3 = c2;
        System.out.println(c3.getImc());
    }
}
