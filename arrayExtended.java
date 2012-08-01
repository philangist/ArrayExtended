public class arrayExtended {
	private int[] array;
	
	public arrayExtended()
	{

	}

	public arrayExtended(int[] someArray)
	{
		this.array = someArray;
	}

	public void setArray(int[] someArray)
	{
		this.array = someArray;	
	}

	public int[] getArray()
	{
		return this.array;
	}

	public int getMin()
	{
		int lowest = this.array[0];
		for (int i = 0; i < this.array.length; i++ ) {
			if (this.array[i] < lowest) {
				lowest = i;
			}
		}
		return lowest;
	}

	public int getMax()
	{	
		int highest = this.array[0];
		for (int i = 0; i < this.array.length - 1; i++) {
			if (this.array[i] > highest) {
				highest = this.array[i];
			}
		}
		return highest;
	}

	public int getValue(int index)
	{
		return this.array[index];
	}

	public void setValue(int index, int value)
	{
		this.array[index] = value;
	}

	public void insert(int index, int element)
	{
		int a1 = this.array[index];
		int length = array.length;

		int[] array2 = new int[length + 1];
		for (int i = 0; i < length; i++)
		{
			if (i < index)
			{
				array2[i] = array[i];
			}	  
			else if (i > index)
			{
				array2[i] = array[i+1];
			}	
		  	else
		  	{
				array2[i] = element;
			}
		}
		array = array2;
	}

	public void delete(int index)
	{
		int length = array.length - 1;

		int[] array2 = new int[length + 1];
		for (int i = 0; i < length; i++)
		{
			if (i < index)
			{
				array2[i] = array[i];
			}	  
			else
		  	{
				array2[i-1] = array[i];
			}
		}
		array = array2;
	}

	private void swap(int i){
		int first = this.array[i];
		int second = this.array[i + 1];
		this.array[i] = second;
		this.array[i + 1] = first;		
	}

	private void swap(int i, int j){
		int first = this.array[i];
		int second = this.array[j];
		this.array[i] = second;
		this.array[j] = first;		
	}

	public void bubbleSort()
	{
		for (int n = this.array.length-1; n > 0; n--){
			for (int i = 0; i < n; i++){
				if (this.array[i] <= this.array[i + 1]){
					continue;
				}else{
					swap(i);		
				}
			}
		}
	}

	public void selectionSort(){
		int lowest = this.array[0];
		int position = 0;
		for (int i = 0; i < this.array.length; i++){
			for (int n = 0; n < (this.array.length - i) - 1; n++) {
				if (this.array[n] < lowest){
					lowest = this.array[n];
					swap(this.array.length - i, position);
					position = n;
				}else{
					continue;
				}
			}
		}
	}

	public void insertionSort(){
		for (int i = 1; i <= this.array.length - 1; i++) {
			int j = i;
			while (j > 0 && this.array[j] < this.array[j - 1]) {
				swap(j, j-1);
				j = j-1;
			}
		}
	}
}