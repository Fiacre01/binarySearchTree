/*
Program:   Node class
Summary:   The Binary Search Tree will be made up of Node objects.  Each node object will reference two 
              children and also contain the string entered by the user and the frequency of that string.
   
*/


public class Node 
{  
   private String words; //the variables to be added to the tree
   private int numOfTimes = 1; //frequency with which the string has been added to the tree
   
   //keeps track of the left and right child
   private Node left; 
   private Node right; 
   
   
   public Node (String w) 
   {
      words = w; 
      left = null; 
      right = null; 
   }

   public void insert(Node times)
   {      
      if(times.getWords().compareTo(getWords()) < 0) //left
      {  
         if(left == null) //no left child
         {       
            left = times;
         }
         
         else //there is a left child
         {                  
            left.insert(times);        
         }
      }
      
      else if(times.getWords().compareTo(getWords()) == 0)
      {                               
         setNumOfTimes();
      }
      
      else
      {
         if(right == null) //no right child
         {
            right = times;
         }
         
         else //there is a right child
         {
            right.insert(times);
         }
      }
   }
   
   
   public Node search (String num)
   {
      if(num.compareTo(words) == 0)
      {
         return this;
      }
      
      else if (num.compareTo(words) < 0)
      {        
            if(left == null)
            {
               return null;  //no left child -> num doesn't exist in tree                      
            }
            
            else
            {
               return left.search(num);  //recursively call search on left child          
            }
      }
      
      else
      {
            if(right == null)
            {
               return null;   //no right child -> num doesn't exist in tree
            }
            
            else
            {
               return right.search(num);  //recursively call search on right child
            }
      }
   }
   
   
   // getters and setters
   public void setLeft(Node numOfTimes)
   {
      left = numOfTimes;
   }
   
   public void setRight(Node numOfTimes)
   {
      right = numOfTimes;
   }
   
   public void setNumOfTimes () 
   {
     numOfTimes++;  
   }
   
 
   public Node getLeft() 
   {
      return left;
   }
   
   public Node getRight() 
   {
      return right;
   }
   
   public int getNumOfTimes () 
   {
      return numOfTimes;
   }
 
   public String getWords() 
   {
      return words;
   }
   
   
   public String toString() 
   { 
      return " " + words + ": " + numOfTimes;
   }
   
   public void printPreOrder() //searches the nodes in the tree using PreOrder 
   {      
      System.out.println(toString()); 
      
      if(left != null)
      {              
         left.printPreOrder();
      }
      
      
      if(right != null)
      {             
         right.printPreOrder();
      }

   }
   
   public void printInOrder() //searches the nodes in the tree using InOrder
   {
      
      if(left != null)
      {              
         left.printInOrder();
      }
      
      System.out.println(toString()); 
      
      if(right != null)
      {             
         right.printInOrder();
      }

   }

   public void printPostOrder() //searches the nodes in the tree using PostOrder
   {
      
      if(left != null)
      {              
         left.printPostOrder();
      }
            
      if(right != null)
      {             
         right.printPostOrder();
      }
      
      System.out.println(toString()); 
   }
}