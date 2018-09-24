//package spittr.test;
//
//import org.junit.Test;
//import org.mockito.Mockito;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
//import spittr.Spitter;
//import spittr.data.SpitterRepository;
//import spittr.web.SpitterController;
//
//import static org.mockito.Mockito.atLeastOnce;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.verify;
//
///**
// * Created by admin on 2018-03-16.
// */
//public class spitterControllerTest {
//
//    @Test
//    public void testSpitterController(){
//        SpitterController spitterController = new SpitterController();
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spitterController).build();
//        try {
//            mockMvc.perform(MockMvcRequestBuilders.get("/spitter/register"))
//                    .andExpect(MockMvcResultMatchers.view().name("registerForm"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//    @Test
//    public void shouldProcessRegistation(){
//        SpitterRepository mockRepository = mock(SpitterRepository.class);
//        Spitter unsaved =
//                new Spitter("chen","24hour","Chen","Longshun");
//        Spitter saved =
//                new Spitter(24L,"chen","24hour","Chen","Longshun");
//        Mockito.when(mockRepository.save(unsaved)).thenReturn(saved);
//
//        SpitterController spitterController = new SpitterController(mockRepository);
//        try {
//            MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spitterController).build();
//            mockMvc.perform(MockMvcRequestBuilders.post("/spitter/register")
//                    .param("userName","chen")
//                    .param("password","24hour")
//                    .param("firstName","Chen")
//                    .param("lastName","Longshun"))
//                    .andExpect(MockMvcResultMatchers.redirectedUrl("/spitter/userShow"));
//            verify(mockRepository,atLeastOnce()).save(unsaved);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
