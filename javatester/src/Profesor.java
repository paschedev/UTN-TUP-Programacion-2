
package javatester;

/**
 *
 * @author gasto
 */
 public class Profesor {
 private String nombre;
 private List cursos = new ArrayList<>();
 // Constructor
 public Profesor(String nombre) {
 this.nombre = nombre;
 }
 // Métodos para gestionar la colección
 }
 public void agregarCurso(Curso curso) {
 cursos.add(curso);
 }
 public void eliminarCurso(Curso curso) {
 cursos.remove(curso);
 }
 public List getCursos() {
 return Collections.unmodifiableList(cursos);
 }

