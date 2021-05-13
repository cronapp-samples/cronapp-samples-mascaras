package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PAGAMENTO
* @generated
*/
@Entity
@Table(name = "\"PAGAMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Pagamento")
public class Pagamento implements Serializable {

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
    @ManyToOne
    @JoinColumn(name="fk_empresa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Empresa empresa;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_funcionario", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Funcionario funcionario;

    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data = Calendar.getInstance().getTime();

    /**
    * @generated
    */
    @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valor;

    /**
    * Construtor
    * @generated
    */
    public Pagamento(){
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
    public Pagamento setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém empresa
    * return empresa
    * @generated
    */
    
    public Empresa getEmpresa(){
        return this.empresa;
    }

    /**
    * Define empresa
    * @param empresa empresa
    * @generated
    */
    public Pagamento setEmpresa(Empresa empresa){
        this.empresa = empresa;
        return this;
    }
    /**
    * Obtém funcionario
    * return funcionario
    * @generated
    */
    
    public Funcionario getFuncionario(){
        return this.funcionario;
    }

    /**
    * Define funcionario
    * @param funcionario funcionario
    * @generated
    */
    public Pagamento setFuncionario(Funcionario funcionario){
        this.funcionario = funcionario;
        return this;
    }
    /**
    * Obtém data
    * return data
    * @generated
    */
    
    public java.util.Date getData(){
        return this.data;
    }

    /**
    * Define data
    * @param data data
    * @generated
    */
    public Pagamento setData(java.util.Date data){
        this.data = data;
        return this;
    }
    /**
    * Obtém valor
    * return valor
    * @generated
    */
    
    public java.lang.Double getValor(){
        return this.valor;
    }

    /**
    * Define valor
    * @param valor valor
    * @generated
    */
    public Pagamento setValor(java.lang.Double valor){
        this.valor = valor;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Pagamento object = (Pagamento)obj;
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