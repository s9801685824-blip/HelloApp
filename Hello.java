public class Hello{
	public static void main(String[] args){
		StringBuilder name = new StringBuilder();
		boolean first =true;
		for (String Name : args){
			if (!first){
				name.append(", ");
			}
			name.append(name);
			first =false;
		}
		String Name = name.toString();
        if (args.length !=0) {
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, " + "World" + "!");
        }
	}
}
