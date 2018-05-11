package pe.com.bcp.safelist.controller;

import io.reactivex.Flowable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.com.bcp.safelist.business.SafelistService;
import pe.com.bcp.safelist.dto.ArchivoDTO;
import pe.com.bcp.safelist.entity.Archive;


@RestController
@RequestMapping("/api")
public class SafelistController {
	
	@Autowired
	private SafelistService safelistService;
	
	@RequestMapping(value = "/all", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,
			MediaType.APPLICATION_STREAM_JSON_VALUE })
	public Flowable<Archive> all(@RequestBody ArchivoDTO archivoDTO){
		//final List<Archive> list = new ArrayList<Archive>();
		
		//safelistRespository.findAll().forEach(c -> list.add(c));
		
		//list = StreamSupport.stream(safelistRespository.findAll().spliterator(), false).collect(Collectors.toList());
	
		//System.out.println("dimension all - " + list.size());

		return safelistService.findAll();
	}
	
	@RequestMapping(value = "/type", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,
			MediaType.APPLICATION_STREAM_JSON_VALUE })
	public Flowable<Archive> type(@RequestBody ArchivoDTO archivoDTO){
		//final List<Archive> list = new ArrayList<Archive>();
		//safelistRespository.findByType(archivoDTO.getType()).forEach(c -> list.add(c));
		//safelistRespository.findAll().forEach(c -> list.add(c));
		
		//list = StreamSupport.stream(safelistRespository.findAll().spliterator(), false).collect(Collectors.toList());
	
		//System.out.println("dimension type - " + list.size());
		return safelistService.findByType(archivoDTO.getType());
	}

}
