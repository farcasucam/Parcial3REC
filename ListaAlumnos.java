import java.util.ArrayList;

public class ListaAlumnos {
    public static void main(String[] args) {
        Asignatura asignatura = new Asignatura();
        asignatura.altaAlumno("Ana", 8.5, 7.0, 9.0);
        asignatura.altaAlumno("Luis", 6.0, 7.5, 8.0);
        asignatura.altaAlumno("Carlos", 9.0, 8.5, 7.5);
        asignatura.altaAlumno("Maria", 7.0, 8.0, 8.5);
        asignatura.altaAlumno("Sofia", 8.0, 9.0, 7.0);
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\tLISTADO DE ALUMNOS");
        System.out.println("--------------------------------------");
        asignatura.mostrarAlumnos();
        System.out.println("--------------------------------------");
        System.out.println("Nota media del grupo: " + asignatura.promedioGeneral());
    }
}