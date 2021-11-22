/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.Entidade;

import javax.swing.JLabel;

/**
 *
 * @author maste
 */
public class usuario {

    /**
     * @return the verificacao_usuario
     */
    public boolean isVerificacao_usuario() {
        return verificacao_usuario;
    }

    /**
     * @param verificacao_usuario the verificacao_usuario to set
     */
    public void setVerificacao_usuario(boolean verificacao_usuario) {
        this.verificacao_usuario = verificacao_usuario;
    }

    /**
     * @return the nome_usuario
     */
    public String getNome_usuario() {
        return nome_usuario;
    }

    /**
     * @param nome_usuario the nome_usuario to set
     */
    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    /**
     * @return the senha_usuario
     */
    public String getSenha_usuario() {
        return senha_usuario;
    }

    /**
     * @param senha_usuario the senha_usuario to set
     */
    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }
    private String nome_usuario;
    private String senha_usuario;
    private boolean verificacao_usuario;
}
