package com.resume.util;

public class InternationalizationClass {
	
	public String[] generateNamesOfAttributes(String localeLanguage, int length){
		String[] namesOfAttributes = new String[length];
		if(localeLanguage.equalsIgnoreCase("ru_RU")){
			namesOfAttributes = new String[]{ "Фамилия", "Имя", "Отчество", "Адрес", 
					"Номер телефона", "EMail", "Должность", "Образование", "Знания", "Опыт",
					"Персональные качества","Дополнительно"};
		}
		else {
			namesOfAttributes = new String[]{ "Surname", "Name", "Patronymic", "Address", 
					"Phonenumber", "Email", "Position", "Education", "Knowledge", "Experience",
					"Qualities","Additionally"};
		}
		return namesOfAttributes;
	}
}
		
