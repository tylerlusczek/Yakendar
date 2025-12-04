public class DraftState implements PostState
{
    //Constructor
    public DraftState()
    {

    }

    @Override
    public boolean edit(PostEntity post, String newContent)
    {
        if(newContent == null)
        {
            System.out.println("Edit Failed: Not a valid edit");
            return false;
        }
        post.setContent(newContent);
        System.out.println("Post Successfully Edited");
        return true;
    }

    @Override
    public boolean publish(PostEntity post)
    {
        PostState publish = new PublishedState();
        post.setState(publish);
        System.out.println("Post Successfully Published");
        return true;
    }

}