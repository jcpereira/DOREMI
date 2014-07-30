package doremi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author João Carlos Luis Pereira
 *
 */
public class GeneroDAO {

    public void inserir(Genero genero) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName("org.postgresql.Driver");
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/BancoPOS", "postgres", "postgres");
        PreparedStatement sql = conexao.prepareStatement("insert into genero(nome) values(?)");
        sql.setString(1, genero.getNome());
        sql.execute();
        // Fechar conexão com o banco.
        conexao.close();
    }

//    deleta ususario no banco
    public void deletar(int id) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName("org.postgresql.Driver");
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/BancoPOS", "postgres", "postgres");
        PreparedStatement sql = conexao.prepareStatement("delete from genero where id = ? ");
        sql.setInt(1, id);
        sql.execute();
        // Fechar conexão com o banco.
        conexao.close();
    }
//altera usuario no banco

    public void alterar(Genero genero) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName("org.postgresql.Driver");
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/BancoPOS", "postgres", "postgres");
        PreparedStatement sql = conexao.prepareStatement("update genero set nome= ? where id = ? ");
        sql.setString(1, genero.getNome());
        sql.setLong(4, genero.getId());
        sql.execute();
        // Fechar conexão com o banco.
        conexao.close();
    }

    public DefaultTableModel listarTodos() throws ClassNotFoundException, SQLException {
        DefaultTableModel dtm = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // Criar uma conexão com o banco.
        Class.forName("org.postgresql.Driver");
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/BancoPOS", "postgres", "postgres");
        PreparedStatement sql = conexao.prepareStatement("select * from genero");
        ResultSet resultado = sql.executeQuery();        
        while (resultado.next()) {
            //pega os valores do bd para popular tabela  
            dtm.addRow(new String[]{resultado.getString("id"), resultado.getString("nome")});
        }
        // Fechar conexão com o banco.
        conexao.close();
        // Retorne os generos.
        return dtm;
    }

    public Genero lerGenero(int id) throws ClassNotFoundException, SQLException {
        // Criar uma conexão com o banco.
        Class.forName("org.postgresql.Driver");
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/BancoPOS", "postgres", "postgres");
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
