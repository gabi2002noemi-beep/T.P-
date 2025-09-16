public class App {
    public static void main(String[] args) {
        // Crear una carrera
        Carrera carrera = new Carrera("Programador Universitario");

        // Crear estudiantes
        Estudiante e1 = new Estudiante("Gabriela", "Ruiz", 19);
        Estudiante e2 = new Estudiante("María", "Gómez", 22);

        // Crear materias
        Materia m1 = new Materia("Programación", "INF101", 6, 9.5);
        Materia m2 = new Materia("Base de Datos", "INF102", 5, 8.0);
        Materia m3 = new Materia("Redes", "INF103", 4, 4);

        // Asignar materias a estudiantes
        e1.agregarMateria(m1);
        e1.agregarMateria(m2);

        e2.agregarMateria(m2);
        e2.agregarMateria(m3);

        // Agregar estudiantes a la carrera
        carrera.agregarEstudiante(e1);
        carrera.agregarEstudiante(e2);

        // Listar estudiantes de la carrera
        carrera.listarEstudiantes();

        // Buscar estudiante
        Estudiante buscado = carrera.buscarEstudiante("Gabriela");
        if(buscado != null) {
            System.out.println("Estudiante encontrado: " + buscado.getNombre() + " " + buscado.getApellido());
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}
