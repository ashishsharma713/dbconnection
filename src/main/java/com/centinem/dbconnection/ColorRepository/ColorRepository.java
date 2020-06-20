package com.centinem.dbconnection.ColorRepository;

import com.centinem.dbconnection.ColorEntity.Color;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface ColorRepository extends CrudRepository<Color, Long> {


    public List<Color> findColorByParentId(@Param("parentId") int id);


}
