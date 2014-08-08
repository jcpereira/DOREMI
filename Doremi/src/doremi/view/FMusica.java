package doremi.view;

import doremi.controler.CantorDAO;
import doremi.controler.GeneroDAO;
import doremi.controler.MusicaDAO;
import doremi.model.Cantor;
import doremi.model.Genero;
import doremi.model.Musica;
import doremi.model.MusicaTableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author João Carlos Luis Pereira
 *
 */
public class FMusica extends javax.swing.JFrame {

    private Musica musica = new Musica();
    private MusicaTableModel jTMusicaModel = null;
    private MusicaDAO daoMusuca = new MusicaDAO();
    private CantorDAO daoCantor = new CantorDAO();
    private GeneroDAO daoGenero = new GeneroDAO();
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form FMusica
     */
    public FMusica() {
        initComponents();
        try {
            carregarLista();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * remusicerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDMusica = new javax.swing.JDialog();
        jFCMusica = new javax.swing.JFileChooser();
        jDLetra = new javax.swing.JDialog();
        jFCLetra = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jTNome = new javax.swing.JTextField();
        jBIncluir = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTMusica = new javax.swing.JTextField();
        jTLetra = new javax.swing.JTextField();
        jCGenero = new javax.swing.JComboBox();
        jCCantor = new javax.swing.JComboBox();
        jBLetra = new javax.swing.JButton();
        jBMusica = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAMusica = new javax.swing.JTable();

        jDMusica.setTitle("Abrir musica.mp3");

        javax.swing.GroupLayout jDMusicaLayout = new javax.swing.GroupLayout(jDMusica.getContentPane());
        jDMusica.getContentPane().setLayout(jDMusicaLayout);
        jDMusicaLayout.setHorizontalGroup(
            jDMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFCMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDMusicaLayout.setVerticalGroup(
            jDMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDMusicaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jFCMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jDLetraLayout = new javax.swing.GroupLayout(jDLetra.getContentPane());
        jDLetra.getContentPane().setLayout(jDLetraLayout);
        jDLetraLayout.setHorizontalGroup(
            jDLetraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDLetraLayout.createSequentialGroup()
                .addComponent(jFCLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDLetraLayout.setVerticalGroup(
            jDLetraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDLetraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jFCLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Musicas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBIncluir.setText("Iincluir");
        jBIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIncluirActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Musica");

        jLabel3.setText("Letra");

        jTMusica.setEditable(false);

        jTLetra.setEditable(false);

        jCGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCCantor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBLetra.setText("...");
        jBLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLetraActionPerformed(evt);
            }
        });

        jBMusica.setText("...");
        jBMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMusicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTNome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCCantor, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBMusica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCCantor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLetra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBIncluir)
                    .addComponent(jBExcluir)
                    .addComponent(jBSair))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTAMusica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTAMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAMusicaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTAMusica);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        if (jBSair.getText().equals("Limpar")) {
            try {
                carregarLista();
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + ex.getMessage());
            }
        } else {
            FTelaInicial ini = new FTelaInicial();
            ini.setLocation(this.location().getLocation());
            this.dispose();
            ini.show();
        }
    }//GEN-LAST:event_jBSairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        FTelaInicial ini = new FTelaInicial();
        ini.setLocation(this.location().getLocation());
        this.dispose();
        ini.show();
    }//GEN-LAST:event_formWindowClosing

    private void jBIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIncluirActionPerformed
        if (!jTNome.getText().equals("") || !jTMusica.getText().equals("") || !jTLetra.getText().equals("")) {
            try {
                musica.setNome(jTNome.getText());
                musica.setMusica(jTMusica.getText());
                musica.setLetra(jTLetra.getText());

                if (jBIncluir.getText().equals("Incluir")) {
                    daoMusuca.inserir(musica);
                    JOptionPane.showMessageDialog(null, "Musica " + musica.getNome() + " incluida corretamente!");
                } else {
                    daoMusuca.alterar(musica);
                    JOptionPane.showMessageDialog(null, "Musica " + musica.getNome() + " alterada corretamente!");
                }
                carregarLista();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + e.getMessage());
            }
        } else {
            if (!jTNome.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor preencha o campo nome!");
            } else if (!jTMusica.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor preencha o campo musica!");
            } else if (!jTLetra.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor preencha o campo letra!");
            }
        }
    }//GEN-LAST:event_jBIncluirActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int indice = jTAMusica.getSelectedRow();
        if (indice != -1) {
            Musica music = (Musica) jTMusicaModel.getValueAt(indice, -1);
            try {
                daoMusuca.deletar(music.getId());
                JOptionPane.showMessageDialog(null, "Musica " + music.getNome() + " excluido corretamente!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + e.getMessage());
            }
            jTMusicaModel.deleta(indice);
        }
        try {
            carregarLista();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + ex.getMessage());
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jTAMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAMusicaMouseClicked
        int indice = jTAMusica.getSelectedRow();
        if (indice != -1) {
            musica = (Musica) jTMusicaModel.getValueAt(indice, -1);
            jBIncluir.setText("Alterar");
            jBSair.setText("Limpar");
            jTNome.setText(musica.getNome());
            jCCantor.setSelectedItem(musica.getCantor());
            jCCantor.setSelectedItem(musica.getGenero());
        }
    }//GEN-LAST:event_jTAMusicaMouseClicked

    private void jBLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLetraActionPerformed
        jFCLetra.setFileFilter(new FileNameExtensionFilter("Arquivo de texto", "txt"));
        jFCLetra.setAcceptAllFileFilterUsed(false);
        int retorno = jFCLetra.showSaveDialog(null);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            if (!jFCLetra.getSelectedFile().getAbsolutePath().endsWith(".txt")) {
                jTLetra.setText(jFCLetra.getSelectedFile().getAbsolutePath() + ".txt");
            } else {
                jTLetra.setText(jFCLetra.getSelectedFile().getAbsolutePath());
            }
        }
    }//GEN-LAST:event_jBLetraActionPerformed

    private void jBMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMusicaActionPerformed
        jFCMusica.setFileFilter(new FileNameExtensionFilter("Arquivo de audio", "mp3"));
        jFCMusica.setAcceptAllFileFilterUsed(false);
        int retorno = jFCMusica.showSaveDialog(null);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            if (!jFCMusica.getSelectedFile().getAbsolutePath().endsWith(".mp3")) {
                jTMusica.setText(jFCMusica.getSelectedFile().getAbsolutePath() + ".mp3");
            } else {
                jTMusica.setText(jFCMusica.getSelectedFile().getAbsolutePath());
            }
        }
    }//GEN-LAST:event_jBMusicaActionPerformed

    private void carregarLista() throws ClassNotFoundException {
        try {
            jTMusicaModel = new MusicaTableModel(daoMusuca.listarMusicas());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + e.getMessage());
        }
        jTMusicaModel.addTableModelListener(jTAMusica);
        jTAMusica.setModel(jTMusicaModel);
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        jTAMusica.getColumnModel().getColumn(0).setCellRenderer(centralizado);

        jCCantor.removeAllItems();
        jCCantor.addItem(new Cantor());
        List<Cantor> cantores = null;
        try {
            cantores = daoCantor.listarCantors();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + e.getMessage());
        }
        for (int i = 0; i < cantores.size(); i++) {
            jCCantor.addItem(cantores.get(i));
        }
        jCCantor.setEditable(true);

        jCGenero.removeAllItems();
        jCGenero.addItem(new Cantor());
        List<Genero> generos = null;
        try {
            generos = daoGenero.listarGeneros();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + e.getMessage());
        }

        for (int i = 0; i < generos.size(); i++) {
            jCCantor.addItem(generos.get(i));
        }
        jCCantor.setEditable(true);

        jTNome.setText("");
        jBIncluir.setText("Incluir");
        jBSair.setText("Sair");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBIncluir;
    private javax.swing.JButton jBLetra;
    private javax.swing.JButton jBMusica;
    private javax.swing.JButton jBSair;
    private javax.swing.JComboBox jCCantor;
    private javax.swing.JComboBox jCGenero;
    private javax.swing.JDialog jDLetra;
    private javax.swing.JDialog jDMusica;
    private javax.swing.JFileChooser jFCLetra;
    private javax.swing.JFileChooser jFCMusica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTAMusica;
    private javax.swing.JTextField jTLetra;
    private javax.swing.JTextField jTMusica;
    private javax.swing.JTextField jTNome;
    // End of variables declaration//GEN-END:variables

}
