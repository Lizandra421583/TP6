//package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Crud
{
    private Connection connection;
    public Crud(Connection conexao){
        this.conexao = conexao;
    }
    
    public boolean create(int cpf, String nome){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("INSERT INTO Aluno VALUES("+cpf+", '"+nome+"')");
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean read(int cpf){
        try{
            Statement statement = this.conexao.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Aluno WHERE cpf = "+cpf);
            
            while (rs.next()) {
                Integer id = rs.getInt("cpf");
                String nome = rs.getString("nome");
                
                System.out.println( cpf +" - " + nome);
            }
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean update(int cpf, String novoNome){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("UPDATE Aluno SET nome = '"+novoNome+"' WHERE cpf="+cpf);
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean delete(int cpf){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("DELETE FROM Aluno WHERE cpf="+cpf+"");
            
            return true;
        }catch(SQLException e){
            return false;
        }
    }
}
