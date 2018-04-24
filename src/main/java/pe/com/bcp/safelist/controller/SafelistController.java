package pe.com.bcp.safelist.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.com.bcp.safelist.dao.SafelistRespository;
import pe.com.bcp.safelist.dto.ArchivoDTO;
import pe.com.bcp.safelist.entity.Archive;


@RestController
@RequestMapping("/api")
public class SafelistController {
	
	@Autowired
	private SafelistRespository safelistRespository;
	
	@RequestMapping(value = "/all", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public List<Archive> all(@RequestBody ArchivoDTO archivoDTO){
		final List<Archive> list = new ArrayList<Archive>();
		
		safelistRespository.findAll().forEach(c -> list.add(c));
		
		//list = StreamSupport.stream(safelistRespository.findAll().spliterator(), false).collect(Collectors.toList());
	
		System.out.println("dimension all - " + list.size());
		return list;
	}
	
	@RequestMapping(value = "/type", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public List<Archive> type(@RequestBody ArchivoDTO archivoDTO){
		final List<Archive> list = new ArrayList<Archive>();
		safelistRespository.findByType(archivoDTO.getType()).forEach(c -> list.add(c));
		//safelistRespository.findAll().forEach(c -> list.add(c));
		
		//list = StreamSupport.stream(safelistRespository.findAll().spliterator(), false).collect(Collectors.toList());
	
		System.out.println("dimension type - " + list.size());
		return list;
	}

}
