import java.util.ArrayList;

public class MyClass {

	String name;
	MyClass parent;
	ArrayList<String> interfaces = new ArrayList<>();
	ArrayList<Method> methods = new ArrayList<>();
	ArrayList<String> attributes = new ArrayList<>();
	
	
	public void addMethod(String methodName) {
		Method m = new Method(methodName);
		methods.add(m);
	}
	
	public Method getMethod(String methodName) {
		for (Method m: methods) {
			if (methodName.equals(m.getName())) {
				return m;
			}
		}
		return null;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyClass getParent() {
		return parent;
	}

	public void setParent(MyClass parent) {
		this.parent = parent;
	}

	public ArrayList<String> getInterfaces() {
		return interfaces;
	}

	public void setInterfaces(ArrayList<String> interfaces) {
		this.interfaces = interfaces;
	}

	public ArrayList<Method> getMethods() {
		return methods;
	}

	public void setMethods(ArrayList<Method> methods) {
		this.methods = methods;
	}

	public ArrayList<String> getAttributes() {
		return attributes;
	}

	public void setAttributes(ArrayList<String> attributes) {
		this.attributes = attributes;
	}

	public MyClass(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
	
	
	public static void mergeClassesAll(ArrayList<MyClass> classes) {
		ArrayList<MyClass> classesToRemove = new ArrayList<>();
		for (int i = 0 ; i < classes.size(); i++) {
			for (int j = 0; j <classes.size(); j++) {
				MyClass cl1 = classes.get(i);
				MyClass cl2 = classes.get(j);
				
				if (!cl1.equals(cl2)) {
					if (isOneClass(cl1, cl2)) {
						cl1.attributes.addAll(cl2.attributes);
						cl1.interfaces.addAll(cl2.interfaces);
						cl1.methods.addAll(cl2.methods);
						classesToRemove.add(cl2);
					}
				}
			}
		}
		classes.removeAll(classesToRemove);
	}
	
	
	private static boolean isOneClass(MyClass cl1, MyClass cl2) {
		if (cl1.name.equals(cl2.name)) {
			return true;
		}
		return false;
	}
	
}
