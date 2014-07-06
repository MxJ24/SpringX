package com.mxJ.dao;

import java.sql.SQLException;
import java.util.Date;

public interface CommonDAO {
	public Date getDatabaseCurrentTime() throws SQLException;
}
