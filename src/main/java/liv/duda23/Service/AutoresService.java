package liv.duda23.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import liv.duda23.Model.AutoresModel;
import liv.duda23.Repository.AutorRepository;

import java.util.List;

@Service
public class AutoresService {

    @Autowired
    private AutorRepository repository;

    public AutoresModel criar(AutoresModel nacionalidade){
        return repository.save(nacionalidade);
    }

    public List<AutoresModel> listar(){
        return repository.findAll();
    }

    public AutoresModel buscar(long id){
        return repository.findById(id).get();
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}


