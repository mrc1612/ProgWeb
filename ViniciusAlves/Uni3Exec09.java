import java.util.Scanner;
public class Uni3Exec09 {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);
       double volume, raio, altura;
       System.out.println("Coloque o raio e a altura respectivamente da lata de óleo");

       raio = teclado.nextDouble();

       altura = teclado.nextDouble();

       volume = ((raio*raio) * (altura * 3.14));
       System.out.println("O volume da lata de óleo é: " + volume);

       teclado.close();

    }
}