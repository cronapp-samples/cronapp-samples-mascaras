package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela FUNCIONARIO
* @generated
*/
@Entity
@Table(name = "\"FUNCIONARIO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Funcionario")
public class Funcionario implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;

    /**
    * @generated
    */
    @Column(name = "CPF", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cpF;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private User user;

    /**
    * Construtor
    * @generated
    */
    public Funcionario(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Funcionario setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    
    public java.lang.String getNome(){
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Funcionario setNome(java.lang.String nome){
        this.nome = nome;
        return this;
    }
    /**
    * Obtém cpF
    * return cpF
    * @generated
    */
    
    public java.lang.String getCpF(){
        return this.cpF;
    }

    /**
    * Define cpF
    * @param cpF cpF
    * @generated
    */
    public Funcionario setCpF(java.lang.String cpF){
        this.cpF = cpF;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    
    public User getUser(){
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public Funcionario setUser(User user){
        this.user = user;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Funcionario object = (Funcionario)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}