import java.util.Collection;
import java.util.Map;

public interface MemberInterface {
    Collection<Member> getMembers();
    void addMember(Member m);
    void removeDuplicates();
    Map<Integer, Collection<Member>> getBirthYearMap();
}



import java.util.Objects;

public class Member {
    private int id;
    private String name;
    private String email;
    private int birthYear;

    // Constructor
    public Member(int id, String name, String email, int birthYear) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthYear = birthYear;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getBirthYear() {
        return birthYear;
    }

    // Override equals() and hashCode() for proper duplicate handling
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return id == member.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Override toString() for readable output
    @Override
    public String toString() {
        return "Member{id=" + id + ", name='" + name + "', email='" + email + "', birthYear=" + birthYear + "}";
    }
}



import java.util.*;

public class Task implements MemberInterface {
    private Collection<Member> members;

    // Constructor
    public Task(Collection<Member> members) {
        this.members = new HashSet<>(members); // Ensuring uniqueness
    }

    // Returns the collection of members
    @Override
    public Collection<Member> getMembers() {
        return members;
    }

    // Adds a new member while ensuring unique ID
    @Override
    public void addMember(Member m) {
        if (members.contains(m)) {
            throw new IllegalArgumentException("Duplicate ID not allowed!");
        }
        members.add(m);
    }

    // Removes duplicate members
    @Override
    public void removeDuplicates() {
        Set<Member> uniqueMembers = new HashSet<>(members);
        members.clear();
        members.addAll(uniqueMembers);
    }

    // Groups members by birth year
    @Override
    public Map<Integer, Collection<Member>> getBirthYearMap() {
        Map<Integer, Collection<Member>> birthYearMap = new HashMap<>();
        for (Member m : members) {
            birthYearMap.computeIfAbsent(m.getBirthYear(), k -> new ArrayList<>()).add(m);
        }
        return birthYearMap;
    }
}


public class Main {
    public static void main(String[] args) {
        List<Member> initialMembers = new ArrayList<>();
        initialMembers.add(new Member(1, "Alice", "alice@example.com", 1990));
        initialMembers.add(new Member(2, "Bob", "bob@example.com", 1995));
        initialMembers.add(new Member(3, "Charlie", "charlie@example.com", 1990));
        initialMembers.add(new Member(1, "Duplicate Alice", "alice2@example.com", 1990)); // Duplicate ID

        Task task = new Task(initialMembers);
        System.out.println("Members List: " + task.getMembers());

        // Adding a new unique member
        task.addMember(new Member(4, "David", "david@example.com", 2000));
        System.out.println("After adding David: " + task.getMembers());

        // Removing duplicates
        task.removeDuplicates();
        System.out.println("After removing duplicates: " + task.getMembers());

        // Displaying birth year map
        System.out.println("Birth Year Map: " + task.getBirthYearMap());
    }
}


