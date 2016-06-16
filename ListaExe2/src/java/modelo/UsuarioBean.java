/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 10070187
 */
@ManagedBean
@SessionScoped
public class UsuarioBean {
    private String UsuarioNome; 
    private String senha;
    private double altura;
    private String nome;
    
    public void login(){
        
    }
    
    public void novoUsuario(){
        
    }
    
    public String getUsuarioNome() {
        return UsuarioNome;
    }

    public void setUsuarioNome(String UsuarioNome) {
        this.UsuarioNome = UsuarioNome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
