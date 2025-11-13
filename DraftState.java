

public class DraftState implements PostState
{
    //Constructor
    public DraftState()
    {

    }

    public void edit(PostEntity post, String newContent)
    {
        if(newContent == null)
        {
            System.out.println("Edit Failed: Not a valid edit");
        }
        post.setContent(newContent);
        System.out.println("Post Successfully Edited");
    }

    public void publish(PostEntity post)
    {
        PostState publish = new PublishedState();
        post.setState(publish);
        System.out.println("Post Successfully Published");
    }

}