import javafx.scene.control.TableColumn;

import javax.xml.soap.SOAPPart;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int idade = 0;
        double base, altura, lado, diagonalMaior, diagonalMenor, baseMaior, baseMenor, raio;


        System.out.println("Hello and welcome!");

        //1 - Baby Steps
        String plutao ="Plutão";
        System.out.println(plutao);


        //2 -  Hello Clarice
        Scanner entradaDeDados = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nomeUsuario = entradaDeDados.nextLine();
        System.out.println("Olá, " + nomeUsuario);


        //3 - A Bit of Information -
        System.out.println("Digite sua idade:");
        idade = entradaDeDados.nextInt();
        System.out.println("Sua idade é: " + idade);


        //4 - A Bit of Geometry

        //Retângulo:
        System.out.println("Digite a base do Retângulo: ");
        base = entradaDeDados.nextDouble();

        System.out.println("Digite a altura do Retângulo: ");
        altura = entradaDeDados.nextDouble();

        System.out.println("A área do Retângulo é: " + base * altura);

        //Quadrado:
        System.out.println("Digite o lado do Quadrado:");
        lado = entradaDeDados.nextDouble();

        System.out.println("A área do Quadrado é: " + lado * lado);

        //Losango:
        System.out.println("Digite a Diagonal Maior do Losango:");
        diagonalMaior = entradaDeDados.nextDouble();

        System.out.println("Digite a Diagonal Menor do Losango:");
        diagonalMenor = entradaDeDados.nextDouble();

        System.out.println("A área do Losango é " + (diagonalMaior * diagonalMenor)/2);


        //Trapézio:
        System.out.println("Digite a Base Maior do Trapézio:");
        baseMaior = entradaDeDados.nextDouble();

        System.out.println("Digite a Base Menor do Trapézio:");
        baseMenor = entradaDeDados.nextDouble();

        System.out.println("Digite a altura do Trapézio: ");
        altura = entradaDeDados.nextDouble();

        System.out.println("A área do Trapézio é " + (baseMaior + baseMenor) * altura/2);
    }
}