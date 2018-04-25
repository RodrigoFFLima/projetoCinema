/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.util.Date;

/**
 *
 * @author rodri
 */
public class Sessao {
    private int ses_id;
    private Date ses_horario;

    public Sessao() {
    }

    public Sessao(int ses_id, Date ses_horario) {
        this.ses_id = ses_id;
        this.ses_horario = ses_horario;
    }

    public int getSes_id() {
        return ses_id;
    }

    public void setSes_id(int ses_id) {
        this.ses_id = ses_id;
    }

    public Date getSes_horario() {
        return ses_horario;
    }

    public void setSes_horario(Date ses_horario) {
        this.ses_horario = ses_horario;
    }
    
    
}
