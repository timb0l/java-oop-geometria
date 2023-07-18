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
//perimiter
    int perimiterSquare(){
        return (width + height) * 2;
    }

//bonus draw
    void draw(){
        for (int i = 0; i <= width; i++){
            for (int j = 0; j <= height; j++){
                if (i == 0 || i == width-1 || j == 0 || j == height-1){
                    System.out.println("[o]");
                }
                else {
                    System.out.println(" ");
                }
            }
        }
        System.out.println();

    }

}
