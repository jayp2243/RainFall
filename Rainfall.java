

import java.util.Scanner;
import java.text.DecimalFormat;

public class Rainfall {

public static void main(String[] args) {
	//See instructions above.
	DecimalFormat df = new DecimalFormat("#0.00");
	int[] months = new int [12]; 
	
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Enter inches of rainfall for the month of January");
	months[0] = scan.nextInt();
	//negative  int checks
	while (months[0]< 0) {
        System.out.println("ERROR Please Enter Non-negative number");
        System.out.println("");
        System.out.println("Enter inches of rainfall for the month of January");
        months[0] = scan.nextInt();
       }
	
	System.out.println("Enter inches of rainfall for the month of February");
	months[1] = scan.nextInt();
	
    while (months[1]< 0) {
        System.out.println("ERROR Please Enter Non-negative number");
        System.out.println("");
        System.out.println("Enter inches of rainfall for the month of February");
        months[1] = scan.nextInt();
       }
	
	System.out.println("Enter inches of rainfall for the month of March");
	months[2] = scan.nextInt();
	
	while (months[2]< 0) {
        System.out.println("ERROR Please Enter Non-negative number");
        System.out.println("");
        System.out.println("Enter inches of rainfall for the month of March");
        months[2] = scan.nextInt();
       }
	
	System.out.println("Enter inches of rainfall for the month of April");
	months[3] = scan.nextInt();
	
	while (months[3]< 0) {
        System.out.println("ERROR Please Enter Non-negative number");
        System.out.println("");
        System.out.println("Enter inches of rainfall for the month of April");
        months[3] = scan.nextInt();
       }
	
	System.out.println("Enter inches of rainfall for the month of May");
	months[4] = scan.nextInt();
	
	while (months[4]< 0) {
        System.out.println("ERROR Please Enter Non-negative number");
        System.out.println("");
        System.out.println("Enter inches of rainfall for the month of May");
        months[4] = scan.nextInt();
       }
	
	System.out.println("Enter inches of rainfall for the month of June");
	months[5] = scan.nextInt();
	
	while (months[5]< 0) {
        System.out.println("ERROR Please Enter Non-negative number");
        System.out.println("");
        System.out.println("Enter inches of rainfall for the month of June");
        months[5] = scan.nextInt();
       }
	
	System.out.println("Enter inches of rainfall for the month of July");
	months[6] = scan.nextInt();
	
	while (months[6]< 0) {
        System.out.println("ERROR Please Enter Non-negative number");
        System.out.println("");
        System.out.println("Enter inches of rainfall for the month of July");
        months[6] = scan.nextInt();
       }
	
	System.out.println("Enter inches of rainfall for the month of August");
	months[7] = scan.nextInt();
	
	while (months[7]< 0) {
        System.out.println("ERROR Please Enter Non-negative number");
        System.out.println("");
        System.out.println("Enter inches of rainfall for the month of August");
        months[7] = scan.nextInt();
       }
	
	System.out.println("Enter inches of rainfall for the month of September");
	months[8] = scan.nextInt();
	
	while (months[8]< 0) {
        System.out.println("ERROR Please Enter Non-negative number");
        System.out.println("");
        System.out.println("Enter inches of rainfall for the month of September");
        months[8] = scan.nextInt();
       }
	
	System.out.println("Enter inches of rainfall for the month of October");
	months[9] = scan.nextInt();
	
	while (months[9]< 0) {
        System.out.println("ERROR Please Enter Non-negative number");
        System.out.println("");
        System.out.println("Enter inches of rainfall for the month of October");
        months[9] = scan.nextInt();
       }
	
	System.out.println("Enter inches of rainfall for the month of November");
	months[10] = scan.nextInt();
	
	while (months[10]< 0) {
        System.out.println("ERROR Please Enter Non-negative number");
        System.out.println("");
        System.out.println("Enter inches of rainfall for the month of November");
        months[10] = scan.nextInt();
       }
	
	System.out.println("Enter inches of rainfall for the month of December");
	months[11] = scan.nextInt();
	
	while (months[11]< 0) {
        System.out.println("ERROR Please Enter Non-negative number");
        System.out.println("");
        System.out.println("Enter inches of rainfall for the month of December");
        months[11] = scan.nextInt();
       }

//Sum of rainfall	
int sum = 0;
for(int i : months) {
sum += i;
}

System.out.println("The total rainfall is " + sum + " inches");

//Average
double avg = 0;
for(int i: months){
avg = sum/12.0;
}

System.out.println("The average rainfall is " + df.format(avg) +" inches");

//Most rainfall month

int maxIndex = 0;
for (int i = 0; i < months.length; i++) {
    int newnumber = months[i];
    if ((newnumber > months[maxIndex])) {
        maxIndex = i;
    }
}


String mostRain="";
if(maxIndex == 0){
 mostRain = "January";
}
if(maxIndex == 1){
 mostRain = "February";
}
if(maxIndex == 2){
 mostRain = "March";
}
if(maxIndex == 3){
 mostRain = "April";
}
if(maxIndex == 4){
 mostRain = "May";
}
if(maxIndex == 5){
 mostRain = "June";
}
if(maxIndex == 6){
 mostRain = "July";
}
if(maxIndex == 7){
 mostRain = "August";
}
if(maxIndex == 8){
 mostRain = "September";
}
if(maxIndex == 9){
 mostRain = "October";
}
if(maxIndex == 10){
 mostRain = "November";
}
if(maxIndex == 11){
 mostRain = "December";
}
System.out.println("The month with the most rain was " + mostRain);

//Least Rainfall month

int minIndex = 0;
for (int i = 0; i < months.length; i++) {
    int newnumber2 = months[i];
    if ((newnumber2 < months[minIndex])) {
        minIndex = i;
    }
}
String leastRain="";
if(minIndex == 0){
 leastRain = "January";
}
if(minIndex == 1){
 leastRain = "February";
}
if(minIndex == 2){
 leastRain = "March";
}
if(minIndex == 3){
 leastRain = "April";
}
if(minIndex == 4){
 leastRain = "May";
}
if(minIndex == 5){
 leastRain = "June";
}
if(minIndex == 6){
 leastRain = "July";
}
if(minIndex == 7){
 leastRain = "August";
}
if(minIndex == 8){
 leastRain = "September";
}
if(minIndex == 9){
 leastRain = "October";
}
if(minIndex == 10){
 leastRain = "November";
}
if(minIndex == 11){
 leastRain = "December";
}
System.out.println("The month with the least rain was " + leastRain);
}
}
