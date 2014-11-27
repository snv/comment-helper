Introduction
============
Tool for merging muliple comments and putting to clipboard. Perfect for tutors, teachers and online marking.

![Alt text](screen.png)



Features
========
 * selection multiple comment lines
 * html tag support
 * multiple source files
 * selection is automatically put to clipboard
 * comments can be grouped in sections
 * Merging of similar sections
 * Press F5 for reloading files after changes.

Usage
=====

 1.  Prepare Dependencies:
 1.1   Install SBT http://www.scala-sbt.org/
 1.2   Open a SBT session in the comment-helper directory and execute "reload plugins", then "eclipse", and then "reload return"
 2.  Then import the Project in eclipse
 3.  Start comment-helper and choose the [comment-example.txt] (comment-helper/comment-example.txt) file.
 4.  Look at the [comment-example.txt] (comment-helper/comment-example.txt) and learn more about syntax.
 5.  Write your own comment source files.

Some supported HTML-Tags
========================
	<br>		          new line
	<code>...</code>	  code fragment
	<b>...</b>		      bold font style
	<i>...</i>		      italic font style
	<u>...</u>		      underline font style
	
More tags are supported, but not yet tested.


Dependencies
============
 
 Managed by SBT

License
=======

Copyright 2014 Fischer Johannes

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
