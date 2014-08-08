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
    private String musica;
    private String letra;
    private Cantor cantor;
    private Genero genero;

    public Musica(Long id, String nome, String musica, String letra) {
        this.id = id;
        this.nome = nome;
        this.musica = musica;
        this.letra = letra;
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

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Cantor getCantor() {
        return cantor;
    }

    public void setCantor(Cantor cantor) {
        this.cantor = cantor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

}
