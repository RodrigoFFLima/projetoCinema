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
public class Ingresso {
    
    private int ing_id;
    private int fil_id;
    private int ses_id;
    private int usu_id;

    public Ingresso() {
    }

    public Ingresso(int ing_id, int fil_id, int ses_id, int usu_id) {
        this.ing_id = ing_id;
        this.fil_id = fil_id;
        this.ses_id = ses_id;
        this.usu_id = usu_id;
    }

    public int getIng_id() {
        return ing_id;
    }

    public void setIng_id(int ing_id) {
        this.ing_id = ing_id;
    }

    public int getFil_id() {
        return fil_id;
    }

    public void setFil_id(int fil_id) {
        this.fil_id = fil_id;
    }

    public int getSes_id() {
        return ses_id;
    }

    public void setSes_id(int ses_id) {
        this.ses_id = ses_id;
    }

    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }
    
    
}
