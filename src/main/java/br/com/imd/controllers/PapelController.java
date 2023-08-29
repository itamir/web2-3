package br.com.imd.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.imd.domain.Papel;
import br.com.imd.repositories.PapelRepository;

@RestController
public class PapelController {

	@RequestMapping("/papeis")
	public List<Papel> getPapeis() {
		return PapelRepository.getPapeis();
	}
}
