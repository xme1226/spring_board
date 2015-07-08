package com.spring_tutorial.board_example.dao;

import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring_tutorial.board_example.dto.BDto;
import com.spring_tutorial.board_example.util.Constant;

public class BDao {
	
	JdbcTemplate template = null;
	
	public BDao() {
		template = Constant.template;
	}
	
	
	public ArrayList<BDto> list() {
		ArrayList<BDto> dtos = null;
		
		String query = "select bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent from mvc_board order by bGroup desc, bStep asc";
		dtos = (ArrayList<BDto>) template.query(query, new BeanPropertyRowMapper<BDto>(BDto.class));
		
		return dtos;
	}
}
