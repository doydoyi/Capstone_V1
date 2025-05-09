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

