import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<Materia> materias;

    public Estudiante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.materias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void agregarMateria(Materia m) {
        materias.add(m);
    }

    public double calcularPromedio() {
        if (materias.isEmpty()) return 0.0;
        double suma = 0;
        for (Materia m : materias) {
            suma += m.getCalificacion();
        }
        return suma / materias.size();
    }
}
