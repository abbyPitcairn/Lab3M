import java.util.LinkedList;

/**
 * Custom stack implementation using a LinkedList.
 * 
 * @author abduladdan
 */
public class myStack implements IStack {
    
    /** Internal storage for the stack. */
    private LinkedList<Character> stacklist;

    /**
     * Initializes the stack with an empty LinkedList.
     */
    public myStack() {
        stacklist = new LinkedList<>();
    }

    /**
     * Pushes a character onto the top of this stack.
     * 
     * @param c Character to be pushed onto the stack.
     */
    @Override
    public void push(Character c) {
        stacklist.push(c);
    }

    /**
     * Removes the character at the top of this stack and returns that character.
     * Returns null if the stack is empty.
     * 
     * @return The character at the top of the stack (last item), or null if empty.
     */
    @Override
    public Character pop() {
        if (isEmpty()) {
            return null;
        }
        return stacklist.pop();
    }

    /**
     * Returns the character at the top of this stack without removing it.
     * Returns null if the stack is empty.
     * 
     * @return The character at the top of the stack (last item), or null if empty.
     */
    @Override
    public Character peek() {
        if (isEmpty()) {
            return null;
        }
        return stacklist.peek();
    }

    /**
     * Tests if this stack is empty.
     * 
     * @return true if the stack is empty; false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return stacklist.isEmpty();
    }
}
