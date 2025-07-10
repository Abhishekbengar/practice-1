package iplmatch;

import java.util.LinkedList;
import java.util.List;

public class players {
	private int jname;
	private String name;
	private int runs;
	private int wickets;
	private String tname;

	public players() {
		super();

	}

	players(int jn, String n, int r, int w, String tname) {

		this.jname = jn;
		this.name = n;
		this.runs = r;
		this.wickets = w;
		this.tname = n;

	}

	public int getJname() {
		return jname;
	}

	public void setJname(int jname) {
		this.jname = jname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "players [jname=" + jname + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		List<players> rcb2025 = new LinkedList<players>();
		rcb2025.add(new players(45, "rohit", 5000, 200, "mumbai"));

	}

}
