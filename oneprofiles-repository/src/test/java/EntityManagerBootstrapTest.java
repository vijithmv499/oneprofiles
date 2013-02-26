import org.fest.assertions.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:META-INF/spring/oneprofiles-repository-jpa-test.xml")
public class EntityManagerBootstrapTest {

    @PersistenceContext
    EntityManager entityManager;

    @Test
    public void test() {
        assertThat(entityManager).isNotNull();
    }
}
