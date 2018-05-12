package pe.com.bcp.safelist.entity;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Getter
@Setter
@Table
public class Archive {
	
	@PrimaryKey
	private UUID id;

	private String name;

	private String type;



}
