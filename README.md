# Project 1 - Retro-Do

Simple Todo is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: Aldo Socarras

Time spent: **2** hours spent in total

## User Stories

The following **required** functionality is completed:

* [X] User can **view a list of todo items**
* [X] User can **successfully add and remove items** from the todo list
* [X] User's **list of items persisted** upon modification and and retrieved properly on app restart

The following **optional** features are implemented:

* [X] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list

The following **additional** features are implemented:

* [X] Inflates a layout per individual item
* [X] Implemented Toasty for cleaner error handling
* [X] Shows position of item in list, similar to an IDE
* [x] Implemented TextInputLayout for character limit/overflow
* [X] Rebranded UI and look
* [X] Replaced Add button with Floating Action Button
* [X] Launches a compose activity instead of handling action in Main

## Video Walkthrough

### 06/11/2021:

<img src='https://github.com/driuft/SimpleTodo/blob/master/walkthrough-0611.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

### 11/18/2020:

<img src='https://github.com/driuft/SimpleTodo/blob/master/walkthrough.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

### 06/11/2021:
N/A

### 11/28/2020:
Although the CodePath video tutorials were fairly straightforward, I had an issue with a NullPointerException during the execution of the EditActivity.java file.

The first thing I did was check Logcat in Android Studio while I ran the Emulator, and see the exception that was being logged when I clicked an item to be edited. This referenced that the error was located in EditActivity.java, in the setText() function. I began validating that all the variables had been initialized with a value, and once completed, I check the variable name 'etItem' against the application's Design panel.

The issue turned out to be the etItem variable being named etText instead. I corrected the variable name and the application ran flawless, allowing the user to edit any items on the list and save successfully.

## License

    Copyright [2021] [Aldo Socarras]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
