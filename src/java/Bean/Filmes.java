/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author rodri
 */

@Entity(name="tb_filme")
public class Filmes {
    
    @Id
    @GeneratedValue
    @Column(name="fil_id", nullable = false)
    private int fil_id;
    @Column(name="fil_ativo", nullable = false)
    private int fil_ativo;
    @Column(name="fil_nome", nullable = true, length = 200)
    private String fil_nome;
    @Column(name="fil_sinopse", nullable = true, length = 150)
    private String fil_sinopse;
    @Column(name="fil_duracao", nullable = true, length = 150)
    private int fil_duracao;
    @Column(name="fil_lancamento", nullable = true, length = 10)
    private String fil_lancamento;
    @Column(name="fil_genero", nullable = true, length = 45)
    private String fil_genero;
    @Column(name="fil_poster", nullable = true, length = 200)
    private String fil_poster;
    @Column(name="ses_id", nullable = true, length = 50)
    private String ses_id;
    @Column(name="fet_id", nullable = true)
    private int fet_id;

    public Filmes() {
    }

    public Filmes(int fil_id, int fil_ativo, String fil_nome, String fil_sinopse, int fil_duracao, String fil_lancamento, String fil_genero, String fil_poster, String ses_id, int fet_id) {
        this.fil_id = fil_id;
        this.fil_ativo = fil_ativo;
        this.fil_nome = fil_nome;
        this.fil_sinopse = fil_sinopse;
        this.fil_duracao = fil_duracao;
        this.fil_lancamento = fil_lancamento;
        this.fil_genero = fil_genero;
        this.fil_poster = fil_poster;
        this.ses_id = ses_id;
        this.fet_id = fet_id;
    }

    public int getFil_id() {
        return fil_id;
    }

    public void setFil_id(int fil_id) {
        this.fil_id = fil_id;
    }

    public int getFil_ativo() {
        return fil_ativo;
    }

    public void setFil_ativo(int fil_ativo) {
        this.fil_ativo = fil_ativo;
    }

    public String getFil_nome() {
        return fil_nome;
    }

    public void setFil_nome(String fil_nome) {
        this.fil_nome = fil_nome;
    }

    public String getFil_sinopse() {
        return fil_sinopse;
    }

    public void setFil_sinopse(String fil_sinopse) {
        this.fil_sinopse = fil_sinopse;
    }

    public int getFil_duracao() {
        return fil_duracao;
    }

    public void setFil_duracao(int fil_duracao) {
        this.fil_duracao = fil_duracao;
    }

    public String getFil_lancamento() {
        return fil_lancamento;
    }

    public void setFil_lancamento(String fil_lancamento) {
        this.fil_lancamento = fil_lancamento;
    }

    public String getFil_genero() {
        return fil_genero;
    }

    public void setFil_genero(String fil_genero) {
        this.fil_genero = fil_genero;
    }

    public String getFil_poster() {
        return fil_poster;
    }

    public void setFil_poster(String fil_poster) {
        this.fil_poster = fil_poster;
    }

    public String getSes_id() {
        return ses_id;
    }

    public void setSes_id(String ses_id) {
        this.ses_id = ses_id;
    }

    public int getFet_id() {
        return fet_id;
    }

    public void setFet_id(int fet_id) {
        this.fet_id = fet_id;
    }

   
    
    
}
