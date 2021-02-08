package com.example.filehandling;


import com.example.filehandling.menus.MenuHandler;
import com.example.filehandling.services.FileHandlerService;

public class FilehandlingApplication {

	public static void main(String[] args) {
		MenuHandler menuHandler = new MenuHandler();
		menuHandler.DisplayMenu();


		FileHandlerService filehandlerService = new FileHandlerService();

		// TODO: Get User Menu option
		// select from fileHandlerService appropriate method.


	}
}
