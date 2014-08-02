package doremi.controler;

import doremi.model.Genero;
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
public class GeneroDAO {

    private String driver = "org.postgresql.Driver";
    private String url = "jdbc:postgresql://127.0.0.1:5432/BancoPOS";
    private String usuario = "postgres";
    private String senha = "postgres";

    public void inserir(Genero genero) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName(driver);
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement sql = conexao.prepareStatement("insert into genero(nome) values(?)");
        sql.setString(1, genero.getNome());
        sql.execute();
        // Fechar conexão com o banco.
        conexao.close();
    }

//    deleta ususario no banco
    public void deletar(Long id) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName(driver);
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement sql = conexao.prepareStatement("delete from genero where id = ? ");
        sql.setLong(1, id);
        sql.execute();
        // Fechar conexão com o banco.
        conexao.close();
    }
//altera usuario no banco

    public void alterar(Genero genero) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName(driver);
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement sql = conexao.prepareStatement("update genero set nome= ? where id = ? ");
        sql.setString(1, genero.getNome());
        sql.setLong(4, genero.getId());
        sql.execute();
        // Fechar conexão com o banco.
        conexao.close();
    }

    public List<Genero> listarGeneros() throws ClassNotFoundException, SQLException {
        List<Genero> generos = new ArrayList<Genero>();
        // Criar uma conexão com o banco.
        Class.forName(driver);
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement sql = conexao.prepareStatement("select * from genero");
        ResultSet resultado = sql.executeQuery();
        while (resultado.next()) {
            //pega os valores do bd para popular a lista  
            Genero novo = new Genero(resultado.getLong("id"), resultado.getString("nome"));
            generos.add(novo);
        }
        // Fechar conexão com o banco.
        conexao.close();
        // Retorne os generos.
        return generos;
    }

    public Genero lerGenero(int id) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName(driver);
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement sql = conexao.prepareStatement("select * from genero where id = ?");
        sql.setInt(1, id);
        ResultSet resultado = sql.executeQuery();
        Genero genero = null;
        if (resultado.next()) {
            genero = new Genero(resultado.getLong("id"), resultado.getString("nome"));
        }
        // Fechar conexão com o banco.
        conexao.close();
        // Retorne os generos.
        return genero;
    }
}
