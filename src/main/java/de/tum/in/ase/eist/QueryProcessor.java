package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else if (query.contains(" plus ")) {
            String[] pairs = query.split("");
            int num1 = Integer.valueOf(pairs[3]);
            int num2 = Integer.valueOf(pairs[5]);
            int sum = num1 + num2;
            String sumStr = String.valueOf(sum);
            return sumStr;
        }
    }
}
