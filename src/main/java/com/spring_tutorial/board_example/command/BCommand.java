package com.spring_tutorial.board_example.command;

import org.springframework.ui.Model;

public interface BCommand {

	public void execute(Model model);
	
}
