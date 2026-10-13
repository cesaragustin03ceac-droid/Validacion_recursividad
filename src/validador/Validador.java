/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validador;

/**
 *
 * @author Emi
 */
public class Validador {

    // Método público (Wrapper)
    public boolean esPalindromo(String palabra) {
        // 1. Escudo protector
        if (palabra == null || palabra.isEmpty()) {
            return false;
        }
        
        // 2. Normalización
        palabra = palabra.toLowerCase().replace(" ", "");
        
        // 3. Llamada al motor recursivo
        return esPalindromoRecursivo(palabra, 0, palabra.length() - 1);
    }

    // Método privado (Recursivo)
    private boolean esPalindromoRecursivo(String palabra, int izq, int der) {
        // Caso base 2: Éxito
        if (izq >= der) {
            return true; 
        }
        // Caso base 1: Falla
        if (palabra.charAt(izq) != palabra.charAt(der)) {
            return false; 
        }
        // Paso recursivo
        return esPalindromoRecursivo(palabra, izq + 1, der - 1);
    }


    public static void main(String[] args) {
        Validador miValidador = new Validador(); 
        String palabraPrueba = "radar"; 
        String PalabraPrueba="reconocer";
        String PalabraPrueba2="perro";

        
        System.out.println(miValidador.esPalindromo(palabraPrueba));
        System.out.println(miValidador.esPalindromo(PalabraPrueba));
        System.out.println(miValidador.esPalindromo(PalabraPrueba2));


    }
}
