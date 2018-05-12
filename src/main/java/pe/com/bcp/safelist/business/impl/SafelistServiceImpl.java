package pe.com.bcp.safelist.business.impl;

import io.reactivex.Flowable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.bcp.safelist.business.SafelistService;
import pe.com.bcp.safelist.dao.SafelistRespository;
import pe.com.bcp.safelist.entity.Archive;

@Service
public class SafelistServiceImpl implements SafelistService {


    @Autowired
    SafelistRespository safelistRespository;

    public Flowable<Archive> findByType(String type){
       return Flowable.merge(safelistRespository.findByType(type),
                safelistRespository.findAll())
                ;
       // return safelistRespository.findByType(type);

    }

    public Flowable<Archive> findAll(){
        return safelistRespository.findAll();
    }

}
