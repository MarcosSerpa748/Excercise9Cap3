package br.com.principal;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i<=10;i++){
            GarbageColector gc = new GarbageColector();
        }
        System.out.println("Instâncias:"+ GarbageColector.getInstancias());
        System.gc();
        System.out.println("Instâncias:"+ GarbageColector.getInstancias());

    }
}