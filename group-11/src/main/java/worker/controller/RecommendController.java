package worker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import worker.bean.Recommend;
import worker.service.RecommendService;

import java.util.List;
import java.util.Map;

@Controller
public class RecommendController {
    @Autowired
    RecommendService recommendService;

    @RequestMapping("/toRecommend")
    public String toRecommend(Map map) {
        List<Recommend> recommends = recommendService.selectAll();
        map.put("recommends",recommends);
        return "recommend";
    }
}
