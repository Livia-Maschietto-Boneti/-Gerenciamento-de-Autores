package liv.duda23.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import liv.duda23.Model.AutoresModel;
import org.springframework.beans.factory.annotation.Autowired;

public interface AutorRepository extends JpaRepository<AutoresModel,Long> {

}
