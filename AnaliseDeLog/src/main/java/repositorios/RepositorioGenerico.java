package repositorios;


import java.util.ArrayList;

import entidades.EntidadeProcesso;

public interface RepositorioGenerico<T> {
	ArrayList<T>select(T t);
	void insert(T t);
	ArrayList<T>delete();
	ArrayList<T> findall();
	T find(T obj);
	EntidadeProcesso find(EntidadeProcesso obj);
	

}
