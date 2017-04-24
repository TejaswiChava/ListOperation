package info.list;

import java.util.Arrays;
import java.util.LinkedList;

public class Listoperation {
	private final Object[] EMPTYELEMENTDATA ={};
	private final int DEFAULT_CAPACITY = 10;
	private final static int ARRAY_SIZE = Integer.MAX_VALUE - 8;
	protected transient int modCount=0;
	public static Listoperation listoperation = new Listoperation();
	public static Object[] list;

	public int size;
	
		
	public Listoperation() {
		this.list = EMPTYELEMENTDATA;
	}

	public void certainCapacityInternal(int minCapacity) {
		if (list == EMPTYELEMENTDATA) {
			minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
		}

		certainExternalCapacity(minCapacity);
	}

	public void certainExternalCapacity(int minCapacity) {
			modCount++;
		if (minCapacity - list.length > 0)
			grow(minCapacity);
	}

	public void grow(int minCapacity) {
		int oldCapacity = list.length;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		if (newCapacity - minCapacity < 0)
			newCapacity = minCapacity;
		if (newCapacity - ARRAY_SIZE > 0)
			newCapacity = hugeCapacity(minCapacity);
		list = Arrays.copyOf(list, newCapacity);
	}

	public static int hugeCapacity(int minCapacity) {
		if (minCapacity < 0)
			throw new OutOfMemoryError();
		return (minCapacity > ARRAY_SIZE) ? Integer.MAX_VALUE : ARRAY_SIZE;
	}

	public Object find(int index) {
		if (index < size) {
			return list[index];
		}
		else return -1;
	}

	public boolean Delete(int index) {
		int temp;
		if (index < size) {
			Object a;
			a = list[index];
			list[index] = null;
			temp = index;
			while (temp < size) {
				list[temp] = list[temp + 1];
				list[temp + 1] = null;
				temp++;
			}
			size--;
		}
		
		return true;

	}

	public int Size() {
		if (size < list.length) {
	         list = (size == 0)
	           ? EMPTYELEMENTDATA
	           : Arrays.copyOf(list, size);
		}
		return list.length;
	}

	public boolean isEmpty() {
		return (list.length == 0);

	}

	public static String DisplayList() {
		String disp="";
		for (int i =0; i < listoperation.Size(); i++) {
			
				disp=disp+list[i];
		}
		
		return disp;
	}

	public boolean add(Object element) {
		certainCapacityInternal(size + 1);

		list[size++] = element;

		return true;

	}
	
	
	  }
