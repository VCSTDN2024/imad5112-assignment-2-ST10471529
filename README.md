# Game of quizz
- **Developer**: Leander Hughes
- **Student Number**: ST-10471529
- **Group**: Group 1
- **Course**: Mobile App Development 
- **Subject**: IMAD5112

## Links
- **GitHub Repository**: https://github.com/VCSTDN2024/imad5112-assignment-2-ST10471529.git
- **YouTube Video**: https://youtu.be/DHFoHUh3qNo

---

## Project Overview

The **Game of quizz** was developed for a mobile app development subject. Used was **Kotlin** and **Android Studio** to create this app. The purpose of the app is to test the user's general knowledge on the app and encourage users to practice more if they don't get satisfaction on their results.

The app focuses on the requirements of the assignment and meet the expectations and utilizing GitHub for version control and CI/CD automation using GitHub Actions.

---

## Purpose and Features

### Purpose:
The goal of my app is to encourage people to test their common knowledge and gain knowledge from it as well. 

### Key Features:
- When opening the app, the user is greated with straight forward information on the app and what to do as well as indicating how to begin the quizz.
- Simple to understand and easy to work with making the app easy to operate.
- Once completing the app there will be more comments on what to do next so the user is not lost when operating the app.

These features simply aim to provide a ease of use feeling for the user, especially for those who might be challenged.

---

## Design Considerations

My design for the **Game of quizz** was based on these ideas and considerations:

1. **User Experience**: The way the app is structured with minimal distractions and easy to read makes it user friendly.
   
2. **How responsive the app is**: The app was built to ensure it performs well on different screen sizes, with particular attention to device compatibility.
   
3. **Simplicity of the app**: The design is minimalistic, focusing on core features without overwhelming the user.
   
4. **If the app is able to handle what is being processed through it**: Code optimization was considered to ensure fast response times and low battery usage.

---

## GitHub and GitHub Actions

This project was managed using **GitHub** for version control. This is where my codes were pushed constanly every change that I have made. GitHub stored my codes and changes of every time i pushed my code through.

### GitHub Actions:
I used **GitHub Actions** to build and deploy my app. It includes:

-Undergoing a various amount of tests to ensure that my app is running at optimal performance and has no issues.
- Executing the app into **APK** and **AAB** files in the required parameters.
- Once making sure the app is done correctly, it will be placed onto github for ease of access to the person who will view my app.

Once all this is completed, it ensures that the files of my project is guaranteed that it will be pushed and creats tests eachtime that is done.

---

## Screenshots

