package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * SaveableDictionary
 */
public class SaveableDictionary {
	private HashMap<String, String> dictionary;
	private String file;

	public SaveableDictionary() {
		this.dictionary = new HashMap<>();

	}

	public SaveableDictionary(String file) {
		this.dictionary = new HashMap<>();
		this.file = file;

	}

	public void add(String words, String translation) {
		if (!dictionary.containsKey(words)) {
			this.dictionary.put(words, translation);
		}
	}

	public String translate(String word) {
		if (this.dictionary.containsKey(word)) {
			return this.dictionary.get(word);
		} else if (this.dictionary.containsValue(word)) {
			for (Map.Entry<String, String> entry : this.dictionary.entrySet()) {
				if (entry.getValue().equals(word)) {
					return entry.getKey();
				}
			}
		}
		return null;
	}

	public void delete(String word) {
		Iterator<Map.Entry<String, String>> iterator = this.dictionary.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			if (entry.getKey().equals(word) || entry.getValue().equals(word)) {
				iterator.remove();
			}
		}
	}

	public boolean load() {
		try (Scanner scanner = new Scanner(Paths.get(this.file))) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split(":");
				this.add(parts[0], parts[1]);
				// System.out.println(parts[0]);
				// System.out.println(parts[1]);

			}
			return true;

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}

	public boolean save() {
		try (PrintWriter writer = new PrintWriter(this.file);) {
			Iterator<Map.Entry<String, String>> iterator = this.dictionary.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<String, String> entry = iterator.next();
				writer.println(entry.getKey() + ":" + entry.getValue());
			}
			writer.close();
			return true;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}

	}
}
