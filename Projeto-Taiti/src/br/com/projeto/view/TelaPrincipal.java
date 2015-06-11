/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import br.com.projeto.model.Rodada;
import br.com.projeto.model.Time;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Guilherme Lourenço
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    List<Rodada> rodadas;
    List<Time> times;
    public TelaPrincipal() {
        initComponents();
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("../image/cup.png") );
        this.setIconImage(icon);
        
        rodadas = new ArrayList<>();
        times = new ArrayList<>();

        Time t1 = new Time("Atletico Mineiro", new ImageIcon("src/br/com/projeto/image/atletico_mg_60x60.png"),17,11,10);

        Time t2 = new Time("Atletico Paranaense", new ImageIcon("src/br/com/projeto/image/atletico_pr_60x60.png"),15,9,14);

        Time t3 = new Time("Avai", new ImageIcon("src/br/com/projeto/image/avai_60x60.png"),18,8,12);

        Time t4 = new Time("Chapecoense", new ImageIcon("src/br/com/projeto/image/chapecoense_60x60.png"),11,10,17);

        Time t5 = new Time("Corinthians", new ImageIcon("src/br/com/projeto/image/corinthians_60x60.png"),19,12,7);

        Time t6 = new Time("Coritiba", new ImageIcon("src/br/com/projeto/image/coritiba_60x60.png"),12,11,15);

        Time t7 = new Time("Cruzeiro", new ImageIcon("src/br/com/projeto/image/cruzeiro_60x60.png"),24,8,6);

        Time t8 = new Time("Figueirense", new ImageIcon("src/br/com/projeto/image/figueirense_60x60.png"),13,8,17);

        Time t9 = new Time("Flamengo", new ImageIcon("src/br/com/projeto/image/flamengo_60x60.png"),14,10,14);

        Time t10 = new Time("Fluminense", new ImageIcon("src/br/com/projeto/image/fluminense_60x60.png"),17,10,11);

        Time t11 = new Time("Goias", new ImageIcon("src/br/com/projeto/image/goias_60x60.png"),13,8,17);

        Time t12 = new Time("Gremio", new ImageIcon("src/br/com/projeto/image/gremio_60x60.png"),17,10,11);

        Time t13 = new Time("Internacional", new ImageIcon("src/br/com/projeto/image/internacional_60x60.png"),21,6,11);

        Time t14 = new Time("Joinville", new ImageIcon("src/br/com/projeto/image/joinville_60x60.png"),21,7,10);

        Time t15 = new Time("Palmeiras", new ImageIcon("src/br/com/projeto/image/palmeiras_60x60.png"),11,7,20);

        Time t16 = new Time("Ponte Preta", new ImageIcon("src/br/com/projeto/image/ponte_preta_60x60.png"),19,12,7);

        Time t17 = new Time("Santos", new ImageIcon("src/br/com/projeto/image/santos_60x60.png"),15,8,15);

        Time t18 = new Time("São Paulo", new ImageIcon("src/br/com/projeto/image/sao_paulo_60x60.png"),20,10,8);

        Time t19 = new Time("Sport", new ImageIcon("src/br/com/projeto/image/sport_60x60.png"),14,10,14);

        Time t20 = new Time("Vasco", new ImageIcon("src/br/com/projeto/image/vasco_60x60.png"),16,15,7);

        times.add(t1);
        times.add(t2);
        times.add(t3);
        times.add(t4);
        times.add(t5);
        times.add(t6);
        times.add(t7);
        times.add(t8);
        times.add(t9);
        times.add(t10);
        times.add(t11);
        times.add(t12);
        times.add(t13);
        times.add(t14);
        times.add(t15);
        times.add(t16);
        times.add(t17);
        times.add(t18);
        times.add(t19);
        times.add(t20);
        
        this.novaRodada();
        this.jlListaDeRodadas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
    }
    
    private void novaRodada(){
        Rodada r = new Rodada(times);
        rodadas.add(r);
        jlListaDeRodadas.setListData(rodadas.toArray());
        jlListaDeRodadas.setSelectedIndex(rodadas.size()-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlListaDeRodadas = new javax.swing.JList();
        btnNovaRodada = new javax.swing.JButton();
        paine2 = new javax.swing.JPanel();
        btnVisualizarRodada = new javax.swing.JButton();
        btnClassificacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador de Campeonato");

        painel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rodadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("FIFA Welcome", 0, 24))); // NOI18N

        jScrollPane1.setViewportView(jlListaDeRodadas);

        btnNovaRodada.setText("Nova Rodada");
        btnNovaRodada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaRodadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnNovaRodada, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addContainerGap())
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnNovaRodada)
                .addContainerGap())
        );

        paine2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campeonato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("FIFA Welcome", 0, 24))); // NOI18N

        btnVisualizarRodada.setText("Visualizar Informações da Rodada");
        btnVisualizarRodada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarRodadaActionPerformed(evt);
            }
        });

        btnClassificacao.setText("Visualizar Classificação");
        btnClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassificacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paine2Layout = new javax.swing.GroupLayout(paine2);
        paine2.setLayout(paine2Layout);
        paine2Layout.setHorizontalGroup(
            paine2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paine2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paine2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVisualizarRodada, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(btnClassificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paine2Layout.setVerticalGroup(
            paine2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paine2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVisualizarRodada)
                .addGap(18, 18, 18)
                .addComponent(btnClassificacao)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaRodadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaRodadaActionPerformed
        this.novaRodada();
    }//GEN-LAST:event_btnNovaRodadaActionPerformed

    private void btnVisualizarRodadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarRodadaActionPerformed
        TelaRodada novaTelaRodada = new TelaRodada((Rodada) jlListaDeRodadas.getSelectedValue());
        novaTelaRodada.setLocationRelativeTo(null);
        novaTelaRodada.setVisible(true);
    }//GEN-LAST:event_btnVisualizarRodadaActionPerformed

    private void btnClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassificacaoActionPerformed
        TelaClassificacao classificacao = new TelaClassificacao(times);
    }//GEN-LAST:event_btnClassificacaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClassificacao;
    private javax.swing.JButton btnNovaRodada;
    private javax.swing.JButton btnVisualizarRodada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList jlListaDeRodadas;
    private javax.swing.JPanel paine2;
    private javax.swing.JPanel painel1;
    // End of variables declaration//GEN-END:variables
}
