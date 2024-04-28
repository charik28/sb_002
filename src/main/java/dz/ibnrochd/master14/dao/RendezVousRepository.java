package dz.ibnrochd.master14.dao;

import dz.ibnrochd.master14.model.RendezVous;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

/**
 * @project sb_002
 * @Author Abdessamie Charik on 28/04/2024
 */
@Mapper
public interface RendezVousRepository   {


    @Select("SELECT id, date_rdv, id_patient FROM cabinet.rendez_vous;")
    List<RendezVous> findAll();


}
