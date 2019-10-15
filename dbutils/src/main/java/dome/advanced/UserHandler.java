package dome.advanced;

import dome.base.User;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ◊‘∂®“Â”≥…‰
 * @author  Somin
 */
public class UserHandler extends BeanHandler<User>
{
	public UserHandler()
	{
		super(User.class);
	}

	@Override
	public User handle(ResultSet rs) throws SQLException
	{
		return super.handle(rs);
	}
}
