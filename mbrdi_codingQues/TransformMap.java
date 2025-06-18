package mbrdi_codingQues;

import java.util.*;

public class TransformMap {
	public static void main(String[] args) {
		Map<String, String> input = new LinkedHashMap<>();
		input.put("a:1", "x");
		input.put("b:2", "y");
		input.put("c:4", "z");
		input.put("b:3", "w");
		input.put("c:5", "u");
		input.put("b:6", "v");

		Map<String, List<Map<String, String>>> output = new LinkedHashMap<>();

		for (Map.Entry<String, String> entry : input.entrySet()) {
			String[] parts = entry.getKey().split(":");
			String mainKey = parts[0];
			String subKey = parts[1];
			String value = entry.getValue();

			output.computeIfAbsent(mainKey, k -> new ArrayList<>()).add(Collections.singletonMap(subKey, value));
		}

		// Print the result
		output.forEach((key, value) -> {
			System.out.println("\"" + key + "\": " + value);
		});
	}
}
