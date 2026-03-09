
package com.forumhub.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.forumhub.repository.TopicoRepository;
import com.forumhub.model.Topico;
import com.forumhub.dto.TopicoDTO;

@RestController
@RequestMapping("/topicos")
public class TopicoController{

 private final TopicoRepository repository;

 public TopicoController(TopicoRepository repository){
  this.repository=repository;
 }

 @PostMapping
 public Topico criar(@RequestBody TopicoDTO dto){
  return repository.save(new Topico(dto.titulo(),dto.mensagem(),dto.autor(),dto.curso()));
 }

 @GetMapping
 public List<Topico> listar(){
  return repository.findAll();
 }

 @GetMapping("/{id}")
 public Topico detalhar(@PathVariable Long id){
  return repository.findById(id).orElseThrow();
 }

 @PutMapping("/{id}")
 public Topico atualizar(@PathVariable Long id,@RequestBody TopicoDTO dto){
  repository.findById(id).orElseThrow();
  return repository.save(new Topico(dto.titulo(),dto.mensagem(),dto.autor(),dto.curso()));
 }

 @DeleteMapping("/{id}")
 public void deletar(@PathVariable Long id){
  repository.deleteById(id);
 }

}
