import com.study.school.dao.mapper.PersonMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Description:
 * Created By LuoHuaSen in 2017/5/16 19:01
 */

public class PersonMapperTest extends BaseTest{
    @Autowired
    private PersonMapper personMapper;

    @Test
    public void test(){
        Assert.assertTrue(personMapper.count() > 0);
    }
}
