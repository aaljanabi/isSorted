public boolean isSorted()
	{
		if(front == null)
			return true;
		
		ListNode current = front;		
		while(current.next != null)
		{
			if(current.data > current.next.data)
				return false;
						
			current = current.next;
		}
		
		return true;
	}
