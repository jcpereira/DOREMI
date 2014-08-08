package doremi.model;

/**
 *
 * @author João Carlos Luis Pereira
 *
 */
public class Cantor {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;

    public Cantor(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Cantor() {
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

    @Override
    public String toString() {
        return getNome();
    }
}
