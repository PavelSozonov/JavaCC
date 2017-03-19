import java.util.ArrayList;

class Method {
		String name;
		ArrayList<String> args = new ArrayList<>();
		
		public Method(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ArrayList<String> getArgs() {
			return args;
		}

		public void setArgs(ArrayList<String> args) {
			this.args = args;
		}
		
		public String toString() {
			return this.name;
		}
		
		
		
	}