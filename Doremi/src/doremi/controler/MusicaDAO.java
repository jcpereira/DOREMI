package doremi.controler;

import doremi.model.Musica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Carlos Luis Pereira
 *
 */
public class MusicaDAO {

    private String driver = "org.postgresql.Driver";
    private String url = "jdbc:postgresql://127.0.0.1:5432/BancoPOS";
    private String usuario = "postgres";
    private String senha = "postgres";

    public void inserir(Musica musica) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName(driver);
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement sql = conexao.prepareStatement("insert into musica(nome,musica,letra) values(?,?,?)");
        sql.setString(1, musica.getNome());
        sql.setString(2, musica.getMusica());
        sql.setString(3, musica.getLetra());
        sql.execute();
        // Fechar conexão com o banco.
        conexao.close();
    }

//    deleta ususario no banco
    public void deletar(Long id) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName(driver);
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement sql = conexao.prepareStatement("delete from musica where id = ? ");
        sql.setLong(1, id);
        sql.execute();
        // Fechar conexão com o banco.
        conexao.close();
    }
//altera usuario no banco

    public void alterar(Musica musica) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName(driver);
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement sql = conexao.prepareStatement("update musica set nome= ?, musica = ?, letra = ? where id = ? ");
        sql.setString(1, musica.getNome());
        sql.setString(2, musica.getMusica());
        sql.setString(3, musica.getLetra());
        sql.setLong(4, musica.getId());
        sql.execute();
        // Fechar conexão com o banco.
        conexao.close();
    }

    public List<Musica> listarMusicas() throws ClassNotFoundException, SQLException {
        List<Musica> musicas = new ArrayList<Musica>();
        // Criar uma conexão com o banco.
        Class.forName(driver);
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement sql = conexao.prepareStatement("select * from musica order by nome ");
        ResultSet resultado = sql.executeQuery();
        while (resultado.next()) {
            //pega os valores do bd para popular a lista  
            Musica novo = new Musica(resultado.getLong("id"), resultado.getString("nome"), resultado.getString("musica"), resultado.getString("letra"));
            musicas.add(novo);
        }
        // Fechar conexão com o banco.
        conexao.close();
        // Retorne os musicas.
        return musicas;
    }

    public Musica lerMusica(int id) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName(driver);
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement sql = conexao.prepareStatement("select * from musica where id = ?");
        sql.setInt(1, id);
        ResultSet resultado = sql.executeQuery();
        Musica musica = null;
        if (resultado.next()) {
            musica = new Musica(resultado.getLong("id"), resultado.getString("nome"), resultado.getString("musica"), resultado.getString("letra"));
        }
        // Fechar conexão com o banco.
        conexao.close();
        // Retorne os musicas.
        return musica;
    }
}
