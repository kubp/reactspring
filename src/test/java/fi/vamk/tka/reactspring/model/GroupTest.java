package fi.vamk.tka.reactspring.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableJpaRepositories(basePackageClasses = GroupRepository.class)
public class GroupTest {
    @Autowired
    private GroupRepository repository;

    @Test
    public void addGroupAndVerifyTest() {
        Group item = new Group();
        item.setName("Vaasa JUG");
        repository.save(item);
        Group found = repository.findByName("Vaasa2 JUG");
        assertNull(found);
        if (found != null) {
            assertEquals(found.getName(), item.getName());
        }
    }

    @Test
    public void testing() {
        System.out.println("test");
    }
    

}