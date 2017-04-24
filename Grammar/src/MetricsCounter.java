import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class MetricsCounter {
	
	public static final int NUMBER_OF_METRICS = 14;
	String[] metricsStrings = new String[NUMBER_OF_METRICS];
	
	RubyParser15 parser;


	public String[] getMetricsStrings() {
		return metricsStrings;
	}

	public MetricsCounter(String fileName) {
		try {
			parser = new RubyParser15(new java.io.FileInputStream(fileName));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			parser.PROGRAM();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// TODO
		MyClass.mergeClassesAll(parser.classes);
		countNOM();
		countStatements();
		countClasses();
		countInterfaces();
		countNOA();
		countLoops();
		countConditions();
		countRR();
		countNOC();
	}

	// Number of methods
	public int countNOM() { 
		int numOfMethods = 0; 
		String numMethodsString = "";
		for (MyClass c: parser.classes) {
			int classNumMethods = c.getMethods().size();
			numOfMethods = numOfMethods + classNumMethods;
			numMethodsString = numMethodsString + c.name + ":" + classNumMethods + "; ";
		}
		metricsStrings[0] = numMethodsString;
		return numOfMethods;
	}
	
	public int countStatements() {
		int numStatements = parser.statementCounter;
		metricsStrings[1] = numStatements + "";
		return numStatements;
	}

	public int countClasses() {		
		int numClasses = parser.classes.size();
		metricsStrings[2] = numClasses + "";
		return numClasses;
	}
	
	public int countInterfaces() {
		int numInterfaces = 0;
		String numInterfacesString = "";
		for (MyClass c: parser.classes) {
			int classNumInterfaces = c.getInterfaces().size();
			numInterfaces = numInterfaces + classNumInterfaces;
			numInterfacesString = numInterfacesString + c.name + ":" + classNumInterfaces + "; ";
		}
		metricsStrings[3] = numInterfacesString;
		return numInterfaces;
	}
	
	
	// Number of attributes
	public int countNOA() {
		int numOfAttributes = 0;
		String numAttributesString = "";
		for (MyClass c: parser.classes) {
			int classNumAttributes = c.getAttributes().size();
			numOfAttributes = numOfAttributes + classNumAttributes;
			numAttributesString = numAttributesString + c.name + ":" + classNumAttributes + "; ";
		}
		metricsStrings[4] = numAttributesString;
		return numOfAttributes;
	}

	public int countLoops() {
		int numLoops = parser.loopCounter;
		metricsStrings[5] = numLoops + "";
		return numLoops;
	}
	
	public int countConditions() {
		int numConditions = parser.conditionsCounter;
		metricsStrings[6] = numConditions + "";
		return numConditions;
	}
	
	// Reuse ratio
	public double countRR() {
		double reuseRatio = 0;
		int numOfClasses = parser.classes.size();
		int numOfSuperClasses = 0;
		ArrayList<String> superClassesNames = new ArrayList<>();
		for (MyClass c: parser.classes) {
			String parentName = c.getParent().name;
			if (!parentName.equals("null") && parentName != null) {
				if (!superClassesNames.contains(parentName))
				{
					superClassesNames.add(c.getParent().name);
					numOfSuperClasses++;
				}
			}
		}
		if (numOfClasses == 0) {return 1;}
		reuseRatio = numOfSuperClasses / (double) numOfClasses;
		metricsStrings[7] = reuseRatio + "";
		return reuseRatio;
	}
	
	// Number Of Children
	public int countNOC() {
		int numOfChildren = 0;
		String classesNumberOfChildren = "";
		for (MyClass c: parser.classes) {
			int classNumOfChildren = 0;
			for (int i = 0 ; i < parser.classes.size(); i++) {
				MyClass curClass = parser.classes.get(i);
				String parentName = curClass.getParent().name;
				if (!c.equals(curClass)) {
					if (parentName.equals(c.getName())) {
						classNumOfChildren++;
						numOfChildren++;
					}
				}
			}
			
			classesNumberOfChildren = classesNumberOfChildren + c.name + ":" + classNumOfChildren + "; ";
		}
		metricsStrings[8] = classesNumberOfChildren;		
		return numOfChildren;
	}
	
	// Weighted Methods per Class
	public int countWMC() {
		// TODO Auto-generated method stub
		return -1;
	}

	// Class complexity
	public int countCC() {
		// TODO Auto-generated method stub
		return -1;
	}

	// Response For a Class
	public int countRFC() {
		// TODO Auto-generated method stub
		return -1;
	}

	// Coupling Between Objects
	public int countCBO() {
		// TODO Auto-generated method stub
		return -1;
	}

	// Data abstract coupling
	public int countDAC() {
		// TODO Auto-generated method stub
		return -1;
	}

	// Message passing coupling
	public int countMPC() {
		// TODO Auto-generated method stub
		return -1;
	}

	// Coupling factor
	public int countCF() {
		// TODO Auto-generated method stub
		return -1;
	}

	// Lack of Cohesion in Methods
	public int countLCOM() {
		// TODO Auto-generated method stub
		return -1;
	}

	// Tight class cohesion
	public int countTCC() {
		// TODO Auto-generated method stub
		return -1;
	}

	// Loose class cohesion
	public int countLCC() {
		// TODO Auto-generated method stub
		return -1;
	}

	// Information based cohesion
	public int countICH() {
		// TODO Auto-generated method stub
		return -1;
	}

	// Depth of Inheritance Tree
	public int countDIT() {
		
		int maxDepth = 0;
		
		ArrayList<MyClass> allClasses = parser.classes;
		ArrayList<MyClass> superClassesNames = new ArrayList<>();
		for (MyClass c: allClasses) {
			String parentName = c.getParent().name;
			if (parentName.equals("null") || parentName == null) {
				superClassesNames.add(c);
			}
		}
		
		for (MyClass parent: superClassesNames) {
			int initialDepth = 0;
			int depth = findDepth(parent, allClasses, initialDepth);
			if (depth > maxDepth) {
				maxDepth = depth;
			}
		}		

		metricsStrings[10] = maxDepth + "";		
		return maxDepth;
	}

	private int findDepth(MyClass classParent, ArrayList<MyClass> allClasses, int depth) {
		if (classParent == null || classParent.name.equals("null")) {
			return depth;
		}
		
		for (MyClass c: allClasses) {			
			if (c != null && !c.name.equals("null") && classParent.name.equals(c.parent.name)) {
				MyClass children = c;
				depth++;
				findDepth(children, allClasses, depth);
			} else {

			}
		}
		
		return depth;
	}

	// Method inheritance factor
	public double countMIF() {
		
		
		int methodsInhereted = 0;
		int methodsDefAndInh = 0;
		
		ArrayList<MyClass> allClasses = parser.classes;	
		
		ArrayList<MyClass> superClassesNames = new ArrayList<>();
		for (MyClass c: allClasses) {
			String parentName = c.getParent().name;
			if (parentName.equals("null") || parentName == null) {
				superClassesNames.add(c);
			}
		}
		
		
		for (MyClass c: allClasses) {
			methodsDefAndInh = methodsDefAndInh + c.methods.size();
			
			String nameParent = c.name;
			
			MyClass currentClass = c.parent;
			while (currentClass != null && !currentClass.name.equals("null")) {
				currentClass = MyClass.getMyClassParent(currentClass, allClasses);
				String name = currentClass.name;
				ArrayList<Method> methods = currentClass.methods;
				methodsInhereted = methodsInhereted + currentClass.getMethods().size();
				currentClass = currentClass.parent;
			}
		}
		if (methodsDefAndInh == 0) {
			return 0;
		}
		methodsDefAndInh = methodsDefAndInh + methodsInhereted;
		double MIF = methodsInhereted / (double) methodsDefAndInh;
		metricsStrings[11] = MIF + "";	
		return MIF;
	}

	// Attribute inheritance factor
	public double countAIF() {
		int attrInhereted = 0;
		int attrDefAndInh = 0;
		
		ArrayList<MyClass> allClasses = parser.classes;	
		
		for (MyClass c: allClasses) {
			attrDefAndInh = attrDefAndInh + c.attributes.size();
			
			String nameParent = c.name;
			
			MyClass currentClass = c.parent;
			while (currentClass != null && !currentClass.name.equals("null")) {
				//currentClass = MyClass.getMyClassParent(currentClass, allClasses);
				String name = currentClass.name;
				ArrayList<String> attr = currentClass.attributes;
				attrInhereted = attrInhereted + currentClass.attributes.size();
				currentClass = currentClass.parent;
			}
		}
		if (attrDefAndInh == 0) {
			return 0;
		}
		attrDefAndInh = attrDefAndInh + attrInhereted;
		double AIF = attrInhereted / (double) attrDefAndInh;
		metricsStrings[12] = AIF + "";	
		return AIF;
	}

	// Method hiding factor
	public int countMHF() {
		// TODO Auto-generated method stub
		return -1;
	}

	// Attribute hiding factor
	public int countAHF() {
		// TODO Auto-generated method stub
		return -1;
	}

	// Number of methods overridden by a subclass
	public int countNMO() {
		int NMO = 0;
		
		ArrayList<MyClass> allClasses = parser.classes;	
		
		for (MyClass c: allClasses) {
			String nameParent = c.name;
			
			ArrayList<Method> methods = c.methods;
			
			MyClass currentClass = c.parent;
			while (currentClass != null && !currentClass.name.equals("null")) {
				String name = currentClass.name;
				methods.addAll(currentClass.methods);
				
				
				currentClass = currentClass.parent;
			}
			
			NMO = NMO + findOverriden(methods);
		}
		metricsStrings[13] = NMO + "";	
		return NMO;
	}

	
	private int findOverriden(ArrayList<Method> methods) {
		int overidden = 0;
		Collections.sort(methods);
		for (Method m: methods) {
			int i = methods.indexOf(m);
			if (i != 0 && m.compareTo(methods.get(i - 1)) == 0) {
				overidden++;
			}
		}
		return overidden;
	}

	// Polymorphism factor
	public int countPF() {
		// TODO Auto-generated method stub
		return -1;
	}

	
	// Specialization ratio
	public double countSR() {
		double specializationRatio = 0;
		int numOfSuperClasses = 0;
		ArrayList<String> superClassesNames = new ArrayList<>();
		for (MyClass c: parser.classes) {
			String parentName = c.getParent().name;
			if (parentName.equals("null") && parentName != null) {
				if (!superClassesNames.contains(parentName))
				{
					superClassesNames.add(c.getParent().name);
					numOfSuperClasses++;
				}
			}
		}
		
		
		ArrayList<String> classesStrings =  new ArrayList<>();
		
		
		int numOfSubClasses = 0;		
		ArrayList<String> subClassesNames = new ArrayList<>();
		for (MyClass c: parser.classes) {
			classesStrings.add(c.name);
			String parentName = c.getParent().name;
			if (!parentName.equals("null") && parentName != null) {
				subClassesNames.add(c.name);
				numOfSubClasses++;
			}
		}
		
		if (numOfSuperClasses == 0) {return 0;}
		specializationRatio = numOfSubClasses / (double) numOfSuperClasses;
		metricsStrings[9] = specializationRatio + "";
		return specializationRatio;
	}

}
