package com.scarlatti;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * ~     _____                                    __
 * ~    (, /  |  /)                /)         (__/  )      /)        ,
 * ~      /---| // _ _  _  _ __  _(/ __ ___     / _ _  __ // _ _/_/_
 * ~   ) /    |(/_(//_)/_)(_(/ ((_(_/ ((_)   ) / (_(_(/ ((/_(_((_(__(_
 * ~  (_/                                   (_/
 * ~  Monday, 12/18/2017
 */
@Component
public class DAO {

    private JdbcTemplate jdbcTemplate;

    private final String COUNT_PENGUINS = "SELECT COUNT(*) FROM SOUTH_POLE.PENGUIN;";

    public DAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int countPenguins() {
        return jdbcTemplate.queryForObject(COUNT_PENGUINS, Integer.class);
    }
}
