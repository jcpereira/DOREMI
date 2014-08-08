package doremi.view;

import doremi.controler.GeneroDAO;
import doremi.model.Genero;
import doremi.model.GeneroTableModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author João Carlos Luis Pereira
 *
 */
public class FGenero extends javax.swing.JFrame {

    private Genero genero = new Genero();
    private GeneroTableModel jTGeneroModel = null;
    private GeneroDAO dao = new GeneroDAO();
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form FGenero
     */
    public FGenero() {
        initComponents();
        carregarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTNome = new javax.swing.JTextField();
        jBIncluir = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTGenero = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generos");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBIncluir)
                    .addComponent(jBExcluir)
                    .addComponent(jBSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTGenero.setModel(new javax.swing.table.DefaultTableModel(
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
        jTGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTGeneroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTGenero);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                genero.setNome(jTNome.getText());
                if (jBIncluir.getText().equals("Incluir")) {
                    dao.inserir(genero);
                    JOptionPane.showMessageDialog(null, "Genero " + genero.getNome() + " incluido corretamente!");
                } else {
                    dao.alterar(genero);
                    JOptionPane.showMessageDialog(null, "Genero " + genero.getNome() + " alterado corretamente!");
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
        int indice = jTGenero.getSelectedRow();
        if (indice != -1) {
            Genero gen = (Genero) jTGeneroModel.getValueAt(indice, -1);
            try {
                dao.deletar(gen.getId());
                JOptionPane.showMessageDialog(null, "Genero " + gen.getNome() + " excluido corretamente!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + e.getMessage());
            }
            jTGeneroModel.deleta(indice);
        }
        carregarLista();
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jTGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTGeneroMouseClicked
        int indice = jTGenero.getSelectedRow();
        if (indice != -1) {
            genero = (Genero) jTGeneroModel.getValueAt(indice, -1);
            jBIncluir.setText("Alterar");
            jBSair.setText("Limpar");
            jTNome.setText(genero.getNome());
        }
    }//GEN-LAST:event_jTGeneroMouseClicked

    private void carregarLista() {
        try {
            jTGeneroModel = new GeneroTableModel(dao.listarGeneros());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + e.getMessage());
        }
        jTGeneroModel.addTableModelListener(jTGenero);
        jTGenero.setModel(jTGeneroModel);
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        jTGenero.getColumnModel().getColumn(0).setCellRenderer(centralizado);

        jTNome.setText("");
        jBIncluir.setText("Incluir");
        jBSair.setText("Sair");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBIncluir;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTGenero;
    private javax.swing.JTextField jTNome;
    // End of variables declaration//GEN-END:variables

}
