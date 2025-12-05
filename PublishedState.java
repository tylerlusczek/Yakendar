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
        if(post != null && !isPublished && (user.getUsername() != null || !user.getUsername().equals(""))) //added edge cases to check if the user is valid
        {
            System.out.println("Post is published");
        }
        else
        {
            System.out.println("Post does not exist or is not published");
        }
    }

    //check the state on whether the post is published
    public boolean getIsPublished()
    {
        return isPublished;
    }

    public void changePublishedStatus()
    {
        isPublished = !isPublished;
    }
    
}
