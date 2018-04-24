package pe.com.bcp.safelist.dao;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import pe.com.bcp.safelist.entity.Archive;

public interface SafelistRespository extends CrudRepository<Archive, String> {

	@Query("Select * from archive where type=?0")
	public Iterable<Archive> findByType(String type);
}
