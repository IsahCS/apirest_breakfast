package com.breakfast.apirest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.breakfast.apirest.repository.BreakfastRepository;
import com.breakfast.apirest.models.Breakfast;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
public class BreakfastResource{
  @Autowired
  BreakfastRepository breakfastRepository;

  //traz todos os dados
  @CrossOrigin(origins = "*")
  @GetMapping("/breakfast")
  public List<Breakfast> listaBreakfast(){
    return breakfastRepository.findAll();
  }

  //traz apenas um dado
  @CrossOrigin(origins = "*")
  @GetMapping("/breakfast/{id}")
  public Breakfast listaBreakfastUnico(@PathVariable(value="id") long id){
    return breakfastRepository.findById(id);
  }

  //salva
  @CrossOrigin(origins = "*")
  @PostMapping("/breakfast")
  public Breakfast salvaBreakfast(@RequestBody Breakfast breakfast){
    return breakfastRepository.save(breakfast);
  }

  //deleta
  @CrossOrigin(origins = "*")
  @DeleteMapping("/breakfast")
  public void excluiBreakfast(@RequestBody Breakfast breakfast){
    breakfastRepository.delete(breakfast);
  }

  //atualiza
  @CrossOrigin(origins = "*")
  @PutMapping("/breakfast")
  public Breakfast atualizaBreakfast(@RequestBody Breakfast breakfast){
    return breakfastRepository.save(breakfast);
  }
} 

