package doremi.controler;

import doremi.model.Cantor;
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
public class CantorDAO {

    private String driver = "org.postgresql.Driver";
    private String url = "jdbc:postgresql://127.0.0.1:5432/BancoPOS";
    private String usuario = "postgres";
    private String senha = "postgres";

    public void inserir(Cantor cantor) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName(driver);
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement sql = conexao.prepareStatement("insert into cantor(nome) values(?)");
        sql.setString(1, cantor.getNome());
        sql.execute();
        // Fechar conexão com o banco.
        conexao.close();
    }

//    deleta ususario no banco
    public void deletar(Long id) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName(driver);
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement sql = conexao.prepareStatement("delete from cantor where id = ? ");
        sql.setLong(1, id);
        sql.execute();
        // Fechar conexão com o banco.
        conexao.close();
    }
//altera usuario no banco

    public void alterar(Cantor cantor) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName(driver);
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement sql = conexao.prepareStatement("update cantor set nome= ? where id = ? ");
        sql.setString(1, cantor.getNome());
        sql.setLong(4, cantor.getId());
        sql.execute();
        // Fechar conexão com o banco.
        conexao.close();
    }

    public List<Cantor> listarCantors() throws ClassNotFoundException, SQLException {
        List<Cantor> cantors = new ArrayList<Cantor>();
        // Criar uma conexão com o banco.
        Class.forName(driver);
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement sql = conexao.prepareStatement("select * from cantor");
        ResultSet resultado = sql.executeQuery();
        while (resultado.next()) {
            //pega os valores do bd para popular a lista  
            Cantor novo = new Cantor(resultado.getLong("id"), resultado.getString("nome"));
            cantors.add(novo);
        }
        // Fechar conexão com o banco.
        conexao.close();
        // Retorne os cantors.
        return cantors;
    }

    public Cantor lerCantor(int id) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName(driver);
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        PreparedStatement sql = conexao.prepareStatement("select * from cantor where id = ?");
        sql.setInt(1, id);
        ResultSet resultado = sql.executeQuery();
        Cantor cantor = null;
        if (resultado.next()) {
            cantor = new Cantor(resultado.getLong("id"), resultado.getString("nome"));
        }
        // Fechar conexão com o banco.
        conexao.close();
        // Retorne os cantors.
        return cantor;
    }
}
