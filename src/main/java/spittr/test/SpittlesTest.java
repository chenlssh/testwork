package spittr.test;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import spittr.Spittle;
import spittr.data.SpittleRepository;
import spittr.web.SpittleController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by admin on 2018-03-01.
 */
@EnableWebMvc
public class SpittlesTest {

    @Test
    public void shoudShowRecentSpittles() throws Exception {
        List<Spittle> ecpectedSpittles = createSpittleList(50);
        SpittleRepository mockRepository = mock(SpittleRepository.class);
        when(mockRepository.findSpittles(238900,50)).thenReturn(ecpectedSpittles);

        SpittleController spittleController = new SpittleController(mockRepository);
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spittleController)
                .setSingleView(
                        new InternalResourceView("/WEB-INF/view/spittles.jsp"))
                .build();
        mockMvc.perform(MockMvcRequestBuilders.get("/spittles?max=238900&count=50"))
                .andExpect(MockMvcResultMatchers.view().name("spittles"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"));
//                 .andExpect(MockMvcResultMatchers.model().attribute("spittleList",hasi))
    }
    private List<Spittle> createSpittleList(int count){
        List<Spittle> spittleList = new ArrayList<Spittle>();
        for(int i = 0; i < count; i++){
            spittleList.add(new Spittle("Spittle"+i,new Date()));
        }
        return spittleList;
    }
}

