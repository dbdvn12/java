package rtm01;

public class NameUtil {

	public static Name[] getNames(String s) {
		String[] v=s.split(",");
		Name[] names=new Name[v.length];
		for(int i=0;i<names.length;i++) {
			char lastName=v[i].charAt(0);
			String firstName=v[i].substring(1);
			names[i]=new Name(firstName,lastName);
		}
		return names;
	}
	
}
