/**
 * Represents the modes that the post can be in.
 */
interface PostState {

    /**
     * Edit the post.
     * @param post
     * @param newContent
     */
    boolean edit(PostEntity post, String newContent);

    /**
     * Publish the post.
     * @param post
     */
    boolean publish(PostEntity post);

}