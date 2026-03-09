
package com.forumhub.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Topico{

 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;

 private String titulo;
 private String mensagem;
 private String autor;
 private String curso;
 private String status;
 private LocalDateTime dataCriacao=LocalDateTime.now();

 public Topico(){}

 public Topico(String titulo,String mensagem,String autor,String curso){
  this.titulo=titulo;
  this.mensagem=mensagem;
  this.autor=autor;
  this.curso=curso;
  this.status="ABERTO";
 }

 public Long getId(){return id;}
 public String getTitulo(){return titulo;}
 public String getMensagem(){return mensagem;}
}
