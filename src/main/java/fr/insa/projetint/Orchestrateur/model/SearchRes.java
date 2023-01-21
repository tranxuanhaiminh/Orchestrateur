package fr.insa.projetint.Orchestrateur.model;

import java.util.ArrayList;

public class SearchRes {
	private ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();

	public SearchRes() {
		
	}
	
	public ArrayList<ArrayList<String>> getRes() {
		return res;
	}

	public void setRes(ArrayList<ArrayList<String>> res) {
		this.res = res;
	}
	
	public String getFirstImageName() {
;		return res.get(0).get(1);
	}

}
