//write your code here
boolean hasMatch = false;
            Pattern p=Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher match =p.matcher(line);
            while(match.find()){
                System.out.println(match.group(2));
                hasMatch = true;
            }
            if(!hasMatch)
            {
                System.out.println("None");
            }



//you will have to learn RegEx package and remember sytanx...learn form youtube....
// source in short. 👇
// https://www.youtube.com/watch?v=9RksQ5YT7FM
