package com.TeamFromLeaflet10.TeamFromLeaflet10;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface DistrictRepository extends CrudRepository<District, Long> {

}
