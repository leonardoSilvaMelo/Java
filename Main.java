
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int idade = 0;
        double base, altura, lado, diagonalMaior, diagonalMenor, baseMaior, baseMenor, raio, numeroInformado;
        double pi = 3.14;

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


        //Paralelogramo:
        System.out.println("Digite a base do Paralelogramo");
        base = entradaDeDados.nextDouble();

        System.out.println("Digite a altura do Paralelogramo");
        altura = entradaDeDados.nextDouble();

        System.out.println("A área do Paralelogramo é: " + (base * altura));


        //Triângulo:
        System.out.println("Digite a base do Triângulo");
        base = entradaDeDados.nextDouble();

        System.out.println("Digite a altura do Triângulo");
        altura = entradaDeDados.nextDouble();

        System.out.println("A área do Triângulo é: " + (base * altura)/2);


        //Círculo:
        System.out.println("Digite o ráio do Círculo");
        raio = entradaDeDados.nextDouble();

        System.out.println("A área do Círculo é: " + pi * (raio * raio));


        //TUDO TEM UMA CONDIÇÃO-----------------------

        //5 - 1,2 e 3
        System.out.println("Digite algum número:");
        numeroInformado = entradaDeDados.nextDouble();

        if ( numeroInformado < 0){
            System.out.println("O número informado é negativo!");
        } else if (numeroInformado == 0){
            System.out.println("O número informado é neutro!");
        }else {
            System.out.println("O número informado é positivo!");
        }


        //6 - Qual o maior?
        System.out.println("Digite o primeiro número:");
        double numero1 = entradaDeDados.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = entradaDeDados.nextDouble();

        System.out.println("Digite o terceiro número:");
        double numero3 = entradaDeDados.nextDouble();

        double maiorNumero = numero1;

        if (numero2 > maiorNumero){
            maiorNumero = numero2;
        }if (numero3 > maiorNumero){
            maiorNumero = numero3;
        }

        System.out.println("O maior número informado é o" + maiorNumero);


        //6.1
        System.out.println("Digite o primeiro número:");
        double valor1 = entradaDeDados.nextDouble();

        System.out.println("Digite o primeiro número:");
        double valor2 = entradaDeDados.nextDouble();

        System.out.println("Digite o primeiro número:");
        double valor3 = entradaDeDados.nextDouble();

        System.out.println("Digite o primeiro número:");
        double valor4 = entradaDeDados.nextDouble();

        double maiorValor = valor1;

        if (valor2 > maiorValor){
            maiorValor = valor2;
        }if (valor3 > maiorValor){
            maiorValor = valor3;
        }if (valor4 > maiorValor){
            maiorValor = valor4;
        }

        System.out.println("O maior número informado é o" + maiorValor);


//        //7 e 7.1 - Qual o quê?
//        System.out.println("Digite o primeiro valor:");
//        double primeiroValor = entradaDeDados.nextDouble();
//
//        System.out.println("Digite o segundo valor:");
//        double segundoValor = entradaDeDados.nextDouble();
//
//        System.out.println("Digite o terceiro valor:");
//        double terceiroValor = entradaDeDados.nextDouble();
//
//        System.out.println("Digite o quarto valor:");
//        double quartoValor = entradaDeDados.nextDouble();
//
//        System.out.println("Digite o quinto valor:");
//        double quintoValor = entradaDeDados.nextDouble();
//
//        double maiorInformado1 = primeiroValor;
//        if (segundoValor > maiorInformado1){
//            maiorInformado1 = segundoValor;
//        }if (terceiroValor > maiorInformado1){
//            maiorInformado1 = terceiroValor;
//        }if (quartoValor > maiorInformado1){
//            maiorInformado1 = quartoValor;
//        }if (quintoValor > maiorInformado1){
//            maiorInformado1 = quintoValor;
//        }
//
//        double maiorInformado2 = segundoValor;
//        if (segundoValor > maiorInformado2){
//            maiorInformado2 = segundoValor;
//        }if (terceiroValor > maiorInformado2){
//            maiorInformado2 = terceiroValor;
//        }if (quartoValor > maiorInformado2){
//            maiorInformado2 = quartoValor;
//        }if (quintoValor > maiorInformado2){
//            maiorInformado2 = quintoValor;
//        }
//
//        System.out.println("A soma dos dois maiores números são:" + (maiorInformado1 + maiorInformado2));
    }
}