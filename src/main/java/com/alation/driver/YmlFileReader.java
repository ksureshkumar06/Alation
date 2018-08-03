package com.alation.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import com.alation.bean.Bean;
import com.esotericsoftware.yamlbeans.YamlException;

public class YmlFileReader {

	private Map<String, Object> environment;
	private Map<String, Object> properties = new LinkedHashMap<String, Object>();
	Bean bean = new Bean();

	public Map yamlFileReader() throws YamlException, FileNotFoundException {
		InputStream inputStream = new FileInputStream("config/locator.yml");
		Yaml yaml = new Yaml();
		Map<String, Map<String, Object>> data = ((Map<String, Map<String, Object>>) yaml.load(inputStream));
		environment = (Map<String, Object>) data.get("locator");
		for (Map.Entry<?, ?> entry : ((Map<?, ?>) environment).entrySet()) {
			properties.put(entry.getKey().toString(), entry.getValue());
		}
		bean.setLocator(properties);
		return properties;

	}
}
