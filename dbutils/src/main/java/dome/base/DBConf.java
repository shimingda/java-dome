package dome.base;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *  ˝æ›≈‰÷√
 * @author  Somin
 */
public class DBConf
{
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC&characterEncoding=utf-8";

	static final String USER = "root";
	static final String PASS = "1234";

	public static Connection getConnection(){
		try
		{
			Class.forName(DBConf.JDBC_DRIVER);
			return DriverManager.getConnection(DBConf.DB_URL, DBConf.USER, DBConf.PASS);
		}
		catch (Exception e)
		{
			System.out.println("databases connection error");
			return null;
		}
	}
	public static DataSource getDataSource()
	{
		BasicDataSource basicDataSource=new BasicDataSource();
		basicDataSource.setDriverClassName(JDBC_DRIVER);
		basicDataSource.setUsername(USER);
		basicDataSource.setPassword(PASS);
		basicDataSource.setUrl(DB_URL);
		return basicDataSource;
	}
}
