package DAO;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author home
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

public class Sessao {
    private static SessionFactory fabricaSessao;
    private static Configuration hibernateConfig;
    // Estrutura static para garantir que a SessionFactory seja iniciada apenas uma vez
    static {
        try {
            
            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                    .applySettings(cfg.getProperties());

            System.out.println("SUCESSO NA CONEXAO MYSQL 5 ");
            fabricaSessao = cfg.buildSessionFactory(builder.build());
            
            //hibernateConfig = new Configuration().configure("hibernate.cfg.xml");
           // fabricaSessao = hibernateConfig.buildSessionFactory(null);
            atualizarBD();
        } catch (Exception e){
             System.out.println("FALHA NA CONEXAO MYSQL  " + e.getMessage());
        }
    }
    // Retorna a sessão
    public static Session getSessao(){
         Session sessao =null;
         try {
             sessao =  fabricaSessao.openSession();
          
        } catch (Exception e){
             System.out.println("FALHA NA CONEXAO MYSQL  " + e.getMessage());
        }
           return sessao;
    }
 
    // Atualiza o Schema do Banco de Dados
    private static void atualizarBD(){
        SchemaUpdate se = new SchemaUpdate(hibernateConfig);
        se.execute(true, true);
    }
}
