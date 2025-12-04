public class DraftState implements PostState
{
    //Constructor
    public DraftState()
    {

    }

    @Override
    public void edit(PostEntity post, String newContent)
    {
        if(newContent == null)
        {
            System.out.println("Edit Failed: Not a valid edit");
        }
        post.setContent(newContent);
        System.out.println("Post Successfully Edited");
    }

    @Override
    public void publish(PostEntity post)
    {
        PostState publish = new PublishedState();
        post.setState(publish);
        System.out.println("Post Successfully Published");
    }

}