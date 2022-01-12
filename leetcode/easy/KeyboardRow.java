class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> mp1=new HashSet<Character>();
        HashSet<Character> mp2=new HashSet<Character>();
        HashSet<Character> mp3=new HashSet<Character>();
        List<String> res=new ArrayList<>();
        int i,j,count,ch;
        String temp,str1,str2,str3;
        str1="qwertyuiop";
        str2="asdfghjkl";
        str3="zxcvbnm";
        putString(str1,mp1);
        putString(str2,mp2);
        putString(str3,mp3);
        for(i=0;i<words.length;i++)
        {
            temp=words[i].toLowerCase();
            ch=0;
            count=1;
            if(mp1.contains(temp.charAt(0)))
            {
                ch=1;
            }
            else if(mp2.contains(temp.charAt(0)))
            {
                ch=2;
            }
            else
            {
                ch=3;
            }
            for(j=1;j<temp.length();j++)
            {
                if(ch==1)
                {
                    if(mp1.contains(temp.charAt(j)))
                    {
                        count++;
                    }
                }
                else if(ch==2)
                {
                    if(mp2.contains(temp.charAt(j)))
                    {
                        count++;
                    }
                }
                else if(ch==3)
                {
                    if(mp3.contains(temp.charAt(j)))
                    {
                        count++;
                    }
                }
                
            }
            if(count==temp.length())
            {
                res.add(words[i]);
            }
            
        }
        String arr[]=new String[res.size()];
        for(i=0;i<res.size();i++)
        {
            arr[i]=res.get(i);
        }

       return arr; 
        
    }
    public void putString(String s,HashSet h)
    {
        for(int i=0;i<s.length();i++)
        {
            h.add(s.charAt(i));
        }
    }
}
