package doremi.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author João Carlos Luis Pereira
 *
 */
public class MusicaTableModel extends AbstractTableModel {

    private List<Musica> musicas;

    MusicaTableModel() {
        this.musicas = new ArrayList<Musica>();
    }

    public MusicaTableModel(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public Class<?> getColumnClass(int coluna) {
        // todas as colunas representam uma String
        return String.class;
    }

    @Override
    public int getColumnCount() {
        // numero de colunas exibidas
        // nome
        return 1;
    }

    @Override
    public String getColumnName(int coluna) {
        // vamos retornar o nome de cada coluna
        switch (coluna) {
            case 0:
                return "Nome"; // o nome da primeira coluna     
            default:
                return ""; // isso nunca deve ocorrer, pois temos 1 coluna
        }
    }

    @Override
    public int getRowCount() {
        //numeros de linhas
        return this.musicas.size();
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        // Pega o sócio referente a linha especificada.
        Musica music = musicas.get(linha);

        switch (coluna) {
            case 0:
                return music.getNome();
            default:
                //Colocar valor diferente de 0 na coluna pra devolver o objrto
                return music;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // nesse caso as todas as colunas não são editaveis
        return false;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        // aqui devemos atualizar o valor de nossos Musicas
        // vemos em qual linha ele esta
        Musica music = this.musicas.get(linha);
        // e vemos o que ser� atualizado
        switch (coluna) {
            case 0:
                music.setNome(valor.toString()); // mudamos o nome
                break;
        }
        // É importante notificar os listeners a cada alteracao
        fireTableDataChanged();       
    }

    //Adiciona musicero na lista
    public void adiciona(Musica music) {
        musicas.add(music);
        // informamos os listeners que a linha (size - 1) foi adicionada
        fireTableRowsInserted(musicas.size() - 1, musicas.size() - 1);
    }

    //remove iten da lista
    public void deleta(int indice) {
        musicas.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }

    //retorna o indice da linha
    public int getIndice(Musica music) {
        return musicas.indexOf(music);
    }

    //adiciona uma lista inteira
    public void adicionaLista(List<Musica> musiceros) {
        int i = this.musicas.size();
        this.musicas.addAll(musiceros);
        fireTableRowsInserted(i, i + musiceros.size());
    }

    //limpa a lista
    public void limpaLista() {
        int i = this.musicas.size();
        this.musicas.clear();
        fireTableRowsDeleted(0, i - 1);
    }
}
