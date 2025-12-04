
/**
 * PostEntity class defines a single post.
 */
class PostEntity {
    private Long id;
    private String username;
    private String location;
    private String content;
    private PostState state;

    //Constructor
    public PostEntity() {
        this.state = new DraftState();
    }

    //Constructor that can take in arguments for posts that already have items identified
    public postEntity(Long id, String username, String locaiton, String content)
    {
        this.id = id;
        this.username = username;
        this.location = location;
        this.content = content;
        this.state = new DraftState();
    }

    /**
     * Edits the current content
     * 
     * @param newContent 
     * */
    public void edit(String newContent) {
        state.edit(this, newContent);
    }

    //Gets the content on the current post
    public String getContent() {
        return content;
    }

    //Will publish the post
    public void publish() {
        state.publish(this);
    }

    //Below are getters and setters for state, id, username, and location
    public void setState(PostState state) {
        this.state = state;
    }

    public PostState getState() {
        return state;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
