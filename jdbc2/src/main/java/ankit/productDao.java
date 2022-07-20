package ankit;
import org.springframework.jdbc.core.*;
public class productDao {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	String s="insert into product values(?,?,?)";
	public int save(product p)
	{
		return jdbcTemplate.update(s,p.getId(),p.getName(),p.getPrice());
	}
	

}
