package bulkops;

import java.util.ArrayList;
import java.util.List;

import closure.Shape;

public class BulkOPs {
	public static void main(String[] args){
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Shape("RED"));
		shapes.add(new Shape("YELLOW"));
		shapes.add(new Shape(null));
		shapes.add(new Shape("RED"));
		shapes.add(new Shape("GREEN"));
		
		/*
		 * External Iteration:
		 * - loop is inherently sequential
		 * - client has to manage iteration
		 *   
		 */
		for(Shape s: shapes) {
			if (s.getColor() == "RED")
				s.setColor("BLUE");
		}
		
		System.out.println(shapes.get(0).toString());
		System.out.println(shapes.get(1).toString());
		System.out.println(shapes.get(2).toString());
		System.out.println(shapes.get(3).toString());
		System.out.println(shapes.get(4).toString());
		
		
		/*
		 * Internal Iteration
		 * - library is in control
		 * - library free to use parallelism, out-of-order execution, laziness
		 * - client passes behavior (lambda) into the API as data
		 */
		shapes.forEach(s -> {
			if (s.getColor() == "WHITE")
				s.setColor("BLUE");
		});
		
		System.out.println(shapes.get(0).toString());
		System.out.println(shapes.get(1).toString());
		System.out.println(shapes.get(2).toString());
		System.out.println(shapes.get(3).toString());
		System.out.println(shapes.get(4).toString());
		
		/*
		 * Streams framework (java.util.stream) for aggregated operations
		 * - make the solution close to question statements
		 */
		shapes.stream()
		.filter(s -> s.getColor() == "BLUE")
		.forEach(s -> {s.setColor("CYAN");});
		
		shapes.stream().forEach(s -> {System.out.println(s.getColor());});
		
		shapes.stream().forEach(s -> {System.out.println(s.toString());});
		
		shapes.stream().filter(s -> s.getColor() == "CYAN").forEach(s -> {s.setShape("hexagon");});
		
		shapes.stream().forEach(s -> {System.out.println(s.toString());});
		
	}
}

