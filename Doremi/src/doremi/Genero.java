package doremi;

import java.io.Serializable;

/**
 *
 * @author João Carlos Luis Pereira
 *
 */
public class Genero implements Comparable<Genero>, Serializable{

    private Long id;
    private String nome;

    public Genero(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    Genero() {        
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
    public int compareTo(Genero g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
