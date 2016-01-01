1. How to open the project in Eclipse?
	Click on "New" button.
	Select "Java/Java Project from Existing Ant Buildfile".
	Click "Next".
	Select build.xml as build file.
	Select compilation instruction which will be called as the default one.
	Click "Finish" button.

2. How to build a project?
	In console when you are in project directory type:
		$ ant TARGET
	To get information about available targets type:
		$ ant -p build.xml
	or:
		$ant -projecthelp build.xml
	which basicly is the same.
