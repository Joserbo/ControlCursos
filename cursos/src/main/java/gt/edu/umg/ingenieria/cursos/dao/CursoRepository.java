package gt.edu.umg.ingenieria.cursos.dao;

import gt.edu.umg.ingenieria.cursos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
    
}
