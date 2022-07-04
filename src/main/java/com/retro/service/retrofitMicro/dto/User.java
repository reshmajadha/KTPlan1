package com.retro.service.retrofitMicro.dto;

import lombok.*;

import javax.persistence.Table;
import java.util.Date;


    @Setter
    @Getter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name="user_table")
    public class User
    {

        private int id;
        private String first_name;
        private String last_name;
        private String email;
        private Date date;
    }

