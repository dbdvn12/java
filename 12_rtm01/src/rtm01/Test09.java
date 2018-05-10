package rtm01;

public class Test09 {
	public static void main(String[] args) {
		String s="±èÃ¶¼ö,ÀÌ¿µÈñ,¹Úµ¿¼ö,±èÁ¤Èñ";
		Name[] names=NameUtil.getNames(s);
//		String v[]=s.split(",");
//		System.out.println(v[0].charAt(0));
//		System.out.println(v[0].substring(1));
		System.out.println(names[1].firstName+" "+names[1].lastName);
	}
}
