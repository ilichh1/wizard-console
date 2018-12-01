package com.wizard.utils;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilichh1
 */
public class ConsoleUtils {
    
    private static final Scanner KEYBOARD_READER = new Scanner(System.in);
    
    public static char askForCharacter() {
        return KEYBOARD_READER.nextLine().charAt(0);
    }
    
    public static void printErrorMessage(String message) {
        System.out.println(generateErrorMessage(message));
    }
    
    public static void printSuccessMessage(String message) {
        System.out.println(generateSuccessMessage(message));
    }
    
    private static String generateMessage (String message, int horizontalPadding, int verticalPadding, String borderChar, String prefix) {
        // TODO: Generar mensaje para los demas tipos de mensaje como:
        // Error, Advertencia y Exito
        int espacioEnBlanco = horizontalPadding;
        int lineasDeEspacio = verticalPadding;
        String caracterDeRelleno = borderChar;
        
        // La variable 'espacioEnBlanco' se multiplica por dos por que se debe
        // tener relleno a la izquierda y derecha del mensaje (dos veces)
        int largoHorizontalDelContenido = (espacioEnBlanco * 2) + message.length() + prefix.length() + 2;
        
        String lineasVerticales = "";
        
        // La constante de '2' es para las esquinas del rectangulo
        for (int i = 0; i < largoHorizontalDelContenido + 2; i++) {
            lineasVerticales += caracterDeRelleno;
        }
        
        String lineaDeSaltos = caracterDeRelleno;
        for (int i = 0; i < largoHorizontalDelContenido; i++) {
            lineaDeSaltos += " ";
        }
        lineaDeSaltos += caracterDeRelleno;
        
        String rellenoHorizontal = "";
        for (int i = 0; i < espacioEnBlanco; i++) rellenoHorizontal += " ";
        
        // El verdadero contenido del mensaje a imprimir
        String rellenoVertical = "";
        for (int i = 0; i < lineasDeEspacio; i++) {
            rellenoVertical += "\n" + lineaDeSaltos;
        }
        
        // Linea que contendrá el texto del mensaje
        String lineaDelMensaje =
                caracterDeRelleno
                + rellenoHorizontal
                + prefix + ": " + message
                + rellenoHorizontal
                + caracterDeRelleno;
        
        return  lineasVerticales
                + rellenoVertical
                + "\n" + lineaDelMensaje
                + rellenoVertical
                + "\n" + lineasVerticales;
    }
    
    private static String generateErrorMessage (String mensaje) {
        // Más espacio y todo el texto en mayusculas para llamar más la atención
        return generateMessage(mensaje.toUpperCase(), 4, 2, "#", "ERROR");
    }
    
    private static String generateSuccessMessage (String mensaje) {
        // El texto normal y un cuadro reducido para notificar una operación exitosa
        return generateMessage(mensaje, 5, 1, "*", "Éxito");
    }
   
    
    
}
