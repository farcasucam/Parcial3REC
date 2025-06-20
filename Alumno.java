/**
 * Representa un alumno con nombre y tres notas.
 */
public class Alumno {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    /**
     * Crea un nuevo alumno con nombre y tres notas.
     * @param nombre Nombre del alumno.
     * @param nota1 Primera nota.
     * @param nota2 Segunda nota.
     * @param nota3 Tercera nota.
     */
    public Alumno(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    /**
     * Obtiene el nombre del alumno.
     * @return Nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la primera nota.
     * @return Primera nota.
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * Obtiene la segunda nota.
     * @return Segunda nota.
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * Obtiene la tercera nota.
     * @return Tercera nota.
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * Calcula el promedio de las tres notas del alumno.
     * @return Promedio de las notas.
     */
    public double promedio() {
        return (nota1 + nota2 + nota3) / 3.0;
    }
}