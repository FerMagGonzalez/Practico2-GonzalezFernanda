
package MetodosOrdenamiento;

/**
 * @author Fernanda M. Gonzalez
 */
public class Seleccion {
	
	private int[] arreglo;

	/**
	 * Constructor de la clase.
	 * @param max
	 */
	public Seleccion(int max) {
		this.arreglo = new int[max];
	}
	
	/**
	 * Devuelve el arreglo.
	 * @return arreglo
	 */
	public int[] getArreglo() {
		return arreglo;
	}
	
	/**
	 * Carga el arreglo con valores aleatorios.
	 */
	public void cargarArreglo(){
		for (int i=0; i< arreglo.length; i++){
			arreglo[i] = (int) (Math.random()*1000)+1;
		}
	}
	
	/**
	 * Método de ordenamiento por Selección.
	 */
	public void ordenar(){
		for (int i=0; i < this.arreglo.length; i++){
			int j = i;
			for (int k=i+1; k < this.arreglo.length; k++){
				if (this.arreglo[k] < this.arreglo[j]){
					j = k;
				}
			}
			int aux = this.arreglo[i];
			this.arreglo[i] = this.arreglo[j];
			this.arreglo[j] = aux;
		}
	}
	
	/*
	public void mostrarArreglo(){
		for (int i=0; i < arreglo.length; i++){
			System.out.println(i+1 + " " + arreglo[i]);
		}
	}*/
}
