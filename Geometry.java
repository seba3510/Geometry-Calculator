package leetCode;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Geometry {

	public static double radius;  // radio del circulo

	public static double length ;  // largo de rectangilo
	public static double width ;  // ancho del rectangulo

	public static double base ; // base del triangulo
	public static double height ;  // altura del triangulo


	public static double CircleArea() {

		double area = 0 ; 

		////////////////////////////
		//
		//
		//		INPUT
		//
		//
		//////////////////////////////
		DecimalFormat deci = new DecimalFormat("##.##") ; 

		Scanner input = new Scanner(System.in); 



		System.out.print("Enter the radius: ");
		Geometry.radius = input.nextDouble() ; 

		if(Geometry.radius < 0) {

			System.err.println("ERROR!!");

			System.exit(0);


		} // if




		area = Math.PI * (Math.pow(Geometry.radius, 2) ) ; 

		System.out.println("The area of the circle is: "+ deci.format(area));

		return area ; 


	} // CircleArea


	public static double RectangleArea() {

		double area = 0 ; 

		////////////////////////////
		//
		//
		//		INPUT
		//
		//
		//////////////////////////////

		Scanner input = new Scanner(System.in); 

		System.out.print("Enter the length of the rectangle: ");
		Geometry.length = input.nextDouble() ; 

		System.out.print("Enter the width of the rectangle: ");
		Geometry.width = input.nextDouble() ; 

		if(Geometry.length < 0|| Geometry.width < 0) {

			System.err.println("ERROR!!");

			System.exit(0);


		} // if

		area = Geometry.length * Geometry.width ; 

		System.out.println("The area of the rectangle is: "+ area);

		return area ; 



	} // RectangleArea

	public static double TriangleArea() {

		double area = 0 ; 
		////////////////////////////
		//
		//
		//		INPUT
		//
		//
		//////////////////////////////

		Scanner input = new Scanner(System.in); 




		System.out.print("Enter the base: ");
		Geometry.base = input.nextDouble() ;


		System.out.print("Enter the height: ");
		Geometry.height = input.nextDouble() ; 

		if(Geometry.base < 0 || Geometry.height < 0) {

			System.err.println("ERROR!!");

			System.exit(0);


		} // if

		area = (Geometry.base * Geometry.height) * 0.5 ; 

		System.out.print("The area of the triangle is: "+ Math.round(area));

		return area ; 


	} // TriangleArea

} // Class
