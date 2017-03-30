package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Address;
import com.bean.ChannelPackage;
import com.bean.Customer;
import com.bean.User;
import com.dao.interfaces.IChannelPackageDao;
import com.util.DBConnection;


public class ChannelPackageDao extends GenericDao implements IChannelPackageDao{

	@Override
	public Integer addChannelPackage(ChannelPackage channelPackage)
			throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet selectSQL(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChannelPackage> getAllChannelPackage() throws SQLException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChannelPackage> getChannelPackageByName(
			String channelPackageName) throws SQLException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
