# NFKeys
Unlock your door with an Android app and a Raspberry Pi

## About the project
This project started as my senior project (I am a recent electrical engineering grad from Cal Poly Pomona)
that I did along with three other classmates.

__Project Status: alpha__

the project is in its alpha stage for three main reasons

1. security: currently passwords are stored as plain text and the communication channels are not encrypted
2. installation: right now I do not have a univeral way of installing the servo motor while not interfering
with the normal use of the dead bolt
3. android bugs: the app is not free from bugs

One of the reasons why I started this project was that I wanted to spend my time working on something useful
so if you find this project interesting or start using it please let me know I would love to hear about it or if you want to help me find a solution to my installation problem you can email me brnsaia@IEEE.org

## Required Hardware
* Android Phone >= 4.3.1
* [Raspberry Pi](http://www.adafruit.com/products/998) model B or better
	* SD card >= 16GB
	* fresh install of [Raspbian](http://www.raspberrypi.org/downloads/) _"Debian Wheezy"_
* [NFC antenna](http://www.adafruit.com/products/364) __Requires Soldering__
* Wires like [these](http://www.adafruit.com/products/266), female-female for the NFC antenna and female-male for the servo
* Servo Motor
* a sensor to indicate when the door is closed and when it is open

## Installation - software
* disable console output through UART
* unzip project
* build libnfc library
* build libllcp library
* make NFC receiver and admin server a service
* make the NFC receiver service and admin server service start on boot
* change admin username and/or password

## Installation - hardware (based on model B)
* wiring up the NFC antenna (see included picture)
	* connect +5V on the antenna to GPIO pin 2 or 4 (both +5V)
	* connect GND on the antenna to GPIO pin 6, 9, 14, 20 or 25 (Ground)
	* connect Tx on the antenna to GPIO pin 8 (UART_Tx)
	* connect Rx on the antenna to GPIO pin 10 (UART_Rx)
