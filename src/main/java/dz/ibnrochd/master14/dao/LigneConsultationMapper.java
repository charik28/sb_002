package dz.ibnrochd.master14.dao;

import dz.ibnrochd.master14.model.LigneConsultation;
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
public interface LigneConsultationMapper {
    @Results(id = "LigneConsultationResult", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "idConsultation", column = "id_consultation"),
            @Result(property = "idTraitement", column = "id_traitement"),
            @Result(property = "posologie", column = "posologie"),
            @Result(property = "uniteTemps", column = "unite_temps"),
            @Result(property = "quantite", column = "quantite")
    })

    @Select("SELECT id, id_consultation, id_traitement, posologie, unite_temps, quantite FROM cabinet.ligne_consultation;")
    List<LigneConsultation> findAll();


    List<LigneConsultation> findById(Long id);

}
