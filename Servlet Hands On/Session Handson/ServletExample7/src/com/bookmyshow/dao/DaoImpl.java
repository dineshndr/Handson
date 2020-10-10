package com.bookmyshow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookmyshow.model.Seat_Selector;
import com.bookmyshow.util.DbUtil;


public class DaoImpl implements seat_selectorDao {

	@Override
	public  void  insert(Seat_Selector seat) {
		Connection connection = null;
		PreparedStatement prepareStatement;

		try {
			connection = DbUtil.getConnection();
			if (connection != null) {
				prepareStatement = connection.prepareStatement("insert into seating_selection(id, seating_type,ticket_cost,no_of_seats ) values(?,?,?,?)");
				prepareStatement.setInt(1, seat.getId());
				prepareStatement.setString(2, seat.getType());
				prepareStatement.setDouble(3, seat.getCost());
				prepareStatement.setInt(4, seat.getNum());
				int noOfRows = prepareStatement.executeUpdate();
				if (noOfRows > 0) {
					System.out.println("Inserted Sucessfully");
					}
				prepareStatement.close();
				connection.close();
			}
		} catch (Exception e1) {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}

			e1.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
	
	}

	
	

//	@Override
//	public List<Seat_Selector> getSeatingSelection() {
//		List<Seat_Selector> ss = new ArrayList<>();
//		Connection connection = null;
//		Statement statement=null;
//		ResultSet resultSet=null;
//		
//		try {
//			connection = DbUtil.getConnection();
//			if (connection != null) {
//				statement = connection.createStatement();
//				resultSet = statement.executeQuery("select * from seating_selection");
//				while(resultSet.next()) {
//					ss.add(new Seat_Selector(resultSet.getInt(1),resultSet.getString(2),resultSet.getDouble(3),resultSet.getInt(4)));
//				}
//				statement.close();
//				connection.close();
//			}
//		} catch (Exception e1) {
//			if (connection != null)
//				try {
//					connection.close();
//				} catch (SQLException e2) {
//					e2.printStackTrace();
//				}
//
//			e1.printStackTrace();
//		} finally {
//			if (connection != null) {
//				try {
//					connection.close();
//				} catch (SQLException e1) {
//					e1.printStackTrace();
//				}
//			}
//		}
//
//		return ss;
//	}
		
	

}
