 Integer[] numbers = new Integer[] { 15, 11, 9, 55, 47, 18, 520, 1123, 366, 420 };
         
        //Sort the array
        Arrays.sort(numbers);
         
        //Print array to confirm
        System.out.println(Arrays.toString(numbers));
        
        Arrays.sort(numbers, Collections.reverseOrder()); //reverse order


//convert string to string array
String blogName = "how to do in java";
String[] words = null;
 
// Method 1 :: using String.split() method
words = blogName.split(" ");                //[how, to, do, in, java]
 
// Method 2 :: using Pattern.split() method
Pattern pattern = Pattern.compile(" ");
words = pattern.split(blogName);            //[how, to, do, in, java]
 
//2. String[] to String
 
String newName = String.join(" ", words);  

//remove duplicate elements in a array
  LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
         
        //Get back the array without duplicates
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
         
        //Verify the array content
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
        
//convert string to byte aray
String name = "howtodoinjava.com";
         
byte[] byteArray = name.getBytes();
 
String str = new String(byteArray);
String strWithCharset = new String(byteArray, Charset.defaultCharset());
        
        //remve elements from array list
         namesList.remove(1);
         
         
         //string compare
         blogName.equals( "howtodoinjava.com" ); 
         blogName.startsWith( "e", 5 ); 
         blogName.indexOf( 'o' );   
         blogName.indexOf( "java" );   
         blogName.substring( 7 );  
         blogName.substring( 7, 9 );     //in
         
         
         String blogName = "howtodoinjava.com";
 
blogName.concat( " Hello Visitor !!" ); 

        
