win-gtts-winamp

Handy for speaking in teamspeak with google synthesizer.

OS:
- Windows

Requires:
- Node.js
- python2 (+ python env)
- winamp (+ winamp env)
- java for running the .jar

*Currently uses polish google tts. You can change it in say.js file (where -l pl is)

Recommendations:
using Virtual Audio Cable for connecting winamp to teamspeak
CTRL+ALT+K as TS mic profile toggle, so it's same as win-gtts-winamp run shortcut

Technologies used:
- Node.js - used as middleware if the app were to be upgraded
- Python - communicates with google tts
- Java - GUI
- DOS CLI - generic operations(file system, exec)