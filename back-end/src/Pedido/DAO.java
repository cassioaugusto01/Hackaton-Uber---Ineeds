package Pedido;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class DAO {
		
	    public void inserir(Processo al){
	        String url    = "jdbc:mysql://localhost/hacka_uber";
	        String user = "root";
	        String pwd = "";    
	        try {
	            Connection conexao = DriverManager.getConnection(url, user, pwd);
	            String sql = "insert into info(receber_ped, Origem, Destino) values (?,?,?,?)";
	            PreparedStatement ps =  conexao.prepareStatement(sql);
	            ps.setString(1, al.getReceber_ped());
	            ps.setString(2, al.getOrigem());
	            ps.setString(3, al.getDestino());
	            ps.executeUpdate();                    
	            conexao.close();
	                    
	        } catch (SQLException ex) {
	            System.out.println("Erro:" + ex.getMessage());
	        }     
	    }
	    
	    public void incluir(){
	    }
	    public void selecionar(){
	    }
	    public void alterar(){
	    }
	    
	}