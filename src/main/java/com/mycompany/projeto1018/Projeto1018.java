/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1018;
import java.util.Scanner;
public class Projeto1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int valorlido;
        valorlido = sc.nextInt();
        System.out.println(valorlido);
         int[] notas = {100, 50, 20, 10, 5, 2, 1};
        for (int nota : notas) {
            int quantidadeNotas = valorlido / nota;
            System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ",00");
            valorlido %= nota;
        }
    }
}
