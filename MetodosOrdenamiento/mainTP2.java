
package MetodosOrdenamiento;

/**
 * La medición de los tiempos de aplicación de ambos métodos de ordenamiento arroja que el más eficiente en
 * arreglos de gran tamaño es el método MERGESORT con un tiempo muy por debajo del otro. Por el contrario, para
 * arreglos chicos es mas eficiente el método de SELECCIÓN.
 * 
 * Eficiencia de los métodos:
 *      SELECCION: O(n^2)
 *      MERGESORT: O(n log n)
 * 
 * @author Fernanda M. Gonzalez
 */
public class mainTP2 {
	
	public static void main(String[] args) {
		
		Seleccion arrS10 = new Seleccion(10);
		Seleccion arrS100 = new Seleccion(100);
		Seleccion arrS1000 = new Seleccion(1000);
		Seleccion arrS10000 = new Seleccion(10000);
		Seleccion arrS100000 = new Seleccion(100000);
		
		Mergesort arrM10 = new Mergesort(10);
		Mergesort arrM100 = new Mergesort(100);
		Mergesort arrM1000 = new Mergesort(1000);
		Mergesort arrM10000 = new Mergesort(10000);
		Mergesort arrM100000 = new Mergesort(100000);
		
		long time_start;
		long time_end;
		
		System.out.println("TIEMPOS de Metodos de ordenamiento con un arreglo de 10 elementos"); 
		
		//System.out.println("Carga de los arreglos");
		arrS10.cargarArreglo();
		/*
		 * Clona el arreglo arrS en arrM para que los metodos ordenen los mismos valores.
		 */
		arrM10.setArreglo(arrS10.getArreglo().clone());
		
		//System.out.println("El arreglo ordenado por Seleccion");
		time_start = System.nanoTime();
		arrS10.ordenar();
		time_end = System.nanoTime();
		System.out.println("El arreglo ordenado por Seleccion tardo " + (time_end - time_start)/1000000.0 + " milisegundos.");

		//System.out.println("El arreglo ordenado por MergeSort");
		time_start = System.nanoTime();
		arrM10.ordenar();
		time_end = System.nanoTime();
		//arrM.mostrarArreglo();
		System.out.println("El arreglo ordenado por MergeSort tardo " + (time_end - time_start)/1000000.0 + " milisegundos.\n\n");
		
//--------------------------------------------------------------------------------------------------------------------------------		
		
		System.out.println("TIEMPOS de Metodos de ordenamiento con un arreglo de 100 elementos"); 
		
		//System.out.println("Carga de los arreglos");
		arrS100.cargarArreglo();
		/*
		 * Clona el arreglo arrS en arrM para que los metodos ordenen los mismos valores.
		 */
		arrM100.setArreglo(arrS100.getArreglo().clone());
		
		//System.out.println("El arreglo ordenado por Seleccion");
		time_start = System.nanoTime();
		arrS100.ordenar();
		time_end = System.nanoTime();
		System.out.println("El arreglo ordenado por Seleccion tardo " + (time_end - time_start)/1000000.0 + " milisegundos.");

		//System.out.println("El arreglo ordenado por MergeSort");
		time_start = System.nanoTime();
		arrM100.ordenar();
		time_end = System.nanoTime();
		//arrM.mostrarArreglo();
		System.out.println("El arreglo ordenado por MergeSort tardo " + (time_end - time_start)/1000000.0 + " milisegundos.\n\n");
		
//--------------------------------------------------------------------------------------------------------------------------------		

		System.out.println("TIEMPOS de Metodos de ordenamiento con un arreglo de 1000 elementos"); 
		
		//System.out.println("Carga de los arreglos");
		arrS1000.cargarArreglo();
		/*
		 * Clona el arreglo arrS en arrM para que los metodos ordenen los mismos valores.
		 */
		arrM1000.setArreglo(arrS1000.getArreglo().clone());
		
		//System.out.println("El arreglo ordenado por Seleccion");
		time_start = System.nanoTime();
		arrS1000.ordenar();
		time_end = System.nanoTime();
		System.out.println("El arreglo ordenado por Seleccion tardo " + (time_end - time_start)/1000000.0 + " milisegundos.");

		//System.out.println("El arreglo ordenado por MergeSort");
		time_start = System.nanoTime();
		arrM1000.ordenar();
		time_end = System.nanoTime();
		//arrM.mostrarArreglo();
		System.out.println("El arreglo ordenado por MergeSort tardo " + (time_end - time_start)/1000000.0 + " milisegundos.\n\n");

//--------------------------------------------------------------------------------------------------------------------------------		

		System.out.println("TIEMPOS de Metodos de ordenamiento con un arreglo de 10000 elementos"); 
		
		//System.out.println("Carga de los arreglos");
		arrS10000.cargarArreglo();
		/*
		 * Clona el arreglo arrS en arrM para que los metodos ordenen los mismos valores.
		 */
		arrM10000.setArreglo(arrS10000.getArreglo().clone());
		
		//System.out.println("El arreglo ordenado por Seleccion");
		time_start = System.nanoTime();
		arrS10000.ordenar();
		time_end = System.nanoTime();
		System.out.println("El arreglo ordenado por Seleccion tardo " + (time_end - time_start)/1000000.0 + " milisegundos.");

		//System.out.println("El arreglo ordenado por MergeSort");
		time_start = System.nanoTime();
		arrM10000.ordenar();
		time_end = System.nanoTime();
		//arrM.mostrarArreglo();
		System.out.println("El arreglo ordenado por MergeSort tardo " + (time_end - time_start)/1000000.0 + " milisegundos.\n\n");

//--------------------------------------------------------------------------------------------------------------------------------		

		System.out.println("TIEMPOS de Metodos de ordenamiento con un arreglo de 100000 elementos"); 
		
		//System.out.println("Carga de los arreglos");
		arrS100000.cargarArreglo();
		/*
		 * Clona el arreglo arrS en arrM para que los metodos ordenen los mismos valores.
		 */
		arrM100000.setArreglo(arrS100000.getArreglo().clone());
		
		//System.out.println("El arreglo ordenado por Seleccion");
		time_start = System.nanoTime();
		arrS100000.ordenar();
		time_end = System.nanoTime();
		System.out.println("El arreglo ordenado por Seleccion tardo " + (time_end - time_start)/1000000.0 + " milisegundos.");

		//System.out.println("El arreglo ordenado por MergeSort");
		time_start = System.nanoTime();
		arrM100000.ordenar();
		time_end = System.nanoTime();
		//arrM.mostrarArreglo();
		System.out.println("El arreglo ordenado por MergeSort tardo " + (time_end - time_start)/1000000.0 + " milisegundos.\n\n");
		
	}

}
