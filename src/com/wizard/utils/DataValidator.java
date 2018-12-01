/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizard.utils;

import com.wizard.product.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *
 * @author ilichh1
 */
public class DataValidator {
    
    private static final String LOGIN = "wizard";
    private static final String PASSWORD = "toystore";
    
    public static boolean validateCredentials(String login, String password) {
        if (login.equals(LOGIN) && password.equals(PASSWORD)) {
            ConsoleUtils.printSuccessMessage("Acceso correcto.");
            return true;
        } else {
            ConsoleUtils.printErrorMessage("Acceso correcto.");
            return false;
        }
    }
    
    public static boolean validateName(String value) {
        String regex = "^[\\p{L} .'-]+$";
        return Pattern.matches(regex, value);
    }
    
    
    public static boolean validateDayOfWeek(String[] dias) {
        ArrayList<String> validDays = new ArrayList<>(Arrays.asList(new String [] {
            "DOMINGO",
            "LUNES",
            "MARTES",
            "MIERCOLES",
            "MIÉRCOLES",
            "JUEVES",
            "VIERNES",
            "SABADO",
            "SÁBADO"
        }));
        return validDays.containsAll(Arrays.asList(dias));
    }
    
    public static boolean validateToyCategory(int categoryId) {
        return categoryId < 0 || categoryId > Product.CATEGORIES.length - 1;
    }
    
}
