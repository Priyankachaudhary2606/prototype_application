package com.scgj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.scgj.common.AbstractTransactionalDao;
import com.scgj.dto.ViewTrainingDetailsDto;

/**
 * This is sample DAO class
 * used to communicate with Database
 *
 */
@Repository
public class ViewTrainingDao extends AbstractTransactionalDao {

	//Call getters from configuration class to execute SQL queries
	
	//Write method to execute query using getJdbcTemplate()
	
	
	
	
	
	
	
	/**
	 * Sample Row Mapper to map query rows with application Objects with DTO {@link ViewTrainingDetailsDto}
	 * Modify the class as per requirement
	 *
	 */
	private static class TrainingsRowMapper implements RowMapper<ViewTrainingDetailsDto>
	{
		@Override
		public ViewTrainingDetailsDto mapRow(ResultSet rs, int rowNum) throws SQLException 
		{
			
			int trainingId = rs.getInt("id");
			String trainingName = rs.getString("trainingName");
		
			return new ViewTrainingDetailsDto(trainingId, trainingName);		
		}		
	}
	
}
