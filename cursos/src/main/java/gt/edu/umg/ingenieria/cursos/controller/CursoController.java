package gt.edu.umg.ingenieria.cursos.controller;

import gt.edu.umg.ingenieria.cursos.dao.CursoRepository;
import gt.edu.umg.ingenieria.cursos.model.Curso;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private CursoRepository cursorepository;
    
    @GetMapping("/cursos")
    public List<Curso> obtenerCursos(){
        return cursorepository.findAll();
    }
    
    @GetMapping("/cursosgenero")
    public List<Curso> obtenerPorGenero(@RequestParam Long id){
       List<Curso> lista = cursorepository.findAll();
       List<Curso> cur = new ArrayList<Curso>();
       
       for(Curso c1 : lista)
       {
           if(c1.getIdGenero().equals(id))
           {
               cur.add(c1);
               System.out.println("agregado");
           }
       }
       return cur;
    }
    
    
    
    
    
    @PostMapping("/ingresarcurso")
    public Curso ingresarCurso(@RequestBody Curso curso){
        return cursorepository.save(curso);
    }
    
    @GetMapping("/cursoid/{id}")
    public Optional<Curso> obtenerPorId(@PathVariable(required = true) Long id)
    {
        return cursorepository.findById(id);        
    }
}
