package doremi.view;

import doremi.controler.MusicaDAO;
import doremi.model.Musica;
import doremi.model.MusicaTableModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author João Carlos Luis Pereira
 *
 */
public class FMusica extends javax.swing.JFrame {

    private Musica musica = new Musica();
    private MusicaTableModel jTMusicaModel = null;
    private MusicaDAO dao = new MusicaDAO();
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form FMusica
     */
    public FMusica() {
        initComponents();
        carregarLista();
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
        jDLetra = new javax.swing.JDialog();
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

        javax.swing.GroupLayout jDMusicaLayout = new javax.swing.GroupLayout(jDMusica.getContentPane());
        jDMusica.getContentPane().setLayout(jDMusicaLayout);
        jDMusicaLayout.setHorizontalGroup(
            jDMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDMusicaLayout.setVerticalGroup(
            jDMusicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDLetraLayout = new javax.swing.GroupLayout(jDLetra.getContentPane());
        jDLetra.getContentPane().setLayout(jDLetraLayout);
        jDLetraLayout.setHorizontalGroup(
            jDLetraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDLetraLayout.setVerticalGroup(
            jDLetraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
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
            carregarLista();
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
        if (!jTNome.getText().equals("")) {
            try {
                musica.setNome(jTNome.getText());
                if (jBIncluir.getText().equals("Incluir")) {
                    dao.inserir(musica);
                    JOptionPane.showMessageDialog(null, "Musica " + musica.getNome() + " incluido corretamente!");
                } else {
                    dao.alterar(musica);
                    JOptionPane.showMessageDialog(null, "Musica " + musica.getNome() + " alterado corretamente!");
                }
                carregarLista();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor preencha o campo nome!");
        }
    }//GEN-LAST:event_jBIncluirActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int indice = jTAMusica.getSelectedRow();
        if (indice != -1) {
            Musica music = (Musica) jTMusicaModel.getValueAt(indice, -1);
            try {
                dao.deletar(music.getId());
                JOptionPane.showMessageDialog(null, "Musica " + music.getNome() + " excluido corretamente!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + e.getMessage());
            }
            jTMusicaModel.deleta(indice);
        }
        carregarLista();
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jTAMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAMusicaMouseClicked
        int indice = jTAMusica.getSelectedRow();
        if (indice != -1) {
            musica = (Musica) jTMusicaModel.getValueAt(indice, -1);
            jBIncluir.setText("Alterar");
            jBSair.setText("Limpar");
            jTNome.setText(musica.getNome());
        }
    }//GEN-LAST:event_jTAMusicaMouseClicked

    private void jBLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLetraActionPerformed
        jDLetra.show();
    }//GEN-LAST:event_jBLetraActionPerformed

    private void jBMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMusicaActionPerformed
        jDMusica.show();
    }//GEN-LAST:event_jBMusicaActionPerformed

    private void carregarLista() {
        try {
            jTMusicaModel = new MusicaTableModel(dao.listarMusicas());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + e.getMessage());
        }
        jTMusicaModel.addTableModelListener(jTAMusica);
        jTAMusica.setModel(jTMusicaModel);
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        jTAMusica.getColumnModel().getColumn(0).setCellRenderer(centralizado);

        jTNome.setText("");
        jBIncluir.setText("Incluir");
        jBSair.setText("Sair");
//    DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();  
//    DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();  
//    DefaultTableCellRenderer direita = new DefaultTableCellRenderer();  
//      
//    esquerda.setHorizontalAlignment(SwingConstants.LEFT);  
//    centralizado.setHorizontalAlignment(SwingConstants.CENTER);  
//    direita.setHorizontalAlignment(SwingConstants.RIGHT);  
//      
//    tabela.getColumnModel().getColumn(0).setCellRenderer(esquerda);  
//    tabela.getColumnModel().getColumn(1).setCellRenderer(centralizado);  
//    tabela.getColumnModel().getColumn(2).setCellRenderer(direita);  
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
