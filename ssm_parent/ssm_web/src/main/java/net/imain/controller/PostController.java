package net.imain.controller;

import net.imain.domain.Post;
import net.imain.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * .
 */
@Controller
@RequestMapping(value = "/post")
public class PostController {

    @Autowired
    PostService postService;

    /**
     * 名言警句
     */
//    @RequestMapping(value = "/aphorism.do")
//    @ResponseBody
//    public String aphorism (Post post) throws Exception {
//
//        Post aphorism = postService.aphorism(post);
//
//        String str = aphorism.getPost();
//
//        return str;
//    }
}
