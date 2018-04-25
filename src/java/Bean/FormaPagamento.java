/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author rodri
 */
public class FormaPagamento {
    
    private int fpg_id;
    private String fpg_descricao;

    public FormaPagamento() {
    }

    public FormaPagamento(int fpg_id, String fpg_descricao) {
        this.fpg_id = fpg_id;
        this.fpg_descricao = fpg_descricao;
    }

    public int getFpg_id() {
        return fpg_id;
    }

    public void setFpg_id(int fpg_id) {
        this.fpg_id = fpg_id;
    }

    public String getFpg_descricao() {
        return fpg_descricao;
    }

    public void setFpg_descricao(String fpg_descricao) {
        this.fpg_descricao = fpg_descricao;
    }
    
    
    
}
