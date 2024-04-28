package dz.ibnrochd.master14.dao;


import dz.ibnrochd.master14.model.Consultation;
import org.apache.ibatis.annotations.*;


import java.util.List;

/**
 * @project sb_002
 * @Author Abdessamie Charik on 28/04/2024
 */
@Mapper

public interface ConsultationRepository   {

@Results(id="consultaionResult" , value = {
        @Result(property = "id" , column = "id"),
        @Result(property = "motif", column = "motif"),
        @Result(property = "dateConsultation", column = "date_consultation"),
        @Result(property = "idPatient", column = "id_patient")
})
    @Select("SELECT id, motif, date_consultation, id_patient FROM cabinet.consultation WHERE true") //id=#{id};
    List<Consultation> findAll();


/*@Select( "SELECT id, motif, date_consultation, id_patient FROM cabinet.consultation WHERE id=#{id}; ")*/
    Consultation findById(long id);
}
