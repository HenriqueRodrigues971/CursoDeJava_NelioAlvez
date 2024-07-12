package Secao18_Interfaces.HerdarvsCumprirContrato.model;

import Secao18_Interfaces.HerdarvsCumprirContrato.model.entities.AbstractShape;
import Secao18_Interfaces.HerdarvsCumprirContrato.model.entities.Circle;
import Secao18_Interfaces.HerdarvsCumprirContrato.model.entities.Rectangle;
import Secao18_Interfaces.HerdarvsCumprirContrato.model.enums.Color;

public class program {
 public static void main(String[] args) {
	AbstractShape s1 = new Circle(Color.BLACK, 2.0);
	AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
	
	System.out.println("Circle color: "+ s1.getColor());
	System.out.println("Circle area: "+ String.format("%.3f", s1.area()));
	System.out.println("Circle color: "+ s2.getColor());
	System.out.println("Circle area: "+ String.format("%.3f", s2.area()));
 }
}