### App Screenshots:
![Screenshot 1]
![Home screen page](https://github.com/user-attachments/assets/84b15537-a8a3-4a43-a59e-00bd29626f4a)

*Caption for screenshot 1: [This is the Home screen to my quizz game app]*

![Screenshot 2]
![Main screen and what all consists of it](https://github.com/user-attachments/assets/13617310-ac77-41d6-a8af-96eac095c664)

*Caption for screenshot 2: [This is the Main screen where the user will spend most time on]*

![Screenshot 3]
![Results page ](https://github.com/user-attachments/assets/bed55a93-96e6-400b-a1e4-a7f14d600bda)

*Caption for screenshot 3: [This is the reults the the user got once the user completed the app]*

![Screenshot 4]
![Review page](https://github.com/user-attachments/assets/8bcbf7bd-f995-4f68-a8ac-369540e67add)

*Caption for screenshot 4: [This is the review page where the answers and questions are shown]*

![Screenshot 5]
![Review 1](https://github.com/user-attachments/assets/8c0ece0b-37a7-4339-a9d9-df16f9a079cd)

*Caption for screenshot : [This is the screenshot of the chat form gemini on my review of the readme file]*

![Screenshot 6]
![Review 2](https://github.com/user-attachments/assets/342391a0-9e86-4c29-8013-ad8bf0bba421)

*Caption for screenshot : [This is the rest of the screenshot for the chat of gemini]*

![Screenshot 7]
![Review 3](https://github.com/user-attachments/assets/7a8bc9a4-d793-4793-9fb9-9b30f7993ad8)

*Caption for screenshot : [This is the final half of the entere chat on gemini of my review of the readme file]*

### Video Demo:
This is the link to my youtube video which displays the functionality of the app: https://youtu.be/DHFoHUh3qNo .

---

## Challenges and Learnings

During the creation of my app, I have gone throgh a few challenges with my app:

1. **I had a 403 push error**: When i was ready to start pushing my code onto my github repositry in android studio, I ran into with pusing the code. Everytime i pushed it through the same way I learnt how to push my code, I had an issue.
   - **Pushing it through files to bypass my issue**: I went through my files and used CMD to push my code through onto github which finally allowed me to push my code. And rather it being in my own reposity, i pushed it stright into the classroom reposity to decrease the stress later on.
   
2. **My app screens not displaying**: When running my app on the emulator, The app would work perfectly but when I finished answering all the questions, the app wouldn't switch screens to the results and review screens. 
   - **Correcting this issue**: Once realising the issue was my 2 screens not displaying even though I have gone and correctly refrenced my screens and ensured that they all work in conjuction to eachother, I eventually had a look in my ActivityManifest file and realised that there were 2 screens (Activity screens) missing which was not allowing my screens to fucntion as they should have.  

After experiencing these issue, I have realised that I should always go through my work and my manifest file to ensure that every screen that I will need is declared.

---

## Future Enhancements

While the current version of the app provides the core functionality, there are several features that could be added in the future, including:

1. **Moving wave background**: I would really like for my apps background that i have right now currently to be a moving wave background.
2. **The app to display the users name when viewing the results of your answers once completing the quizz as well as know who it is once the user puts in their id number**: I would like my app to be very active between the users so when ever the user puts their ID number into the app, it automatically knows who it is and shows your name once you've completed the quizz and displays with a message encouraging you on.  
3. **Different style's of buttons to be visually pleasing to the user**: Although having the buttons in a see through style making it pleasing to the users. I would really love to change the shapes of the buttons and use a gradient color background to be pleasing to the users.

---

## References

1. Reference 1: Wavy background (Youtube link): https://www.youtube.com/watch?v=fnZ0B8M2oPw
2. Reference 2: Website for the background: https://getwaves.io/
3. Reference 3: Color codes for the wave background source: https://htmlcolorcodes.com/
4. Reference 4: True or False questions source: https://www.cosmopolitan.com/uk/entertainment/a32612392/best-true-false-quiz-questions/
5. Reference 5: User manual (Sharepoint for IMAD5112): https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/_layouts/15/Doc.aspx?sourcedoc=%7BA1FF62F0-8E1A-47BC-99BD-CA07AE24427D%7D&file=IMAD5112_MM.docx&action=default&mobileredirect=true
6. Reference 6: (Git hub pushing issue): ChatGPT use: https://chatgpt.com/c/6808e9ef-8634-800a-b04a-c28453c75660
7. Reference 7: (Gemini use for understanding): Gemini use: https://gemini.google.com/app/84daf70dcfd150d2?hl=en_GB
8. Reference 8: (Gemini use for review): Gemini use: https://gemini.google.com/app/9055b0fa641ac126?hl=en_GB
---

## List of Figures

- **Figure 1**: Screenshot of the app's home screen.
- **Figure 2**: Screenshot of the app's main screen.
- **Figure 3**: Screenshot of the app's result page.
- **Figure 4**: Screenshot of the app's review page.
- **Figure 5**: Screenshot of the review of my readme file on gemini.
- **Figure 6**: Screenshot of the review of my readme file, the second half of what was said.
- **Figure 7**: Screenshot of the review on my readme file, the final half of what was said.

---

## Disclosure of AI Usage in My Assessment

While working on my app, I have used the help of AI to assist me in fixing issues and guiding me on what to do. 

### 1. **Section(s) in which Generative AI was used**
- **ACtivity_main.xml files**: Used AI to give me ideas on how to come up with an intresting background feature.
- **ReadMe file**: Used AI to help check the grammar and clarify the quality of the report.

### 2. **Name of AI Tool Used:**
- **ChatGPT**
- **Gemini**

### 3. **Purpose Behind Use:**
- **Understanding lines of code**: Used to explain certain lines of code for me to understand why it was used and what its meant to do.
- **Help of fixing issues**: ChatGPT helped me with finding a way to understand why my code was not pushing as well as providing examples on how to get around the issue faced. 
- **Grammer checks and fixes**: ChatGPT helped review and correct the grammar and clarity of my project report.

### 4. **Date accessed when using the AI tools for work:**
- **Fixing the missing display screens**: Used on the 7th March 2025 for the fix of my screens.
- **MainActivity3.kt - line 31 to 40**: Used AI to have a look at my lines of code to understand it and see if theres anything wrong with it as well, used on the 15th March 2025.
- **Final Review of my ReadMe file**: Used gemini on the 19th of May 2025 for reviewing my final submission.

### 5. **Link to the AI Chat(s) or Screenshots:**
- **Chat 1**:Link to ChatGPT AI chat: https://chatgpt.com/c/6808e9ef-8634-800a-b04a-c28453c75660

- **Chat 2**: Link to gemini AI chat: https://gemini.google.com/app/84daf70dcfd150d2?hl=en_GB

- **Chat 3 (Grammar Review)**: Link to what gemini said to my readme file design: https://gemini.google.com/app/9055b0fa641ac126?hl=en_GB

---
