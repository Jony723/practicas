package Modelo;
// Generated 26/05/2017 06:16:01 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Matricula generated by hbm2java
 */
public class Matricula  implements java.io.Serializable {


     private Integer codMatricula;
     private Alumnos alumnos;
     private Nivel nivel;
     private Date fechaMatricula;
     private Set notases = new HashSet(0);

    public Matricula() {
    }

	
    public Matricula(Alumnos alumnos, Nivel nivel, Date fechaMatricula) {
        this.alumnos = alumnos;
        this.nivel = nivel;
        this.fechaMatricula = fechaMatricula;
    }
    public Matricula(Alumnos alumnos, Nivel nivel, Date fechaMatricula, Set notases) {
       this.alumnos = alumnos;
       this.nivel = nivel;
       this.fechaMatricula = fechaMatricula;
       this.notases = notases;
    }
   
    public Integer getCodMatricula() {
        return this.codMatricula;
    }
    
    public void setCodMatricula(Integer codMatricula) {
        this.codMatricula = codMatricula;
    }
    public Alumnos getAlumnos() {
        return this.alumnos;
    }
    
    public void setAlumnos(Alumnos alumnos) {
        this.alumnos = alumnos;
    }
    public Nivel getNivel() {
        return this.nivel;
    }
    
    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
    public Date getFechaMatricula() {
        return this.fechaMatricula;
    }
    
    public void setFechaMatricula(Date fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }
    public Set getNotases() {
        return this.notases;
    }
    
    public void setNotases(Set notases) {
        this.notases = notases;
    }




}


