package com.resume.util;

public class InternationalizationClass {
	
	public String[] generateNamesOfAttributes(String localeLanguage, int length){
		String[] namesOfAttributes = new String[length];
		if(localeLanguage.equalsIgnoreCase("ru_RU")){
			namesOfAttributes = new String[]{ "�������", "���", "��������", "�����", 
					"����� ��������", "EMail", "���������", "�����������", "������", "����",
					"������������ ��������","�������������"};
		}
		else {
			namesOfAttributes = new String[]{ "Surname", "Name", "Patronymic", "Address", 
					"Phonenumber", "Email", "Position", "Education", "Knowledge", "Experience",
					"Qualities","Additionally"};
		}
		return namesOfAttributes;
	}
}
		
