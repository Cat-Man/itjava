package firstdemo;

import com.example.firstdemo.domain.MallOrderitem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("mappers")
public class FirstDemoApplicationTests {
	@Test
	public void contextLoads() {
	}
}
