package com.TeamFromLeaflet10.TeamFromLeaflet10;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetRepository extends CrudRepository<Street, Long> {

}
