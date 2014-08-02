/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doremi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author JoãoCarlos
 */
public class GeneroTableModel extends AbstractTableModel {

    private List<Genero> generos;

    GeneroTableModel() {
        this.generos = new ArrayList<Genero>();
    }

    public GeneroTableModel(List<Genero> generos) {
        this.generos = generos;
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
        return this.generos.size();
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        // Pega o sócio referente a linha especificada.
        Genero gen = generos.get(linha);

        switch (coluna) {
            case 0:
                return gen.getNome();
            default:
                //Colocar valor diferente de 0 na coluna pra devolver o objrto
                return gen;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // nesse caso as todas as colunas não são editaveis
        return false;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        // aqui devemos atualizar o valor de nossos Generos
        // vemos em qual linha ele esta
        Genero gen = this.generos.get(linha);
        // e vemos o que ser� atualizado
        switch (coluna) {
            case 0:
                gen.setNome(valor.toString()); // mudamos o nome
                break;
        }
        // É importante notificar os listeners a cada alteracao
        fireTableDataChanged();
    }

    //Adiciona genero na lista
    public void adiciona(Genero gen) {
        generos.add(gen);
        // informamos os listeners que a linha (size - 1) foi adicionada
        fireTableRowsInserted(generos.size() - 1, generos.size() - 1);
    }

    //remove iten da lista
    public void deleta(int indice) {
        generos.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }

    //retorna o indice da linha
    public int getIndice(Genero gen) {
        return generos.indexOf(gen);
    }

    //adiciona uma lista inteira
    public void adicionaLista(List<Genero> generos) {
        int i = this.generos.size();
        this.generos.addAll(generos);
        fireTableRowsInserted(i, i + generos.size());
    }

    //limpa a lista
    public void limpaLista() {
        int i = this.generos.size();
        this.generos.clear();
        fireTableRowsDeleted(0, i - 1);
    }
}
