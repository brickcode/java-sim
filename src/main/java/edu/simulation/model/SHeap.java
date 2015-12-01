package edu.simulation.model;

import edu.simulation.model.*;
import java.util.ArrayList;

public class SHeap
{
	private int size;
	ArrayList<SEvent> list;
	
	SHeap()
	{
		this.list = new ArrayList<SEvent>();
		this.size = 0;
	}
	
	public SEvent first()
	{
		return remove(0);
	}

	private int min_child(int parent)
	{
		int left = (2*parent)+1;
		int right = left + 1;
		if(left > getSize())
		{
			return getSize();
		}
		if(right > getSize() || get(left).compare(get(right)))
		{
			return left;
		}
		return right;
	}

	public int getSize()
	{
		return size;
	}

	public SEvent get(int position)
	{
		return list.get(position);
	}
	
	private SEvent remove(int position)
	{
		if(size > (position))
		{
			size--;
			SEvent head = get(position);
			SEvent last = get(size);
			int x = position;
			int c = min_child(position);
			while(get(c).compare(get(size)))
			{
				list.set(x, get(c));
				x = c;
				c = min_child(c);
			}
			list.set(x, last);
			list.remove(size);
			return head;
		}
		return null;
	}
	
	public void schedule(SEvent newEvent)
	{
		list.add(null);
		int child = size;
		size++;
		int parent = (child%2 == 0) ? (child/2)-1 : (child/2);
		while((parent >= 0) && (newEvent.compare(get(parent))))
		{
			list.set(child, get(parent));
			child = parent;
			parent = (child%2 == 0) ? (child/2)-1 : (child/2);
		}
		list.set(child, newEvent);
	}
}
