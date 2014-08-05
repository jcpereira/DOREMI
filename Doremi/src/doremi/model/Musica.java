package doremi.model;

/**
 *
 * @author João Carlos Luis Pereira
 *
 */
public class Musica {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;

    public Musica(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Musica() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
