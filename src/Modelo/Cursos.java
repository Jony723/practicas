package Modelo;
// Generated 16/06/2017 06:14:45 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cursos generated by hbm2java
 */
public class Cursos  implements java.io.Serializable {


     private Integer codCurso;
     private String descripcion;
     private String area;
     private String condicion;
     private Set notases = new HashSet(0);

    public Cursos() {
    }

	
    public Cursos(String descripcion, String area, String condicion) {
        this.descripcion = descripcion;
        this.area = area;
        this.condicion = condicion;
    }
    public Cursos(String descripcion, String area, String condicion, Set notases) {
       this.descripcion = descripcion;
       this.area = area;
       this.condicion = condicion;
       this.notases = notases;
    }
   
    public Integer getCodCurso() {
        return this.codCurso;
    }
    
    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getArea() {
        return this.area;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    public String getCondicion() {
        return this.condicion;
    }
    
    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
    public Set getNotases() {
        return this.notases;
    }
    
    public void setNotases(Set notases) {
        this.notases = notases;
    }




}


