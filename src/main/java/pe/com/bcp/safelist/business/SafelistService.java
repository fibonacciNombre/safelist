package pe.com.bcp.safelist.business;

import io.reactivex.Flowable;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.reactive.RxJava2CrudRepository;
import pe.com.bcp.safelist.entity.Archive;

public interface SafelistService  {


	Flowable<Archive> findByType(String type);

	public Flowable<Archive> findAll();
}
