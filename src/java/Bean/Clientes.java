/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 *
 * @author rodri
 */
@Entity(name = "tb_usuario")

public class Clientes {
    
    @Id
    @GeneratedValue
    @Column(name="usu_id", nullable = false)
    private int usu_id;
    @Column(name="usu_senha", nullable = true, length = 20)
    private String usu_senha;
    @Column(name="usu_nome", nullable = true, length = 200)
    private String usu_nome;
    @Column(name="usu_email", nullable = true, length = 50)
    private String usu_email;
    @Column(name="usu_cpf", nullable = true, length = 12)
    private String usu_cpf;
    @Column(name="usu_telefone", nullable = true, length = 15)
    private String usu_telefone;

    public Clientes(int usu_id, String usu_senha, String usu_nome, String usu_email, String usu_cpf, String usu_telefone) {
        this.usu_id = usu_id;
        this.usu_senha = usu_senha;
        this.usu_nome = usu_nome;
        this.usu_email = usu_email;
        this.usu_cpf = usu_cpf;
        this.usu_telefone = usu_telefone;
    }

    public Clientes() {
    }

    public int getCodigo() {
        return usu_id;
    }

    public void setCodigo(int codigo) {
        this.usu_id = codigo;
    }

    public String getSenha() {
        return usu_senha;
    }

    public void setSenha(String usu_senha) {
        this.usu_senha = usu_senha;
    }

    public String getNome() {
        return usu_nome;
    }

    public void setNome(String usu_nome) {
        this.usu_nome = usu_nome;
    }

    public String getEmail() {
        return usu_email;
    }

    public void setEmail(String usu_email) {
        this.usu_email = usu_email;
    }

    public String getCpf() {
        return usu_cpf;
    }

    public void setCpf(String usu_cpf) {
        this.usu_cpf = usu_cpf;
    }

    public String getTelefone() {
        return usu_telefone;
    }

    public void setTelefone(String usu_telefone) {
        this.usu_telefone = usu_telefone;
    }
    
    
    
}
