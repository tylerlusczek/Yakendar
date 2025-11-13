package Yakendar;

public class PublishedState implements PostState{

    private boolean isPublished;
    public PublishedState()
    {
        this.isPublished = false;
    }
    
    @Override
    public void edit(PostEntity post, String newContent) {
        System.out.println("Cannot edit a published post.");
    }

    @Override
    public void publish(PostEntity post) {
        if(post != null && !isPublished)
        {
            System.out.println("Post is published");
        }
        else
        {
            System.out.println("Post does not exist or is not published");
        }
    }

    public boolean getIsPublished()
    {
        return isPublished;
    }

    public void changePublishedStatus()
    {
        isPublished = !isPublished;
    }
    
}
