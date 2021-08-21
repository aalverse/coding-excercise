package com.simpleapi.simpleapi.repository;

import com.simpleapi.simpleapi.identity.DogType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface DogTypeRepository extends CrudRepository<DogType, Long> {

//    @Override
//    default List<DogType> findAll() {return findAll(Sort.by(Sort.Direction.DESC));
//    }
//    default List<DogType> save() {return saveAll()}


//    @Query(" FROM Comment WHERE requestId=:requestId order by createdAt desc")
//    List<DogType> findForRequest(@Param("requestId") Long id);

}

