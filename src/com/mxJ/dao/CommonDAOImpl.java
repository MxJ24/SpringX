package com.mxJ.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommonDAOImpl implements CommonDAO {
	@Autowired
	private org.apache.commons.dbcp.BasicDataSource dataSource;

	@Override
	public Date getDatabaseCurrentTime() throws SQLException {
		Connection conn=this.dataSource.getConnection();
		String sql="select to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') from dual";
		PreparedStatement st=conn.prepareStatement(sql);
		st.execute();
		System.out.println(this.dataSource.getNumActive()+"<==");
		conn.close();
		return null;
	}

}
