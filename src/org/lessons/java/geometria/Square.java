package org.lessons.java.geometria;
/*
* do square
* */
public class Square {
//mesurments
    int height;
    int width;
//area
    int areaSquare(){
        return width * height;
    }
//perimeter
    int perimiterSquare(){
        return (width + height) * 2;
    }
//bonus draw
    void draw(){
        int width = this.width;
        int height = this.height
    //top
        for (int i = 0; i <= width; i++){
            System.out.println("[]");
        } System.out.println();
    //sides
        for (int i = 0; i <= height; i++) {
            for (int b = 0; b <= width; b++){
                if (i == 0  || i == height || b = 0 || b = width){
                    System.out.println("[]");
                } else{
                    System.out.println(" ");
                }
            }
        }
        System.out.println();
    //body
            /*for (int b = 0; b <= width; b++){
                System.out.println(" ");
            }
            System.out.println("[]");
        }*/
    //bottom
        /*for (int a = 0; a <= width; a++) {
            System.out.println("[]");
        }*/
    }
}
