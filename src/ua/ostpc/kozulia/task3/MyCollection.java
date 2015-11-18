package ua.ostpc.kozulia.task3;

import java.util.Arrays;
import java.util.Iterator;

public class MyCollection<T>{

	private T[] array;
	private int size;
	/////////////////////////////////////
	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
   /////////////////////////////////////
	public MyCollection(T [] array, int size) {
	      this.array = array;
	      this.size = size;
	    }
	
	
	   public void ensureCapacity(int minCapacity) {		            
		            int oldCapacity = array.length;
		            if (minCapacity > oldCapacity) {
		                Object oldData[] = array;
		                int newCapacity = (oldCapacity * 3)/2 + 1;
		                if (newCapacity < minCapacity)
		                    newCapacity = minCapacity;
		                // minCapacity is usually close to size, so this is a win:
		                array = Arrays.copyOf(array, newCapacity);
		            }
		        }
	
	
	//////////////////////////////////////
	public void add(T elem) {/// DONE!!!
		ensureCapacity(size+1);
		array[size++] = elem;		
	}
	
	 public boolean remove(T elem) {//DONE!!!
		          if (elem == null) {
		              for (int index = 0; index < size; index++)
		                 if (array[index] == null) {
		                      fastRemove(index);
		                      return true;
		                  }
		        } else {
		              for (int index = 0; index < size; index++)
		                 if (elem.equals(array[index])) {
		                     fastRemove(index);
		                      return true;
		                  }
		          }
		         return false;
		      }
		  
		 
		      private void fastRemove(int index) {
		 
		          int numMoved = size - index - 1;
		          if (numMoved > 0)
		             System.arraycopy(array, index+1, array, index,
		                               numMoved);
		          array[--size] = null; // Let gc do its work
		     }
	
	
	

	public void getRange(int startIndex, int finalIndex) {//Done!!!		
		for (int i=startIndex-1;i<finalIndex;i++)
			System.out.print(array[i]+" ");
	}

	// @SuppressWarnings("unchecked")
	public Iterator<T> iterator() {//Done!!!	
		Iterator <T> it = new Iterator <T>(){
			private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < array.length && array[currentIndex] != null;
        }

        @Override
        public T next() {
            return array[currentIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    };
		return it;
		//return iterator();
	}

	public T get(int index) {//DONE!!!!
		//rangeCheck(index);
		return (T) array[index];
	}

	private void rangeCheck(int index) {
		if (index >= size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size " + size);

	}

	

	public String toString() {//DONE!!!
		//String g= new String(array);
		String a="[";
				for(int i=0;i<size-1;i++)
				{
					a+=array[i]+";";
				}
				a+=array[size-1]+"]";
		return a;
		
	}

	public boolean equals(MyCollection<T> anoterCollection) {///DONE!!!
		 return (this == anoterCollection);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers = new Integer[]{1, 2, 3, 4, 5};
		MyCollection<Integer> item = new MyCollection<Integer>(numbers,numbers.length);		
		item.add(1);
		System.out.println(item.get(item.size-1)+"///"+item.size);
		System.out.println(item);
		item.getRange(1, 3);
		item.remove(2);
		System.out.println(item);
		System.out.println(item.iterator());
		Integer[] numbers1 = new Integer[]{3, 4, 3, 6};
		MyCollection<Integer> item1 = new MyCollection<Integer>(numbers1,numbers1.length);
		System.out.println(item);
		System.out.println(item.equals(item1));

	}

}
