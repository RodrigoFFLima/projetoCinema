/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Bean.Filmes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.*;
import org.hibernate.criterion.*;

/**
 *
 * @author rodri
 */
public class FilmesDAO {
        
    private Session sessao;
    private Transaction transacao;
    
    public List<Filmes> selecionar(){
        List<Filmes> lista = new ArrayList<Filmes>();
        sessao = Sessao.getSessao();
        //criação dos criterios de busca
        Criteria cri = sessao.createCriteria(Filmes.class);
        //criaçaõ de um filtro
        Criterion filtroAtivo = 
                Restrictions.eq("fil_ativo", 1);
        //adicionar os filtros
        cri.add(filtroAtivo);
        //adicionar orderby
        cri.addOrder(Order.asc("fil_id"));
        //obter a lista
        lista = cri.list();
        //fechar a sessao
        sessao.close();
        return lista;
    }
    
    public List<Filmes> selecionarEspecifico(int id){
        List<Filmes> lista = new ArrayList<Filmes>();
        sessao = Sessao.getSessao();
        //criação dos criterios de busca
        Criteria cri = sessao.createCriteria(Filmes.class);
        //criaçaõ de um filtro
        Criterion filtroAtivo = 
                Restrictions.eq("fil_id", id);
        //adicionar os filtros
        cri.add(filtroAtivo);
        //obter a lista
        lista = cri.list();
        //fechar a sessao
        sessao.close();
        return lista;
    }
}
