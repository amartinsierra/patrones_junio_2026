package com.patrones.adapter.adaptable;

import java.util.ArrayList;
import java.util.List;

public class Info{
    private List<String> lst=new ArrayList<>();
    
    //constructor, setter y getter
    
    public void register(String texto){
        System.out.println(texto);
    }
    public List<String> getLst() {
		return lst;
	}
	public void setLst(List<String> lst) {
		this.lst = lst;
	}
	public Info() {
	}
	public void save(String texto){
        lst.add(texto);
    }
}

