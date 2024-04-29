package dz.ibnrochd.master14.model;

import java.io.Serializable;

/**
 * @project sb_002
 * @Author Abdessamie Charik on 28/04/2024
 */


public abstract class BaseModel implements Serializable {

    private Long id;
    public void setId(Long id) {
        if(id<=0)
            throw new RuntimeException("id must be > 0");

        this.id = id;
    }


    public Long getId() {
        return id;
    }



}
