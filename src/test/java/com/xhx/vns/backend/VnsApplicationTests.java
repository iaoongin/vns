package com.xhx.vns.backend;

import com.xhx.vns.backend.dao.ArchitectureMapper;
import com.xhx.vns.backend.pojo.Architecture;
import com.xhx.vns.backend.pojo.ArchitectureExample;
import com.xhx.vns.backend.pojo.User;
import com.xhx.vns.common.util.PaginationRequest;
import com.xhx.vns.confg.VnsApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest( classes = {VnsApplication.class})
public class VnsApplicationTests {


	@Test
	public void contextLoads() {
	}

	@Autowired
	private ArchitectureMapper architectureMapper;

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Test
	public void t1() throws Exception{

		List<Architecture> architectures = architectureMapper.selectByExample(new ArchitectureExample());

		System.out.println(architectures);

	}

	@Test
	public void t2() throws Exception{

        HashMap<Object, Object> searchMap = new HashMap<>();
        searchMap.put("userNickname","a");
        searchMap.put("userStatus","0");
        PaginationRequest ppp = new PaginationRequest(null, null, null, null);
        List<User> users = sqlSessionTemplate.selectList("com.xhx.vns.backend.dao.UserMapper.selectByMapPaginational", ppp.getSqlMap());

		System.out.println(users);

	}

	@Test
	public void t3() throws Exception{

		Object o = sqlSessionTemplate.selectOne("com.xhx.vns.backend.dao.UserMapper.queryCount");

		System.out.println(o);

	}

}
