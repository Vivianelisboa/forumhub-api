
package com.forumhub.model;
import jakarta.persistence.*;

@Entity
public class Usuario{

 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;

 private String login;
 private String senha;

 public String getLogin(){return login;}
 public String getSenha(){return senha;}
}
