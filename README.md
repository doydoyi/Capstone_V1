# Japanese Word Repository
**About** This project utilizes the Java programming language with it's core OOP Principles, as well as making use of File handling, Exception handling, and Graphical User Interface (GUI)
The GUI makes you add words into a .txt file that is located in your local directory that it will be saved at and display them for the user to review the words.

## Note:
AI was utilized upon the making of this project. As well as logic from previous projects and repositories for reference. External sources were used as well, specifically StackOverFlow, GeekforGeeks, and Oracle Java documentation.
Also, please refer to **commit history** for some specific steps that were documented while making the project.

### File structure
I asked an AI model what would be an appropriate file structure to follow to understand the project better. Files were arranged based on the types and their relevance to each other.

### Classes and Objects
There are 4 main folders/packages that make up the project.
⋅⋅* Model: This package has classes that hold the data that is the JapaneseWord class (Basically the class that returns the words for Japanese and English.). The JapaneseToEnglishWordRepo is the class that connects to the .txt file. Also has a method to load words and save words.

⋅⋅* Panels: This package holds the GUI forms and the .java files for the panels.
Base.java is the abstract class or the blueprint for other panel classes to inherit. addWordPanel is the panel that lets you add a word and save it to the word repository. Front panel is the welcome panel. Menu panel lets you choose whether to view your word list or add another word. Word panel shows you word repository in a list view. 

⋅⋅* Resources: contains the text file to use for the word repository.

⋅⋅* Controls: The "Brain" for the GUI and contains most of the much needed controls for the buttons for navigation through panels. As well as the initialization of panels.

## Additional note(s):
User may have to restart the GUI in order for the word in the addWordPanel to be saved.. Add word. Save. Rerun. Check "Word" panel to see if it loads.

In the main function I used the SwingUtilities.invokeLater method. Based from experience specifically from previous Malware Development repositories and courses as well as Projects (Which I have not yet uploaded in my repositories) A thread is a part of a Process and inside processes there are threads which is needed to run and process or a GUI in this example (Don't quote me on this, this is all based my understanding and experience so far). 

the invokeLater method according to online forums and documentation ensures that a runnable is executed on a single thread that is responsible for handling all GUIs updates and events in Java Swing called the EDT or Event dispatch thread. **SWING IS NOT THREAD SAFE** all of the GUIs must run or go through EDT, modifying swing components like Jlists, JPanels, etc. from another thread it **WILL** cause glitches and freezes or potentially crash since it is running on a different thread. That is where invokeLater comes in handy it schedules the runnable to not run together on the single thread (EDT) therefore avoiding conflicits.

TL:DR (too long didn't read) / ELI5 (Explain like i'm five):
  EDT is a single/one-way road, invokeLater function is the traffic officer that monitors who goes first and who goes next so that cars don't crash.
