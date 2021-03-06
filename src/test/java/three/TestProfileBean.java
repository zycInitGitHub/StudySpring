package three;

import com.spring.one.chapterThree.advancedConfiguration.environmentProfile.JavaConfigProfileBean;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 可以根据@ActiveProfiles来激活相对应的profile
 * 3.1.2激活profile
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfigProfileBean.class)
 //激活相对应的profile
@ActiveProfiles("dev")
public class TestProfileBean {
}