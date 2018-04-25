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
public class FaixaEtaria {
    private int fet_id;
    private int fet_idade;

    public FaixaEtaria() {
    }

    public FaixaEtaria(int fet_id, int fet_idade) {
        this.fet_id = fet_id;
        this.fet_idade = fet_idade;
    }

    public int getFet_id() {
        return fet_id;
    }

    public void setFet_id(int fet_id) {
        this.fet_id = fet_id;
    }

    public int getFet_idade() {
        return fet_idade;
    }

    public void setFet_idade(int fet_idade) {
        this.fet_idade = fet_idade;
    }


    
    
}
