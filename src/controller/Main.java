package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws Exception {
		Connection con = null;
		con = ConnectionManager.getConnection();
		
		if(con != null) {
			System.out.println("Connection Established.");
		}
		else {
			System.out.println("Check your Connection.");
		}
	}
}
