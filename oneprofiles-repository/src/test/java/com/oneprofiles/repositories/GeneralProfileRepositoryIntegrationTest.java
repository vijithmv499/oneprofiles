package com.oneprofiles.repositories;

import com.oneprofiles.domain.GeneralProfile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import static org.fest.assertions.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:META-INF/spring/oneprofiles-repository-jpa-test.xml")
@Transactional
public class GeneralProfileRepositoryIntegrationTest {

    @Autowired
    private GeneralProfileRepository repository;

    @Test
    public void testSave() {
        GeneralProfile generalProfile = newGeneralProfile("jack");
        repository.save(generalProfile);
        assertThat(generalProfile.getId()).isNotNull();
    }

    @Test
    public void testFindByUserName() {
        GeneralProfile generalProfile = newGeneralProfile("jack");
        repository.save(generalProfile);
        repository.flush();
        generalProfile = repository.findByUserName("jack");
        assertThat(generalProfile.getUserName()).isEqualTo("jack");
    }

    private GeneralProfile newGeneralProfile(String userName) {
        GeneralProfile generalProfile = new GeneralProfile();
        generalProfile.setUserName(userName);
        return generalProfile;
    }


}
