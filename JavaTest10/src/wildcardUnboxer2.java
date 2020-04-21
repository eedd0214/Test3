
class Unboxer2{
	public static <T>T openBox(Box<T> box){
		return box.get();
	}
	public static void peekBox(Box<?> box) {
		System.out.println(box);
	}
}
public class wildcardUnboxer2 {

	public static void main(String[] args) {
		Box<String> box =new Box<>();
		box.set("So simple String");
		Unboxer2.peekBox(box);

	}

}
