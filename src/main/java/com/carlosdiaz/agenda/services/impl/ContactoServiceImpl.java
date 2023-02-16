package com.carlosdiaz.agenda.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosdiaz.agenda.models.Contacto;
import com.carlosdiaz.agenda.repositories.ContactoRepository;
import com.carlosdiaz.agenda.services.ContactoService;

@Service
public class ContactoServiceImpl implements ContactoService{


    @Autowired
    ContactoRepository repository;
    @Override
    public List<Contacto> findAll() {
        return repository.findAll();
    }

    @Override
    public Contacto findById(int id) {
        Optional<Contacto> findById = repository.findById(id);
        if(findById != null){
            return findById.get();
        }
        return null;
    }

    @Override
    public Contacto save(Contacto contacto) {
        return repository.save(contacto);
    }

    @Override
    public void update(int id, Contacto contacto) {
        this.findById(id);
        contacto.setId(id);
        repository.save(contacto);
        
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
        
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
        
    }
    
}
