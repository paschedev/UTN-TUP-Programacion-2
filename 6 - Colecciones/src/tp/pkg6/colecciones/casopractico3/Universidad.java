/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg6.colecciones.casopractico3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gasto
 */
public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Profesor profe = buscarProfesorPorId(idProfesor);
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        
        if(profe != null && curso != null){
            curso.setProfesor(profe);
        }else{
            System.out.println("Curso o Profesor inexistente");
        }
    }

    public void listarProfesores() {
        //System.out.println(profesores);
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        //System.out.println(cursos);
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        if (id != null) {
            for (Profesor p : profesores) {
                if (p.getId().equals(id)) {
                    return p;
                }
            }
        }
        return null;
    }
    
    public Curso buscarCursoPorCodigo(String codigo){
        if (codigo != null) {
            for (Curso c : cursos) {
                if (c.getCodigo().equals(codigo)) {
                    return c;
                }
            }
        }
        return null;
    }

    public void eliminarCurso(String codigo) {
        if (codigo != null) {
            for (Curso c : cursos) {
                if (c.getCodigo().equals(codigo)) {
                    cursos.remove(c);
                    c.getProfesor().eliminarCurso(c);
                }
            }
        }
    }

    public void eliminarProfesor(String id) {
        if (id != null) {
            for (Profesor p : profesores) {
                if (p.getId().equals(id)) {
                    profesores.remove(p);
                }
            }
        }
    }
}
