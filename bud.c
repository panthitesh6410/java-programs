#include<stdio.h>
#include<conio.h>
typedef struct linked_list
{
  int info;
  struct linked_list * next;
}node;
void main()
{
  int choice,num;
  node * start;
  node * create(node *,int);
  void display(node *start);
  clrscr();
  start=NULL;
  while(1)
  {
    printf("\n MENU");
    printf("\n 1.create");
    printf("\n 2.display");
    printf("\n 3.exit");
    printf("\n enter number to choose");
    scanf("%d",&choice);
    switch(choice)
    {
      case 1:
	    printf("\n eneter number to enter");
	    scanf("%d",&num);
	    create(start,num);
	    break;

      case 2:
	   display(start);
	   break;

      case 3:
	    exit(0);

      default :
	     printf("\n wrong choice");
    }
   }
   getch();
}
node * create(node * start, int num)
{
   node * newnode,*temp;
   newnode=(node*)malloc(sizeof(node));
   newnode->info=num;
   newnode->next=NULL;
   if(start==NULL)
   {
     start =newnode;
   }
   else
   {
     temp=start;
     while(temp->next!=NULL)
     {
       temp=temp->next;
     }
     temp->next=newnode;
   }
   return start;
}
void display(node * start)
{
  node * temp;
  temp=start;
  if(temp==NULL)
  {
    printf("\n the lisnked list id emprtry");
  }
  while(temp !=NULL)
  {
    printf(" %d->",temp->info);
    temp=temp->next;
  }
}



