import java.util.Scanner;

import javax.naming.NamingException;

class App {
  public static void main(String[] args) {
    // 1. Use a variable to store a number, then write a condition that prints 0 if the number is equal to 10, and prints -1 otherwise.

    // int number = 10;

    // if (number == 10) {
    //   System.out.println(0);
    // } else {
    //   System.out.println(-1);
    // }

    // 2. Use a variable to store a number, then write a condition that prints -1 if the number is less than 10, prints 1 if the number is greater than 10, and prints 0 if the number is equal to 10.

    // int number = 9;

    // if (number < 10) {
    //   System.out.println(-1);
    // } else if (number > 10) {
    //   System.out.println(1);
    // } else if (number == 10) {
    //   System.out.println(0);
    // }

    // 3. Use variables to store two numbers, then write a condition that prints 1 if the numbers are both less than 10, and prints 0 otherwise.

      // int numberOne = 8;
      // int numberTwo = 5;

      // if (numberOne < 10 && numberTwo < 10) {
      //   System.out.println(1);
      // } else {
      //   System.out.println(0);
      // }

    // 4. Use a variable to store a number, then write a condition that prints 1 if the number is over 9000, and prints -1 otherwise.

      // int number = 9;
      // if (number > 9000) {
      //   System.out.println(1);
      // } else {
      //   System.out.println(-1);
      // }

    // 5. Use a variable to store a number, then write a condition that prints 9 if the number is less than 10, prints 19 if the number is less than 20, prints 29 if the number is less than 30, and prints -1 otherwise (only one print statement should occur).

        // int number = 9; 
        // if (number <10) {
        //   System.out.println(9);
        // } else if (number <20) {
        //   System.out.println(19);
        // } else if (number <30) {
        //   System.out.println(29);
        // } else {
        //   System.out.println(-1);
        // }

    // 6. Use variables to store two numbers, then write a condition that prints 100 if either number is greater than 10, and prints -100 otherwise.

      // int numberOne = 9;
      // int numberTwo = 8;

      // if (numberOne > 10 || numberTwo > 10) {
      //   System.out.println(100);
      // } else {
      //   System.out.println(-100);
      // }

    // 7. Use a variable to store a number, then write a condition that prints 1776 if the number is less than 0, and prints 1979 otherwise.

      // int number = 9;

      // if (number < 0) {
      //   System.out.println(1776);
      // } else {
      //   System.out.println(1979);
      // }

    // 8. Use a variable to store a number, then write a condition that prints 100 if the number equals 100, prints 99 if the number is equal to 99, and prints 0 otherwise.

      // int number = 9;
      
      // if (number == 100) {
      //   System.out.println(100);
      // } else if (number == 99) {
      //   System.out.println(99);
      // } else {
      //   System.out.println(0);
      // }

    // 9. Use variables to store two numbers, then write a condition that prints 1 if the first number is less than zero and the second number is greater than 0, and prints 0 otherwise.

      // int numberOne = -9;
      // int numberTwo = 9;

      // if (numberOne < 0 && numberTwo > 0) {
      //   System.out.println(1);
      // } else {
      //   System.out.println(0);
      // }

    // 10. Use a variable to store a number, then write a condition that prints 5 if the number is greater than 80, prints 4 if the number is greater than 60, prints 3 if the number is greater than 40, prints 2 if the number is greater than 20, and prints 1 otherwise (only one print statement should occur).

    // int number = 9;

    // if (number > 80) {
    //   System.out.println(5);
    // } else if (number > 60) {
    //   System.out.println(4);
    // } else if (number > 40) {
    //   System.out.println(3);
    // } else if (number > 20) {
    //   System.out.println(2);
    // } else {
    //   System.out.println(1);
    // }

    // SOLUTIONS: https://gist.github.com/peterxjang/aee70f966f0f725609eee89b06e8a6c0


    // 1. Write a program that uses variables to store a first and last name, then prints the full name in one line using string concatenation (the + operator).

      // String firstName = "Bob";
      // String lastName = "The Builder";

      // System.out.println(firstName + " " + lastName);

    // 2. Write a program that uses variables to store a first and last name, then prints the full name in one line using string interpolation (the #{} operator).

      // String firstName = "Bob";
      // String lastName = "The Builder";
      // String message = String.format("%s %s", firstName,lastName);

      // System.out.println(message);

    // 3. Write a program that asks the user to input a word. If the word is "marco", print "polo".

      // System.out.println("input a word please");
      // Scanner keyboard = new Scanner(System.in);
      // String word = keyboard.next();

      // if (word.equals("marco")) {
      //   System.out.println("polo");
      // }
      // keyboard.close();

    // 4. Write a program that uses variables to store three different colors, then prints out a sentence using the colors with string concatenation (the + operator).

      // String blue = "blue";
      // String red = "red";
      // String green = "green";

      // System.out.println("the colors are: " + blue + " " + red + " and " + green);

    // 5. Write a program that uses variables to store three different colors, then prints out a sentence using the colors with string interpolation (the #{} operator).

    // String blue = "blue";
    // String red = "red";
    // String green = "green";
    // String message = String.format("the colors are %s %s and %s", blue,green,red);

    // System.out.println(message);

    // 6. Write a program that asks the user to enter a name. If the name is not "Santa", print "You're not Santa."

    // System.out.println("input a name please");
    //   Scanner keyboard = new Scanner(System.in);
    //   String name = keyboard.next();

    //   if (!name.equals("Santa")) {
    //     System.out.println("You're not Santa.");
    //   }
    //   keyboard.close();;

    // 7. Write a program that uses variables to store a book's title and author, then prints out a sentence using that information with string concatenation (the + operator).

      // String title = "Java for Dummies";
      // String author = "Barry Burd";

      // System.out.println("The author of " + title + " is " + author);

    // 8. Write a program that uses variables to store a book's title and author, then prints out a sentence using that information with string interpolation (the #{} operator).

    // String title = "Java for Dummies";
    // String author = "Barry Burd";
    // String message = String.format("The author of %s is %s", title,author);

    // System.out.println(message);

    // 9. Write a program that asks the user to enter a password. If the password is "Joshua", the program responds "Shall we play a game?". For any other password, the program responds "Access denied"

      // System.out.println("Please enter a password");

      // Scanner keyboard = new Scanner(System.in);
      // String password = keyboard.next();

      // if (password.equals("Joshua")) {
      //   System.out.println("Shall we play a game?");
      // } else {
      //   System.out.println("Access denied");
      // }

      // keyboard.close();

    // 10. Write a program that uses variables to store the names of three cities, then prints out a sentence using that information with string concatenation (the + operator).

      // String brooklyn = "Brooklyn";
      // String queens = "queens";
      // String bronx = "bronx";

      // System.out.println(brooklyn + ", " + queens + ", and " + bronx + " are all cities");

    // SOLUTIONS: https://gist.github.com/peterxjang/79ba5acc912a86cce2a18c2f14b1c712


    // 1. Write a program that asks the user to enter a word, then prints that word with all capital letters.

      // System.out.println("Please enter a word");

      // Scanner keyboard = new Scanner(System.in);
      // String input = keyboard.next();

      // System.out.println(input.toUpperCase());

      // keyboard.close();

    // 2. Write a program that asks the user to enter a number, then prints "That's a big number" if the number is greater than 100.

    // System.out.println("Please enter a number");

    // Scanner keyboard = new Scanner(System.in);
    // int number = keyboard.nextInt();

    // if (number > 100) {
    //   System.out.println("Thats a big number");
    // }

    // keyboard.close();

    // 3. Write a program that asks the user to enter two numbers, then prints the numbers added together.

      // System.out.println("Please enter a number");
      // Scanner keyboard = new Scanner(System.in);
      // int numberOne = keyboard.nextInt();
      
      // System.out.println("Please enter another number");
      // int numberTwo = keyboard.nextInt();

      // int sum = numberOne + numberTwo;

      // System.out.println("Sum is " + sum);
      // keyboard.close();

    // 4. Write a program that asks the user to enter a word, then prints that word in reverse order.

      // System.out.println("Please enter a word");

      // Scanner keyboard = new Scanner(System.in);

      // String input = keyboard.next();

      // System.out.println(new StringBuilder(input).reverse().toString());

      // keyboard.close();

    // 5. Write a program that asks the user to enter a number, then prints the number times 10.

      // System.out.println("Please enter a number");

      // Scanner keyboard = new Scanner(System.in);
      // int number = keyboard.nextInt();

      // for (int i = 0; i < 10; i++) {
      //   System.out.println(number);
      // }
      
      // keyboard.close();

    // 6. Write a program that asks the user to enter two words, then prints both words on the same line in all capital letters.

      // System.out.println("Please enter two words");

      // Scanner keyboard = new Scanner(System.in);
      // String str = keyboard.nextLine();

      // System.out.println(str.toUpperCase());
      
      // keyboard.close();

    // 7. Write a program that asks the user to enter a word, then prints the number of letters in the word.

      // System.out.println("Please enter a word");

      // Scanner keyboard = new Scanner(System.in);
      // String str = keyboard.next();

      // System.out.println(str.length());
      
      // keyboard.close();

    // 8. Write a program that asks the user to enter a number, then prints "That's a negative number" if the number is less than 0.

      // System.out.println("Please enter a number");

      // Scanner keyboard = new Scanner(System.in);
      // int number = keyboard.nextInt();
      // if (number < 0) {
      //   System.out.println("Thats a negative number");
      // }
      
      // keyboard.close();

    
    // 9. Write a program that asks the user to enter two numbers, then prints the two numbers multiplied together.

    // System.out.println("Please enter a number");
    
    // Scanner keyboard = new Scanner(System.in);
    // int firstNumber = keyboard.nextInt();
    // System.out.println("Please enter another number");
    // int secondNumber = keyboard.nextInt();
    
    // int product = firstNumber * secondNumber;

    // System.out.println(product);

    // keyboard.close();

    // 10. Write a program that asks the user to enter a word, then prints "That's a long word" if the word has more than 5 letters.

      // System.out.println("Please enter a word");

      // Scanner keyboard = new Scanner(System.in);
      // String word = keyboard.next();
      
      // if (word.length() > 5) {
      //   System.out.println("Thats a long word");
      // }
      
      // keyboard.close();

    // SOLUTIONS: https://gist.github.com/peterxjang/1539a3ad79728ba4fb68dd8d07279c29


    // 1. Write a while loop to print the numbers 1 through 10.

      // int i = 1;
      // while (i <= 10) {
      //   System.out.println(i);
      //   i++;
      // }

    // 2. Write a while loop that prints the word "hello" 5 times.

    // int i = 0;
    // while (i < 5) {
    //   System.out.println("hello");
    //   i++;
    // }

    // 3. Write a while loop that asks the user to enter a word and will run forever until the user enters the word "stop".

      // Scanner keyboard = new Scanner(System.in);
    
      // while (true) {
      //   System.out.println("Please enter a word");
      //   String word = keyboard.next();
      //   if (word.equals("stop")) {
      //     System.out.println("exiting..");
      //     break;
      //   }
      // }

      // keyboard.close();

    // 4. Write a while loop that prints the numbers 0 through 100, increasing by 5 each time.

      // int i = 0;
      // while (i <= 100) {
      //   System.out.println(i);
      //   i += 5;
      // }

    // 5. Write a while loop that prints the number 9000 ten times.

    // int i = 0;
    // while(i < 10) {
    //   System.out.println(9000);
    //   i++;
    // }

    // 6. Write a while loop that asks the user to enter a number and will run forever until the user enters a number greater than 10.

      // Scanner keyboard = new Scanner(System.in);
    
      // while (true) {
      //   System.out.println("Please enter a number");
      //   int number = keyboard.nextInt();
      //   if (number > 10) {
      //     System.out.println("exiting");
      //     break;
      //   }
      // }

      // keyboard.close();

    // 7. Write a while loop that prints the numbers 50 to 70.

      // int i = 50;

      // while (i <= 70) {
      //   System.out.println(i);
      //   i++;
      // }

    // 8. Write a while loop that prints the phrase "Around the world" 144 times.

      // int i = 0; 
      // while(i < 144) {
      //   System.out.println("Around the world");
      //   i++;
      // }

    // 9. Write a while loop that asks the user to enter a word and will run forever until the user enters a word with more than 5 letters.

    // Scanner keyboard = new Scanner(System.in);
    
    // while (true) {
    //   System.out.println("Please enter a word");
    //     String input = keyboard.nextLine();  
    //     if (input.length() > 5 ) {
    //       break;
    //     }
    //   }
    //   keyboard.close();


    // 10. Write a while loop that prints the even numbers from 2 to 40.

    // int i = 2;

    // while (i <= 40) {
    //   System.out.println(i);
    //   i += 2;
    // }

    // SOLUTIONS: https://gist.github.com/peterxjang/c4ec0e0f8f6e123d65ada9bf3100068b


    // 1. Create an array to store 3 words. Then add two more words to the array and print the array on one line.

    // 2. Create an array to store 4 letters. Then change the second letter to a number and print the array on one line.

    // 3. Create an array to store 5 numbers. Then print out each number on separate lines with a while loop.

    // 4. Create an array to store 1 number. Then add three more numbers to the array and print the array on one line.

    // 5. Create an array to store 3 strings with lower case letters. Then change the third string to have all capital letters and print the array on one line.

    // 6. Create an array to store 3 names. Then print out each name on separate lines with a while loop.

    // 7. Create an array to store 2 strings. Then add one string to the array and print the array on one line.

    // 8. Create an array to store 5 numbers. Then change the first number to 10 times its original value and print the array on one line.

    // 9. Create an array to store 2 numbers. Then print out each number on separate lines with a while loop.

    // 10. Create an array to store names of 3 different countries. Then add one more country and print the array one line.


    // SOLUTIONS: https://gist.github.com/peterxjang/7095a2b19e1da2cc18d4a0dcd66cb8f1


    // 1. Create an array to store 3 words. Then add two more words to the array and print the array on one line.

    // 2. Create an array to store 4 letters. Then change the second letter to a number and print the array on one line.

    // 3. Create an array to store 5 numbers. Then print out each number on separate lines with a while loop.

    // 4. Create an array to store 1 number. Then add three more numbers to the array and print the array on one line.

    // 5. Create an array to store 3 strings with lower case letters. Then change the third string to have all capital letters and print the array on one line.

    // 6. Create an array to store 3 names. Then print out each name on separate lines with a while loop.

    // 7. Create an array to store 2 strings. Then add one string to the array and print the array on one line.

    // 8. Create an array to store 5 numbers. Then change the first number to 10 times its original value and print the array on one line.

    // 9. Create an array to store 2 numbers. Then print out each number on separate lines with a while loop.

    // 10. Create an array to store names of 3 different countries. Then add one more country and print the array one line.


    // SOLUTIONS: https://gist.github.com/peterxjang/7095a2b19e1da2cc18d4a0dcd66cb8f1


    // 1. Write a function that takes in a number and returns the number times two. Then run the function and print the result.

    // 2. Write a function that takes in a string and returns the string with all capital letters. Then run the function and print the result.

    // 3. Write a function that takes in two numbers and returns the first number subtracted by the second. Then run the function and print the result.

    // 4. Write a function that takes in a number and returns the number times itself. Then run the function and print the result.

    // 5. Write a function that takes in a string and returns the first letter of the string. Then run the function and print the result.

    // 6. Write a function that takes in three strings and returns a string that combines all three strings with spaces in between. Then run the function and print the result.

    // 7. Write a function that takes in a number and returns the number as a string. Then run the function and print the result.

    // 8. Write a function that takes in a string and returns the string repeated 5 times. Then run the function and print the result.

    // 9. Write a function that takes in 3 numbers and returns the average (the sum divided by 3.0). Then run the function and print the result.

    // 10. Write a function that takes in a number and returns the number times 10 plus 30. Then run the function and print the result.


    // SOLUTIONS: https://gist.github.com/peterxjang/6a26d3c698c651dd6e9ccb168d32648c


    //  1. Start with an array of numbers and create a new array with each number times 3.
    //     For example, [1, 2, 3] becomes [3, 6, 9].

    //  2. Start with an array of strings and create a new array with each string upcased.
    //     For example, ["hello", "goodbye"] becomes ["HELLO", "GOODBYE"].

    //  3. Start with an array of hashes and create a new array of string values from each hash's :name key.
    //     For example, [{name: "Alice", age: 27}, {name: "Blane", age: 16}] becomes ["Alice", "Blane"].

    //  4. Start with an array of numbers and create a new array with each number plus 7.
    //     For example, [1, 2, 3] becomes [8, 9, 10].

    //  5. Start with an array of strings and create a new array with each string's length.
    //     For example, ["hello", "goodbye"] becomes [5, 7].

    //  6. Start with an array of hashes and create a new array of number values from each hash's :age key.
    //     For example, [{name: "Alice", age: 27}, {name: "Blane", age: 16}] becomes [27, 16].

    //  7. Start with an array of numbers and create a new array with each number divided by 2.
    //     For example, [1, 2, 3] becomes [0.5, 1.0, 1.5].

    //  8. Start with an array of strings and create a new array with each string's first letter only.
    //     For example, ["hello", "goodbye"] becomes ["h", "g"].

    // 9.  Start with an array of hashes and create a new array of number values from each hash's :age key times 2.
    //     For example, [{name: "Alice", age: 27}, {name: "Blane", age: 16}] becomes [54, 32].

    // 10. Start with an array of numbers and create a new array with each number converted into a string.
    //     For example, [1, 2, 3] becomes ["1", "2", "3"].


    // SOLUTIONS (using while loop): https://gist.github.com/peterxjang/b9ac4390aad2301a2238efc95c904f3d
    // SOLUTIONS (using .each shortcut): https://gist.github.com/peterxjang/66598fd7cdbc67fe663624e217cebbaf
    // SOLUTIONS (using .map shortcut): https://gist.github.com/peterxjang/23a8f8a51601e4288ba3a8aa6d1f1c98


    //  1. Start with an array of numbers and create a new array with only the numbers less than 20.
    //     For example, [2, 32, 80, 18, 12, 3] becomes [2, 18, 12, 3].

    //  2. Start with an array of strings and create a new array with only the strings that start with the letter "w".
    //     For example, ["winner", "winner", "chicken", "dinner"] becomes ["winner", "winner"].

    //  3. Start with an array of hashes and create a new array with only the hashes with prices greater than 5 (from the :price key).
    //     For example, [{name: "chair", price: 100}, {name: "pencil", price: 1}, {name: "book", price: 4}] becomes [{name: "chair", price: 100}].

    //  4. Start with an array of numbers and create a new array with only the even numbers.
    //     For example, [2, 4, 5, 1, 8, 9, 7] becomes [2, 4, 8].

    //  5. Start with an array of strings and create a new array with only the strings shorter than 4 letters.
    //     For example, ["a", "man", "a", "plan", "a", "canal", "panama"] becomes ["a", "man", "a", "a"].

    //  6. Start with an array of hashes and create a new array with only the hashes with names shorter than 6 letters (from the :name key).
    //     For example, [{name: "chair", price: 100}, {name: "pencil", price: 1}, {name: "book", price: 4}] becomes [{name: "chair", price: 100}, {name: "book", price: 4}].

    //  7. Start with an array of numbers and create a new array with only the numbers less than 10.
    //     For example, [8, 23, 0, 44, 1980, 3] becomes [8, 0, 3].

    //  8. Start with an array of strings and create a new array with only the strings that don't start with the letter "b".
    //     For example, ["big", "little", "good", "bad"] becomes ["little", "good"].

    //  9. Start with an array of hashes and create a new array with only the hashes with prices less than 10 (from the :price key).
    //     For example, [{name: "chair", price: 100}, {name: "pencil", price: 1}, {name: "book", price: 4}] becomes [{name: "pencil", price: 1}, {name: "book", price: 4}].

    // 10. Start with an array of numbers and create a new array with only the odd numbers.
    //     For example, [2, 4, 5, 1, 8, 9, 7] becomes [5, 1, 9, 7].


    // SOLUTIONS (using while loop): https://gist.github.com/peterxjang/7de16ed43ea506e98df3fa15074b84f8
    // SOLUTIONS (using .each shortcut): https://gist.github.com/peterxjang/a702894841c7018ed8c127b647ae21f8
    // SOLUTIONS (using .select shortcut): https://gist.github.com/peterxjang/b8c8fb8b77b2cae7bb9cc62a3a434761


    //  1. Start with an array of numbers and compute the sum of all the numbers.
    //     For example, [5, 10, 8, 3] becomes 26.

    //  2. Start with an array of strings and combine them all into a single string.
    //     For example, ["volleyball", "basketball", "badminton"] becomes "volleyballbasketballbadminton".

    //  3. Start with an array of hashes and compute the sum of the prices (from the :price key).
    //     For example, [{name: "chair", price: 100}, {name: "pencil", price: 1}, {name: "book", price: 4}] becomes 105.

    //  4. Start with an array of numbers and compute the the minumum number.
    //     For example, [5, 10, 8, 3, 9] becomes 3.

    //  5. Start with an array of strings and compute the total length of all the strings.
    //     For example, ["volleyball", "basketball", "badminton"] becomes 29.

    //  6. Start with an array of hashes and find the hash with the lowest price (from the :price key).
    //     For example, [{name: "chair", price: 100}, {name: "pencil", price: 1}, {name: "book", price: 4}] becomes {name: "pencil", price: 1}.

    //  7. Start with an array of numbers and compute product of all the numbers.
    //     For example, [5, 10, 8, 3] becomes 1200.

    //  8. Start with an array of strings and combine them all into a single string, separated by dashes.
    //     For example, ["volleyball", "basketball", "badminton"] becomes "-volleyball-basketball-badminton-".

    //  9. Start with an array of hashes and find the hash with the shortest name (from the :name key).
    //     For example, [{name: "chair", price: 100}, {name: "pencil", price: 1}, {name: "book", price: 4}] becomes {name: "book", price: 4}.

    // 10. Start with an array of numbers and compute the maximum number.
    //     For example, [5, 10, 8, 3] becomes 10.


    // SOLUTIONS (using while loop): https://gist.github.com/peterxjang/376c8931a48549889eb3c9bc091e9f43
    // SOLUTIONS (using .each shortcut): https://gist.github.com/peterxjang/379c9945774f51027750c59d6e4395df
    // SOLUTIONS (using .reduce shortcut): https://gist.github.com/peterxjang/b69183e2d555964ce3936893f423ef35


    //  1. Convert an array of arrays into a hash.
    //     For example, [[1, 3], [8, 9], [2, 16]] becomes {1 => 3, 8 => 9, 2 => 16}.

    //  2. Convert an array of hashes into a hash using the :id key from the array's hashes as the keys in the new hash.
    //     For example, [{id: 1, color: "blue", price: 32}, {id: 2, color: "red", price: 12}] becomes {1 => {id: 1, color: "blue", price: 32}, 2 => {id: 2, color: "red", price: 12}}.

    //  3. Convert a string into a hash with keys for each letter in the string and values for the number of times the letter appears in the string.
    //     For example, "bookkeeper" becomes {"b" => 1, "o" => 2, "k" => 2, "e" => 3, "p" => 1, "r" => 1}.

    //  4. Convert a hash into an array of arrays.
    //     For example, {"chair" => 100, "book" => 14} becomes [["chair", 100], ["book", 14]].

    //  5. Convert a hash into an array of hashes using the keys from each hash as the :id key in each of the array's hashes.
    //     For example, {321 => {name: "Alice", age: 31}, 322 => {name: "Maria", age: 27}} becomes [{id: 321, name: "Alice", age: 31}, {id: 322, name: "Maria", age: 27}].

    //  6. Convert an array of strings into a hash with keys for each string in the array and values for the number of times the string appears in the array.
    //     For example, ["do", "or", "do", "not"] becomes {"do" => 2, "or" => 1, "not" => 1}.

    //  7. Convert a hash into a flat array containing all the hash’s keys and values.
    //     For example, {"a" => 1, "b" => 2, "c" => 3, "d" => 4} becomes ["a", 1, "b", 2, "c", 3, "d", 4].

    //  8. Combine data from a hash with names and prices and an array of hashes with names, colors, and weights to make a new hash.
    //     For example, {"chair" => 75, "book" => 15} and [{name: "chair", color: "red", weight: 10}, {name: "book", color: "black", weight: 1}] becomes {"chair" => {price: 75, color: "red", weight: 10}, "book" => {price: 15, color: "black", weight: 1}}.

    //  9. Convert an array of hashes into a hash of arrays, using the author as keys and the titles as values.
    //     For example, [{author: "Jeff Smith", title: "Bone"}, {author: "George Orwell", title: "1984"}, {author: "Jeff Smith", title: "RASL"}] becomes {"Jeff Smith" => ["Bone", "RASL"], "George Orwell" => ["1984"]}.

    // 10. Given a hash, create a new hash that has the keys and values switched.
    //     For example, {"a" => 1, "b" => 2, "c" => 3} becomes {1 => "a", 2 => "b", 3 => "c"}.


    // SOLUTIONS: https://gist.github.com/peterxjang/216a7a6e8411ee5c05118e78022f2bc7



    //  1. Use a nested loop to convert an array of number pairs into a single flattened array.
    //     For example, [[1, 3], [8, 9], [2, 16]] becomes [1, 3, 8, 9, 2, 16].

    //  2. Use a nested loop with two arrays of strings to create a new array of strings with each string combined.
    //     For example, ["a", "b", "c"] and ["d", "e", "f", "g"] becomes ["ad", "ae", "af", "ag", "bd", "be", "bf", "bg", "cd", "ce", "cf", "cg"].

    //  3. Use a nested loop with one array of strings to create a new array that contains every combination of each string with every other string in the array.
    //     For example, ["a", "b", "c", "d"] becomes ["ab", "ac", "ad", "ba", "bc", "bd", "ca", "cb", "cd", "da", "db", "dc"].

    //  4. Use a nested loop to find the largest product of any two different numbers within a given array.
    //     For example, [5, -2, 1, -9, -7, 2, 6] becomes 63.

    //  5. Use a nested loop to compute the sum of all the numbers in an array of number pairs.
    //     For example, [[1, 3], [8, 9], [2, 16]] becomes 39.

    //  6. Use a nested loop with two arrays of numbers to create a new array of the sums of each combination of numbers.
    //     For example, [1, 2] and [6, 7, 8] becomes [7, 8, 9, 8, 9, 10].

    //  7. Use a nested loop with an array of numbers to compute an array with every combination of products from each number.
    //     For example, [2, 8, 3] becomes [4, 16, 6, 16, 64, 24, 6, 24, 9].

    //  8. Use a nested loop to find the largest sum of any two different numbers within an array.
    //     For example, [1, 8, 3, 10] becomes 18.

    //  9. Use nested loops with an array of numbers to compute a new array containing the first two numbers (from the original array) that add up to the number 10. If there are no two numbers that add up to 10, return false.
    //     For example, [2, 5, 3, 1, 0, 7, 11] becomes [3, 7].

    // 10. Use a nested loop to convert an array of string arrays into a single string.
    //     For example, [["a", "man"], ["a", "plan"], ["a", "canal"], ["panama"]] becomes "amanaplanacanalpanama".


    // SOLUTIONS: https://gist.github.com/peterxjang/af8985dc4fb07ea14b4bd6ba41cb08f8
  }
}