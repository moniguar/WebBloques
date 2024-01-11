/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author moniguar
 */
import java.util.HashSet;
import java.util.Set;

public class BloquesABC {

   // Colección de bloques
    private static final String[] bloques = {
            "BO", "XK", "DQ", "CP", "NA", "GT", "RE", "TG", "QD", "FS",
            "HU", "VI", "AT", "OB", "ER", "FS", "LY", "PC", "ZM", "JW"
    };

     public static boolean puedo_obtener_palabra(String palabra) {
        palabra = palabra.toUpperCase(); // Convertir la palabra a mayúsculas
        Set<Character> bloquesUsados = new HashSet<>();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            boolean bloqueEncontrado = false;

            // Buscar el bloque que contiene la letra
            for (String bloque : bloques) {
                char lado1 = bloque.charAt(0);
                char lado2 = bloque.charAt(1);

                if (!bloquesUsados.contains(lado1) && (letra == lado1 || letra == lado2)) {
                    bloquesUsados.add(lado1);
                    bloqueEncontrado = true;
                    break;
                } else if (!bloquesUsados.contains(lado2) && (letra == lado2 || letra == lado1)) {
                    bloquesUsados.add(lado2);
                    bloqueEncontrado = true;
                    break;
                }
            }

            if (!bloqueEncontrado) {
                // Si no se encuentra un bloque con la letra, no se puede obtener la palabra
                return false;
            }
        }

        // Si se llega hasta aquí, significa que se pueden usar todos los bloques para formar la palabra
        return true;
    }

  
}