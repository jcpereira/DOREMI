/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doremi;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author JoãoCarlos
 */
public class JFGenero extends JFrame implements TableModelListener {

    private GeneroTableModel modelo;
    private JTable tabela;
    private JScrollPane scrollPane;
    private JButton botaoAdicionar;
    private JButton botaoRemover;
    private JButton botaoLimpar;
    private GeneroDAO dao = new GeneroDAO();

    public JFGenero() {
        instanciaComponentes();
        adicionaComponentes();
        ajustaJanela();
    }

    private void instanciaComponentes() {
        modelo = new GeneroTableModel();
        // aqui est� a grande jogada!
        modelo.addTableModelListener(this);
        try {
            modelo.adicionaLista(dao.listarGeneros());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Meu primeiro programa gráfico!\n Obrigado, Curso Java Progressivo!");
        }

        // mudamos o modelo de nossa tabela
        tabela = new JTable();
        tabela.setModel(modelo);
        scrollPane = new JScrollPane();
        scrollPane.setViewportView(tabela);
        botaoAdicionar = new JButton();
        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // nesse caso, simplesmente adiciona um novo cliente aleat�rio
//                modelo.adiciona(ClienteDAO.geraContato());
            }
        });
        botaoRemover = new JButton();
        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // remove o cliente selecionado
                int indice = tabela.getSelectedRow();
                if (indice != -1) {
                    modelo.deleta(indice);
                }
            }
        });
        botaoLimpar = new JButton();
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.limpaLista();
            }
        });
    }

    private void adicionaComponentes() {
        add(scrollPane);
        JPanel panel = new JPanel();
        panel.add(botaoAdicionar);
        panel.add(botaoRemover);
        panel.add(botaoLimpar);
        add(panel, BorderLayout.SOUTH);
    }

    private void ajustaJanela() {
        setTitle("Generos");
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        // quando a estrutura de dados muda, imprimimos a informa��o. Fazer a
        // persist�ncia no banco seria o comportamento realista desse m�todo.
        String tipo;
        switch (e.getType()) {
            case TableModelEvent.DELETE:
                tipo = "DELETE";
                break;
            case TableModelEvent.INSERT:
                tipo = "INSERT";
                break;
            case TableModelEvent.UPDATE:
                tipo = "UPDATE";
                break;
            default:
                tipo = "?";
                break;
        }
        // mostra uma mensagem:
        // TIPO_DE_EVENTO: linhaInicial-linhaFinal, coluna
        // -1 representa todas as linhas ou todas as colunas
        // 2147483647 representa poss�vel mudan�a em toda a tabela
        System.out.printf("%s: %d-%d, %d%n", tipo, e.getFirstRow(), e
                .getLastRow(), e.getColumn());
    }

}
