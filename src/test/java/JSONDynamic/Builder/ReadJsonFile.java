package JSONDynamic.Builder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class ReadJsonFile {

	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\user\\eclipse-workspace\\Builder\\src\\test\\sample.json";
		Path p= Paths.get(filePath);
		String file=Files.readString(p);
		System.out.println(file);
		
		Map<String,String> map=new HashMap<>();
		map.put("fruit", "apple");
		map.put("size", "Large");
		map.put("color", "red");
		
		Set<String> key=map.keySet();
		for(String s:key)
		{
			file=file.replace("{{"+s+"}}",map.get(s));
		}
		System.out.println(file);
	}

}
