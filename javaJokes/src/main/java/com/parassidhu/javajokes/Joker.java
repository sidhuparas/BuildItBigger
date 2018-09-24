package com.parassidhu.javajokes;

import java.util.Random;

public class Joker {

    private String[] jokes = {
            "Q: How many programmers does it take to change a light bulb?\n" +
                    "\n" +
                    "A: none, that's a hardware problem",

            "Q: What did the Java code say to the C code?\n" +
                    "\n" +
                    "A: You've got no class.",

            "Q: \"Whats the object-oriented way to become wealthy?\"\n" +
                    "\n" +
                    "A: Inheritance",

            "Q: Why are Assembly programmers always soaking wet?\n" +
                    "\n" +
                    "A: They work below C-level.",

            "Q: What do cats and programmers have in common?\n" +
                    "\n" +
                    "A: When either one is unusually happy and excited, an appropriate question would be, \"did you find a bug?\"",

            "Q: Why do programmers always get Christmas and Halloween mixed up?\n" +
                    "\n" +
                    "A: Because DEC 25 = OCT 31",

            "“Knock, knock.”\n" +
                    "“Who’s there?”\n" +
                    "Extremely long pause…\n" +
                    "“Java.”",

            "Q: What is the difference between a programmer and a non-programmer?\n" +
                    "A: The non-programmer thinks a kilobyte is 1000 bytes while a programmer thinks that a kilometer is 1024 meters.\n" +
                    "\n"
    };

    public String tellJoke() {
        int i = new Random().nextInt(8);
        return jokes[i];
    }
}
