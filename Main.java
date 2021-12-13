//package Conexao; 

import Conexao.TestConexaoSqlite3;
import Conexao.Crud;
import java.sql.Statement;
import java.sql.SQLException;

public class Main{
    public static void main(String args[])throws Exception{
        TestConexaoSqlite3 conexao = new TestConexaoSqlite3();
        conexao.abrirConexao();
        Crud crud = new Crud(conexao.getConnection());
        
        //Inserindo cadastros no banco
        //crud.create(1234567890, "Lizandra");
        //crud.create(1234567890, "Lizandra");
        //crud.create(1234567890, "Lizandra");
        //crud.create(1234567890, "Lizandra");
        
        //Consultando uma linha no banco
        //crud.read(1234567891);
        
        //Alterando um registro no banco
        //crud.update(1234567891, "Novo nome");
        
        //Deletando um registro no banco
        //crud.delete(1234567891);
        
        boolean resposta;
        resposta = crud.create(1234567891, "Lizandra");
        System.out.println(resposta);
        
        
        conexao.fecharConexao();
    }
    
}
