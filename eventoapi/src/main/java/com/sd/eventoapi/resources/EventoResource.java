package com.sd.eventoapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sd.eventoapi.models.Evento;
import com.sd.eventoapi.repository.EventoRepository;

@RestController
@RequestMapping("/evento")
public class EventoResource {
	
	@Autowired
	private EventoRepository er;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Evento> listaEventos() {
		Iterable<Evento> listaEventos = er.findAll();
		return listaEventos;
	}
	
	@PostMapping()
	public Evento CadastraEvento(@RequestBody Evento evento) {
		return er.save(evento);
	}
	
	@DeleteMapping()
	public Evento deletaEvento (@RequestBody Evento evento) {
		er.delete(evento);
		return evento;
	}
	

}
