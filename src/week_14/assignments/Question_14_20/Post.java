package week_14.assignments.Question_14_20;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Post {
    private BigInteger ID;

    private Set<String> tags;

    public Post() {
        this(new BigInteger("0"));
    }

    public Post(BigInteger ID) {
        tags = new HashSet<>();
        this.ID = ID;
    }

    public void addTag(String tag){
        tags.add(tag);
    }

    public void remove(String tag) {
        tags.remove(tag);
    }

    public boolean isContains(String tag) {
        for (String s : tags) {
            if (s.equals(tag)) {
                return true;
            }
        }
        return false;
    }

    public Set<String> getTags(){
        return tags;
    }

    public BigInteger getID(){
        return ID;
    }

    public String toString(){
        return "Tags for Post " + getID() + ": " + tags;
    }


}
