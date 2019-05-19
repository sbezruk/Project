package laba2;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Zadanie1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader=new BufferedReader (new InputStreamReader(System.in));
		ArrayList<String> arr = new ArrayList<>();
		for(int i=0;i<10;i++){
			arr.add(reader.readLine());
		}
		System.out.println(arr);
		
		for(int i=0;i<15;i++){
			arr.add(0,arr.remove(9));
		}
System.out.println(arr);
System.out.println("Input 5 el --> ");

	for(int i=0;i<5;i++){	
			arr.set(arr.size()-6+i+1,reader.readLine());	
	}
	
System.out.println(arr);

for(String s: arr){
	System.out.println(s);
}
	}
}


