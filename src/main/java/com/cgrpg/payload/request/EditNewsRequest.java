package com.cgrpg.payload.request;

import javax.validation.constraints.NotNull;

public class EditNewsRequest extends CreateNewsRequest{

    @NotNull
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}