public class PublishedState implements PostState{

    private boolean isPublished;
    public PublishedState()
    {
        this.isPublished = false;
    }
    
    @Override
    public boolean edit(PostEntity post, String newContent) {
        System.out.println("Cannot edit a published post.");
        return false;
    }

    @Override
    public boolean publish(PostEntity post) {
        if(post != null && !isPublished)
        {
            System.out.println("Post is published");
            return true;
        }
        else
        {
            System.out.println("Post does not exist or is not published");
            return false;
        }
    }

    public boolean getIsPublished()
    {
        return isPublished;
    }

    public boolean changePublishedStatus()
    {
        isPublished = !isPublished;
        return true;
    }
    
}
