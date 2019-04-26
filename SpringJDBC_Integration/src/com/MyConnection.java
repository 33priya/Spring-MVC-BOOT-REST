package com;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class MyConnection {

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void getConnection() {
		try {
			Connection connection = dataSource.getConnection();
			System.out.println("Connection established");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
