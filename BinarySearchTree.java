/*

Program:   Bineary Search Tree class
Summary:   This class has the functionality for adding nodes and 
              searching  the tree.
author: Fiacre Indagiye Sibomana
*/


public class BinarySearchTree 
{
   private Node root;
   
   public BinarySearchTree() 
   {
      root = null;
   }
   
   
   public void insert(String times)
   {
      Node newNode = new Node(times); // new node object
      
      if(root == null)  //is tree empty
      {
         root = newNode; 
      }
      
      else  // adds new node 
      {
         root.insert(newNode);  
      }
   }

   public Node search (String num )
   {  
      if(root == null)  
      {          
          return null;
      }
      
      else 
      {
          if(root.search(num) == null)
          {
              System.out.println(num + ": not found."); // if the root is empty it will print not found
              
              return null;
          }
          
          else 
          {
              System.out.println(root.search(num).toString()); // else it will search for the num
              
              return root.search(num);
          }
      }
   }   
   
   public void printPreOrder()  // prints all the nodes in the tree using PreOrder searching
   {
      if (root == null)
      {
         return;
      }
   
      else
      {
         System.out.println("-------------------------------------- ");
         System.out.println("Printing all nodes in PreOrder:- ");
         System.out.println("-------------------------------------- ");
         
         root.printPreOrder();
      }
   }

   public void printInOrder () //prints all the nodes in the tree using InOrder searching
   {
      if (root == null)
      {
         return;
      }
   
      else
      {
         System.out.println("------------------------------------- ");
         System.out.println("Printing all nodes InOrder:- ");
         System.out.println("------------------------------------- ");
         
         root.printInOrder ();
      }
   }
       
   public void printPostOrder()  //prints all the nodes in the tree using PostOrder searching
   {
      if (root == null)
      {
         return;
      }
   
      else
      {
         System.out.println("-------------------------------------- ");
         System.out.println("Printing all nodes in PostOrder:- ");
         System.out.println("-------------------------------------- ");      

         
         root.printPostOrder();
      }
   }
}
