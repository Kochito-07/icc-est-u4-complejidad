public class MetodoBurbuja {
    int[] arreglo;

    // Constructor vacío
    public MetodoBurbuja(int[] arreglo) {
        System.out.println("Se creó la clase MetodoBurbuja");
        // 1RA FORMA
        // INSTANCIAR CON VALOR CREADO EN CONSTRUCTOR

        // this.arreglo = new int[] { 10, 5, 8, 0, 7 };

        // 2DA FORMA
        // INSTANCIAR CON VALOR DESDE PARAMETRO
        this.arreglo = arreglo;

    }

    public void ordenarAscendente() {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                // si se cambia < por > el valor de j se va a la izquierda
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;

                }
            }
        }
    }

    public void imprimirArreglo() {
        for (int numero : arreglo) {
            System.out.print(numero + ", "); // Concatena coma con espacio
        }
        System.out.println();
    }
}
