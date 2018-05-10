
public class Test3 {
	public static void main(String[] args) {
		String s="경성대학교부산대학교";
		//int v=s.indexOf("대");
		int v=s.indexOf('대');
		System.out.println(v);
		int d=s.lastIndexOf('대');
		System.out.println(d);
		boolean f=s.startsWith("경성");
		System.out.println(f);
		System.out.println(s.replace("대학", "고등학"));
		System.out.println(s.substring(2,5));
		String t="    경성대학교    ";
		System.out.println(s.trim());
		
	}
}
