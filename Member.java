public class Member extends User {
    private String memberId;

    public Member(int id, String name, String memberId) {
        super(id, name);
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void displayMember() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + getName());
    }
}