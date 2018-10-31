//package spittr.test;
//
//import jdk.nashorn.internal.ir.GetSplitState;
//import junit.framework.Assert;
//import org.junit.Test;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
//import org.springframework.web.servlet.View;
//import spittr.web.HomeController;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//
///**
// * Created by admin on 2018-02-25.
// */
//public class HomeControllerTest {
//
//    @Test
//    public void testHomePage(){
//        HomeController homeController = new HomeController();
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
//        try {
//            mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.view().name("index1"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
