package org.springblade.modules.business.service;

import java.sql.*;

public class TestClass {
	public static void main(String[] args) throws SQLException {

		Connection connection = JdbcUtils.getConnection();
		System.out.println(connection);
		Statement statement = connection.createStatement();
		String sql = "select * from blade_role";
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			long id = resultSet.getLong("id");
			String tenantId = resultSet.getString("tenant_id");
			long parentId = resultSet.getLong("parent_id");
			String roleName = resultSet.getString("role_name");
			int sort = resultSet.getInt("sort");
			String roleAlias = resultSet.getString("role_alias");
			int isDeleted = resultSet.getInt("is_deleted");
			System.out.println("id = " + id + " tenant_id = " + tenantId + " parent_id = " + parentId +
				" role_name = " + roleName + " sort = " + sort + " role_alias = " + roleAlias + " id_deleted = " + isDeleted);
		}

		resultSet.close();
		statement.close();
		connection.close();


	}

}
