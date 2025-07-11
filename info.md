diff --git a/eg2.txt b/eg2.txt
new file mode 100644
index 0000000..d6c2ce0
--- /dev/null
+++ b/eg2.txt
@@ -0,0 +1,3 @@
+Hi this is eg2.txt file which is an example file to practice git commands.
+
+This new line is added to eg2.txt to check how git add works. I have already added staged this file once and now making changes in it again to see how git status will behave.
diff --git a/eg3.txt b/eg3.txt
new file mode 100644
index 0000000..5ba8b8c
--- /dev/null
+++ b/eg3.txt
@@ -0,0 +1 @@
+Hi this is eg3.txt file which is an example file to practice git commands.
diff --git a/file.txt b/file.txt
index 1c5c921..cb03b26 100644
--- a/file.txt
+++ b/file.txt
@@ -1,2 +1,6 @@
 This is a text file
-This is changed via web browser from github website.
+JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
+DAY3VAR=/home/rails/Aditya/Syllabus/Day-3
+*.swp
+*.save
+*.class
diff --git a/index.html b/index.html
index b12d7a5..6403e2b 100644
--- a/index.html
+++ b/index.html
@@ -7,6 +7,10 @@
   <title>Git Practice Project</title>
 
   <style>
+    #header{
+	color:GREY;
+	
+    }
     #heading {
       color: blue;
       font-size: 30px;
@@ -21,13 +25,20 @@
 
 <body>
 
+  <header id= "header">
+	<h1> This is a Header of this page! </h1>
+	<p> Some broken code here </p> 
+ </Header>
+
   <h1 id="heading">Hello, World! I am Aditya Aerpule.</h1>
   <p id="paragraph">I have created this HTML page using Nano editor in Ubuntu.</p>
 
   <label for="textbox">Button click Times</label>
   <input type="text" id="textbox" placeholder="0" style="width:20px">
   <button onclick="updateMessage()" id="button">Click Me</button>
-
+<footer>
+	<p> This is abroken footer. </p>
+</footer>
 <script>
 	let count = 0;
 	function updateMessage(){
diff --git a/index.html.save b/index.html.save
deleted file mode 100644
index dd29bed..0000000
--- a/index.html.save
+++ /dev/null
@@ -1,28 +0,0 @@
-<!DOCTYPE html>
-<html lang="en">
-<head>
-  <meta charset="UTF-8">
-  <meta name="viewport" content="width=device-width, initial-scale=1.0">
-  <meta http-equiv="X-UA-Compatible" content="IE=edge">
-  <title>Your Page Title</title>
-  
-  <!-- Favicon -->
-  <link rel="icon" href="favicon.ico" type="image/x-icon">
-
-  <!-- CSS (optional) -->
-  <link rel="stylesheet" href="styles.css">
-
-  <!-- Fonts (optional) -->
-  <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
-
-  <!-- JavaScript (optional) -->
-  <script defer src="script.js"></script>
-</head>
-<body>
-  
-  <h1>Hello, World!</h1>
-  <p>This is a basic HTML5 boilerplate page.</p>
-
-</body>
-</html>
-https://www.google.com/imgres?q=favicon%20icon&imgurl=https%3A%2F%2Fwww.clipartmax.com%2Fpng%2Fmiddle%2F267-2670932_favicon-icon-icon-favicon.png&imgrefurl=https%3A%2F%2Fwww.clipartmax.com%2Fmiddle%2Fm2H7i8G6N4Z5H7N4_favicon-icon-icon-favicon%2F&docid=NAP-TZmf97ClYM&tbnid=2c6rhUjW383kUM&vet=12ahUKEwi0ncntxq-OAxV7xzgGHWU0NWMQM3oECGIQAA..i&w=840&h=680&hcb=2&ved=2ahUKEwi0ncntxq-OAxV7xzgGHWU0NWMQM3oECGIQAA
diff --git a/style.css b/style.css
deleted file mode 100644
index 00c81ac..0000000
--- a/style.css
+++ /dev/null
@@ -1,9 +0,0 @@
-#heading{
-color: BLUE;
-font-size: 30px;
-}
-
-#paragraph{
-color: BLACK;
-font-size: 40px;
-}
