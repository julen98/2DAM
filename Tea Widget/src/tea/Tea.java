package tea;

class Tea {
	
	String typeTea = "";
	int time = 0;
	
	Tea (String typeTea, int time) {
		this.typeTea = typeTea;
		this.time = time;
	}

	public String getTypeTea() {
		return typeTea;
	}

	public void setTypeTea(String typeTea) {
		this.typeTea = typeTea;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	int calcTime () {
		switch (typeTea) {
		case "Black Tea":
			return 60*3;
		case "Green Tea":
			return 60;
		case "White Tea":
			return 60*2;
		case "Oolong Tea":
			return 60*2;
		case "Pu-erh Tea":
			return 60*5;
		case "Purple Tea":
			return 60*3;
		case "Herbal Infusions":
			return 60*5;
		case "Roiboos Tea":
			return 60*5;
		default:
			return 0;
		}
	}
	
}
