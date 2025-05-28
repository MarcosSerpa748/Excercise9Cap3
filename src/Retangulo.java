import java.util.Scanner;
public class Retangulo {
    private double base ;
    private double altura;

    Scanner sc = new Scanner(System.in);
    public Retangulo(double base,double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void  calculoGeral(int numerosSalas){
        for (int i = 0; i <= numerosSalas ; i++) {

            System.out.println("Digite o valor da base:");
            double base = sc.nextDouble();
            System.out.println("Digite o valor da altura:");
            double altura = sc.nextDouble();

            Retangulo r1 = new Retangulo(base,altura);
            double calculo = r1.getBase()* r1.getAltura();
            System.out.println("Área:"+calculo);
        }
    }
}
