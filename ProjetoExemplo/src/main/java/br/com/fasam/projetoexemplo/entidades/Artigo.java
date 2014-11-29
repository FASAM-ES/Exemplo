/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fasam.projetoexemplo.entidades;

import java.util.ArrayList;
import java.util.List;
 
/**
 *
 * @author Otávio
 */
public class Artigo {
    
    String nome;
    String descricao;
    Usuario usuario;

    public Artigo(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    List<Comentario> comentarios;
    
    public Comentario getComentario(Integer i) {
        return comentarios.get(i);
    }
    
    public void addComentario(Comentario comentario) {
        if(this.comentarios == null) {
            this.comentarios = new ArrayList<Comentario>();
        }
        this.comentarios.add(comentario);
    }

    public void remComentario(Comentario comentario) {
        if(this.comentarios != null) {
            this.comentarios.remove(comentario);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
