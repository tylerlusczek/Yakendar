public class PublishedState implements PostState{

    private PostEntity user;
    private boolean isPublished;
    public PublishedState()
    {
        this.isPublished = false;
    }

    public PublishedState(PostEntity user)
    {
        this();
        this.user = user;
    }
    
    @Override
    public void edit(PostEntity post, String newContent) {
        System.out.println("Cannot edit a published post.");
    }

    @Override
    public void publish(PostEntity post) {
        if(post != null && !isPublished && (user.getUsername() != null || !user.getUsername().equals("")))
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
