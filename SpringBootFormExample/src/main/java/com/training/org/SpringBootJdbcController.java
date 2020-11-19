package com.training.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@RequestMapping("/insert")
	public String insert() {
		jdbcTemplate.execute("insert into emp99(id,name,salary,designation) values (101,'EShan',10000,'HR')");
		return "Data inserted ";
		
	}
}
