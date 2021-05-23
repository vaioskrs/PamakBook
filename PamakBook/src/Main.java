
public class Main {

	public static void main(String[] args) {

		User u1 = new User("Makis", "it1698@uom.edu.gr");
		User u2 = new User("Petros", "it1624@uom.edu.gr");  
		User u3 = new User("Maria", "it16112@uom.edu.gr"); 
		User u4 = new User("Gianna", "it16133@uom.edu.gr");  
		User u5 = new User("Nikos", "it1658@uom.edu.gr");  
		User u6 = new User("Babis", "it16104@uom.edu.gr");  
		User u7 = new User("Eleni", "eleni1986@gmail.com"); 
		
		Group g1 = new Group("WebGurus","A group for web passionates");  
		ClosedGroup g2 = new ClosedGroup("ExamSolutions","Solutions to common exam questions");

		u1.addFriend(u2);
		u1.addFriend(u3);
		u1.addFriend(u4);
		u1.addFriend(u5);
		u1.addFriend(u6);
		u1.addFriend(u1);
		
		u2.addFriend(u1);
		u2.addFriend(u3);
		u2.addFriend(u4);
		u2.addFriend(u5);
		u2.addFriend(u2);
		
		u6.addFriend(u2);
		u6.addFriend(u1);
		
		u1.mutualFriends(u2);
		u6.mutualFriends(u1);
		
		u1.printFriends();	
		u2.printFriends();
		u6.printFriends();
		
		g1.addToGroup(u1);
		g1.addToGroup(u2);
		g1.addToGroup(u1);
		g1.addToGroup(u5);
		g1.addToGroup(u7);
		
		g2.addToGroup(u1);
		g2.addToGroup(u2);
		g2.addToGroup(u6);
		g2.addToGroup(u6);
		g2.addToGroup(u3);
		g2.addToGroup(u7);
		
		g1.printInfo();
		g2.printInfo();
	
			
	}
}
