package CalculadoraO;

// A linguagem java contém pacotes com classe prontas (código já escrito, uma biblioteca)

import java.io.IOException;
import java.util.Scanner;

// Declarando a Classe
public class CalculadoraO {
    // A função (Método) Principal - main
    // Void indica que este método não retornará um valor
    public static void main (String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        System.out.println("Calculador sem OO");
        String ch = " ";
        while (true){
            System.out.println("Para sair digite S ou s:  \n");
            ch = ler.next();
            if ((ch == "S") || (ch == "s"))break;


            System.out.println("Digite o Primeiro numero:  ");
            double d1 = ler.nextDouble();

            System.out.println("Digite o Segundo numero:  ");
            double d2 = ler.nextDouble();

            System.out.println("Escolha a Operacao + - * / ->");
            String op = ler.next();

            String msg = "Invalido";
            double dResultado = 0;

            switch (op){
                case "+":
                    dResultado = d1 + d2;
                    msg = "A soma e: " ;
                    break;

                case "-":
                    dResultado = d1 - d2;
                    msg = "A subtracao é:  ";
                    break;

                case "*":
                    dResultado = d1 * d2;
                    msg = "A multiplicacao e:  ";
                    break;

                case "/":
                    if (d2 != 0){
                        dResultado = d1 / d2;
                        msg = "A divisão e:  ";
                    } else {
                        dResultado = 999999999;
                        msg = "Erro de divisão por zero";
                    }
                    break;
                default:
                    msg = "Operação não Implementada...";
                    break;






            }
            System.out.println(msg + dResultado);


        }
    }

}








