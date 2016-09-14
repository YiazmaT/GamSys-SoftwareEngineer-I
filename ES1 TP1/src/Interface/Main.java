/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import Classes.GamSys;
import java.awt.GridLayout;
import static java.lang.System.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author Eymar Lima
 */
public class Main extends javax.swing.JFrame {
    private String usuarioLogado;
    private GamSys controlador;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        principal.setLayout(new GridLayout(1, 1));
        this.controlador = new GamSys();
        this.travarMenus();
        this.chamarLogin();
        
    }

    public void setNomeUsuarioLogado(String nome){
        this.usuarioLogado = nome;
    }
    
    
    public GamSys getGamSys(){
        return controlador;
    }
    
    //chamadas
    public void chamarLogin(){
        principal.removeAll();
        principal.add(new Login(this, this.controlador));
        principal.revalidate();
        principal.repaint();
    }    
    public void chamarMenuInicial(){
        usuarioLogado = controlador.getUsuarioLogado().getNome();
        principal.removeAll();
        principal.add(new MenuInicial(usuarioLogado));
        principal.revalidate();
        principal.repaint();
    }
    public void chamarBiblioteca(){
        principal.removeAll();
        principal.add(new Biblioteca(controlador, this));
        principal.revalidate();
        principal.repaint();
    }
    public void chamarComunidades(){
        principal.removeAll();
        principal.add(new Comunidade(this,controlador.getUsuarioLogado()));
        principal.revalidate();
        principal.repaint();
    }
    public void chamarCarrinho(){
        principal.removeAll();
        principal.add(new Carrinho(this, controlador));
        principal.revalidate();
        principal.repaint();
    }
    public void chamarLoja(){
        principal.removeAll();
        principal.add(new Loja(this,controlador));
        principal.revalidate();
        principal.repaint();
    }
    public void chamarNovaConta() {
        principal.removeAll();
        principal.add(new NovaConta(this));
        principal.revalidate();
        principal.repaint();
    }
    public void chamarTrocarInformacoes(){
        principal.removeAll();
        principal.add(new AlterarInformacoesPessoais(controlador));
        principal.revalidate();
        principal.repaint();
    }
    //menus
    public void destravarMenus(){
        logoutMenu.setEnabled(true);
        inicioMenu.setEnabled(true);
        usuarioMenu.setEnabled(true);
        comprasMenu.setEnabled(true);
        loginMenu.setEnabled(false);
    }
    public void travarMenus(){
        logoutMenu.setEnabled(false);
        inicioMenu.setEnabled(false);
        usuarioMenu.setEnabled(false);
        comprasMenu.setEnabled(false);
        loginMenu.setEnabled(true);
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
        principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        inicioMenu = new javax.swing.JMenuItem();
        loginMenu = new javax.swing.JMenuItem();
        logoutMenu = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        usuarioMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        comprasMenu = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GamSys");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        principal.setOpaque(false);

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel1.add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-1134468_960_720.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 480));

        jMenu1.setText("Iniciar");

        inicioMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        inicioMenu.setText("Inicio");
        inicioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioMenuActionPerformed(evt);
            }
        });
        jMenu1.add(inicioMenu);

        loginMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loginin.png"))); // NOI18N
        loginMenu.setText("Login");
        loginMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuActionPerformed(evt);
            }
        });
        jMenu1.add(loginMenu);

        logoutMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logOut.png"))); // NOI18N
        logoutMenu.setText("Logout");
        logoutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuActionPerformed(evt);
            }
        });
        jMenu1.add(logoutMenu);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        jMenuItem5.setText("Sair");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        usuarioMenu.setText("Usuário");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/33.png"))); // NOI18N
        jMenuItem1.setText("Lista de Amigos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        usuarioMenu.add(jMenuItem1);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/44.png"))); // NOI18N
        jMenuItem6.setText("Biblioteca");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        usuarioMenu.add(jMenuItem6);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/people.png"))); // NOI18N
        jMenuItem9.setText("Comunidades");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        usuarioMenu.add(jMenuItem9);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/99.png"))); // NOI18N
        jMenuItem2.setText("Alterar Informações Pessoais");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        usuarioMenu.add(jMenuItem2);

        jMenuBar1.add(usuarioMenu);

        comprasMenu.setText("Compras");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/store.png"))); // NOI18N
        jMenuItem7.setText("Loja");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        comprasMenu.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/55.png"))); // NOI18N
        jMenuItem8.setText("Carrinho");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        comprasMenu.add(jMenuItem8);

        jMenuBar1.add(comprasMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        principal.removeAll();
        principal.add(new ListaDeAmigos(this,controlador));
        principal.revalidate();
        principal.repaint();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void logoutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuActionPerformed
        int confirmation = JOptionPane.showConfirmDialog(null, "Deseja Realmente Fazer Logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if (confirmation == 0) {
            this.travarMenus();
            this.chamarLogin();
        }
    }//GEN-LAST:event_logoutMenuActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.chamarBiblioteca();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.chamarLoja();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        this.chamarCarrinho();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       int confirmation = JOptionPane.showConfirmDialog(null, "Deseja Realmente Fechar o Sistema?", "Sair", JOptionPane.YES_NO_OPTION);
        if (confirmation == 0) {
            exit(0);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void loginMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuActionPerformed
        this.chamarLogin();
    }//GEN-LAST:event_loginMenuActionPerformed

    private void inicioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioMenuActionPerformed
        this.chamarMenuInicial();
    }//GEN-LAST:event_inicioMenuActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        this.chamarComunidades();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.chamarTrocarInformacoes();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu comprasMenu;
    private javax.swing.JMenuItem inicioMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem loginMenu;
    private javax.swing.JMenuItem logoutMenu;
    private javax.swing.JPanel principal;
    private javax.swing.JMenu usuarioMenu;
    // End of variables declaration//GEN-END:variables

    
}
