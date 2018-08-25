package programming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class MaxRepeatedWordsInFile {

	public HashMap<String, Integer> getCountOfWordsInFile() throws FileNotFoundException{
		
		int words=0;
		File file = new File("C:\\Users\\User1\\Desktop\\dummy.txt");
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(fis);
		
		HashMap<String, Integer> wordMap = new HashMap<String,Integer>();
		while(sc.hasNextLine()){
			String line_data = sc.nextLine();
			StringTokenizer st = new StringTokenizer(line_data," ");
			words+= st.countTokens();
			while(st.hasMoreTokens()){
			String temp = st.nextToken().toLowerCase();
			
			if(!wordMap.containsKey(temp)){
				wordMap.put(temp,1);
			}
			else{
				wordMap.put(temp, wordMap.get(temp)+1);
			}
			}
		}
		System.out.println("No of words : "+words);
		
		
		return wordMap ;
	}
	
	public List<Entry<String,Integer>> sortByValue(HashMap<String, Integer> wordMap){
		Set<Entry<String,Integer>> set = wordMap.entrySet();
		List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(set);
		
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return (o2.getValue().compareTo(o1.getValue()));
			}	
		});
		return list ;
	}

	public static void main(String[] args) throws FileNotFoundException{
		MaxRepeatedWordsInFile wrds = new MaxRepeatedWordsInFile();
		HashMap<String, Integer> wordMap = wrds.getCountOfWordsInFile();
		List<Entry<String,Integer>> list = wrds.sortByValue(wordMap);
		for(Map.Entry<String, Integer> entry : list ){
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}
}
