package com.it.Utils;

import java.util.Random;
import java.util.stream.Collectors;

public class Utils {

    public static class String {

        public static java.lang.String getRandon(int lenght) {

           return new Random().ints(65, 88)
                    .limit(lenght)
                    .mapToObj(s -> "" + (char) s)
                    .collect(Collectors.joining());

        }

    }

}
