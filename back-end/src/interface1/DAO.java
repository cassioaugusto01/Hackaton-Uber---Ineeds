package interface1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {
    public void inserir(Cadastro al){
        String url    = "jdbc:mysql://localhost/hacka_uber";
        String user = "root";
        String pwd = "";    
        try {
            Connection conexao = DriverManager.getConnection(url, user, pwd);
            String sql = "insert into (nome, cidade, estado, sexo, tipo_cadeira) values (?,?,?,?,?)";
            PreparedStatement ps =  conexao.prepareStatement(sql);
            ps.setString(1, al.getNome());
            ps.setString(2, al.getCidade());
            ps.setString(3, al.getEstado());
            ps.setString(4, al.getSexo());
            ps.setString(5, al.getTipo_cadeira());
            ps.executeUpdate();                    
            conexao.close();
                    
        } catch (SQLException ex) {
            System.out.println("Erro:" + ex.getMessage());
        }     
    }
    
    public void selecionar(){
    }
    public void alterar(){
    }
    public void deletar(){
    }
    
}
