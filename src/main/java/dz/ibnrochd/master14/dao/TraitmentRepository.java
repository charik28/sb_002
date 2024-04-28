package dz.ibnrochd.master14.dao;

import dz.ibnrochd.master14.model.Traitement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @project sb_002
 * @Author Abdessamie Charik on 28/04/2024
 */

@Mapper
public interface TraitmentRepository  {

    @Results(id = "TraitementResult", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "nom", column = "nom")
    })
    @Select("SELECT id, nom FROM cabinet.traitement;")
    List<Traitement> findAll();

}
