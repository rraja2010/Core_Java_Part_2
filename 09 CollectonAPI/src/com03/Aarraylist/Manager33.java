//69 removing the object 9 if it is equal to nine
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Manager33 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);
		System.out.println(list);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
			if (obj.equals(9)) {
				it.remove();
			}
			
		}
		System.out.println(list);
	}
}
