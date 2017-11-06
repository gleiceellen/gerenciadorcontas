
package gleice.projetoum.modelos;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private TipoConta tipo;
    private Double valor;
    @ManyToOne
    private Categoria categoria;

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    
}


