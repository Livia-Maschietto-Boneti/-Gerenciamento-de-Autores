package liv.duda23.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import liv.duda23.Model.AutoresModel;
import liv.duda23.Service.AutoresService;

import java.util.List;
@RestController

@RequestMapping(path = "/nacionalidade")
public class AutoresController {

    @Autowired
    private AutoresService nacionalidadeService;

    @PostMapping
    public AutoresModel criar(@RequestBody AutoresModel nacionalidadeModel){
        return nacionalidadeService.criar(nacionalidadeModel);
    }

    @GetMapping
    public List<AutoresModel> listar(){
        return nacionalidadeService.listar();
    }

    @DeleteMapping
    public void deletar(@PathVariable Long id){
        nacionalidadeService.deletar(id);
    }

}



