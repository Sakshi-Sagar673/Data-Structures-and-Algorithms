#Find the middle of a given linked list
class node:
	def __init__(self,data=None):
		self.data=data
		self.next=None

class linked_list:
	def __init__(self):
		self.head=node()

	def append(self,data):
		new_node=node(data)
		cur=self.head
		while cur.next!=None:
			cur=cur.next
		cur.next=new_node
		
	def length(self):
	    cur=self.head
	    total=0
	    while cur.next!=None:
	        total=total+1
	        cur=cur.next
	    return total
	    
	def middle(self):
	    count=self.length()
	    count=count//2
	    cur=self.head
	    for i in range(count+1):
	        cur=cur.next
	    print(cur.data)
	    
	    
	    
l=linked_list()
l.append(1)
l.append(2)
l.append(4)
l.middle()
	        
