package Yakendar;

public interface PostState
{
    void edit(PostEntity post, String newContent);
    void publish(PostEntity post);
}