package by.epam.pretraining.kleshchenko.task07.util.list;

public interface List<T> {
	
    public int size();

    public boolean isEmpty();
    
    public boolean contains(T e);
    
    public int indexOf(T e);
    
    public T get(int index);
    
	public boolean add(T e);
	
	public boolean addAll(T[] e);

    public T remove(int index);

    public void clear();
    
    public T[] toArray();

}
