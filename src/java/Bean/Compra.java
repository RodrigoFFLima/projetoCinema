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
public class Compra {
    
    private int comp_id;
    private Date com_dataCompra;
    private Double com_total;
    private int fpg_id;

    public Compra() {
    }

    public Compra(int comp_id, Date com_dataCompra, Double com_total, int fpg_id) {
        this.comp_id = comp_id;
        this.com_dataCompra = com_dataCompra;
        this.com_total = com_total;
        this.fpg_id = fpg_id;
    }

    public int getComp_id() {
        return comp_id;
    }

    public void setComp_id(int comp_id) {
        this.comp_id = comp_id;
    }

    public Date getCom_dataCompra() {
        return com_dataCompra;
    }

    public void setCom_dataCompra(Date com_dataCompra) {
        this.com_dataCompra = com_dataCompra;
    }

    public Double getCom_total() {
        return com_total;
    }

    public void setCom_total(Double com_total) {
        this.com_total = com_total;
    }

    public int getFpg_id() {
        return fpg_id;
    }

    public void setFpg_id(int fpg_id) {
        this.fpg_id = fpg_id;
    }
    
    
}
