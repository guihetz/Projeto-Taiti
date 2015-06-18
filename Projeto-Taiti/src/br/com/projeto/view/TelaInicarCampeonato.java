/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import br.com.projeto.model.ComparadorDePontos;
import br.com.projeto.model.Rodada;
import br.com.projeto.model.Time;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Daylton
 */
public class TelaInicarCampeonato extends javax.swing.JFrame {    
    public TelaPrincipal tPrincipal;
    /**
     * Creates new form TelaInicarCampeonato
     */    
    List<Rodada> rodadas;
    List<Time> times;
    public static final long TEMPO = (100);
    int i = 0;
    TimerTask tarefa;
    private ImageIcon escudo;
    
    public TelaInicarCampeonato() {
        initComponents();
        
        ImageIcon img = new ImageIcon("src/br/com/projeto/image/cup.png");
        this.setIconImage(img.getImage());
        
        rodadas = new ArrayList<>();
        times = new ArrayList<>();        
        
        btnInciar.setOpaque(false);
        btnInciar.setContentAreaFilled(false);
        btnInciar.setBorderPainted(false);
                
        pgLoading.setOpaque(false);
        pgLoading.setBorderPainted(false);
        pgLoading.setStringPainted(true);
        //pgLoading.setString("Simulando Rodadas...");
        pgLoading.setForeground(Color.GREEN); //Cor da barra de progresso        
        pgLoading.setMaximum(100);    
        pgLoading.setMinimum(0);
    }
    
    public TelaInicarCampeonato(javax.swing.JFrame form){
        this();
        tPrincipal = (TelaPrincipal) form;
    }
    
    public int soma(){
        return this.i = i+2;        
    }
    
    private void novaRodada(){
        Rodada r = new Rodada(times);
        ArrayList<Time> clubes = new ArrayList<>();
        for(Time t: times){
            clubes.add(t);
        }
        Collections.sort(clubes,new ComparadorDePontos());
        for(int x = 0; x < clubes.size();x++){
            clubes.get(x).addPosicao(x+1);
        }
        rodadas.add(r);
    }    
    
    private void setTimes(){
        Time t;
        try {
            File arquivo = new File("src/br/com/projeto/file/Times.txt");
            try (InputStream is = new FileInputStream(arquivo); Scanner entrada = new Scanner(is)) {
                
                while (entrada.hasNext()) {
                    Scanner linha = new Scanner(entrada.nextLine());
                    linha.useDelimiter(";");
                    if (linha.hasNext()) {
                        t = new Time(linha.next(), new ImageIcon(linha.next()), Integer.parseInt(linha.next()), Integer.parseInt(linha.next()), Integer.parseInt(linha.next()));
                        times.add(t);
                    }
                }                
                entrada.close();
                is.close();                
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void fechar(){ 
        this.setTimes();       
        for(int j = 0; j < 38; j++){
            this.novaRodada();
        }        
        
        TelaPrincipalMesmo form1 = new TelaPrincipalMesmo(this.rodadas, this.times, times.get(0).getEscudo());
        form1.setAlwaysOnTop(false);
        form1.setVisible(true);
        form1.setLocationRelativeTo(null);
        this.dispose();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbFundo = new javax.swing.JLabel();
        pgLoading = new javax.swing.JProgressBar();
        btnInciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/image/arquibancada.jpg"))); // NOI18N

        btnInciar.setBackground(new java.awt.Color(255, 255, 255));
        btnInciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pgLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lbFundo)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnInciar, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(btnInciar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(pgLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lbFundo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInciarActionPerformed
        java.util.Timer timer = null;  
        if (timer == null) {  
            timer = new java.util.Timer();  
            tarefa = new TimerTask() {  
                public void run() {  
                    try {                        
                        if(i <= 100){
                            pgLoading.setValue(soma());  
                            if(soma()<=100){
                                pgLoading.setString("Simulando Rodadas...  " +i+"%");
                            }
                            pgLoading.isIndeterminate();                            
                        }else{
                            fechar();
                            tarefa.cancel();
                        }
                        
                    } catch (Exception e) {  
                        e.printStackTrace();  
                    }  
                }  
            };  
            timer.scheduleAtFixedRate(tarefa, TEMPO, TEMPO);  
        }
    }//GEN-LAST:event_btnInciarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicarCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicarCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicarCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicarCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicarCampeonato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInciar;
    private javax.swing.JLabel lbFundo;
    private javax.swing.JProgressBar pgLoading;
    // End of variables declaration//GEN-END:variables
}
