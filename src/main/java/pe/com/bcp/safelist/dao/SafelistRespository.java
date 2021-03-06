package pe.com.bcp.safelist.dao;

import io.reactivex.Flowable;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.reactive.RxJava2CrudRepository;
import pe.com.bcp.safelist.entity.Archive;

public interface SafelistRespository extends RxJava2CrudRepository<Archive, String> {

	@Query("Select * from archive where type=?0")
	Flowable<Archive> findByType(String type);
}
