package alkemy.challenge.Challenge.Alkemy.service;

import alkemy.challenge.Challenge.Alkemy.model.Blogs;
import alkemy.challenge.Challenge.Alkemy.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Blogs> listBlogs() {
        return (List<Blogs>) blogRepository.findAll();
    }

    @Override
    @Transactional
    public void saveBlogs(Blogs blogs) {
        blogRepository.save(blogs);
    }

    @Override
    @Transactional
    public void deleteBlogs(Blogs blogs) {
        blogRepository.delete(blogs);

    }

    @Override
    @Transactional(readOnly = true)
    public Blogs findBlogs(Blogs blogs) {
        return blogRepository.findById(blogs.getId_blog()).orElse(null);
    }

}
