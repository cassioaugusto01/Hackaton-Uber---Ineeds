package Pedido;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        ButtonGroup buttonReceber_ped = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        JTextField txtOrigem = new javax. swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTextField txtDestino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tblResultado = new javax.swing.JTable();
        btnSelecionar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Receber_ped");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 50, 27, 14);

        txtOrigem.setText("txtOrigem"); 
        getContentPane().add(txtOrigem);
        txtOrigem.setBounds(90, 40, 130, 30);
        
        txtDestino.setName("txtDestino"); 
        getContentPane().add(txtOrigem);
        txtDestino.setBounds(90, 40, 130, 30);
            	
        
       

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "receber_ped", "origem", "destino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblResultado.setName("tblResultado"); 
        jScrollPane3.setViewportView(tblResultado);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 360, 460, 90);

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelecionar);
        btnSelecionar.setBounds(410, 230, 90, 23);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(410, 300, 80, 23);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(320, 233, 63, 20);

        setSize(new java.awt.Dimension(528, 517));
        setLocationRelativeTo(null);
    }

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {
    }
    
    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {
        
        DefaultTableModel dtm = (DefaultTableModel) tblResultado.getModel();
        dtm.removeRow(tblResultado.getSelectedRow());
        tblResultado.setModel(dtm);
        
    }
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {
    
    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {
        Processo bean = new Processo();
        bean.setReceber_ped(txtNome.getText());
        AbstractButton chkOrigem = null;
		JComboBox<String> cbxOrigem = null;
		bean.setOrigem(chkOrigem.isSelected()?cbxOrigem.getSelectedItem().toString():"É necessário informar o local de saída ou ligar o GPS");
        bean.setDestino(txtDestino.getSelectedText());
      
        DAO dao = new DAO();
        dao.inserir(bean);
        
DefaultTableModel model = (DefaultTableModel) tblResultado.getModel();
 


    }
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.ButtonGroup buttonReceber_ped;
    private javax.swing.JTextField txtOrigem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTable tblResultado;
    private javax.swing.JTextField txtNome;
}
