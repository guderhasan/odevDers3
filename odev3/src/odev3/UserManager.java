package odev3;

public class UserManager {
private void addUser(User user) {
	System.out.println(user.getUserName()+" isimli "+user.geteMail()+" mail adresine sahip kullanıcı eklendi");
}
public void addUsers(User[] users) {
	for(User user:users) {
		addUser(user);
	}
}
}
