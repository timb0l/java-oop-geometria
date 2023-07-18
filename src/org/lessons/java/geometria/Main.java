package org.lessons.java.geometria;

import java.util.Scanner;

/*
* ask W/H
* Add costruttore w/ Area n Parameter
* do the square*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//ask deets
        Square square = new Square();

        System.out.println("Insert height");
            int heigthSquare = Integer.parseInt(scan.nextLine());
        System.out.println("Insert width");
            int widthSquare = Integer.parseInt(scan.nextLine());

        square.height = heigthSquare;
        square.width = widthSquare;

//print area and perimiter
        System.out.println("Area: " + square.areaSquare());
        System.out.println("Perimiter: " + square.perimiterSquare());

        scan.close();
        square.draw();
    }
}
