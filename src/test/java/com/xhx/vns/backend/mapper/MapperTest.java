package com.xhx.vns.backend.mapper;

import com.xhx.vns.backend.dao.ArchitectureMapper;
import com.xhx.vns.backend.pojo.Architecture;
import com.xhx.vns.backend.pojo.ArchitectureExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author XHX
 * @date 2018/4/4.
 */
@SpringBootTest
public class MapperTest {

    @Autowired
    private ArchitectureMapper architectureMapper;

    @Test
    public void t1() throws Exception{

        List<Architecture> architectures = architectureMapper.selectByExample(new ArchitectureExample());

        System.out.println(architectures);

    }

}
