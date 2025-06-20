import java.util.ArrayList;

/**
 * Clase que gestiona una lista de alumnos para una asignatura.
 */
public class Asignatura {
    /**
     * Lista de alumnos inscritos en la asignatura.
     */
    static ArrayList<Alumno> lista = new ArrayList<>();

    /**
     * Muestra por pantalla la lista de alumnos y sus notas.
     */
    public void mostrarAlumnos() {
        System.out.println(Textos.ENCABEZADO);
        System.out.println(Textos.SEPARADOR);
        for (int i = 0; i < lista.size(); i++) {
            Alumno a = lista.get(i);
            System.out.println(a.getNombre() + "\t" +
                String.format("%.1f", a.getNota1()) + "\t" +
                String.format("%.1f", a.getNota2()) + "\t" +
                String.format("%.1f", a.getNota3()) + "\t" +
                String.format("%.1f", a.promedio()));
        }
    }

    /**
     * Calcula el promedio general de todos los alumnos.
     * @return Promedio general del grupo.
     */
    public double promedioGeneral() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i).promedio();
        }
        return suma / lista.size();
    }

    /**
     * Da de alta un nuevo alumno en la asignatura.
     * @param nombre Nombre del alumno.
     * @param n1 Nota 1.
     * @param n2 Nota 2.
     * @param n3 Nota 3.
     * @return El objeto Alumno creado.
     */
    public Alumno darAltaAlumno(String nombre, double n1, double n2, double n3) {
        Alumno a = new Alumno(nombre, n1, n2, n3);
        return a;
    }

    /**
     * Método principal para pruebas: agrega alumnos de ejemplo a la lista.
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        lista.add(new Alumno("Ana", 8.5, 7.0, 9.0));
        lista.add(new Alumno("Luis", 6.0, 7.5, 8.0));
        lista.add(new Alumno("Carlos", 9.0, 8.5, 7.5));
        lista.add(new Alumno("Maria", 7.0, 8.0, 8.5));
        lista.add(new Alumno("Sofia", 8.0, 9.0, 7.0));
    }
}