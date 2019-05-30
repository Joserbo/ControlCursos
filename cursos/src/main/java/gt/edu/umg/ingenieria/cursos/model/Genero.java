package gt.edu.umg.ingenieria.cursos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Genero")
public class Genero {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="id_genero")
   private Long idGenero;
   @Column(name="nombre")
   private String nombre;

    public Genero() {
    }

    public Genero(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdGenero() {
        return idGenero;
    }

    public String getNombre() {
        return nombre;
    }
   
   
   
}
