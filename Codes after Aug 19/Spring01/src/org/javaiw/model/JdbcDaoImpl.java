package org.javaiw.model;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcDaoImpl {
	private JdbcTemplate template = null;
	
	public void setDataSource(DataSource dataSource){
		template = new JdbcTemplate(dataSource);
	}

	public void show(){		

	}
}

