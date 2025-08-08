//Pacote
package com.pucpr.crud.model;
import jakarta.persistence.*;

/* Especificando uma anotação que: é uma classe entidade, adicionando nome da entidade
* Especificando que ela terá uma tabela, adicionando nome da tabela*/

@Entity(name = "product")
@Table(name = "product")

public class Product {

    /*Definindo atributos e informando que o próximo atributo abaixo @Id
     é um id junto do GeneratedValue que informa a geração de valor automática*/
    // constructor vazio
    public Product() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Long price;
// Construtor
    public Product(Integer id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
// Getters Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
