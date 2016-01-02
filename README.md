FAQ

1. How to open the project in Eclipse?
	Click on "New" button.
	Select "Java/Java Project from Existing Ant Buildfile".
	Click "Next".
	Select build.xml as build file.
	Select compilation instruction which will be called as the default one.
	Click "Finish" button.

2. How to build the project in console?
	In console when you are in project directory type:
		$ ant TARGET
	To get information about available targets type:
		$ ant -p build.xml
	or:
		$ant -projecthelp build.xml
	which basically is the same.

3. How to build the project in Eclipse?
	In Package Explorer (or any other Eclipse's explorer) click on build.xml. Then you've got such options:
		Find "Play" button in Navigation Bar and click it
			or
		Type Ctrl+F11 to use shortcut of action described above.
	In newly opened windows select any of displayed options. In build-in console you should see building result.

	Important: you can still build separate files just open one of them and click "Play" button or Ctrl+F11 shortcut. JUnit environment will run test only from opened file.
	
	
TravisCI
For continues integration there is used TracisCI tool. Direct link for building page:
	https://travis-ci.org/Nowax/snake_game
