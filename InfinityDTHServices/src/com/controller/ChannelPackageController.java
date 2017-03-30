package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bean.ChannelPackage;
import com.service.ChannelPackageService;
import com.util.DBConnection;

/**
 * Servlet implementation class ChannelPackageController
 */
@WebServlet("/channel-package")
public class ChannelPackageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(DBConnection.class);

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChannelPackageController() {
        super(); 
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Create service to perform CRUD operation
		//ChannelPackageService service = new ChannelPackageService();
		//creating object
		ChannelPackage cp = new ChannelPackage();
		
		// Store data from form into the bean
		cp.setName(request.getParameter("channelPackageName"));
		
		//cp.setCategory(request.getParameter("chann"))
		
	}

}
