package closure;

import java.util.function.Consumer;
import java.util.function.Function;

public class Sorting {

	


}


interface Comparator {
//	public static<T, U extends Comparable<? super U>>
	<T, U> Comparator comparing(Function<T, U> f);	
}

//interface Collection<T> {
//    default void forEach(Consumer<T> action) {
//        for (T t : this)
//            action.apply(t);
//} }