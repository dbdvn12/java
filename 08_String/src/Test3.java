
public class Test3 {
	public static void main(String[] args) {
		String s="�漺���б��λ���б�";
		//int v=s.indexOf("��");
		int v=s.indexOf('��');
		System.out.println(v);
		int d=s.lastIndexOf('��');
		System.out.println(d);
		boolean f=s.startsWith("�漺");
		System.out.println(f);
		System.out.println(s.replace("����", "�����"));
		System.out.println(s.substring(2,5));
		String t="    �漺���б�    ";
		System.out.println(s.trim());
		
	}
}
