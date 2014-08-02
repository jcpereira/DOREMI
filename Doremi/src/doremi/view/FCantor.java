package doremi.view;

import doremi.controler.CantorDAO;
import doremi.model.Cantor;
import doremi.model.CantorTableModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author João Carlos Luis Pereira
 *
 */
public class FCantor extends javax.swing.JFrame {

    private CantorTableModel jTCantorModel = null;
    private CantorDAO dao = new CantorDAO();
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form FCantor
     */
    public FCantor() {
        initComponents();
        carregarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTnome = new javax.swing.JTextField();
        jBIncluir = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTCantor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
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
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTnome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBIncluir)
                    .addComponent(jBexcluir)
                    .addComponent(jBSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTCantor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Cantor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTCantor.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jTCantorComponentRemoved(evt);
            }
        });
        jScrollPane2.setViewportView(jTCantor);

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
        FTelaInicial ini = new FTelaInicial();
        ini.setLocation(this.location().getLocation());
        this.dispose();
        ini.show();
    }//GEN-LAST:event_jBSairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        FTelaInicial ini = new FTelaInicial();
        ini.setLocation(this.location().getLocation());
        this.dispose();
        ini.show();
    }//GEN-LAST:event_formWindowClosing

    private void jBIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIncluirActionPerformed
        if (!jTnome.getText().equals("")) {
            try {
                Cantor cant = new Cantor();
                cant.setNome(jTnome.getText());
                jTnome.setText("");
                dao.inserir(cant);
                carregarLista();
                JOptionPane.showMessageDialog(null, "Cantor " + cant.getNome() + " incluido corretamente!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor preencha o campo nome!");
        }
    }//GEN-LAST:event_jBIncluirActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        int indice = jTCantor.getSelectedRow();
        if (indice != -1) {
            Cantor cant = (Cantor) jTCantorModel.getValueAt(indice, -1);
            try {
                dao.deletar(cant.getId());
                JOptionPane.showMessageDialog(null, "Cantor " + cant.getNome() + " excluido corretamente!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + e.getMessage());
            }
            jTCantorModel.deleta(indice);
        }
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jTCantorComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTCantorComponentRemoved
        int indice = jTCantor.getSelectedRow();
        jTCantor.addRowSelectionInterval(0,0);
        if (indice != -1) {
            Cantor cant = (Cantor) jTCantorModel.getValueAt(indice, -1);
            try {                       
                dao.alterar(cant);
                JOptionPane.showMessageDialog(null, "Cantor " + cant.getNome() + " excluido corretamente!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + e.getMessage());
            }
            jTCantorModel.deleta(indice);
        }
    }//GEN-LAST:event_jTCantorComponentRemoved

    private void carregarLista() {
        try {
            jTCantorModel = new CantorTableModel(dao.listarCantors());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar banco de dados! \n" + e.getMessage());
        }
        jTCantorModel.addTableModelListener(jTCantor);
        jTCantor.setModel(jTCantorModel);
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        jTCantor.getColumnModel().getColumn(0).setCellRenderer(centralizado);

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
    private javax.swing.JButton jBIncluir;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTCantor;
    private javax.swing.JTextField jTnome;
    // End of variables declaration//GEN-END:variables

}
