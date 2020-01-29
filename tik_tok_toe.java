
import java.util.*;
public class tik_tok_toe {
  static int count=1;
  static int draw=0;
  public static boolean cheak(String arr[][],String s,int count)
  {
    boolean d=true;
    if( ((arr[0][0].equalsIgnoreCase(arr[2][2]))&&(arr[0][0].equalsIgnoreCase(arr[1][1]))) || ( (arr[0][2].equalsIgnoreCase(arr[1][1]))&&(arr[0][2].equalsIgnoreCase(arr[2][0]))))
    {
      System.out.println("Congratulations "+s+" you are win");
        d=false;
    }
    else if(((arr[0][0].equals(arr[0][2])) &&(arr[0][0].equals(arr[0][1]))) || ((arr[1][0].equals(arr[1][2])) &&(arr[1][0].equals(arr[1][1]))) || ((arr[2][0].equals(arr[2][1])) &&(arr[2][0].equals(arr[2][2]))))
    {
      System.out.println("Congratulations "+s+" you are win");
      d=false;
    }
    else if(((arr[0][0].equals(arr[1][0])) &&(arr[0][0].equals(arr[2][0]))) || ((arr[0][1].equals(arr[1][1])) &&(arr[0][1].equals(arr[2][1]))) || ((arr[0][2].equals(arr[1][2])) &&(arr[0][2].equals(arr[2][2]))))
    {
      System.out.println("Congratulations "+s+" you are win");
      d=false;
    }
    else if(count>9)
    {
      System.out.println("Both are talented and leads to a draw");
             draw=draw+1;
      d=false;
    }
    return d;
  }
  public static void print(String arr[][])
  {
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void input(int pos,String arr[][],String i)
  {
    switch(pos)
    {
    case 1:
      if(arr[0][0].equalsIgnoreCase("1"))
      {
      arr[0][0]=i;
      count++;
      }
      else
      {
        System.out.println("Invalid postion,please re-enter");
      }
      break;
    case 2:
      if(arr[0][1].equalsIgnoreCase("2"))
      {
      arr[0][1]=i;
      count++;
      }
      else
      {
        System.out.println("invalid postion,please re-enter");
      }
      break;
    case 3:
      if(arr[0][2].equalsIgnoreCase("3"))
      {
        arr[0][2]=i;
        count++;
      }
      else
      {
        System.out.println("invalid postion,please re-enter");
      }
      break;
    case 4:
      if(arr[1][0].equalsIgnoreCase("4"))
      {
        arr[1][0]=i;
        count++;
      }
      else
      {
        System.out.println("invalid postion,please re-enter");
      }
      break;
    case 5:
      if(arr[1][1].equalsIgnoreCase("5"))
      {
        arr[1][1]=i;
        count++;
      }
      else
      {
        System.out.println("invalid postion,please re-enter");
      }
      break;
    case 6:
      if(arr[1][2].equalsIgnoreCase("6"))
      {
        arr[1][2]=i;
        count++;
      }
      else
      {
        System.out.println("invalid postion,please re-enter");
      }
      break;
    case 7:
      if(arr[2][0].equalsIgnoreCase("7"))
      {
        arr[2][0]=i;
        count++;
      }
      else
      {
        System.out.println("invalid postion,please re-enter");
      }
      break;
    case 8:
      if(arr[2][1].equalsIgnoreCase("8"))
      {
        arr[2][1]=i;
        count++;
      }
      else
      {
        System.out.println("invalid postion,please re-enter");
      }
      break;
    case 9:
      if(arr[2][2].equalsIgnoreCase("9"))
      {
        arr[2][2]=i;
        count++;  
        }
      else
      {
        System.out.println("invalid postion,please re-enter");
      }
      break;
    default:
      System.out.println("Please provide valid postion....");
      break;
    }
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
      
     Scanner a=new Scanner(System.in);
      String s1,s2;
      System.out.println("well come to Tik-Tak-Toe......");
      System.out.println();
      System.out.println("How to play?");
      System.out.println("------------");
      System.out.println("=>This is the specified postions");
      System.out.println("         1 2 3");
      System.out.println("         4 5 6");
      System.out.println("         7 8 9");
      System.out.println("=>Give the specified postion and continue.");
      System.out.println("=>player 1 always uses * ");
      System.out.println("=>player 2 always uses 0 ");
      System.out.println("______________________________________________________________________");
      System.out.println();
     
      String per="y";
       int play1=0;
       int play2=0;
       int tot_game=0;
      while(per.equalsIgnoreCase("y"))
      {
        tot_game=tot_game+1;
        String arr[][]=new String[3][3];
        int value=1;
        for(int i=0;i<3;i++)
        {
          for(int j=0;j<3;j++)
          {
            String c="";
            arr[i][j]=c+value;
            value++;
          }
        }
        System.out.print("Enter the player 1 name(takes 1)>>");
        s1=a.next();
        System.out.print("Enter the player 2 name(takes 0)>>");
        s2=a.next();
        System.out.println("MATCH BETWEEN "+s1+" VS "+s2);
        String t1="*";
        String t2="0";
        boolean d=true;
        while(d)
        {
          if(count%2!=0)
          {
            System.out.print(s1+"(*) please enter the postion from 1-9>>");
            int pos=a.nextInt();
            input(pos,arr,t1);
            print(arr);
            d=cheak(arr,s1,count);
            if(d==false)
            {
              play1=play1+1;
            }
          }
          else
          {
            System.out.print(s2+"(0) please enter the postion from 1-9>>");
            int pos=a.nextInt();
            input(pos,arr,t2);
            print(arr);
            d=cheak(arr,s2,count);
            if(d==false)
            {
              play2=play2+1;
            }
          }
        }
        count=1;
        System.out.println();
        System.out.println("TOTAL GAME="+tot_game);
        System.out.println("player 1 wins "+play1+" times");
        System.out.println("player 2 wins "+play2+" times");
        System.out.println("Match draw "+draw+" times");
        System.out.println();
        System.out.print("Do you want to play another game? (y/n)>>");
        per=a.next();
        System.out.println();
      }
   }

}
