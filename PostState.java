/**
 * Represents the modes that the post can be in.
 */
interface PostState {

    /**
     * Edit the post.
     * @param post
     * @param newContent
     */
    void edit(PostEntity post, String newContent);

    /**
     * Publish the post.
     * @param post
     */
    void publish(PostEntity post);

}