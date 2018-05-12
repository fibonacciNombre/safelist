package pe.com.bcp.safelist.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ArchivoDTO {
	
	private UUID id;

	private String name;

	private String type;


}
