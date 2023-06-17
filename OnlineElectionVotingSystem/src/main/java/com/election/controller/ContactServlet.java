/* Copyright (c) Nishit Tated. All Rights Reserved.
 *  Project name: Online Election Voting System 
 * This project is licensed under the MIT License, see LICENSE.
 */
package com.election.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.election.dao.Dao;
import com.election.model.Details;

@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ContactServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String from = request.getParameter("email");
		String subject = request.getParameter("sub");
		String message = request.getParameter("msg");
		String page = "";
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String s = sdf.format(d);

		if (from.equals("") || subject.equals("") || message.equals("")) {
			page = "error.jsp?msg=man";
		} else {
			Details m = new Details();
			m.setEmail(from);
			m.setSubject(subject);
			m.setMessage(message);
			try {
				int i = Dao.register(m, "insert into feedback(from_email,to_email,subject,message,date) values('" + from
						+ "' , 'test@gmail.com', '" + subject + "', '" + message + "', '" + s + "')");
				if (i != 0) {
					page = "contact.jsp?msg=success";
				} else {
					page = "contact.jsp?msg=failed";
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		response.sendRedirect(page);
	}
}
