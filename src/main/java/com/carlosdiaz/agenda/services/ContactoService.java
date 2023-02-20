package com.carlosdiaz.agenda.services;

import java.util.List;

import com.carlosdiaz.agenda.models.Contacto;

public interface ContactoService {
    public List<Contacto> findAll();
    public Contacto findById(int id);
    public void save(Contacto contacto);
    public void update(int id, Contacto contacto);
    public void deleteById(int id);
    public void deleteAll();
}
