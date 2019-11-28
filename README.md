# Project Setup

Clone the repo, open the project in Android Studio, hit "Run". Done!

# Architecuture Overview


JavaMail API uses Configuration file for email credentials and does sending part of the application.
alternative(which I have commented out) is that if user wants to use third party applications like Gmail, then intent put methods could be used.
internet access allowed in gradle.

# External dependencies

JavaMail API is used for sending out email
imported three jar file in android studio for JavaMail API, they are activation, additionnal and mail
they have been put in app/libs folder and implementations are created in gradle

# Version control workflow

I loosely use the "Git flow" approach: master is the release branch - it should always be releasable, and only merged into 
when I have tested and verified that everything works and is good to go. 
Keep commits atomic and self-explanatory, use rebase to clean up messy branches before merging back into develop.

# How to test the project

prerequisite: change email and password in Configuration file and allow external use of email is must(if using gmail particularly)
Test : compose email from main activity
Test : message sent/recieved successfully
Test : delete the message from inbox
Test : Archive Email