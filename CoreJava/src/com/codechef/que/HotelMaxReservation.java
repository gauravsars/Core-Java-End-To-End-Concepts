package com.codechef.que;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HotelMaxReservation {

	public static void main(String[] a) throws IOException {

		int noOfTestCase, noOfGuest = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter no of test cases");
		noOfTestCase = in.nextInt();
		System.out.println("Enter No of Guest");
		noOfGuest = in.nextInt();
		for (int i = 0; i < noOfTestCase; i++) {
			ArrayList<Guest> list = new ArrayList<Guest>();dding 
			for (int j = 0; j < noOfGuest; j++) {
				Guest guest = new Guest();
				guest.setInTime(in.nextInt());
				guest.setOutTime(in.nextInt());
				list.add(guest);
			}
			
			ArrayList<Integer> hours = new ArrayList<Integer>();
			for(int j=0;j<24;j++)
					hours.add(j,0);
			for (int p = 0; p < noOfGuest; p++) {
				for(int j=list.get(p).getInTime()+1;j<list.get(p).getOutTime();j++) {
					int k = hours.get(j);
					hours.set(j,++k);
				}
			}
			
			System.out.println(" *** ");
			int max=0;
			for(int j=0;j<24;j++){
				if (max < hours.get(j))	max=hours.get(j);
			}
			
			System.out.println(max);
		}

	}
	

}

class Guest implements Comparable<Guest> {
	Integer inTime, outTime;

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public int getOutTime() {
		return outTime;
	}

	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

	public Integer diff() {
		return outTime - inTime;
	}

	@Override
	public String toString() {
		return "Guest [inTime=" + inTime + ", outTime=" + outTime + ", Diff "
				+ diff() + "]";
	}

	@Override
	public int compareTo(Guest arg0) {
		// TODO Auto-generated method stub

		if ((arg0.diff()).compareTo(this.diff()) == 0) {
			if ((arg0.inTime).compareTo(this.inTime) == 0) {
				return (arg0.outTime).compareTo(this.outTime);

			} else {
				return (arg0.inTime).compareTo(this.inTime);
			}
		} else {
			return (arg0.diff()).compareTo(this.diff());
		}

	}

}