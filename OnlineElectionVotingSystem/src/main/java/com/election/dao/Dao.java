/* Copyright (c) Nishit Tated. All Rights Reserved.
 *  Project name: Online Election Voting System
 * This project is licensed under the MIT License, see LICENSE.
 */
package com.election.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.election.model.Details;

public class Dao {
	static Connection con = null;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// database_name --> oevs
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oevs", "root", "@database4ME");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int register(Details m, String sql) throws SQLException {
		PreparedStatement ps = con.prepareStatement(sql);
		int i = ps.executeUpdate();
		return i;
	}

	public static ResultSet validate(Details m, String sql) throws SQLException {
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		return rs;
	}

	public static int register1(String sql) throws SQLException {
		PreparedStatement ps = con.prepareStatement(sql);
		int i = ps.executeUpdate();
		return i;
	}

	public static ResultSet validate1(String sql) throws SQLException {
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		return rs;
	}

	public static int common(Details m, String sql, String update) throws SQLException {
		PreparedStatement ps = con.prepareStatement(sql);
		int i = ps.executeUpdate();
		return i;
	}
}
