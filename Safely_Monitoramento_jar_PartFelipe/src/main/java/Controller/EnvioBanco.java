package Controller;

import Controller.Conexao;
import Model.CapturaHardware;
import Model.Processador;
import Model.Memoria;
import Model.Disco;
import Model.Maquina;
import java.io.IOException;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
    
public class EnvioBanco extends Conexao {
    
    //AQUI É ONDE ESTOU FAZENDO TODOS OS INSERTS DNO BANCO DE DADOS, TUDO QUE FOR COLOCAR AQUI VAI FUNCIONAR, 
    //SEGUE O SCRIPT

    //INSERT PRO BANCO, POPULAR 
    private Conexao con = new Conexao();
    
    // aqui fazer a inserssao de dados no banco Processador está pronto !
    public void insereDados(String nome) throws IOException {
        try {
            con.executeCommand("insert into processador (nome) values ('" + nome + "')");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void insereMemoria(String ram) throws IOException{
         try {
            con.executeCommand("insert into memoria (TAMANHO_A) values ('" + ram + "')");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void insereDisco(String nome, long tamanho) throws IOException{
        try {
            con.executeCommand("insert into disco (nome, tamanho) values ('" + nome + "', '"+ tamanho + "')");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

         public void insereleitura(int utilizado, int disponivel, int velocidade_de_leitura, int processos, int interrupcoes, int threads) throws IOException{
        try {
            con.executeCommand("insert into leitura ( utilizado, disponivel, velocidade_de_leitura, processos, interrupcoes, threads) values ('" + utilizado + "', '"+ disponivel +"', '"+ velocidade_de_leitura + "', '"+ processos +"', '" +interrupcoes +"', '" + threads+ "' )");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}