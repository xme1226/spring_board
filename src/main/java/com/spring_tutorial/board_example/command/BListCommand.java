package com.spring_tutorial.board_example.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.spring_tutorial.board_example.dao.BDao;
import com.spring_tutorial.board_example.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {
		BDao dao = new BDao();
		
		ArrayList<BDto> dtos = dao.list();
		
		model.addAttribute("list", dtos);
		
	}

}
