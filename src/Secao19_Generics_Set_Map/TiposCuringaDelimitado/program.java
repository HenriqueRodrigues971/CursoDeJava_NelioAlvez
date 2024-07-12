package Secao19_Generics_Set_Map.TiposCuringaDelimitado;

import Secao19_Generics_Set_Map.TiposCuringaDelimitado.entities.Circle;
import Secao19_Generics_Set_Map.TiposCuringaDelimitado.entities.Rectangle;
import Secao19_Generics_Set_Map.TiposCuringaDelimitado.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0,2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(myShapes));
    }

    public static double totalArea(List<Shape> list){
        double sum = 0.0;
        for(Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
