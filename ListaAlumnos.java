import java.util.ArrayList;

public class ListaAlumnos {
    public static void main(String[] args) {
        Asignatura asignatura = new Asignatura();
        asignatura.altaAlumno("Ana", 8.5, 7.0, 9.0);
        asignatura.altaAlumno("Luis", 6.0, 7.5, 8.0);
        asignatura.altaAlumno("Carlos", 9.0, 8.5, 7.5);
        asignatura.altaAlumno("Maria", 7.0, 8.0, 8.5);
        asignatura.altaAlumno("Sofia", 8.0, 9.0, 7.0);
        
        System.out.print(Mensajes.LIMPIAR_PANTALLA);
        System.out.flush();
        System.out.println(Mensajes.TITULO_LISTADO);
        System.out.println(Mensajes.SEPARADOR);
        asignatura.mostrarAlumnos();
        System.out.println(Mensajes.SEPARADOR);
        System.out.println(Mensajes.NOTA_MEDIA + asignatura.promedioGeneral());
    }
}