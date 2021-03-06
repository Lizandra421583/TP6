//package Conexao; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestConexaoSqlite3 {
    
    private Connection connection;
    public TestConexaoSqlite3(){
        this.connection = null;
    }
    
    private void setConnection(Connection connection){
        this.connection = connection;
    }
    public Connection getConnection(){
        return this.connection;
    }
    
    public boolean abrirConexao(){
        
        try
        {
            connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/Lizandra/TP6/TP6.db");
            this.setConnection(connection);
            return true;
        }
        catch(SQLException e)
        {
            return false;
        }
    }
        public boolean fecharConexao(){
            try
            {
                if(this.getConnection() != null)
                    this.getConnection().close();
                    return true;
            }
            catch(SQLException e)
            {
                return false;
            }
    }
}
