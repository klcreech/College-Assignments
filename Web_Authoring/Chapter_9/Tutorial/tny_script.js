"use strict";

/*
   New Perspectives on HTML5 and CSS3, 8th Edition
   Tutorial 9
   Tutorial Case

   Countdown Clock
   Author: Kerry Creech
   Date: 4/15/2021  

*/

/* Excecute the function to run and display the countdown clock */

runClock();
setInterval("runClock()", 1000);

/* Function to create and run the countdown clock */
function runClock() {
	

/* Store the current date and time */

var currentDay = new Date();
var dateStr = currentDay.toLocaleDateString();
var timeStr = currentDay.toLocaleTimeString();


/* Display te current date and time */
document.getElementById("dateNow").innerHTML = dateStr + "<br />" + timeStr;

/*Calculate the days until Janurary 1st */

var newYear = new Date("January 1, 2021");
var nextYear = currentDay.getFullYear() + 1;
newYear.setFullYear(nextYear);
var daysLeft = (newYear - currentDay)/(1000*60*60*24);

/* Calculate hours left in current day*/
var hrsLeft = (daysLeft - Math.floor(daysLeft))*24;

/* Calculate the minutes and seconds left in the current hour */
var minsLeft = (hrsLeft - Math.floor(hrsLeft))*60;
var secsLeft = (minsLeft - Math.floor(minsLeft))*60;


/* Display he time left until New Year's Eve */
document.getElementById("days").textContent = Math.floor(daysLeft);
document.getElementById("hrs").textContent = Math.floor(hrsLeft);
document.getElementById("mins").textContent = Math.floor(minsLeft);
document.getElementById("secs").textContent = Math.floor(secsLeft);

}