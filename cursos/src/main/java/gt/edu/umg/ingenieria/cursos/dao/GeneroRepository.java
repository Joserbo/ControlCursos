package gt.edu.umg.ingenieria.cursos.dao;

import gt.edu.umg.ingenieria.cursos.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long>{
    
}
