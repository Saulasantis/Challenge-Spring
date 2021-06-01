package alkemy.challenge.Challenge.Alkemy.service;

import alkemy.challenge.Challenge.Alkemy.model.Blogs;
import java.util.List;

public interface BlogService {

    public List<Blogs> listBlogs();

    public void saveBlogs(Blogs blogs);

    public void deleteBlogs(Blogs blogs);

    public Blogs findBlogs(Blogs blogs);

}
