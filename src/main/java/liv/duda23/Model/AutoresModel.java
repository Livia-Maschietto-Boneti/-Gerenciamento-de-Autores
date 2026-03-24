package liv.duda23.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity(name = "AutorModel")
@Table(name = "tb_autor")
public class AutoresModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nacionalidade")
    private String nacionalidade;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;


    public AutoresModel(String nacionalidade, LocalDate dataNascimento) {
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
    }

    public AutoresModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // ✅ Corrigido (antes estava getTitulo)
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}