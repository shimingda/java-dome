import dome.advanced.UserHandler;
import dome.base.DBConf;
import dome.base.User;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Ignore;
import org.junit.Test;

import java.sql.Connection;

/**
 * advanced test
 * @author Somin
 */
public class AdvancedTest
{
	@Test
	@Ignore
	public void handlerTest() throws Exception
	{
		QueryRunner queryRunner = new QueryRunner();
		Connection conn=DBConf.getConnection();
		String sql ="SELECT * FROM user where id =?";
		User user=queryRunner.query(conn,sql,new UserHandler(),1);
		System.out.println("id:"+user.getId()+",name:"+user.getName());
	}

	@Test
	public void dataSourceTest() throws Exception
	{
		QueryRunner queryRunner=new QueryRunner(DBConf.getDataSource());
		String sql ="SELECT * FROM user where id =?";
		User user=queryRunner.query(sql,new UserHandler(),1);
		System.out.println("id:"+user.getId()+",name:"+user.getName());
	}
}
