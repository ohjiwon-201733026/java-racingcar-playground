package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CalculatorString {

    private String delimeter;
    private List<Integer> numbers;

    public CalculatorString(String input) {
        numbers = new ArrayList<>();
        setDelimeterAndNumbers(input);
    }

    protected void setDelimeterAndNumbers(String input) {
        if(input == null || input.isEmpty()) return;

        input = setDelimeter(input);
        setNumbers(input);

    }

    protected void setNumbers(String input) {
        this.numbers = Arrays.stream(input.split(this.delimeter))
                .mapToInt(Integer::parseInt)
                .peek(num -> {
                    if(num < 0) {
                        throw new RuntimeException();
                    }
                })
                .boxed()
                .collect(Collectors.toList());
    }

    protected String setDelimeter(String input) {
        delimeter = ":|,";

        if(input.startsWith("//")) {
            this.delimeter = getCustomDelimeter(input);
            input = input.replace("//"+this.delimeter+"\n", "");
        }

        return input;
    }

    private String getCustomDelimeter(String input) {
        String regex = "//(.*?)\n";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            return matcher.group(1).trim();
        }

        throw new RuntimeException("No custom delimeter found");
    }

    public int add() {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}

