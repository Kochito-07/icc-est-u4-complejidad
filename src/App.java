import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int cantidadEstudiante = 1000000;
        int cantidad = 1_000_000;

        List<Estudiante> estudiantes = Generador.generarListado(cantidadEstudiante);

        for (Estudiante est : estudiantes) {
            System.out.println(est.nombre);
        }

        String nombreBuscar = "Estudiante_84";
        int intentos = 0;
        for (Estudiante est : estudiantes) {
            if(est.nombre.equals(nombreBuscar)){
                System.out.println("EXISTE");
                break;
            } else {
                intentos++;
            }
        }
        System.out.println(intentos);
        System.out.println("FIN");
    }  
}