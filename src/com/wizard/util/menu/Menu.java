/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizard.util.menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ilichh1
 */
public class Menu {
    
    private final List<MenuEntry> menuOptions;
    private String menuName;
    private int longestMenuLabel = 0;
    
    public Menu(MenuEntry[] initialOptions, String name) {
        this.menuName = name;
        this.menuOptions = new ArrayList<>(Arrays.asList(initialOptions));
        this.determineLongestMenuLabel();
    }
    
    private void determineLongestMenuLabel() {
        for (MenuEntry menuOption : menuOptions) {
            if (menuOption.menuLabel.length() > this.longestMenuLabel)
                this.longestMenuLabel = menuOption.menuLabel.length();
        }
    }
    
    public void addMenuOption(MenuEntry newOption) {
        this.menuOptions.add(newOption);
        if(newOption.menuLabel.length() > this.longestMenuLabel)
            this.longestMenuLabel = newOption.menuLabel.length();
    }
    
    public void printInConsole() {
        int suposedFinalLength = this.longestMenuLabel + 7;
        
        System.out.println("\n======== " + this.menuName + "========\n");
        for (MenuEntry menuOption : this.menuOptions) {
            String lineToPrint = " * " + menuOption.menuLabel + " ";
            String remainingDots = "";
            for (int i = 0; i < suposedFinalLength - lineToPrint.length(); i++)
                remainingDots += ".";
            System.out.println(lineToPrint + remainingDots + " " + menuOption.menuOption + ")");
        }
    }
    
}
