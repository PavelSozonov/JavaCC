import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MetricsCounter {
	String[] metricsStrings = new String[23];
	
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
		MyClass.mergeClassesAll(parser.classes);
	}

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
//		System.out.println("!!!!!!!!!!!!!!!!!!!!" + numInterfacesString);
		return numInterfaces;
	}
	
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
//		while (true) {
//			System.out.println(numOfSuperClasses + " / " + numOfClasses + " = " + reuseRatio);
//		}
		metricsStrings[7] = reuseRatio + "";
		return reuseRatio;
	}
	
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
	
	public int countWMC() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countCC() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countRFC() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countCBO() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countDAC() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countMPC() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countCF() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countLCOM() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countTCC() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countLCC() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countICH() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countDIT() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countMIF() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countAIF() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countMHF() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countAHF() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countNMO() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int countPF() {
		// TODO Auto-generated method stub
		return -1;
	}

	

	public int countSR() {
		// TODO Auto-generated method stub
		return -1;
	}

}
