package interface1;

import javax.swing.AbstractButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        optFeminino = new javax.swing.JRadioButton();
        optMasculino = new javax.swing.JRadioButton();
        chkTipo_cadeira = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        JList listEstado = new javax.swing.JList<>();
        JComboBox cbxCidade = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();
        btnSelecionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 50, 27, 14);

        txtNome.setName("txtNome"); 
        getContentPane().add(txtNome);
        txtNome.setBounds(90, 40, 130, 30);

        jLabel2.setText("Sexo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 24, 14);

        buttonGroupSexo.add(optFeminino);
        optFeminino.setText("Feminino");
        optFeminino.setName("optFeminino"); 
        getContentPane().add(optFeminino);
        optFeminino.setBounds(90, 100, 67, 23);

        buttonGroupSexo.add(optMasculino);
        optMasculino.setText("masculino");
        optMasculino.setName("optMasculino"); 
        getContentPane().add(optMasculino);
        optMasculino.setBounds(160, 100, 71, 23);
        

        chkTipo_cadeira.setText("Tem nÃ­vel superior");
        chkTipo_cadeira.setName("chkTipo_cadeira"); 
        getContentPane().add(chkTipo_cadeira);
        chkTipo_cadeira.setBounds(60, 160, 120, 23);

        listEstado.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "AC\n" + 
            		"AL\n" + 
            		"AP\n" + 
            		"AM\n" + 
            		"BA\n" + 
            		"CE\n" + 
            		"DF\n" + 
            		"ES\n" + 
            		"GO\n" + 
            		"MA\n" + 
            		"MT\n" + 
            		"MS\n" + 
            		"MG\n" + 
            		"PA\n" + 
            		"PB\n" + 
            		"PR\n" + 
            		"PE\n" + 
            		"PI\n" + 
            		"RJ\n" + 
            		"RN\n" + 
            		"RS\n" + 
            		"RO\n" + 
            		"RR\n" + 
            		"SC\n" + 
            		"SP\n" + 
            		"SE\n" + 
            		"TO"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listEstado.setName("listEstado"); 
        jScrollPane1.setViewportView(listEstado);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 250, 230, 80);

        cbxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Acre (AC)\n" + 
        		"Alagoas (AL)\n" + 
        		"Amapá (AP)\n" + 
        		"Amazonas (AM)\n" + 
        		"Bahia (BA)\n" + 
        		"Ceará (CE)\n" + 
        		"Distrito Federal (DF)\n" + 
        		"Espírito Santo (ES)\n" + 
        		"Goiás (GO)\n" + 
        		"Maranhão (MA)\n" + 
        		"Mato Grosso (MT)\n" + 
        		"Mato Grosso do Sul (MS)\n" + 
        		"Minas Gerais (MG)\n" + 
        		"Pará (PA) \n" + 
        		"Paraíba (PB)\n" + 
        		"Paraná (PR)\n" + 
        		"Pernambuco (PE)\n" + 
        		"Piauí (PI)\n" + 
        		"Rio de Janeiro (RJ)\n" + 
        		"Rio Grande do Norte (RN)\n" + 
        		"Rio Grande do Sul (RS)\n" + 
        		"Rondônia (RO)\n" + 
        		"Roraima (RR)\n" + 
        		"Santa Catarina (SC)\n" + 
        		"São Paulo (SP)\n" + 
        		"Sergipe (SE)\n" + 
        		"Tocantins (TO)" }));
        cbxCidade.setName("cbxCidade"); 
        getContentPane().add(cbxCidade);
        cbxCidade.setBounds(60, 200, 230, 30);

        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(320, 60, 170, 120);

        jLabel3.setText("ObservaÃ§Ã£o");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 40, 110, 14);

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nome", "sexo", "cidade", "estado"
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

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover);
        btnRemover.setBounds(310, 300, 80, 23);

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
        Cadastro bean = new Cadastro();
        bean.setNome(txtNome.getText());
        AbstractButton chkCidade = null;
		bean.setCidade(chkTipo_cadeira.isSelected()?cbxCidade.getSelectedItem().toString():"É necessário informar a Cidade");
        bean.setEstado(listEstado.getSelectedValue());
        bean.setSexo(optFeminino.isSelected()?"Feminino":"Masculino");
        bean.setTipo_cadeira(chkTipo_cadeira.isSelected()?"Qual o tipo?":"?");
      
        DAO dao = new DAO();
        dao.inserir(bean);
        
DefaultTableModel model = (DefaultTableModel) tblResultado.getModel();

String[] linha = {txtNome.getText(),optFeminino.isSelected()?"Feminino":"Masculino",chkTipo_cadeira.isSelected()?"Tem":"NÃ£o tem", listEstado.getSelectedValue()};
model.addRow(linha);
tblResultado.setModel(model);


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
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JComboBox<String> cbxCidade;
    private javax.swing.JCheckBox chkTipo_cadeira;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JList<String> listEstado;
    private javax.swing.JRadioButton optFeminino;
    private javax.swing.JRadioButton optMasculino;
    private javax.swing.JTable tblResultado;
    private javax.swing.JTextField txtNome;
}
