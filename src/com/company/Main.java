package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un Numero: ");
        String valor = scanner.nextLine();
        int n = Integer.parseInt(valor);
        Numero miNumero = new Numero(n);
        if (miNumero.esPar()) {
            System.out.println("Es Par");

        } else System.out.println("ES Inpar");

    }
}
