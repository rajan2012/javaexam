live assin 6 

in abstarct class , how size variables is accessed 

when its full no entry 

a object of type 

logic of this "all other
samples will also be contaminated. In this case the method test() must change the status
boolean tainted of each sample in Sample[] samples to tainted = true." 

use of break in this 

"

    boolean test() {
        boolean flag=true;
        for (int i = 0; i < samples.length; i++) {
            if (samples[i].tainted == false) {
                flag= false;
                //break;

            }
            samples[i].tainted=true;
        }
        return flag;

    }"

    correct imple 

    @Override
    public boolean test() {
        boolean allClean = true;

        // Check for contamination in each sample
        for (int i = 0; i < samples.length; i++) {
            if (samples[i] != null && samples[i].tainted) {
                // If the sample is contaminated, mark all samples as tainted
                for (int j = 0; j < samples.length; j++) {
                    if (samples[j] != null) {
                        samples[j].tainted = true;
                    }
                }
                allClean = false;  // The experiment is not successful
                break;
            }
        }

        // If all samples are clean, the test was successful
        return allClean;
    }



    use of Override for accessing abstract method 

    is ovveride required for abstract method?


    Q3. 
    arraylist is also initialized in constructor 
    lenthg of learned word array will be for each so its not static ,so count is initilized with 0 

Since PersonA and PersonB in this example learn words of a new language in different
ways, the method learn(...) must be implemented for both classes. It is important that
in the class PersonA the learned words are stored in an array (initialized with 100 fields). In
the class PersonB all learned words are stored in a List<String>
    whats wrong with this 

       void learn2(String newWord)
    {
       for(int i=0;i<100;i++)
       {
           if(s[i]!=null)
           {
               s[i]=newWord;
               count++;
           }
       }
    }

    this is correct 

    
@Override
     void learn(String newWord)
    {
       for(int i=0;i<100;i++)
       {
           if(s[i]==null)
           {
               s[i]=newWord;
               count++;
               break;
           }
       }
    }



#########what is wrong with this 

 for(String s1:records.keySet())
        {
            if(records.containsKey(name))
            {
                System.out.println(records.get(name));
                if(records.get(name)>s)
                {
                    records.put(s1,s);
                }
            }
            else
            {
                records.put(name,s);
            }

        }

###to add new key u don't have to loop through existing keys , since in beginning 
there is no keys , it would never enter the loop, 
looping through key should not be done, if you want to add new keys and value 



use of anagrams 
 public static boolean checkanagrams(String s,String s2)
    {
        Map<Character,Integer> m=new HashMap<>();

        Map<Character,Integer> m1=new HashMap<>();

        boolean flag=true;
        if(s.length()!=s2.length())
            return false;
        int count=0;
        for(char c:s.toCharArray())
        {
            if(m.containsKey(c))
            {
                m.put(c, count);
            }
            else
            {
                m.put(c,0);
            }
        }

        int count1=0;
        for(char c:s2.toCharArray())
        {
            if(m1.containsKey(c))
            {
                m1.put(c, count1);
            }
            else
            {
                m1.put(c,0);
            }
        }
        for(Character c1:m.keySet())
        {
            if(m.get(c1)!=m1.get(c1))
            {
                flag= false;
                break;
            }
        }

        return flag;

    }

    ################another method
    failing because after break there should not be any line of code 
public static boolean checkanagrams(String s,String s2)
    {
 for(Character c1:m.keySet())
        {
            if(m.get(c1)!=m1.get(c1))
            {
                flag= false;
                break;
            }
        }

        return flag;

    }

    

    compare 2 arrays // Compare sorted arrays
        return Arrays.equals(chars1, chars2);


any problems with character ,string with count , use char where index is string value 
like 

here d is character value .
c[d]++;