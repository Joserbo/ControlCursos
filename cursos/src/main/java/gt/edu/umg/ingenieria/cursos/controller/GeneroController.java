package gt.edu.umg.ingenieria.cursos.controller;

import gt.edu.umg.ingenieria.cursos.dao.GeneroRepository;
import gt.edu.umg.ingenieria.cursos.model.Genero;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genero")
public class GeneroController {
    @Autowired
    private GeneroRepository generorepository;
    
    @GetMapping("/generos")
    public List<Genero> obtenergeneros(){
        return generorepository.findAll();
    }
    
    @PostMapping("/insertargenero")
    public Genero insertargenero(@RequestBody Genero genero){
        return generorepository.save(genero);
    }
}
