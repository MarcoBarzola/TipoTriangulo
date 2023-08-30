
package com.mycompany.tipotriangulo;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class TipoTriangulo {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de a:");
        int a = scanner.nextInt();

        System.out.println("Ingrese el valor de b:");
        int b = scanner.nextInt();

        System.out.println("Ingrese el valor de c:");
        int c = scanner.nextInt();

        if (!esRangoPermitido(a) || !esRangoPermitido(b) || !esRangoPermitido(c)) {
            System.out.println("El valor no estﾃ｡ dentro del rango permitido.");
        } else if (esTriangulo(a, b, c)) {
            if (a == b && b == c) {
                System.out.println("Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("No es ningun triangulo");
        }
    }

    public static boolean esRangoPermitido(int num) {
        return num >= 1 && num <= 200;
    }

    public static boolean esTriangulo(int a, int b, int c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }
}
