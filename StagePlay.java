package com.com.livevasiliy.hometask;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StagePlay
{
	public static void main (String[] args) throws java.lang.Exception
	{
		       String[] roles = {"Городничий",
                "Аммос Федорович",
                "Артемий Филиппович"};

        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное " +
                                "известие: к нам едет ревизор.",
                                "Аммос Федорович: Как ревизор?",
                                "Артемий Филиппович: Как ревизор?",
                                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                                "Аммос Федорович: Вот те на!",
                                "Артемий Филиппович: Вот не было заботы, так подай!",
                                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles, textLines));
	}
	
	private static String printTextPerRole(String[] roles, String[] textLines) {
		String stageplaytext = "";

        for (String role : roles ) {
        	stageplaytext += (role + '\n');
        		for (int i = 0; i < textLines.length; i++ ) {
        			if (textLines[i].startsWith(role + ":")){
        				stageplaytext += ((i + 1) + ")" + textLines[i].substring(role.length() + 1) + '\n');
        			}
        		}
        		stageplaytext +=('\n');
        }

        return stageplaytext;
    }
}