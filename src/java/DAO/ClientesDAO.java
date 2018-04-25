/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rodri
 */
public class ClientesDAO {
    
    private Session sessao;
    private Transaction transacao;
    
    public void salvar(Clientes cli){
        //abrir a sessão
        sessao = Sessao.getSessao();
        //inicar transacao
        transacao = sessao.beginTransaction();
        //salvar
        sessao.saveOrUpdate(cli);
        //finalizar a transacao
        transacao.commit();
        //fechar a sessão
        sessao.close();
    }
    
    public void excluir(Clientes cli){
        sessao = Sessao.getSessao();
        transacao = sessao.beginTransaction();
        sessao.delete(cli);
        transacao.commit();
        sessao.close();
    }
    
    public  Clientes selecionar(int codigo){
        Clientes cli = null;
        sessao = Sessao.getSessao();
        cli = (Clientes) sessao.get(Clientes.class, codigo);
        sessao.close();
        return cli;
    }
    
    public List<Clientes> selecionar(String nome){
        List<Clientes> lista = new ArrayList<Clientes>();
        sessao = Sessao.getSessao();
        //criação dos criterios de busca
        Criteria cri = sessao.createCriteria(Clientes.class);
        //criaçaõ de um filtro
        Criterion filtroNome = 
                Restrictions.like("usu_nome", nome + "%");
        //adicionar os filtros
        cri.add(filtroNome);
        //obter a lista
        lista = cri.list();
        //fechar a sessao
        sessao.close();
        return lista;
    }
    
    
    public Clientes  logar (String cpf, String senha){
        Clientes cli = null;
        sessao = Sessao.getSessao();
        Criteria cri = sessao.createCriteria(Clientes.class);
        Criterion rest1= Restrictions.and(Restrictions.eq("usu_senha", senha), Restrictions.eq("usu_cpf", cpf));
        cri.add(rest1);
        List<Clientes> lista2 = cri.list();
        if(lista2!=null) {
            cli = lista2.get(0);
        }
        sessao.close();
        return cli;
    }
    
    
    
    
}