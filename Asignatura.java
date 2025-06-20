import java.util.ArrayList;

public class Asignatura {
    static ArrayList<Alumno> lista = new ArrayList<>();

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

    public double promedioGeneral() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i).promedio();
        }
        return suma / lista.size();
    }

    public Alumno darAltaAlumno(String nombre, double n1, double n2, double n3) {
        Alumno a = new Alumno(nombre, n1, n2, n3);
        return a;
    }

    public static void main(String[] args) {
        lista.add(new Alumno("Ana", 8.5, 7.0, 9.0));
        lista.add(new Alumno("Luis", 6.0, 7.5, 8.0));
        lista.add(new Alumno("Carlos", 9.0, 8.5, 7.5));
        lista.add(new Alumno("Maria", 7.0, 8.0, 8.5));
        lista.add(new Alumno("Sofia", 8.0, 9.0, 7.0));
    }
}
