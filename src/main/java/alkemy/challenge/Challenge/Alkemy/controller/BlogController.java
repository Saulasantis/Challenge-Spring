package alkemy.challenge.Challenge.Alkemy.controller;

import alkemy.challenge.Challenge.Alkemy.model.Blogs;
import alkemy.challenge.Challenge.Alkemy.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/")
    public String index() {
        return "index";
    }
//Show complete list of Created Blogs

    @GetMapping("/posts/list")
    public String list_of_blogs(Model model) {
        var blog = blogService.listBlogs();
        model.addAttribute("blog", blog);
        return "listOfBlogs";
    }

    @GetMapping("/posts/details")
    public String details_blogs(Blogs blogs, Model model) {
        blogs = blogService.findBlogs(blogs);
        model.addAttribute("blogs", blogs);
        return "detailsPostId";
    }

    @GetMapping("/posts/create")
    public String add_blog(Blogs blogs) {
        return "createBlog";
    }

    @PostMapping("/posts/save")
    public String save_blogs(@Valid Blogs blogs, BindingResult result) {
        if (result.hasErrors()) {
            return "createBlogs";
        }
        blogService.saveBlogs(blogs);
        return "redirect:/posts/list";
    }

    @GetMapping("/posts/edit")
    public String edit_blogs(Blogs blogs, Model model) {
        blogs = blogService.findBlogs(blogs);
        model.addAttribute("blogs", blogs);
        return "editBlogs";
    }

    @GetMapping("/posts/delete")
    public String delete_blogs(Blogs blogs) {
        blogService.deleteBlogs(blogs);
        return "redirect:/posts/list";
    }

}
