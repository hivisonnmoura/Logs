package repositorios;


import java.util.ArrayList;

public interface RepositorioGenerico<T> {
	ArrayList<T>select(T t);
	void insert(T t);
	ArrayList<T>delete();
	ArrayList<T> findall();
	T find(T obj);
	

}
