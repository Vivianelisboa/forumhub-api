
package com.forumhub.controller;

import org.springframework.web.bind.annotation.*;
import com.forumhub.dto.LoginDTO;
import com.forumhub.repository.UsuarioRepository;

@RestController
@RequestMapping("/login")
public class AuthController{

 private final UsuarioRepository repository;

 public AuthController(UsuarioRepository repository){
  this.repository=repository;
 }

 @PostMapping
 public String login(@RequestBody LoginDTO dto){
  var user=repository.findByLogin(dto.login()).orElseThrow();
  if(user.getSenha().equals(dto.senha())){
   return "TOKEN_EXEMPLO";
  }
  throw new RuntimeException("Login inválido");
 }
}
