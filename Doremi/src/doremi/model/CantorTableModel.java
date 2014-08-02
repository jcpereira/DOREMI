package doremi.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author João Carlos Luis Pereira
 *
 */
public class CantorTableModel extends AbstractTableModel {

    private List<Cantor> cantores;

    CantorTableModel() {
        this.cantores = new ArrayList<Cantor>();
    }

    public CantorTableModel(List<Cantor> cantores) {
        this.cantores = cantores;
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
        return this.cantores.size();
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        // Pega o sócio referente a linha especificada.
        Cantor cant = cantores.get(linha);

        switch (coluna) {
            case 0:
                return cant.getNome();
            default:
                //Colocar valor diferente de 0 na coluna pra devolver o objrto
                return cant;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // nesse caso as todas as colunas não são editaveis
        return true;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        // aqui devemos atualizar o valor de nossos Cantors
        // vemos em qual linha ele esta
        Cantor cant = this.cantores.get(linha);
        // e vemos o que ser� atualizado
        switch (coluna) {
            case 0:
                cant.setNome(valor.toString()); // mudamos o nome
                break;
        }
        // É importante notificar os listeners a cada alteracao
        fireTableDataChanged();       
    }

    //Adiciona cantero na lista
    public void adiciona(Cantor cant) {
        cantores.add(cant);
        // informamos os listeners que a linha (size - 1) foi adicionada
        fireTableRowsInserted(cantores.size() - 1, cantores.size() - 1);
    }

    //remove iten da lista
    public void deleta(int indice) {
        cantores.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }

    //retorna o indice da linha
    public int getIndice(Cantor cant) {
        return cantores.indexOf(cant);
    }

    //adiciona uma lista inteira
    public void adicionaLista(List<Cantor> canteros) {
        int i = this.cantores.size();
        this.cantores.addAll(canteros);
        fireTableRowsInserted(i, i + canteros.size());
    }

    //limpa a lista
    public void limpaLista() {
        int i = this.cantores.size();
        this.cantores.clear();
        fireTableRowsDeleted(0, i - 1);
    }
}
