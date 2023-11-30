package adda.ejercicios;

import java.util.function.Predicate;

import org.jgrapht.Graph;

import us.lsi.graphs.views.SubGraphView;

public class Ejercicio1 {
	public static <V,E> Graph<V,E> ejercicio1(Graph<V,E> g, Predicate<V> condV, Predicate<E> condE) {
		Graph<V,E> subG = SubGraphView.of(g, condV, condE);
		return subG;
	}
}
